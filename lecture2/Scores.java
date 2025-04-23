public class Scores {
    public static void main(String[] args) {//String型の変数args

        int[] scores = new int[3];//点数の配列宣言とプログラムで制御できる形式への準備

        scores[0] = 58;//国語の点数

        scores[1] = 29;//数学

        scores[2] = 75;//英語

        //System.out.println(scores[2]);//英語だけの点数

        //int sum = scores[0] + scores[1] + scores[2];
        //System.out.println("合計点は" + sum + "点です"); //3科目のsumを表示:　「合計点は○○点です」

        //System.out.println(scores); 
        int[] remarks = new int[3]; //scoresとは別のものを作っている
        //int[] remarks = scores;
        scores[1] = 99;
         System.out.println(remarks);
         System.out.println(remarks[0]); 
    }
}