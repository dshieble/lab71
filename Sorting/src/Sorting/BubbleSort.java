package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
		//TODO: S1 implements bubble sort
		
	    while (!sorted(array)){	
		  	for (int i=1; i<array.length; i++){
				if (array[i-1]>array[i]){
					int c = array[i];
					array[i] = array[i-1];
					array[i-1] = c;
				}
			}
	    }
	    return array;
	}

	  public static boolean sorted(int array[]){
	  	for (int i=1; i<array.length; i++){
			if (array[i-1]>array[i]){
				return false;
			}
		}
		return true;
	  }


	
}
