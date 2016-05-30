/** The Test description ===>
 *  we are going to test the classes by different cases 
 *  0.Test number zero No elements inside the array the array is empty.
 *  1.Test number one in in order insert numbers.
 *  2.Test number two in descending order insert numbers.
 *  3.Test number three random order insert numbers.
 *  4.Test number four more than 10 insert numbers.
 *  @author Gaith Salman
 *  Student PIN # 43
 *  @version May 22, 2016
 * 
 */

package cse360assign2;

public class TestAnalytics {

	   public static void main(String [] args)
	   {
		
		/**
		*  allocated location and Create object class list (OrderedIntList) so we can access the methods ===>    
		*  A list of integer numbers is implemented as an array of integers.
	    *  the insert method is to insert a new value into the array ===> 
	    *  so that the array remains in ascending order.
	    *  also we can say This class takes an integers as input 
	    *  and outputs should given integers in ascending order.
		*/
		//OrderedIntList list = new OrderedIntList();
		   
		  
		/**
	    * allocated location and Create object class testObject1 (Analytics) so we can access the methods ===>    
		* 1.Method mean – return the mean of the integer list as a double.
        * 2.Method median – return the median of the integer list as an integer.
        * 3.Method high – return the high value in the list.
        * 4	Method low – return the low value in the list.
        * 5.Method numInts – return the number of integers in the list.
        */
		Analytics testObject1 = new Analytics();
		
		
		/**
		* Test number zero ===> 
		* we are going to insert in order integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array).     
        */
		
        System.out.println("//******************** Test number zero No elements iside the array the array is empty ********************//");
		
		System.out.println("Mean Number: "+testObject1.mean());
		
		System.out.println("Median Number: "+testObject1.median());
		
		System.out.println("High Number: "+testObject1.high());
		
		System.out.println("Low Number: "+testObject1.low());
		
		System.out.println("Number of elements in the array: "+testObject1.numInts());
		
			
		/**************************************************/
		
		
		
		
		
		
		
		
		/**
		* Test number one ===> 
		* we are going to insert in order integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		
		
		testObject1.insert(-55);
		testObject1.insert(-30);
		testObject1.insert(-25);
		testObject1.insert(-17);
		testObject1.insert(-11);
		testObject1.insert(-9);
		testObject1.insert(0);
		testObject1.insert(4);
		testObject1.insert(4);
		testObject1.insert(13);
		testObject1.insert(15);
		testObject1.insert(500);
	    
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
		
		System.out.println("//******************** Test number one in order insert numbers ********************//");
		
        System.out.println("Mean Number: "+testObject1.mean());
		
		System.out.println("Median Number: "+testObject1.median());
		
		System.out.println("High Number: "+testObject1.high());
		
		System.out.println("Low Number: "+testObject1.low());
		
		System.out.println("Number of elements in the array: "+testObject1.numInts());
		
			
		/**************************************************/
		
		/**
		* Test number two ===> 
		* we are going to insert in descending order integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		
		testObject1.insert(500);
		testObject1.insert(15);
		testObject1.insert(13);
		testObject1.insert(4);
		testObject1.insert(4);
		testObject1.insert(0);
		testObject1.insert(-9);
		testObject1.insert(-11);
		testObject1.insert(-17);
		testObject1.insert(-25);
		testObject1.insert(-30);
		testObject1.insert(-55);
	    
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
		
		System.out.println("//******************** Test number two in descending order insert numbers ********************//");
		
		System.out.println("Mean Number: "+testObject1.mean());
		
		System.out.println("Median Number: "+testObject1.median());
		
		System.out.println("High Number: "+testObject1.high());
		
		System.out.println("Low Number: "+testObject1.low());
		
		System.out.println("Number of elements in the array: "+testObject1.numInts());
		
        /**************************************************/
		
		/**
		* Test number three ===> 
		* we are going to insert random order integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array). 
   	    */
		
		testObject1.insert(358);
		testObject1.insert(-55);
		testObject1.insert(-30);
		testObject1.insert(13);
		testObject1.insert(-9);
		testObject1.insert(-11);
		testObject1.insert(4);
		testObject1.insert(0);
		testObject1.insert(-25);
		testObject1.insert(-37);
		testObject1.insert(4);
		testObject1.insert(-244);
	    
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
		
		System.out.println("//******************** Test number three random order insert numbers ********************//");
		
		System.out.println("Mean Number: "+testObject1.mean());
		
		System.out.println("Median Number: "+testObject1.median());
		
		System.out.println("High Number: "+testObject1.high());
		
		System.out.println("Low Number: "+testObject1.low());
		
		System.out.println("Number of elements in the array: "+testObject1.numInts());
		
/**************************************************/
		
		/**
		* Test number Four ===> 
		* we are going to insert more than 10 integer numbers and test. 
		* the out put in ordered.
		* test and find the  mean.
        * test and find the median.
        * test and find the high number.
        * test and find the low number.
        * test and find the numInts (numbers of integer numbers inside the array).
   	    */
		
		testObject1.insert(358);
		testObject1.insert(-55);
		testObject1.insert(-30);
		testObject1.insert(13);
		testObject1.insert(-9);
		testObject1.insert(-11);
		testObject1.insert(4);
		testObject1.insert(0);
		testObject1.insert(-25);
		testObject1.insert(-37);
		testObject1.insert(4);
		testObject1.insert(-244);
		testObject1.insert(96);
		testObject1.insert(-66);
		testObject1.insert(-24);
		testObject1.insert(133);
		testObject1.insert(-19);
		testObject1.insert(-151);
		testObject1.insert(4);
		testObject1.insert(0);
		testObject1.insert(-25);
		testObject1.insert(-37);
		testObject1.insert(4);
		testObject1.insert(-244);
	    
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
		
		System.out.println("//******************** Test number four more than 10 insert numbers ********************//");
		
		System.out.println("Mean Number: "+testObject1.mean());
		
		System.out.println("Median Number: "+testObject1.median());
		
		System.out.println("High Number: "+testObject1.high());
		
		System.out.println("Low Number: "+testObject1.low());
		
		System.out.println("Number of elements in the array: "+testObject1.numInts());
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
