package com.example.ads;
import java.util.Scanner;

public class HelloApplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 1000000;
        int n = input.nextInt();
        //System.out.println(problem1(n, min));
        System.out.println(problem2(n));
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
}