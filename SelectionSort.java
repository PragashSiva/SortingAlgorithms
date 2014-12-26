// The "SelectionSort" class.
import java.awt.*;
import hsa.Console;

public class SelectionSort
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int list[] = {4, 5, 6, 1, 2, 3};
	int small = 0;

	System.out.println ("LIST:");
	for (int i = 0 ; i < list.length ; i++)
	    System.out.print (list [i] + "\t");
	System.out.println ();

	for (int i = 0 ; i < list.length ; i++)
	{
	    small = i;
	    for (int j = i ; j < list.length ; j++)
	    {
		if (list [j] < list [small])
		{
		    int temp = list [j];
		    list [j] = list [small];
		    list [small] = temp;
		}
	    }
	    for (int r = 0 ; r < list.length ; r++)
		System.out.print (list [r] + "\t");
	    System.out.println ();
	}


	// Place your program here.  'c' is the output console
    } // main method
} // SelectionSort class
