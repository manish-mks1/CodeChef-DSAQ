/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DefeatTheMonster
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    long h=sc.nextLong();
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    if(x>y)
		    System.out.println("1");
		    else
		    System.out.println("0");
		    
		}
	}
}
