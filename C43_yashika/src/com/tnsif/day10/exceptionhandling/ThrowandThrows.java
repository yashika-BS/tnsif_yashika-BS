package com.tnsif.day10.exceptionhandling;

public class ThrowandThrows {
    public static void main(String ags[]) {
    	ThrowandThrows obj=new ThrowandThrows();
    	obj.show();
    }
		// TODO Auto-generated method stub
    public void Demo() {
    	int a=5/0;
    	System.out.println(a);
    }
    public void show() {
    	try {
    		Demo();
    	}
    	catch(Exception e) {
    		System.out.println("exception...");
    	}
    	finally {
    		System.out.println("hello world!...");
    	}
	}

}
