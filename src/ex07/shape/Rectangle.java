package ex07.shape;

public class Rectangle extends Shape {

	public double width; // 넓이
	public double height; // 높이
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
/*	public boolean isSquare() {
		
		
	}*/

}
