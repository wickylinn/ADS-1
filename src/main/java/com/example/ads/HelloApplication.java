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
        //System.out.println(problem1(n, min));
        //System.out.println(problem2(n));
        //System.out.println(problem3(n));
        //System.out.println(problem4(n));
        //System.out.println(problem5(n));
        //System.out.println(problem6(a,n));
        //problem7(n-1, arr);
        //System.out.println(problem8(s) ? "Yes" : "No");
        System.out.println(problem9(a, n));

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
    public static int problem4(int n) {
        if (n == 1){
            return 1;
        }
        return n*problem4(n-1);
    }
    public static int problem5(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return problem5(n - 1) + problem5(n - 2);
        }
    }
    public static int problem6(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * problem6(a, n - 1);
        }
    }
    public static void problem7(int i, int[] arr) {
        if (i < 0) {
            return;
        }
        System.out.print(arr[i] + " ");
        problem7(i - 1, arr);
    }
    public static boolean problem8(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }
        return problem8(s.substring(1));
    }
    public static int problem9(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return problem9(n - 1, k - 1) + problem9(n - 1, k);
    }
}