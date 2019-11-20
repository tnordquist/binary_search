package edu.cnm.deedive;

import java.util.Arrays;

public class BinarySearchTodd {

  boolean binarySearch(int target, int[] nums) {

    int[] sorted = nums;
    Arrays.sort(sorted);

    int fI = -1;
    int cI = sorted.length;

    while (fI + 1 < cI) {
      int mI = (cI - fI) / 2;
      int guessI = fI + mI;
      int guessValue = sorted[guessI];
      if (guessValue == target) {
        return true;
      }
      if (guessValue > target) {
        cI = guessI;
      } else {
        fI = guessI;
      }

    }
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTodd bs = new BinarySearchTodd();
    int[] nums = {5, 2, 3, 7, 4, 6};
    boolean val = bs.binarySearch(2, nums);
    System.out.println(val);
  }
}