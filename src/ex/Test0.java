package ex;

import java.util.Arrays;

import org.junit.Test;

public class Test0 {

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		try {
			System.out.println(java.util.Arrays.toString(shuffle(original)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int[] shuffle(int[] arr) throws Exception {
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr.length - 1; j > 0; j--) {

				int x = (int) (Math.random() * arr.length);
				int y = (int) (Math.random() * arr.length);
				int temp1 = arr[y];
				int temp2 = arr[j];
				arr[y] = arr[x];
				arr[x] = temp1;
				arr[j] = arr[i];
				arr[i] = temp2;
				
				System.out.printf("x=%d, y=%d", x, y);
				System.out.printf("arr[y]=%d, arr[x]=%d, arr[j]=%d, arr[j]=%d"
						+"%n", arr[y], arr[x], arr[j], arr[i]);
				System.out.println(Arrays.toString(arr));
			}
		}
		return arr;
	}

}
