import java.util.Scanner;

public class CheckString2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("色を入力してください：");
		 String color = scan.next();

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