package Figures;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		
	}
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	//distance between two points
	public static double getDistance(Point a, Point b) {
		return Math.sqrt(
				(a.getX()-b.getX())*(a.getX()-b.getX()) + 
				(a.getY()-b.getY())*(a.getY()-b.getY())
				);
	}

}
