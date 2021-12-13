
package com.company;
import java.io.*;
import java.lang.Math;
import java.util.*;

public class Lab {
    public static void main(String args[]){
        int n = 0; //length of array
        List <Integer> arr = new ArrayList<Integer>(); //array of Integer numbers
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Hello! Print your number here (one string - one number, in the end type 'quit'):");
        while(!input.equals("quit"))
        {
            input = scan.next();
            if(!input.equals("quit")) {
                arr.add(Integer.parseInt(input));
                n++;
            }
        }
        System.out.print("Type number to delete: ");
        int x;
        input = scan.next();
        x = Integer.parseInt(input);

        System.out.print("Before deleting number " + x + ": ");
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        for(int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i) == x)
                arr.remove(i);
        }

        System.out.print("\nAfter deleting: ");
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
}
