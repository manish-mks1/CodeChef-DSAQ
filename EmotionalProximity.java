/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EmotionalProximity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		for(int i=sc.nextInt();i>0;i--){
		    float p=sc.nextFloat();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if(z==1)
		    p+=(float)x/100;
		    else
		    p-=(float)y/100;
		    System.out.println(p);
		}
	}
}
