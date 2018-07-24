package Figures;

public class Triangle extends Shape{
	private Point apexA;
	private Point apexB;
	private Point apexC;

	public Triangle() {
		
	}
	
	public Triangle(Point apexA, Point apexB, Point apexC) {
		
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
	}

	public Point getApexA() {
		return apexA;
	}

	public void setApexA(Point apexA) {
		this.apexA = apexA;
	}

	public Point getApexB() {
		return apexB;
	}

	public void setApexB(Point apexB) {
		this.apexB = apexB;
	}

	public Point getApexC() {
		return apexC;
	}

	public void setApexC(Point apexC) {
		this.apexC = apexC;
	}

	@Override
	public String toString() {
		return "Triangle [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC;
	}

	@Override
	double getPerimetr() {
		return Point.getDistance(apexA, apexB)+Point.getDistance(apexA, apexC)+Point.getDistance(apexB, apexC);

	}

	@Override
	double getArea() {
		double p = getPerimetr()/2;
		return Math.sqrt(p*(p-Point.getDistance(apexA, apexB))*
				(p-Point.getDistance(apexA, apexC))*
				(p-Point.getDistance(apexB, apexC))
				);
	}
}
