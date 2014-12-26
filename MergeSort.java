// The "MergeSort" class.
import java.awt.*;
import hsa.Console;

public class MergeSort
{
    static Console c;           // The output console
    static int list[] = {2, 4, 45, 5, 3, 6, 3, 2};
    static int temp[] = new int [list.length];

    public static void mergeSort (int low, int high)
    {
	if (low < high)
	{
	    int middle = low + (high - low) / 2;
	    mergeSort (low, middle);
	    mergeSort (middle + 1, high);
	    merge (low, middle, high);
	}
    }


    public static void merge (int low, int middle, int high)
    {
	// copy original array to the temp array
	for (int i = low ; i <= high ; i++)
	{
	    temp [i] = list [i];
	}

	int i = low;
	int j = middle + 1;
	int k = low; // copying the smallest values from either the left or right side back to the array

	while (i <= middle && j <= high)
	{
	    if (temp [i] <= temp [j])
	    {
		list [k] = temp [i];
		i++;
	    }

	    else
	    {
		list [k] = temp [j];
		j++;
	    }
	    k++;
	} // copying the left array into the original array

	while (i <= middle)
	{
	    list [k] = temp [i];
	    k++;
	    i++;
	}
	printList();
    }

    public static void printList ()
    {
	for (int i = 0; i<list.length; i++)
	    System.out.print (list [i] + "\t");
	System.out.println();
    }

    public static void main (String[] args)
    {
	c = new Console ();
	printList();
	mergeSort (0, list.length - 1);
	printList();
    } // main method
} // MergeSort class
