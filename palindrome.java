package assignment1;

import java.util.*;
public class palindrome {
	public static void main(String[] args){

         Scanner sc= new Scanner(System.in);
             palindrome o=new palindrome();
           int num=sc.nextInt();
             if(o.isPalindrome(num))
             System.out.println(num+" is a palindrome");
           else
              System.out.println(num+" is not a palindrome");
              
	}
	
	public boolean isPalindrome(int num){
       
		int temp,rev=0;
		  temp=num;
		while(num>0){
             rev=rev*10+(num%10);
                num=num/10;
                  }
         return temp==rev;
	}
}