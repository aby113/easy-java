package ex07.ex7_27;

public class Outer {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(new Outer().value);
		}
	} // Inner클래스의 끝
}
