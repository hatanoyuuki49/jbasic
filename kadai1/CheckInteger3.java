import java.util.Scanner;

public class CheckInteger3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("年齢を入力してください：");
		int age = scan.nextInt();

		if (0 >= 0 && age <= 130) {
            System.out.println("正しい年齢です");
        } else {
            System.out.println("正しくない年齢です");
               }


		scan.close();
	}
} 