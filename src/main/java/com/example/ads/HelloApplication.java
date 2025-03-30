package com.example.ads;
import java.util.Scanner;

public class HelloApplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 1000000;
//        int a = input.nextInt();
        int n = input.nextInt();
//        String s = input.next();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            int inp = input.nextInt();
//            arr[i] = inp;
//        }
        //System.out.println(problem1(n, min));
        //System.out.println(problem2(n));
        System.out.println(problem3(n));
        //System.out.println(problem4(n));
        //System.out.println(problem5(n));
        //System.out.println(problem6(a,n));
        //problem7(n-1, arr);
        //System.out.println(problem8(s) ? "Yes" : "No");
        //System.out.println(problem9(a, n));
        //System.out.println(problem10(a,n));

    }
    public static int problem1(int n, int min) {
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
    public static double problem2(int n) {
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
    public static String problem3(int n) {
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
}