/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PixelDamage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		for(int i=sc.nextInt();i>0;i++){
		    long h=sc.nextLong();
		    long w=sc.nextLong();
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    long k=sc.nextLong();
		    if(Math.sqrt(Math.pow(w-x,2) + Math.pow(h-y,2))<k)
		    System.out.println("1");
		    else
		    System.out.println("0");
		}
	}
}
