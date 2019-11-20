package edu.cnm.deedive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SearchSet {

  public int binarySearch(int needle, Integer[] nums) {

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

  public int linearSearch (Integer[] arr, int needle) {

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

    Integer[] linArr = new Integer[1_000_000];
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < linArr.length; ++i) {
      Random rand = new Random();
      Integer rand_int1 = rand.nextInt(1_000_000);
      set.add(rand_int1);
    }

    set.toArray(linArr);

    SearchSet search = new SearchSet();
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

    SearchSet linearSearch = new SearchSet();
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



    SearchSet binarySearch = new SearchSet();
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
