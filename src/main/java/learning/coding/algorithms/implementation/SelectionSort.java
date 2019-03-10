package learning.coding.algorithms.implementation;

public class SelectionSort {

  public static void sort(int array[]) {

    int length = array.length;
    int minIndex = 0;
    int temp = 0;

    for (int i = 0; i < length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }
}
