package deenn.com;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.*;

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

//        replacementSpaces(a,13);
        String str = "aaabcde";
        String aa = "abdacdc";
//        System.out.println(permu(str,aa));
        boolean[] charSet = new boolean[128];
        System.out.println(uniqueChar(str));
        System.out.println(Arrays.toString(charSet));
        String s = "ddooog";
        String t =  "ddooog";
        System.out.println(permutations(s,t));
        String hello = "abccde";
        StringBuffer text1 = new StringBuffer(hello.substring(0,hello.length()/2));
        StringBuffer text2 = new StringBuffer(hello.substring(hello.length()/2));
        int count = 0;
        for (int i = 0; i < text1.length(); i++) {

             if (!String.valueOf(text1.charAt(i)).equals(String.valueOf(text2.charAt(i)))) {

             }

        }
        System.out.println(count);
        System.out.println(text1);
        System.out.println(text2);
        Map<String, Integer> happy = new HashMap<>();
        for (int i = 0; i < hello.length(); i++) {
            String key = String.valueOf(hello.charAt(i));
            happy.put(key, happy.containsKey(key) ? happy.get(key) + 1 : 1);
        }
        int[] arr1 = {1, 1, 4, 2, 2, 3, 5};
        int[] arr2 = {1, 9, 25, 4, 4, 1, 16};
        System.out.println(same(arr1, arr2));
        System.out.println(anagram("faoefet","taaoffee"));
        int[] arq = {-1,-2,-3,0,3,4,5,6};
        double [] nrr = {1,1,1,1,1,2,1,1,1};
        System.out.println("fuck");
        System.out.println(Arrays.toString(sumZero(arq,5)));
        System.out.println(findUniq(nrr));

//        int count = 1;
////        for (int i = 0; i < hello.length(); i++) {
////            if (!happy.containsKey(String.valueOf(hello.charAt(i)))) {
////                happy.put(String.valueOf(hello.charAt(i)),count);
////            } else {
////                count++;
////                happy.put(String.valueOf(hello.charAt(i)),happy.get(String.valueOf(hello.charAt(i)))+ 1);
////            }
////        }
//        System.out.println(happy);
        Map<Integer, String> happy1 = new HashMap<>();
        happy1.put(1, "10");
//        happy1.put(2, 12);
//        happy1.put(3, 78);

        System.out.println(happy1.get(1));
        // write your code here
        int n = Math.abs(-490);
        System.out.println(n);
        System.out.println(gcd(48, 18));
        System.out.println(sumOfDigits(1273));
        System.out.println(power(3, 2));
//        System.out.println(gcd(123));
        int[] arr = {3, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        float num = 3;
        float num2 = 2;
        float num3 = num / num2;
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
        return num % 10 + sumOfDigits(num / 10);
    }

    //    Power
    public static int power(int base, int exp) {
//        Recursion
        if (exp < 0) return -1;
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    //    public static int gcd(int num) {
////        Recursion
//        return num;
//    }
// Using Bubble sort
    public static int[] bubbleSort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
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
        return gcd(b, a % b);
    }

    //    Frequency Counter algorithm
    public static boolean same(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        Map<Integer, Integer> counter1 = new HashMap<>();
        Map<Integer, Integer> counter2 = new HashMap<>();

        for (int i : arr1) {
            counter1.put(i, counter1.containsKey(i) ? counter1.get(i) + 1 : 1);
        }
        System.out.println(counter1.keySet());
        for (int i : arr2) {
            counter2.put(i, counter2.containsKey(i) ? counter2.get(i) + 1 : 1);
        }
        System.out.println(counter2.keySet());
        for (int i : counter1.keySet()) {
            if (!counter2.keySet().contains((int) Math.pow(i, 2))) {
                return false;
            }
        }
        return true;
    }

    //    Anagram
    public static boolean anagram(String first, String second) {
        Map<String, Integer> lookup = new HashMap<>();
        Map<String, Integer> lookup2 = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            String key = String.valueOf(first.charAt(i));
            lookup.put(key, lookup.containsKey(key) ? lookup.get(key) + 1 : 1);
        }
        System.out.println(lookup.entrySet());
        for (int i = 0; i < second.length(); i++) {
            String letter = String.valueOf(second.charAt(i));
//            if (!lookup.keySet().contains(letter)) {
//                return false;
//            } else {
//              int count = lookup.get(letter);
//              count--;
//            }
//            System.out.println(lookup);
            lookup2.put(letter,lookup2.containsKey(letter) ? lookup2.get(letter) + 1 : 1);

            lookup2.merge(letter, 1, Integer::sum);
        }
        System.out.println(lookup2.entrySet());
//        return true;
        return lookup.entrySet().equals(lookup2.entrySet());
    }
    public static int[] sumZero(int[] ar, int k) {
        int left = 0;
        int right = ar.length-1;
        int[] arr = new int[2];
        int c= 0;
        while (left < right) {
            int sum = ar[left] + ar[right];

            if (sum == 0) {
                arr[0] = ar[left];
                arr[1] = right;
                return arr ;
            } else if (sum > 0){
                right--;
            } else {
                left++;
            }


        }
        return arr;
    }
    public static double findUniq(double arr[]) {
        // Do the magic
        double ans = 0;
        Map<Double, Integer> tracker = new HashMap<>();
        for (double i : arr) {
            tracker.put(i, tracker.containsKey(i) ? tracker.get(i) + 1 : 1);
        }
        for (double i : tracker.keySet()) {
            if(tracker.get(i) == 1) {
              ans = i;
            }
        }
        return ans;
    }
    public static int countUnique(int[] arr) {
     int i = 0;
     for (int j = 1; j < arr.length; j++) {
         if (arr[i] != arr[j]) {
             i++;
             arr[i] = arr[j];

         }
     }
     return 1;
    }
    public static boolean permutations(String s, String t) {
        if (s.length() != t.length()) return false;
//        char[] newS = s.toCharArray();
//        Arrays.sort(newS);
//        System.out.println(newS);
//        char[] newT = t.toCharArray();
//        Arrays.sort(newT);
//        System.out.println(newT);
//        return Arrays.equals(newS, newT);
//
       int[] letters = new int[128];
////
//
       char[] ss = s.toCharArray();
        System.out.println(Arrays.toString(ss));
       for ( char c : ss) {
           letters[c]++;
           System.out.println(letters[c]);
       }
        System.out.println(Arrays.toString(ss));
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            System.out.println(letters[c]);
            if (letters[c] < 0) return false;
        }
       return true;
    }

//    Unique Character set
    public static boolean uniqueChar(String str) {
        if (str.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
    public static boolean permu(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charset = new int[128];
        char[] s_array = s.toCharArray();

        for ( char c : s_array) {
            charset[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            charset[c]--;
            if (charset[c] < 0) {
                return false;
            }
        }
        return true;

    }
    public static double power(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            n = Math.abs(n);
            return (1/ (x * power(x, n - 1)));
        } else {
            return x * power(x, n - 1);
        }
    }

    public static boolean uniqueString(String c) {
        if (c.length() > 128) return false;
        boolean[] cSet = new boolean[128];
        for (int i = 0; i < c.length(); i++) {
            int val = c.charAt(i);
            if (!cSet[val]) {
                return false;
            }
            cSet[val] = true;
        }
        return true;
    }
    public static boolean permus(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[128];
        char[] sArray = s.toCharArray();
        for (char c : sArray) {

            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) return false;
        }return true;
    }

}