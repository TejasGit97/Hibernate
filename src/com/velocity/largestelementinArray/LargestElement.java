package com.velocity.largestelementinArray;

public class LargestElement {

	public static void main(String[] args) {
		int a[]= {10,34,75,20,5,54};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
