import java.util.Scanner;

public class CheckInteger5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("パスワード：");
		 String pass = scan.next();

		if (pass.equals("himitu")) {
            System.out.println("一致しました");
        } else  {
            System.out.println("一致しませんでした");
               }


		scan.close();
	}
} 