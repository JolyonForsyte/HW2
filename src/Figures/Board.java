package Figures;

public class Board {
	Shape[] s = new Shape[4];
	
	public void addShape(Shape shape, int quadrant) {
		if(quadrant > 0 && quadrant <= 4) {
				s[quadrant-1] = shape;
				System.out.println("New shape "+shape + "is added to quadrant "+ quadrant);
		
		}
	}
	
	public void removeShape(int quadrant) {
		if(quadrant > 0 && quadrant <= 4) {
			s[quadrant-1]=null;
			System.out.println("the shape has been removed from quadrant  "+quadrant);
		}
	}
	
	public void showInfo() {
		double  total = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i]!=null) {
			total+=s[i].getArea();
			
		}
	}
		System.out.println("Total area of shapes on the board: " + total);
}
}
