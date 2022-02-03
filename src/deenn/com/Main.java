package deenn.com;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

//    public static int divisibleSumPairs(int k, List<Integer> ar) {
        // Write your code here
//        int count = 0;
//        ar.sort((a,b) -> a - b);
//        for (int i = 0; i < ar.size(); i++) {
//            for (int j = 1; j < ar.size() -1; j++) {
//                int sum = ar.get(i) + ar.get(j);
//                if((sum % k) != 0){
//                    count += 1;
//                }
//
//            }
//
//        }
//        return count;

//    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(gcd(48, 18));
        System.out.println(sumOfDigits(1273));
        System.out.println(power(3,2));
//        System.out.println(gcd(123));
        int[] arr = {3,1,7,6,8,4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        float num = 3;
        float num2 = 2;
        float num3 = num/num2;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
//        var result = divisibleSumPairs(5, ar);
//        System.out.println("Result: "+result);
//        Math DoubleRounder = null;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(num3));
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
//    public static int gcd(int num) {
////        Recursion
//        return num;
//    }
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
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}

