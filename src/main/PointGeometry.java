package main;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class PointGeometry {

	private int x;
	private int y;
	
	public PointGeometry (int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public PointGeometry(PointGeometry p) {
		try {
			this.x = p.getX();
			this.y = p.getY();
		} catch (NullPointerException e) {
			this.x = 0;
			this.y = 0;
		}
	}
	
	public PointGeometry() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public double distance(PointGeometry p) {
		try {
			long dx = this.getX() - p.getX();
			long dy = this.getY() - p.getY();
			double d2 = dx * dx + dy * dy;
			return Math.sqrt(d2);
		} catch (NullPointerException e) {
			return -1;
		}
	}
	
	public Shape shape() {
		return new Ellipse2D.Float(getX()-2, getY()-2, 4, 4);
	}
	
	public void translate(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}
	
	public boolean equals(Object obj) {
		if (obj == PointGeometry.class) {
			PointGeometry p = (PointGeometry) obj;
			return (p.getX() == getX() && p.getY() == getY());
		}
		return false;
	}
	
	public String toString() {
		return "(" + getX() +"," + getY() + ")";
	}
	
}
