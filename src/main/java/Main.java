import learning.coding.algorithms.implementation.sorting.BubbleSort;
import learning.coding.algorithms.implementation.sorting.SelectionSort;

public class Main {

  public static void main(String[] args) {

    int[] data = {5, 2, 3, 0};
    System.out.println("Hello World! Hello Algorithms!");
    printArray(data);
    System.out.println();
//    SelectionSort.sort(data);
    BubbleSort.sort(data);

    printArray(data);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
