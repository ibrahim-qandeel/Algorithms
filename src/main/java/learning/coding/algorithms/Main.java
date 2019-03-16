package learning.coding.algorithms;

import learning.coding.algorithms.implementation.sorting.InsertionSort;
import learning.coding.algorithms.problems.GeeksForGeeks.SortTheArray;

public class Main {

  public static void main(String[] args) {
    //GeeksForGeeks
//    SortTheArray.sortTheArray();

    int data[] = {9, 4, 8, 5};
    InsertionSort.sort(data);
    printArray(data);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
  }
}
