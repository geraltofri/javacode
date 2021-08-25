package javaproject;

import java.lang.reflect.Array;

public class my1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int String =9;
		//System.out.println(String);
		
		
		//String teststring="aaaaabbbbaaaaa";
		
	//System.out.println(palindrome(teststring));
	
//	swap() ;
	//swapnumber() ;
		
		//nearestpalindrome();
		   charadd();
	}
	
	public static void charadd() {
		char a='1';
		char b='0';
		
		System.out.println(a-b);
		System.out.println((int)a +" "+ (int)b); 
		
		
	}
	
	public static boolean palindrome(String teststring) {
		
		for (int i=0;i< teststring.length()/2;i++)
	  {
			
			if(teststring.charAt(i)== teststring.charAt(teststring.length()-1-i))
			{}
			
			else {return false;}
			  }
			return true;}
	
	public static void swap() {
		String s1="Ram";
		String s2="Kumar";
		
		
		s1=s1+s2;
		
		s2= s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("s1 is =="+ s1);
		System.out.println("s2 is =="+ s2);
		
	}
	
	static public   void swapnumber() {
		int a=10;
		int b=22;
		
		 a= a+b;
		
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("a  :" +a);
		 System.out.println("b  :" +b);
		 
	}
	

	public static void nearestpalindrome() {
		
		int a=1224567867;
		
		String sa=""+a;
		System.out.println(sa);
	     if(sa.length()%2==0)
		{StringBuilder tsa=new StringBuilder(sa.substring(0,(sa.length()/2)));
		sa=sa.substring(0,(sa.length()/2))+ tsa.reverse();
		}
	     
	     else {
	    	 
	    	 StringBuilder tsa=new StringBuilder(sa.substring(0,(sa.length()/2)));
	 		sa=sa.substring(0,(sa.length()/2))+sa.charAt(sa.length()/2) +tsa.reverse();
	     }
	     
	     
	     
	     
		//Integer.parseInt("200");  
		
		System.out.println(sa);
	}
	
	
	public void github(){
	
	 System.out.println("this was written in github");
	}
	
	
}
