/** The Program description ===>
 *  A list of integer numbers is implemented as an array of integers.
 *  the insert method is to insert a new value into the array ===> 
 *  so that the array remains in ascending order.
 *  also we can say This class takes an integers as input 
 *  and outputs should given integers in ascending order.
 *  @author Gaith Salman
 *  Student PIN # 43
 *  @version May 22, 2016
 * 
 */

package cse360assign2;
 
public class OrderedIntList {
	
	protected int[] numList;  // numList is a container of the integers numbers on the array.
	protected int count;      // count is variable is going to count how many element in the array.
	private boolean debug;
	
	/** constructor that creates (initialization) an empty list of integers */
	OrderedIntList ()
	{	
		numList = new int[10];
		count = 0;		
	}
	
	/** This method inserts a new number into the array in ascending order
	 * @param newValue this is the new value to be inserted into the array
	 */
	public void insert (int newValue)
	{
		int placeToInsert = 0;
		
		//if the array is full, expand it 
		if (count == numList.length)
		{
			grow();
		}
		
		//if the list is empty, insert at the beginning
		if (count == 0)
		{
			numList[0] = newValue;
			count++;
		}
		else 
		{			
			//find where the index to insert is 
			for (int index = 0; index < count && newValue > numList[index]; index++)
			{				
					placeToInsert = index + 1;				
			}
			
			//shifting the integers to insert the newValue			
			for (int index = count; index > placeToInsert ; index--)
			{
				    numList[index] = numList[index - 1];
			}
			
			numList[placeToInsert] = newValue; 
			count++;
			
		}
		
	}
	
	/** This method expands the array if the array is full */
	private void grow ()
	{
		int []temp = new int[count * 2];
		
		for (int index = 0; index < count; index++)
		{
			temp[index] = numList[index];
		}
		
		numList = temp;
		
	}
	
	/** This print function displays the list */
	public void print () 
	{
		for (int index = 0; index < count; index++)
		{
			if (index % 5 == 0)
			{
				System.out.println();
			}
		
			System.out.print(numList[index] + "\t");	
		}
		
		System.out.println();
		
	}

}
