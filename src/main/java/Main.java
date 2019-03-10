import learning.coding.algorithms.implementation.SelectionSort;

public class Main {

  public static void main(String[] args) {

    int[] data = {8, 6, 3, 5, 1};
    System.out.println("Hello World! Hello Algorithms!");

    SelectionSort.sort(data);

    printArray(data);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
