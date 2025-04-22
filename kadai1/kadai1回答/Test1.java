package kadai1;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 3科目のテストの点数を入力
		System.out.print("国語の点数を入力してください：");
		int jpnScore = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int mathScore = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int engScore = scan.nextInt();
		
		// 平均点を求める
		double average = (jpnScore + mathScore + engScore) / 3.0;
		
		// 平均点の出力
		System.out.println("平均は" + average + "点です");
		
		scan.close();
	}
}
