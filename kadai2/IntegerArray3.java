public class IntegerArray3 {
    public static void main(String[] args){
        
        int[] numbers = {1, 7, 2, 7, 3};
        int count = 0;//初期化する意味
        for (int num : numbers) {
            if (num == 7) {//==は等しいという意味
                count++;//countが1ずつ増加する意味
            }
        }
        System.out.println(count + "ありました");
    }

}
