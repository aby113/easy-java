package ex07.shape;

public class Circle extends Shape{

	public double r; // 반지름
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(double r) {
		this.r = r;
	}


	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return r * r * 3.14;
	}

}
