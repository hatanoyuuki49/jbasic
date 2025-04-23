public class forUser {
    public static void main(String[] args){
        int [] scores =new int[] {58, 29, 75, 87, 98, 83};//配列リテラル
        String [] sub = {"国語", "数学", "英語", "理科", "社会","体育"};

        int sum = 0;//初期化
        

        int intlength = scores.length;
        for (int i = 0; i < intlength; i++) {
            System.out.println(sub[i] + "は" + scores[i] + "点です");
            
            sum = sum + scores[i];
        }

        for (String subj : sub){
            System.out.println(sub);
        }
            
        
        double average = (double)sum / scores.length;//小数点が出るからdouble
                                                     //double / sumはdouble   sum / sumはsumになる
                                                     //少数点以下も出力される
        System.out.println("平均点は" + average + "点です");

        System.out.println("合計点は" + sum + "点です");

        

    }
}