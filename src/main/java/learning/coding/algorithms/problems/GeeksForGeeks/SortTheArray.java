package learning.coding.algorithms.problems.GeeksForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import learning.coding.algorithms.implementation.sorting.SelectionSort;

/**
 * @see 'https://practice.geeksforgeeks.org/problems/sort-the-array/0'
 */
public class SortTheArray {

  public static void sortTheArray() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer result = new StringBuffer();
    int[] data = null;
    try {
      int numOfCases = Integer.parseInt(reader.readLine());

      for (int i = 0; i < numOfCases; i++) {
        int sizeOfArray = Integer.parseInt(reader.readLine());
        data = new int[sizeOfArray];
        String arrayInputValues = reader.readLine();
        String values[] = arrayInputValues.split(" ");
        for (int j = 0; j < values.length; j++) {
          data[j] = Integer.parseInt(values[j]);
        }
        SelectionSort.sort(data);
        result.append(printArray(data));
      }
    } catch (IOException ex) {
    }

    System.out.print(result);
  }

  private static StringBuffer printArray(int[] array) {
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < array.length; i++) {
      result.append(array[i] + " ");
    }
    result.append("\n");
    return result;
  }

}
