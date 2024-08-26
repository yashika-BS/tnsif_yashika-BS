package com.tnsif.day9.Interface.Wrapperclass;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Unboxing - converting explicity
				Integer i=new Integer(10);
				System.out.println(i);
				int b=i.intValue();
				System.out.println(b);
				// Without using intValue();
				int c=i;
				System.out.println(c);
				//Autoboxing - converting implicity
				int a=100;
				Integer i1=a;
				System.out.println(i1);
			}

	}


