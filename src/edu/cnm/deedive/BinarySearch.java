package edu.cnm.deedive;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

  public int binarySearch(int needle, int[] nums) {

    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (nums[mid] == needle) {
        return mid;
      }

      if (nums[mid] < needle) {
        low = mid + 1;

      } else {

        high = mid - 1;
      }
    }
      return -1;
    }

    public int linearSearch (int[] arr, int needle) {

      for(int i = 0; i < arr.length; i++) {
        if(arr[i] == needle){
          return i;
        }
      }
      return -1;
    }

  public static void main(String[] args) {
    int needle = 999;
    double start;
    double end;
    int index;

    int[] linArr = new int[1_000_000];
    for (int i = 0; i < linArr.length; ++i) {
      Random rand = new Random();
      int rand_int1 = rand.nextInt(1_000_000);
      linArr[i] = rand_int1;
    }

    LinearSearch search = new LinearSearch();
    start = System.nanoTime();
    index = search.linearSearch(linArr, needle);
    end = System.nanoTime();
    System.out.println("Time: " + (end - start));
    if (index == -1) {
      System.out.println("Number not present");
    } else {
      System.out.println("Number found at "
          + "index " + index);
    }

    Arrays.sort(linArr);

    LinearSearch linearSearch = new LinearSearch();
    start = System.nanoTime();
    int result = linearSearch.linearSearch(linArr, needle);
    end = System.nanoTime();
    System.out.println("Time: " + (end - start));
    if (result == -1) {
      System.out.println("Number not present");
    } else {
      System.out.println("Number found at "
          + "index " + result);
    }



    BinarySearch binarySearch = new BinarySearch();
    start = System.nanoTime();
    index = binarySearch.binarySearch(needle, linArr);
    end = System.nanoTime();
    System.out.println("Time: " + (end - start));
    if (result == -1) {
      System.out.println("Number not present");
    } else {
      System.out.println("Number found at "
          + "index " + result);
    }

  }
}