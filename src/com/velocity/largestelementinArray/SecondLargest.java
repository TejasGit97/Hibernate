package com.velocity.largestelementinArray;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {10,45,544,87,98,234,67};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println(a[1]);
	}

}
