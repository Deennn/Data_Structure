package deenn.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOfDigits(1273));
        System.out.println(power(3,2));
        System.out.println(gcd(123));
    }
    public static int sumOfDigits(int num) {
        if (num <= 9) return num;
        return num % 10 + sumOfDigits(num/10);
    }
    public static  int power(int base, int exp) {
        if (exp < 0) return -1;
        if (exp == 0) return 1;
        return base * power(base, exp-1);
    }
    public static int gcd(int num) {
        return num;
    }
}
