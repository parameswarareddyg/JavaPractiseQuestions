package com.java.arrays.assignement;

public class MergeTwoStringArrays {

	public static void main(String[] args) {
		String [] a = new String[] {"Rajesh","Shyam"};
		String [] b = new String[] {"Kalyan","Ramesh"};
		int size = a.length+b.length;
		String [] c=new String[size];
		/*
		 * for(int i=0;i<a.length;i++) { c[i]=a[i]; } for(int i=0;i<b.length;i++) {
		 * c[i+a.length]=b[i]; }
		 */
		/*
		 * System.arraycopy(a, 0, c, 0, a.length); System.arraycopy(b, 0, c,
		 * a.length,b.length);
		 */
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(String i:c)
		{
			System.out.print(i+" ");
		}
	}

}
