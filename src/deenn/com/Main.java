package deenn.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOfDigits(1273));
        System.out.println(power(3,2));
        System.out.println(gcd(123));
        int[] arr = {3,1,7,6,8,4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
//    Sum of Digits
    public static int sumOfDigits(int num) {
//        Recursion
        if (num <= 9) return num;
        return num % 10 + sumOfDigits(num/10);
    }
//    Power
    public static  int power(int base, int exp) {
//        Recursion
        if (exp < 0) return -1;
        if (exp == 0) return 1;
        return base * power(base, exp-1);
    }
    public static int gcd(int num) {
//        Recursion
        return num;
    }
// Using Bubble sort
    public static int[] bubbleSort(int[] arr) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return arr;
    }
}
