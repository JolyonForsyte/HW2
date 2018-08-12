package Figures;

import java.util.Arrays;

public class Board {
	private Shape[] s = new Shape[4];
	
	
	public Board() {
		super();
	}
	
	public void addShape(Shape shape, int quadrant) {
		if(quadrant > 0 && quadrant <= 4)
		//board{position] == null
			{
				s[quadrant-1] = shape;
				System.out.println("New shape "+shape + "is added to quadrant "+ quadrant);
		
		}
	}
	
	public void removeShape(int quadrant) {
		if(quadrant > 0 && quadrant <= 4) 
			//board{position] != null
			{
			s[quadrant-1]=null;
			System.out.println("the shape has been removed from quadrant  "+quadrant);
		}
	}
	
	
	
	public double getTotalArea() {
		double  total = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i]!=null) {
			total+=s[i].getArea();
			
		}
	}
		//System.out.println("Total area of shapes on the board: " + total);
		return total;
}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<s.length; i++) {
			if(s[i]!=null) {
				sb.append(((i+1)+")"+s[i]));
			}
			else {
				sb.append((i+1)+")"+"Empty");
			}
			sb.append(System.lineSeparator());
		}
		
		sb.append("Total Area = " + getTotalArea());
		return sb.toString();
	}

	
	
}
