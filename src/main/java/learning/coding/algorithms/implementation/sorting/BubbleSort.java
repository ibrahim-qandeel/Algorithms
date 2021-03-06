package learning.coding.algorithms.implementation.sorting;

public class BubbleSort {

  public static void sort(int array[]) {
    int length = array.length;
    boolean isSwapped = false;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped) {
        break;
      }
      length--;
    }
  }
}
