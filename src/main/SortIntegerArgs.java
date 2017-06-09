package main;

public class SortIntegerArgs {
	
	public static int[] getNumbers(String[] args) throws NumberFormatException {
		int[] a = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		return a;
	}
	
	public static void printNumbers(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
	
	public static void sort(int[] a) throws NullPointerException {
		if (a == null) throw new NullPointerException("Array must not be null.");
		sort(a, a.length);
	}
	
	public static void sort(int[] a, int n)  throws NullPointerException, IllegalArgumentException {
		if (a == null) throw new NullPointerException("Array must not be null.");
		else if (0 <= n && n <= a.length) {
			for (int i = 0; i < n; i++) {
				int index = min(a, i, n-1);
				swap(a, i, index);
			}
		}
		else {
			IllegalArgumentException e = new IllegalArgumentException();
			System.out.println(e);
		}
	}
	
	public static int min(int[] a, int lo, int hi) {
		int index = lo;
		for (int i = lo + 1; i <= hi; i++) {
			if (a[i] < a[index]) {
				index = i;
			}
		}
		return index;
	}
	
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
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return n *= factorial(n-1); 
		}
	}
	
	public static int fact(int n) {
		if (n < 0) throw new IllegalArgumentException();
		return factorial(n);
	}
	
	public static int count(int x, int[] a, int lo, int hi) {
		int count = 0;
		for (int i = lo; i <= hi; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public static int count2(int x, int[] a, int lo, int hi) {
		if (lo > hi) {
			return 0;
		}
		else if(x != a[lo]) {
			return count2(x, a, lo+1, hi);
		}
		else {
			return 1 + count(x, a, lo+1, hi);
		}
	}
	
	public static void main(String[] args) {
		try {
			int[] a = getNumbers(args);
			sort(a);
			printNumbers(a);
			System.out.println(min2(a, 2, 11));
		} catch (NumberFormatException e) {
			String msg = "Error: argument " + e.getMessage();
			System.out.println(msg);
			System.exit(0);
		}
	}

}
