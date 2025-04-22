package kadai1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int maxScore = scan.nextInt(); // 最高点数を設定
		String maxSubject = "国語"; // 最高点数の科目を設定

		System.out.print("数学の点数を入力してください：");
		int input = scan.nextInt();
		if (input > maxScore) {
			// 数学の点数が国語の点数よりも高ければ
			// 最高点数と最高点数の科目を設定
			maxScore = input;
			maxSubject = "数学";
		}

		System.out.print("英語の点数を入力してください：");
		input = scan.nextInt();
		if (input > maxScore) {
			// 数学の点数が今までの最高点数よりも高ければ
			// 最高点数と最高点数の科目を設定
			maxScore = input;
			maxSubject = "英語";
		}

		// 最高得点の科目と最高得点を出力
		System.out.println("最高点は" + maxSubject + "で" + maxScore + "点です");

		scan.close();
	}
}
