package kadai1;//package

import java.util.Scanner;

public class CheckInteger1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力して下さい：");
		int input = scan.nextInt();

		if (input == 7) {
			System.out.println("大当たり！");
		} else {
			System.out.println("ハズレ");
		}

		scan.close();
	}
}
