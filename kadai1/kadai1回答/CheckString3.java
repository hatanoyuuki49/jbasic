package kadai1;

import java.util.Scanner;

public class CheckString3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("名前：");
		String name = scan.next();

		if (name.length() > 20) {
			System.out.println("エラー：20文字以内で入力してください");
		} else {
			System.out.println("ようこそ" + name + "さん");
		}

		scan.close();
	}
}
