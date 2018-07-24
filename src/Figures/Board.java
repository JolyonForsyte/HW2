package Figures;

public class Board {
	Shape[] s = new Shape[4];
	
	public void addShape(Shape shape, int quadrant) {
		if(quadrant > 0 && quadrant <= 4) {
				s[quadrant-1] = shape;
				System.out.println("В квадрант "+quadrant + " добавлена фигура "+shape);
		
		}
	}
	
	public void removeShape(int quadrant) {
		if(quadrant > 0 && quadrant <= 4) {
			s[quadrant-1]=null;
			System.out.println("Из квадранта "+quadrant + " удалена фигура ");
		}
	}
	
	public void showInfo() {
		double  total = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i]!=null) {
			total+=s[i].getArea();
			
		}
	}
		System.out.println("Суммарная площадь фигур на доске: " + total);
}
}
