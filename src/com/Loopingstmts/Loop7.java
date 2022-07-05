package com.Loopingstmts;

//Main class
class Loop7{

 // Method 1
 // Function to traverse the string and
 // print the characters of the string
 static void traverseString(String str)
 {
     // Traverse the string
     for (int i = 0; i < str.length(); i++) {

         // Print current character
         System.out.print(str.charAt(i) + " ");
     }
 }

 // Method 2
 // Main driver method
 public static void main(String[] args)
 {
     // Custom input string
     String str = "GeeksforGeeks";

     // Calling the Method 1
     traverseString(str);
 }
}