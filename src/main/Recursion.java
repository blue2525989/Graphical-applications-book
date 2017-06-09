package main;

public class Recursion {


	// finds minimum element in the array
	public static int min(int[] a, int lo, int hi) {
		if (lo == hi) {
			return lo;
		}
		else {
			int best = min(a, lo+1, hi);
			if (a[lo] < a[best]) {
				return lo;
			}
			else {
				return best;
			}
		}
	}
	
	// recursive shell for minimum
	public static int min2(int[] a, int lo, int hi) {
		if (a == null) throw new NullPointerException();
		if (lo < 0 || lo > hi) throw new IllegalArgumentException();
		return min(a, lo, hi);
	}
	
	// n * n-1 until n = 0
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
	
	// a to the power of b
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
	
	// fib sequence n-1 + n-2 until n = 0
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
	
	// sums up sub array between a[lo] ... a[hi]
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
	
	// square roots every element of array
	public static void squareMapHelper(int[] a, int lo, int hi) {
		if (lo != hi + 1) {
			a[lo] *= a[lo];
			squareMap(a, lo+1, hi);
		}
	}
	
	// recursive shell for squareMap
	public static void squareMap(int[] a, int lo, int hi) {
		if (a == null) throw new NullPointerException();
		if (lo < 0) throw new IllegalArgumentException();
		squareMapHelper(a, lo, hi);
	}
	
	// adds n+1 n+2 ... ... n+n
	public static int summationHelper(int n) {
		int sum = n;
		if (n > 0) {
			sum += summationHelper(n-1); 
		}
		return sum;
	}
	
	// recursive shell for summation
	public static int summation(int n) {
		if (n < 0) throw new IllegalArgumentException();
		return summationHelper(n);
	}
	
	// find element x in array
	public static int findElement(int x, int[] a, int lo, int hi) {
		int idx = 0;
		if (a[lo] == x) {
			idx = lo;
		}
		else if (lo == hi) {
			return -1;
		}
		else {
			lo = findElement(x, a, lo +1, hi);
			return lo;
		}
		return idx;
	}
	
	// recursive shell for find
	public static int find(int x, int[] a, int lo, int hi) {
		if (a == null) throw new NullPointerException();
		if (x < 0 || lo < 0 || lo > hi) throw new IllegalArgumentException();
		return findElement(x, a, lo, hi);
	}
	
	// merge sort
	public static void msort(int[] a, int lo, int hi) {
		if (lo < hi) {
		// have to come back to this one
			
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void sort(int[] a) {
		msort(a, 0, a.length-1);
	}
	
	public static void main(String[] args) {
		// 64
		System.out.println(pow(8, 8));
		// fib
		System.out.println(fib(10));
		
		int[] nums = {6, 5, 4, 3, 2, 1};
		System.out.println(sumSubArray(nums, 1, 3));
		/*
		squareMap(nums, 0, 4);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		*/
		System.out.println("\n" + summation(4) + "\n");
		
		System.out.println(find(4, nums, 0, 4) + "\n");
		
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
