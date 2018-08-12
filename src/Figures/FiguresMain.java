package Figures;

public class FiguresMain {

	public static void main(String[] args) {
		Triangle tr = new Triangle(new Point(1,1), new Point(3,3), new Point(5,1));
		System.out.println(tr);
		System.out.println(tr.getPerimetr());
		System.out.println(tr.getArea());
		
		System.out.println("*******************");
		
		Rectangle rec = new Rectangle(new Point (0,0),new Point(0,2),new Point(4,2), new Point(4,0));
		System.out.println(rec);
		System.out.println(rec.getPerimetr());
		System.out.println(rec.getArea());
		
		System.out.println("*******************");
		Board board = new Board();
		board.addShape(tr, 1);
		board.addShape(rec, 2);
		board.addShape(rec, 3);
		board.removeShape(2);
		
		System.out.println(board);
	
		
	}

}
