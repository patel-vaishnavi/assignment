package assignment1;

import java.util.*;

public class anagram {
	
	public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter first string");
                String s1=sc.next();
                System.out.println("enter second string");
                String s2=sc.next();
                   boolean res;
                   
                   anagram a=new anagram();
                res=a.areAnagram(s1,s2);
       if(res)
 
       	   System.out.println("is anagram");
       
       else	   
    	   
       	   System.out.println("not anagram");
    	   
    	   sc.close();
    	   
	}   	  
    
	public boolean areAnagram(String s1,String s2){
		 
	     boolean res=false;
       
      if(s1.length()==s2.length())
      {
   	   
   	   s1=s1.toLowerCase();
   	   s2=s2.toLowerCase();
   	   
   	   char[] n1=s1.toCharArray();
   	   char[] n2=s2.toCharArray();
   	   
   	   Arrays.sort(n1);
   	   Arrays.sort(n2);
   	  
   	   if(Arrays.equals(n1, n2))
   	         res=true;
   	  
      }    
      
		return res;
		
	}
}