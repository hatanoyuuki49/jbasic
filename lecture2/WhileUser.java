public class WhileUser {
    public static void main(String[] args) {
        int [] scores =new int[] {58, 29, 75, 87, 98, 83};//配列リテラル
        int intlength = scores.length;
        int i = 0;
        while (i < intlength) {//0~9までの整数を表示
            System.out.println(scores[i]);
            i++;
        }
    }
}