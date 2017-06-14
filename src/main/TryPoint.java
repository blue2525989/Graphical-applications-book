package main;

public class TryPoint {

	public static void main(String[] args) {
		if ((args.length != 2) && (args.length != 4)) {
			String msg = "USAGE: java TryPoint x1 y1 [x2 y2]";
			System.out.println(msg);
			System.exit(0);
		}
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		PointGeometry p1 = new PointGeometry(x1, y1);
		PointGeometry p2 = new PointGeometry();
		if (args.length == 4) {
			int x2 = Integer.parseInt(args[2]);
			int y2 = Integer.parseInt(args[3]);
			p2.setX(x2);
			p2.setY(y2);
		}
		System.out.println("point 1: " + p1);
		System.out.println("point 2: " + p2);
		System.out.println("distance: " + p1.distance(p2));
		p1.translate(p2.getX(), p2.getY());
		System.out.println("point 1 translated: " + p1);
		System.out.println(p1.equals2(p1));
		System.out.println(p1.equals2(p2));
		System.out.println(p1.equals2(23));
	}
}
