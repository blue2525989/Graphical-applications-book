package main;

import org.junit.Assert;

public class Point {

	protected int x;
	protected int y;
	
	public Point(int newX, int newY) { this.x = newX; this.y = newY; };
	
	public Point(Point p) { this.x = p.getX(); this.y = p.getY(); };
	
	public Point() { this(0, 0); };
	
	public int getX() {
		return x;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public void setCoordinates(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void setCoordinates(Point p) {
		setX(p.getX());
		setY(p.getY());
	}
	
	public void moveBy(int dx, int dy) {
		setCoordinates(this.getX() + dx, this.getY() + dy);
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
	
	public void translate(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}
	
	static void translate1(Point p, int dx, int dy) {
		p.setX(p.getX() + dx);
		p.setY(p.getY() + dy);
	}
	
	Point translate2(Point p, int dx, int dy) {
		Assert.assertNotNull("Must not be null!", p);
		Point q = new Point(p.getX() + dx, p.getY() + dy);
		return q;
	}
	
	static Point translate3(Point p, int dx, int dy) {
		p.setX(dx);
		p.setY(dy);		
		return p;
	}
	
	public double distance(Point p) {
		int newX = p.getX() - this.x;
		int newY = p.getY() - this.y;
		String temp = newX+"."+newY;
		double dist = Double.parseDouble(temp);
		return dist;
	}
	
	public void translate5(Point p, int dx, int dy) throws NullPointerException {
		if (p == null) throw new NullPointerException ("Point must not be null");
		p.setX(dx);
		p.setY(dy);
	}
	
	public void translatePoints1(Point[] points, int dx, int dy) throws NullPointerException,
	IllegalArgumentException {
		if (points == null) throw new NullPointerException("Must send array of points.");
		for (int i = 0; i < points.length; i++) {
			try {
				translate5(points[i], dx, dy);
			} catch (NullPointerException e) {
				// assign new point if null
				points[i] = new Point(dx, dy);
			}
		}
	}
	
		
	public static void main(String[] args) {
			
		Point p = new Point(2, 3);
		Point q = new Point(p);
		q.translate(7, 74);
		q.translate2(p, 7, 74);
		System.out.printf("%s, %s\n", p, q);
		System.out.println(p.distance(q)+"");
	}
	
}
