package com.logic.strings;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String inString = sc.next();
        
        
        

		
		  if(isPalindromString(inString)){
	            System.out.println(inString +" is a Palindrom String");
	        }
	        else{
	            System.out.println(inString +" is not a Palindrom String");
	        }   
	
		  
		  
		  
		  
		  
		  
		  
		  
	}

	
	



	//using stringclass
	public static boolean isPalindromString(String inputStr){
      
	 
		String str="";
         for(int i=inputStr.length()-1;i>=0;i--) {
        	 str=str+inputStr.charAt(i);	 
         }
      
         System.out.println(str);
         
         if(str.equals(inputStr)) 
        	 return true;
         else
        	 return false;              
    }
    
}
