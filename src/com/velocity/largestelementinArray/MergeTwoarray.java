package com.velocity.largestelementinArray;

public class MergeTwoarray {

	public static void main(String[] args) {
	
		int a[]= {12,455,23,87,54};
		int b[]= {32,87,98,11,22};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=1+i;j<b.length;j++)
			{
				if(b[i]>b[j]){
					 int temp=b[i];
					 b[i]=b[j];
					 b[j]=temp;		
						}
			}
			c[i+b.length]=b[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ,");
		}
		
		
	}
	
}
