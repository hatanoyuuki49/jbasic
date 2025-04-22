package kadai1;

import java.util.Scanner;

public class CheckString2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("色を入力して下さい：");
		String color = scan.next();

		//		if (color.equals("red")) {
		//			System.out.println("赤です");
		//
		//		} else if (color.equals("green")) {
		//			System.out.println("緑です");
		//
		//		} else if (color.equals("blue")) {
		//			System.out.println("青です");
		//
		//		} else {
		//			System.out.println("他の色を入力してください");
		//		}

		switch (color) {
		case "red":

			System.out.println("赤です");
			break;

		case "green":

			System.out.println("緑です");
			break;

		case "blue":

			System.out.println("青です");
			break;

		default:

			System.out.println("他の色を入力してください");
			break;
		}

		scan.close();
	}
}
