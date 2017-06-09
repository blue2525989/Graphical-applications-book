package main;

public class Recursion {


	public static int min2(int[] a, int lo, int hi) {
		if (lo == hi) {
			return lo;
		}
		else {
			int best = min2(a, lo+1, hi);
			if (a[lo] < a[best]) {
				return lo;
			}
			else {
				return best;
			}
		}
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return n *= factorial(n-1); 
		}
	}
	
	// recursive shell, a function that calls a recursive method
	public static int fact(int n) {
		if (n < 0) throw new IllegalArgumentException();
		return factorial(n);
	}
	
	public static int power(int a, int b) {
		if (b == 1) {
			return a;
		}
		else {
			return a *= power(a, b -1);
		}
	}
	
	// recursive shell for power
	public static int pow(int a, int b) {
		if (a < 0 || b <= 0) throw new IllegalArgumentException();
		return power(a, b);
	}
	
	public static long fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	// recursive shell for fib
	public static long fibo(int n) {
		if (n < 0) throw new IllegalArgumentException();
		return fib(n);
	}
	
	public static int sumSub(int[] a, int lo, int hi) {
		int sum = a[lo];
		if (hi == lo) {
			return sum;
		}
		else {
			sum += sumSub(a, lo+1, hi);
		}
		return sum;
	}
	
	// recursive shell for sumSub 
	public static int sumSubArray(int[] a, int lo, int hi) {
		if (a == null) throw new NullPointerException();
		if (lo < 0 || hi < lo) throw new IllegalArgumentException();
		return sumSub(a, lo, hi);
	}
	
	public static void squareMap(int[] a, int lo, int hi) {
		if (lo != hi + 1) {
			a[lo] *= a[lo];
			squareMap(a, lo+1, hi);
		}
	}
	
	public static void main(String[] args) {
		// 64
		System.out.println(pow(8, 8));
		// fib
		System.out.println(fib(10));
		
		int[] nums = {2, 2, 2, 2, 2};
		System.out.println(sumSubArray(nums, 1, 3));
		
		squareMap(nums, 0, 4);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
