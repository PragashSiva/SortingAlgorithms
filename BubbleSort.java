// The "BubbleSort" class.
import java.awt.*;
import hsa.Console;

public class BubbleSort
{
    static Console c;           // The output console


    public static void sort (int list[])
    {
	for (int j = 0 ; j < list.length ; j++)
	{
	    for (int k = list.length - 1 ; k > j ; k--) // always leaves the last digit of each pass untouched 
	    {
		if (list [k - 1] > list [k])
		{
		    int temp = list [k - 1];
		    list [k - 1] = list [k];
		    list [k] = temp;
		}
	    }
	}
	for (int i = 0 ; i < list.length ; i++)     // sorted array
	    System.out.print (list [i] + "\t");
	System.out.println();
    }


    public static void main (String[] args)
    {
	c = new Console ();
	int list[] = {4, 5, 6, 1, 2, 3};
	System.out.println ("LIST:");
	for (int i = 0 ; i < list.length ; i++)     // initial array
	    System.out.print (list [i] + "\t");
	System.out.println();
	sort (list);

	// Place your program here.  'c' is the output console
    } // main method
} // BubbleSort class

