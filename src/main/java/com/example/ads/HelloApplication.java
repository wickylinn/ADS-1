package com.example.ads;
import java.util.Scanner;

public class HelloApplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 1000000;
        int n = input.nextInt();
        System.out.println(problem1(n, min));
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
}