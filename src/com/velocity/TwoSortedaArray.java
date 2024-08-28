package com.velocity;

public class TwoSortedaArray {

	public static void main(String[] args) {
		int a[] = {1 ,5 ,2 ,4 ,3 };
		int b[] = {7 ,9 ,6 ,8 ,10 };
		int c[] = new int[a.length + b.length];
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
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			c[i+b.length]=b[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		
		
		}
	}

