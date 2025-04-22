package kadai1;

import java.util.Scanner;

public class CheckInteger4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力して下さい：");
		int input = scan.nextInt();

		String message = input + "は";

		if (input >= 0) {
			message += "正の";
		} else {
			message += "負の";
		}

		if (input % 2 == 0) {
			message += "偶数です";
		} else {
			message += "奇数です";
		}
		// 出力
		System.out.println(message);
		scan.close();
	}
}
