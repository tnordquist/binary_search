package edu.cnm.deedive;

import java.util.Arrays;
import java.util.Random;

public class IterativeGeeks {

    // Returns index of x if it is present in arr[],
    // else return -1
    public int binarySearch(int[] arr, int x) {
      int l = 0, r = arr.length - 1;
      while (l <= r) {
        int m = l + (r - l) / 2;

        // Check if x is present at mid
        if (arr[m] == x) {
          return m;
        }

        // If x greater, ignore left half
        if (arr[m] < x) {
          l = m + 1;
        }

        // If x is smaller, ignore right half
        else {
          r = m - 1;
        }
      }

      // if we reach here, then element was
      // not present
      return -1;
    }

    // Driver method to test above
    public static void main(String[] args) {

      int needle = 999999;
      double start;
      double end;

      LinearSearch linS = new LinearSearch();
      int[] linArr = new int[1_000_000];
      for(int i = 0; i < linArr.length; ++i){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1_000_000);
        linArr[i] = rand_int1;
      }

      start = System.nanoTime();
      int index = linS.linearSearch(linArr,needle);
      end = System.nanoTime();
      System.out.println("Time: " + (end-start));
      if (index == -1) {
        System.out.println("Number not present");
      } else {
        System.out.println("Number found at "
            + "index " + index);
      }

    // Now sort the arrays
      Arrays.sort(linArr);


      start = System.nanoTime();
      int index2 = linS.linearSearch(linArr,needle);
      end = System.nanoTime();
      System.out.println("Time: " + (end-start));
      if (index2 == -1) {
        System.out.println("Number not present");
      } else {
        System.out.println("Number found at "
            + "index " + index2);
      }


      IterativeGeeks iG = new IterativeGeeks();
      start = System.nanoTime();
      int result = iG.binarySearch(linArr, needle);
      end = System.nanoTime();
      System.out.println("Time: " + (end-start));
      if (result == -1) {
        System.out.println("Number not present");
      } else {
        System.out.println("Number found at "
            + "index " + result);
      }
   }
  }


