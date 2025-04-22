package kadai1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3科目のテストの点数を入力
		System.out.print("国語の点数を入力してください：");
		int jpnScore = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int mathScore = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int engScore = scan.nextInt();

		// 合否判定
		if (jpnScore >= 80 && mathScore >= 75 && engScore >= 70) {
			// 英語が80点以上かつ数学が75点以上かつ英語が70点以上なら合格
			System.out.println("合格です");
		} else {
			// それ以外なら不合格
			System.out.println("不合格です");
		}

		scan.close();
	}
}
