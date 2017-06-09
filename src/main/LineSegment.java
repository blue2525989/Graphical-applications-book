package main;

public class LineSegment {

	protected Point endPoint0, endPoint1;
	
	public LineSegment(int x0, int y0, int x1, int y1) {
		endPoint0 = new Point(x0, y0);
		endPoint1 = new Point(x1, y1);
	}
	
	public void moveEndPoint0(int newX, int newY) {
		endPoint0.setCoordinates(newX,  newY);
	}
	
	public void moveEndPoint1(int newX, int newY) {
		endPoint1.setCoordinates(newX, newY);
	}
}
