package com.velocity.largestelementinArray;

public class charArray {

	public static void main(String[] args) {
		String s="i am java developer";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		 for(int j=1+i;j<c.length;j++)
		 {
			 if(c[i]>c[j])
			 {
				 char temp=c[i];
				 c[i]=c[j];
				 c[j]= temp;
				 
			 }
		 }
		 System.out.print(c[i]);
		}
	}
}
