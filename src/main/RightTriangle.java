package main;

public class RightTriangle {

	public static void main(String[] args) {
		if (args.length < 1) {
			String msg = "Usage: java RightTriangle n";
			System.out.println(msg);
			System.exit(0);
		}
		int n = Integer.parseInt(args[0]);
		printTable(n);
	}
	
	public static void printTable(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				double hyp = hypotenuse(i, j);
				if (hyp == Math.floor(hyp)) {
					System.out.print(i + "\t" + j + "\t");
					System.out.println((int)hyp);
				}
			}
		}
	}
	
	public static double hypotenuse(int a, int b) {
		int c2 = square(a) + square(b);
		return Math.sqrt(c2);
	}
	
	public static int square(int k) {
		return k * k;
	}
}
