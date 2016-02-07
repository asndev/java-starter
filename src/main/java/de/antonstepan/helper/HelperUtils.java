package de.antonstepan.helper;

import java.util.Arrays;


/**
 * Guava Math wiki: https://github.com/google/guava/wiki/MathExplained
 * @author hknd
 *
 */
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
  
  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
  
  public static boolean isPalindrome(String s) {
    return s.equals(reverse(s));
  }
  
  public static boolean isPalindrome(int x) {
    return isPalindrome(Integer.toString(x));
  }

}
