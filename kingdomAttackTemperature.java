/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kingdomAttackTemperature
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		for(int i=sc.nextInt();i>0;i--){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    if(arr.length<3)
		    System.out.println(arr[n-1]);
		    else
		    System.out.println(arr[1]);
		}
	}
}
