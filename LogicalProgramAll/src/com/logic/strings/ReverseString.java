package com.logic.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String : ");
	        String inString = sc.next();
	        
	       String strresver= reverseString(inString);
	       System.out.println(strresver);
	        
		  /*
	        //single Palindrom using stringbuffer logic
	        if(isPalindromStringBuffer(inString)){
	            System.out.println(inString +" is a Palindrom String");
	        }
	        else{
	            System.out.println(inString +" is not a Palindrom String");
	        }
	        */
	        
	        
	}//end of the ReverseString 

	//using stringbuffer 
	public static boolean isPalindromStringBuffer(String inputStr){
	        StringBuilder sb  = new StringBuilder(inputStr);
	        String reverseStr = sb.reverse().toString();
	        return (inputStr.equalsIgnoreCase(reverseStr));              
	}

	
	//using stringbuffer 
	public static String reverseString(String inputStr){
		String str="";
        for(int i=inputStr.length()-1;i>=0;i--) {
       	 str=str+inputStr.charAt(i);	 
        }
     
		return str;
	}//end of the reverseString

	
}
