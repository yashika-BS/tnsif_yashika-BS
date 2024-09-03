package com.tnsif.day10.exceptionhandling;
import java.util.Scanner;
public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       try{
    	 System.out.println("enter your number:");
    	 int a = sc.nextInt();
    	 System.out.println(a%2==0?a+"is even":"is odd");
       }
       catch(Exception e){
    	   System.out.println("invalid input");
       }
       finally {
    	   System.out.println("in finally....");
    	   sc.close();
       }

   }

}
