package assignment1;

import java.util.*;
class occurence {
 public static void main(String[] args) {
	        occurence o=new occurence();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter article");
	  String sentence=sc.nextLine();
	  System.out.println("enter word");
	  String word=sc.next();
	  System.out.println(word+":"+o.occurenceTime(sentence,word));
	 
 } 
	  public  int occurenceTime(String sentence,String word) {
		   int count=0;
	  String[] a=sentence.split(" ");
	   for(int i=0;i<a.length;i++)
		     if(a[i].equals(word))
		    	 count++;
	     return count;
	  }
}
