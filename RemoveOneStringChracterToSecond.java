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
public class RemoveOneStringChracterToSecond {
 public static String removeChars(String string1,
                                     String string2)
    {
         for (int index = 0; index < string2.length();
             index++) {
            char i = string2.charAt(index);
            while (string1.contains(i + "")) {
                int itr = string1.indexOf(i);
            string1 = string1.replace((i + ""), "");
            }
        }
        return string1;
    }
    public static void main(String[] args)
    {
        String string1, string2;
        string1 = "geeksforgeeks";
        string2 = "mask";
        System.out.println(removeChars(string1, string2));
    }
}
