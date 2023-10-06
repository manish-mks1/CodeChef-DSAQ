/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThreeNumberExpression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        long n=0;
		for(int i=sc.nextInt();i>0;i--){
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		    long c=sc.nextLong();
		    if(-a-b-c==0||-a-b+c==0 || -a+b+c==0 || a+b+c==0 || a-b+c==0 || a-b-c==0 || a+b-c==0 || -a+b-c==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}
}
