import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Numcount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0,i;
		int n=sc.nextInt();
		while(n>0)
		{
		  ++count;
		   n = n/10;
		}
	System.out.println(count);
	}
}
