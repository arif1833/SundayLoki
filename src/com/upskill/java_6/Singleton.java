package com.upskill.java_6;

public class Singleton {
	
	private Singleton(){
		
	}
   private static Singleton Singletonobj = new Singleton();
   
   public static Singleton getInstance(){
	   return Singletonobj;
   }
   protected static void demo(){
	   System.out.println("Demo method for singleton clacess");
	   

 }
	   
	   
   }

