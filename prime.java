package assignment1;

import java.util.*;
public class prime {
	public  void primeRange(int num){
		  
		 int i,j;
	        boolean flag;
	
	   for(i=1;i<=num;i++)
	     {  flag=true;
	       for(j=2;j<=i/2;j++)
	           if(i%j==0)
	            {   flag=false;
	                  break;
	            }
          if(flag)
        	 System.out.print(i+" ");
		
	     }
	}
	
	public static void main(String[] args){
		   prime o=new prime();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number ");
	      int num=sc.nextInt();
	       o.primeRange(num);
      }


}
