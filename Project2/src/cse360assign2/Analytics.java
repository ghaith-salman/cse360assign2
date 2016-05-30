/** The Program (class) description ===>
 *  This class (Analytics) will inherit from OrderedIntList by using extend operator that will inherit all variables and methods declared as protected ===> 
 *  This class calculate the following methods: 
 *  1.Method mean ===> return the mean of the integer list as a double.
 *  2.Method median ===> return the median of the integer list as an integer.
 *  3.Method high ===> return the high value in the list.
 *  4.Method low ===> return the low value in the list.
 *  5.Method numInts ===> return the number of integers in the list.
 *  @author Gaith Salman
 *  Student PIN # 43
 *  @version May 28, 2016
 *
 */

package cse360assign2;

// the operator (extend) using when we inherit all variables and methods declared as protected from class (OrderedIntList) to class (Analytics).
public class Analytics extends OrderedIntList {

	Analytics()
	{
		super();
	}

	/**
	 * This method (mean) will add all elements of the numList array.
	 * then calculate the mean value.
	 * @return meanValue which this is the mean of the numbers in the numList array.
	 */
	public double mean ()
	{

		double meanValue = -1; // meanValue this variable going to hold calculate the mean value, initial it with (-1) because if the array is empty return (-1).

		if(countElements != 0)
		{

			for (int index = 0; index < countElements; index++)
			{
				 meanValue = meanValue + this.numList[index];
			}

			meanValue = meanValue / countElements;

		}

		return meanValue;

	}

	/**
	 * This method (median) will find the median element of the numList array.
	 * if the numList is odd we will divide the numbers of element to find the number in the middle (direct way No problem in this case).
	 * if the the numList even we will find the two numbers in the middle then,
	 * add them together, then divide the result by two to find the median.
	 * @return meanValue which this is the median of the numbers in the numList array
	 */
	public int median ()
	{

		  int medianValue = -1; // medianValue this variable going to hold calculate the median value, initial it with (-1) because if the array is empty return (-1).

		  if(countElements != 0)
		  {

		         if (countElements % 2 == 0)
		         {
			            
		        	      int midleIndex = 0; // midleIndex is to hold the value of the median value index.
			              midleIndex = countElements / 2;
			              medianValue = (numList[midleIndex - 1] + numList[midleIndex]) / 2;

		         }
		         else
		         {

			              int midleIndex = 0;
			              midleIndex = (int) Math.ceil(countElements / 2);
			              medianValue = numList[midleIndex];

		         }

		 }

		 return medianValue;

	}

	/**
	 * This method (highValue) will find the elements of the numList array
	 * then calculate the highest value in the array.
	 * @return highValue which this is the highest Value of the numbers in the numList array.
	 */
	public int high ()
	{

		int highValue = -1 ; // highValue this variable going to hold calculate the high value, initial it with (-1) because if the array is empty return (-1).

		if(countElements != 0)
		{

		   highValue = this.numList[countElements-1];

		}

		 return highValue;

	}

	/**
	 * This method (lowValue) will find the elements of the numList array
	 * then calculate the lowest value in the array.
	 * @return lowValue which this is the lowest Value of the numbers in the numList array.
	 */
	public int low ()
	{

		int lowValue = -1; // lowValue this variable going to hold calculate the low value, initial it with (-1) because if the array is empty return (-1).

		if(countElements != 0)
		{

	       lowValue = this.numList[0];

		}

		return lowValue;
		
	}

	/**
	 * This method (numInts) will find the elements of the numList array,
	 * then calculate how many elements inside the numList array.
	 * @return countElements which means calculate  how many elements inside the numList array.
	 */
	public int numInts ()
	{

		return countElements; // countElements:  this variable is inherit from OrderedIntList class and counts number of integer in the array.

	}

}
