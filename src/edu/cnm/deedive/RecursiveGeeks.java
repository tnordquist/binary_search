package edu.cnm.deedive;

// Java implementation of recursive Binary Search
public class RecursiveGeeks {

  private int binarySearch(int[] arr, int l, int r, int x) {
    if (r >= l) {
      int mid = l + (r - l) / 2;

      // If the element is present at the
      // middle itself

      if (arr[mid] == x) {
        return mid;
      }

      // If element is smaller than mid, then
      // it can only be present in left subarray
      if (arr[mid] > x) {
        return binarySearch(arr, l, mid - 1, x);
      }

      // Else the element can only be present
      // in right subarray
      return binarySearch(arr, mid + 1, r, x);
    }

    // We reach here when element is not present
    // in array
    return -1;
  }

  public static void main(String[] args) {
    RecursiveGeeks rg = new RecursiveGeeks();
    int[] arr1 = {2, 45, 234, 567, 876, 900, 976, 999};
    int index = rg.binarySearch(arr1, 0, arr1.length, 2);
    System.out.println("Found 2 at " + index + " index");
    index = rg.binarySearch(arr1, 0, arr1.length, 999);
    System.out.println("Found 999 at " + index + " index");
    index = rg.binarySearch(arr1, 0, arr1.length, 876);
    System.out.println("Found 876 at " + index + " index");
  }
}

