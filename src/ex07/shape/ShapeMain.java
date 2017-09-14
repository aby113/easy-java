package ex07.shape;

public class ShapeMain {

	public static void main(String[] args) {

		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));

	}

	public static double sumArea(Shape[] arr) {
		double sumArea = 0.0;
		for (int i = 0; i < arr.length; i++) {
			
			sumArea += arr[i].calcArea();
		}
		return sumArea;
	}

}
