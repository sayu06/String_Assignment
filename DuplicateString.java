/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sayali
 */
import java.util.*;
public class DuplicateString {
 public static void main(String[] args) {
  String str1 = "w3resource";
  System.out.println("The given string is: " + str1);
  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
 }
 private static String removeDuplicateChars(String sourceStr) {
  char[] arr1 = sourceStr.toCharArray();
  String targetStr = "";
  for (char value: arr1) {
   if (targetStr.indexOf(value) == -1) {
    targetStr += value;
   }
  }
  return targetStr;
 }
}

