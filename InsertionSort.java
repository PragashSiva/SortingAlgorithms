// The "InsertionSort" class.
import java.awt.*;
import hsa.Console;

public class InsertionSort
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
	int key;
	int i;
	c = new Console ();
	int list[] = {1, 3, 45, 56, 4, 3, 3};
	for (int j = 1 ; j < list.length ; j++) // starting with 1
	{
	    key = list [j];
	    for (i = j - 1 ; (i >= 0 && (list [i] < key)) ; i--) //smaller values move up
	    {
		list [i + 1] = list [i];
	    }
	    list [i + 1] = key; // put the key in the location
	    
	    for (int l = 0 ; l < list.length ; l++)     // sorted array
		System.out.print (list [l] + "\t");
	    System.out.println ();
	}
	// Place your program here.  'c' is the output console
    } // main method
} // InsertionSort class


