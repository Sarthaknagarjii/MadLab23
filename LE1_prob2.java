import java.io.*;
class Main
{
    public static void main (String[] args)
        {
        	int i, j, n=1;
	        for(i = n; i >= 1; i--)
	            {
		            for(j = i; j < n; j++)
                		{
                			System.out.print(" ");
                		}
            		for(j = 1; j <= (2 * i - 1); j++)
                		{
                			System.out.print("*");
                		}
	        System.out.println("");
	           }
        }
}