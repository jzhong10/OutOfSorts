import java.util.Arrays;

public class Sorts {
  /*Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    boolean swapped = true;
    int index = 0;
    while (swapped) {
      swapped = false;
      for (int i = 0; i<data.length-index-1; i++) {
        if (data[i]>data[i+1]) {
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          swapped = true;
        }
      }
      index++;
    }
  }

  public static void selectionSort(int[] data) {
    for (int i = 0; i<data.length; i++) {
      int min = data[i];
      int minIndex = i;
      for (int j = i; j<data.length; j++) {
        if (data[j]<min) {
          min = data[j];
          minIndex = j;
        }
      }
      int temp = data[i];
      data[i] = min;
      data[minIndex] = temp;
    }
  }
/* if its's in the proper position, leave it
else, find where it belongs
shift everything over and add it in
*/
  public static void insertionSort(int[] data) {
    for (int i = 1; i<data.length; i++) {
      if (data[i]<data[i-1]) {
        int current = data[i];
        int index = i-1;
        //find where to insert
        while (index>=0 && data[i]<data[index]) {
          index--;
        }
        index++;
        //shift everything over
        for (int j = i; j>index; j--) {
          data[j] = data[j-1];
        }
        //insert value
        data[index] = current;
      }
    }
  }
}
