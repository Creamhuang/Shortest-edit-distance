//����:ʵ�ֽ��ַ���aת��Ϊ�ַ���b(��̼��༭����);
package com.agrothrim.exercise4;

public class Min_Distance {
	public int min(int x,int y){
		return x<y?x:y;
	}
	
	public void minDistance(char[] a,char[] b){
		int la=a.length;
		int lb=b.length;
		/*Ҫ�Դ�aΪ0����b��λ0;��bΪ0,��a��Ϊ0;��a����bͬʱΪ0��������������жϣ�
		 * ����d[][]����ֵ����la+1,��ֵ����lb+1
		 */
		int[][] d=new int[la+1][lb+1];
		int i,j;
		
		d[0][0]=0;
		for(i=1;i<=la;i++)//��bΪ��
			d[i][0]=i;
        for(j=1;j<=lb;j++)//��aΪ��
        	d[0][j]=j;
        
        for(i=1;i<=la;i++){
        	for(j=1;j<=lb;j++){
        		if(a[i-1]==b[j-1])//a[]�еĵ�i���ַ����±���i-1,b[]�еĵ�j���ַ����±���j-1
        			d[i][j]=d[i-1][j-1];
        		else
        			//d[i][j]ȡ��a[]�в���һ���ַ���ɾ��һ���ַ����滻һ���ַ�����Сֵ
        			d[i][j]=min(min(d[i][j-1]+1,d[i-1][j]+1),d[i-1][j-1]+1);
        	}
        }	 
       System.out.println(d[la][lb]);
	}
}
