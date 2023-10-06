/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LukyNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		for(int i=sc.nextInt();i>0;i--){
		    long n=sc.nextLong();
		    long pow=0;
		    while(n%2==0){
		        n/=2;
		        pow+=1;
		    }
		    if(pow%2==0)
		    System.out.println("1");
		    else
		    System.out.println("0");
		}
	}
}
