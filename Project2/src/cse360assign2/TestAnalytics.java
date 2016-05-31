/** The Test description ===>
 *  we are going to test the classes by different cases 
 *  1.Test number one: No elements inside the array, the array is empty.
 *  2.Test number two: 10 integers that are in order.
 *  3.Test number three: 10 integers in descending order.
 *  4.Test number four: 10 random integers.
 *  5.Test number five: more than 10 random integers.
 *  6.Test number six: 10 integers that are positive and equal.
 *  7.Test number seven: 10 integers that are negative and equal.
 *  @author Ghaith Salman
 *  Student PIN # 43
 *  @version May 31, 2016
 * 
 */

package cse360assign2;

public class TestAnalytics {

	   public static void main(String [] args)
	   {
		
		/**
		*  Create object class list (OrderedIntList) so we can access the methods ===>    
		*  A list of integer numbers is implemented as an array of integers.
	    *  The insert method is to insert a new value into the array ===> 
	    *  so that the array remains in ascending order.
	    *  also we can say this class takes an integers as input 
	    *  and outputs should given integers in ascending order.
		*/
		//OrderedIntList list = new OrderedIntList();
		   
		/**************************************************/
		/**
	    * Create object class testObject1 (Analytics) so we can access the methods ===>    
		* 1.Method mean – return the mean of the integer list as a double.
        * 2.Method median – return the median of the integer list as an integer.
        * 3.Method high – return the high value in the list.
        * 4	Method low – return the low value in the list.
        * 5.Method numInts – return the number of integers in the list.
        */
		Analytics testObject1 = new Analytics();
		
		/**
		* Test number one ===> 
		* we are going to test empty array. 
		* the output should be an empty list.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array).     
        */
		
        System.out.println("//******************** Test number one: No elements inside the array, the array is empty ********************//");
		
        testObject1.print();
        
        System.out.println("Mean Number: " + testObject1.mean());
		
		System.out.println("Median Number: " + testObject1.median());
		
		System.out.println("High Number: " + testObject1.high());
		
		System.out.println("Low Number: " + testObject1.low());
		
		System.out.println("Number of elements in the array: " + testObject1.numInts());
		
			
		/**************************************************/
		
		/**
		* allocated location and Create object class testObject2 (Analytics) so we can access the methods ===>    
		* 1.Method mean – return the mean of the integer list as a double.
	    * 2.Method median – return the median of the integer list as an integer.
	    * 3.Method high – return the high value in the list.
	    * 4	Method low – return the low value in the list.
	    * 5.Method numInts – return the number of integers in the list.
	    */
		Analytics testObject2 = new Analytics();
		
		/**
		* Test number two ===> 
		* we are going to insert in order 10 integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
			
		testObject2.insert(-55);
		testObject2.insert(-30);
		testObject2.insert(-25);
		testObject2.insert(-9);
		testObject2.insert(0);
		testObject2.insert(4);
		testObject2.insert(4);
		testObject2.insert(13);
		testObject2.insert(15);
		testObject2.insert(500);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number two: 10 integers that are in order ********************//");
		
		testObject2.print();
		
		System.out.println("Mean Number: " + testObject2.mean());
		
		System.out.println("Median Number: " + testObject2.median());
		
		System.out.println("High Number: " + testObject2.high());
		
		System.out.println("Low Number: " + testObject2.low());
		
		System.out.println("Number of elements in the array: " + testObject2.numInts());
		
		/**************************************************/
		
		/**
		* Test number three ===> 
		* we are going to insert in descending order 10 integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		Analytics testObject3 = new Analytics();
		
		testObject3.insert(500);
		testObject3.insert(15);
		testObject3.insert(13);
		testObject3.insert(4);
		testObject3.insert(0);
		testObject3.insert(-9);
		testObject3.insert(-17);
		testObject3.insert(-25);
		testObject3.insert(-30);
		testObject3.insert(-55);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number three: 10 integers in descending order ********************//");
		
		testObject3.print();
		
		System.out.println("Mean Number: " + testObject3.mean());
		
		System.out.println("Median Number: " + testObject3.median());
		
		System.out.println("High Number: " + testObject3.high());
		
		System.out.println("Low Number: " + testObject3.low());
		
		System.out.println("Number of elements in the array: " + testObject3.numInts());
		
        /**************************************************/
		
		/**
		* Test number four ===> 
		* we are going to insert random 10 integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		Analytics testObject4 = new Analytics();
		
		testObject4.insert(358);
		testObject4.insert(-55);
		testObject4.insert(13);
		testObject4.insert(-9);
		testObject4.insert(-11);
		testObject4.insert(4);
		testObject4.insert(0);
		testObject4.insert(-37);
		testObject4.insert(4);
		testObject4.insert(-244);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number four: 10 random integers ********************//");
		
		testObject4.print();
		
		System.out.println("Mean Number: " + testObject4.mean());
		
		System.out.println("Median Number: " + testObject4.median());
		
		System.out.println("High Number: " + testObject4.high());
		
		System.out.println("Low Number: " + testObject4.low());
		
		System.out.println("Number of elements in the array: " + testObject4.numInts());
		
/**************************************************/
		
		/**
		* Test number five ===> 
		* we are going to insert more than 10 integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array).
   	    */
		Analytics testObject5 = new Analytics();
		
		testObject5.insert(358);
		testObject5.insert(-55);
		testObject5.insert(-30);
		testObject5.insert(13);
		testObject5.insert(-9);
		testObject5.insert(-11);
		testObject5.insert(4);
		testObject5.insert(0);
		testObject5.insert(-25);
		testObject5.insert(-37);
		testObject5.insert(4);
		testObject5.insert(-244);
		testObject5.insert(96);
		testObject5.insert(-66);
		testObject5.insert(-24);
		testObject5.insert(133);
		testObject5.insert(-19);
		testObject5.insert(-151);
		testObject5.insert(4);
		testObject5.insert(0);
		testObject5.insert(-25);
		testObject5.insert(-37);
		testObject5.insert(4);
		testObject5.insert(-244);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number five: more than 10 random integers ********************//");
		
		testObject5.print();
		
		System.out.println("Mean Number: " + testObject5.mean());
		
		System.out.println("Median Number: " + testObject5.median());
		
		System.out.println("High Number: " + testObject5.high());
		
		System.out.println("Low Number: " + testObject5.low());
		
		System.out.println("Number of elements in the array: " + testObject5.numInts());
		
		/**************************************************/
		
		/**
		* Test number six ===> 
		* we are going to insert equal integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		Analytics testObject6 = new Analytics();
		
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
		testObject6.insert(8);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number six: 10 integers that are positive and equal ********************//");
		
		testObject6.print();
		
		System.out.println("Mean Number: " + testObject6.mean());
		
		System.out.println("Median Number: " + testObject6.median());
		
		System.out.println("High Number: " + testObject6.high());
		
		System.out.println("Low Number: " + testObject6.low());
		
		System.out.println("Number of elements in the array: " + testObject6.numInts());
		
/**************************************************/
		
		/**
		* Test number seven ===> 
		* we are going to insert equal negative integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		Analytics testObject7 = new Analytics();
		
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
		testObject7.insert(-8);
	    
		/*
		list.insert(-55);
		list.insert(-30);
		list.insert(-25);
		list.insert(-17);
		list.insert(-11);
		list.insert(-9);
		list.insert(0);
		list.insert(4);
		list.insert(4);
		list.insert(13);
		list.insert(15);
		list.insert(100);
	    */
		//list.print();
		
		System.out.println("//******************** Test number seven: 10 integers that are negative and equal ********************//");
		
		testObject7.print();
		
		System.out.println("Mean Number: " + testObject7.mean());
		
		System.out.println("Median Number: " + testObject7.median());
		
		System.out.println("High Number: " + testObject7.high());
		
		System.out.println("Low Number: " + testObject7.low());
		
		System.out.println("Number of elements in the array: " + testObject7.numInts());
		
		
		
		
		
		
		
		
		
		}

}
