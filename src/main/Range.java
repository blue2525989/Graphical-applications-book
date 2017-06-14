package main;

public class Range {
	
	private int min;
	private int max;
	
	public Range(int min, int max) {
		if (min > max) throw new IllegalArgumentException();
		this.setMin(min);
		this.setMax(max);
	}
	
	public Range(Range r) {
		try {
			setMin(r.getMin());
			setMax(r.getMax());
		} catch (NullPointerException e) {
			setMin(0);
			setMax(0);
		}
	}
	
	public Range() {
		this.setMin(0);
		this.setMax(0);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public void setMinMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int length() {
		return max-min;
	}
	
	public int size() {
		return this.length() + 1;
	}
	
	public boolean contains(int a) {
		return false;
	}

}
