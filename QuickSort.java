// The "QuickSort" class.
import java.awt.*;
import hsa.Console;

public class QuickSort
{
    static Console c;           // The output console
    static int list[] = {1,2,3,4,5};
    static int quickcounter = 0;

    public static void printStuff ()
    {
	for (int i = 0 ; i < list.length ; i++)
	    System.out.print (list [i]);
	System.out.println ();
    }


    public static void swap (int i, int j)
    {
	int temp = list [i];
	list [i] = list [j];
	list [j] = temp;
    }


    public static void quickSort (int left, int right)
    {
	quickcounter++;
	int pivotPlace;
	int mid = (left + right) / 2;
	swap (left, mid);
	int lastSmall = left;
	for (int i = left + 1 ; i <= right ; i++)
	{
	    printStuff ();
	    if (list [i] < list [left])
	    {
		lastSmall++;
		swap (lastSmall, i);
	    }
	}

	swap (left, lastSmall);
	pivotPlace = lastSmall;
	if (left < pivotPlace - 1)
	    quickSort (left, pivotPlace - 1);
	if (pivotPlace + 1 < right)
	    quickSort (pivotPlace + 1, right);

    }


    public static void main (String[] args)
    {
	printStuff();
	{
	}
	;
	quickSort (0, list.length-1);
	printStuff ();
	// Place your program here.  'c' is the output console
    } // main method
} // QuickSort class
