package de.antonstepan.helper;

import java.util.Arrays;


public class HelperUtils {

  public static <T> boolean compareArrays(T[] a1, T[] a2) {
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }

  public static boolean compareArrays(int[] a1, int[] a2) {
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }

  public static boolean compareArrays(char[] a1, char[] a2) {
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }

}
