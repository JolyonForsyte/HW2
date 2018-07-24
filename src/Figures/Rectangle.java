package Figures;

public class Rectangle extends Shape {
	private Point apexD;
	private Point apexE;
	private Point apexF;
	private Point apexG;

	public Rectangle(Point apexD, Point apexE, Point apexF, Point apexG) {
		
		this.apexD = apexD;
		this.apexE = apexE;
		this.apexF = apexF;
		this.apexG = apexG;
	}
	public Rectangle() {
		
	}

	public Point getApexD() {
		return apexD;
	}

	public void setApexD(Point apexD) {
		this.apexD = apexD;
	}

	public Point getApexE() {
		return apexE;
	}

	public void setApexE(Point apexE) {
		this.apexE = apexE;
	}

	public Point getApexF() {
		return apexF;
	}

	public void setApexF(Point apexF) {
		this.apexF = apexF;
	}

	public Point getApexG() {
		return apexG;
	}

	public void setApexG(Point apexG) {
		this.apexG = apexG;
	}

	@Override
	public String toString() {
		return "Rectangle [apexD=" + apexD + ", apexE=" + apexE + ", apexF=" + apexF + ", apexG=" + apexG ;
	}

	@Override
	public double getPerimetr() {
		
		return ((Point.getDistance(apexE, apexD))+(Point.getDistance(apexD, apexF))*2);
	}

	@Override
	public double getArea() {
		return ((Point.getDistance(apexE, apexD))*(Point.getDistance(apexD, apexF))); 
	}

}
