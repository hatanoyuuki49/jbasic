import java.util.Scanner;

public class Introduce2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("情報を登録します");

        System.out.print("名前");
        String name = scan.next();

        System.out.print("趣味1");
        String hobby1 = scan.next();

        System.out.print("趣味2");
        String hobby2 = scan.next();

        System.out.print("趣味3");
        String hobby3 = scan.next();
       
       scan.close();

       String [] hobby =new String[] {hobby1, hobby2, hobby3,};
       

        
       System.out.println("こんにちは田中太郎です");
       System.out.println("私の趣味は、");
        for (String syumi : hobby) {
            System.out.println(syumi);
        }
       
       System.out.println("です");
    }
        
}
