package com.example.ads;
import java.util.Scanner;

public class HelloApplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 1000000;
        int a = input.nextInt();
        int n = input.nextInt();
//        String s = input.next();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            int inp = input.nextInt();
//            arr[i] = inp;
//        }
        // Commented function calls for testing
        //System.out.println(problem1(n, min));
        //System.out.println(problem2(n));
        //System.out.println(problem3(n));
        //System.out.println(problem4(n));
        //System.out.println(problem5(n));
        //System.out.println(problem6(a,n));
        //problem7(n-1, arr);
        //System.out.println(problem8(s) ? "Yes" : "No");
        //System.out.println(problem9(a, n));
        //System.out.println(problem10(a,n));

    }
    public static int problem1(int n, int min) { //O(n) An array of size n is input.The n numbers are read and the minimum among them is found.The found minimum is returned.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int inp = input.nextInt();
            arr[i] = inp;
            if (inp < min) {
                min = inp;
            }
        }
        return min;
    }
    public static double problem2(int n) { //O(n) An array of size n is entered. The numbers are summed up, then their average value is calculated.
        double avg = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int inp = input.nextInt();
            arr[i] = inp;
            avg+=inp;
        }
        avg/=n;
        return avg;
    }
    public static String problem3(int n) {  //O(1) Checking if the num is prime or composite. If it is divided by int from 2 to 9, its prime.
        if (n==1 || n==2 || n==3 || n==5 || n==7) {
            return "Prime";
        }
        else {
            for (int i = 2; i <= 9; i++) {
                if (n % i == 0) {
                    return "Composite";
                }
            }
            return "Prime";
        }
    }
    public static int problem4(int n) {  //O(n) It finds the factorial of n
        if (n == 1){
            return 1;
        }
        return n*problem4(n-1);
    }
    public static int problem5(int n) {  //O(2^n) It finds the n-th element of Fibonacci sequence
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return problem5(n - 1) + problem5(n - 2);
        }
    }
    public static int problem6(int a, int n) {  //O(n)   it takes 2 integers as an input. And multiplies first int with the degree of second int
        if (n == 0) {
            return 1;
        } else {
            return a * problem6(a, n - 1);
        }
    }
    public static void problem7(int i, int[] arr) {  //O(n) it reverses an array of length n
        if (i < 0) {
            return;
        }
        System.out.print(arr[i] + " ");
        problem7(i - 1, arr);
    }
    public static boolean problem8(String s) {   //O(n)  it checks if the inputted string is consisted by only digits
        if (s.isEmpty()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }
        return problem8(s.substring(1));
    }
    public static int problem9(int n, int k) {   //O(2^n)  it finds binomial coefficient, considering first input as n and second input as k
        if (k == 0 || k == n) {
            return 1;
        }
        return problem9(n - 1, k - 1) + problem9(n - 1, k);
    }
    public static int problem10(int a, int b) { //O(log min(a,b)) it finds greatest common divisor of the two input digits using Euclidean Algorithm
        if (b == 0) {
            return a;
        }
        return problem10(b, a % b);
    }
}