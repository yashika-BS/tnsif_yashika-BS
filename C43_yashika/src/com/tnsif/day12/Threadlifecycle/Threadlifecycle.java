package com.tnsif.day12.Threadlifecycle;
public class Threadlifecycle {
             public static void main(String args[])
             {
            	 MychildThread myThread=new MychildThread();
            	 System.out.println("before runnable stage thread"+"is alive or not?"+myThread.isAlive());
            	 myThread.start();
            	 try{
            	    Thread.sleep(4000);
            	    
            	 }
            	 catch(Exception exp) {
            		 System.out.println("thread is interupted"+exp);
            	 }
            	 System.out.println("after complete execution"+"of thread,it is alive or not?"+myThread.isAlive());
             }
}
