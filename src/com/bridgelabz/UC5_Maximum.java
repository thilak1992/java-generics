package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UC5_Maximum<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Comparable<T>> T findMax(List<T> arr) {

        T max = arr.get(0);

        for (T key : arr) {
            if (key.compareTo(max) > 0)
                max = key;
        }
        return max;
    }

    public static <T extends Comparable> T printMax() {
        System.out.println("Calling findMaxMethod through printMax.......");

        System.out.println("The Maximum integer is: " + findMax(Arrays.asList(12,24,36,48)));
        System.out.println("The Maximum float is: " + findMax(Arrays.asList(10.34,65.54,24.87,76.56)));
        System.out.println("The Maximum string is: " + findMax(Arrays.asList("Apple", "Peach", "Banana","Kiwi")));

        return null;
    }

    public void findMaxInteger() {
        UC5_Maximum mx = new UC5_Maximum();
        System.out.println("Enter 3 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Maximum integer number is: " + mx.findMax(num1, num2, num3));
    }

    public void findMaxFloat() {
        UC5_Maximum mx = new UC5_Maximum();
        System.out.println("Enter 3 float numbers: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Maximum float number is: " + mx.findMax(num1, num2, num3));
    }

    public void findMaxString() {
        UC5_Maximum mx = new UC5_Maximum();
        System.out.println("Enter 3 strings: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        System.out.println("Maximum float number is: " + mx.findMax(str1, str2, str3));
    }

    public static void main(String[] args) {
        UC5_Maximum mx = new UC5_Maximum();
        System.out.println("Welcome to Generic Practice Problem");
        // Maximum Integer ->
        mx.findMaxInteger();

        // Maximum Float ->
        mx.findMaxFloat();

        // Maximum String ->
        mx.findMaxString();

        UC5_Maximum obj = new UC5_Maximum();
        System.out.println("---------------- UC4 -> Options ---------------");
        System.out.println("The Maximum integer is: " + obj.findMax(Arrays.asList(12,24,36,48)));
        System.out.println("The Maximum float is: " + obj.findMax(Arrays.asList(10.34,65.54,24.87)));
        System.out.println("The Maximum string is: " + obj.findMax(Arrays.asList("Apple", "Peach", "Banana")));

        System.out.println("--------------- UC5 -> Find the max value using printMax method -------------");
        printMax();
    }

}
