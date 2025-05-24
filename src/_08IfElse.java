public class _08IfElse {
    public static void main(String[] args) {
        //條件判斷式
        //範例:1. 判斷是否為偶數

        int number = 10; 
        //這裡隨機給的數字都要能夠辨識的出來

        // if(條件){
        //     當條件成立時要執行的程式
        // }

        //判斷是否為偶數就是除以2會等於0，會被整除就是偶數。
        //判斷奇數的方法，就用else的特性(2擇一)，不是偶數就是奇數。
        if (number % 2 == 0 ) {

            System.out.println(number + "是偶數");
            
        } else {
            System.out.println(number + "是奇數");
        }

        System.out.println("*******************************************");


        //如果不是二擇一的類型

        //判斷三角形類型
    
        int a = 3, b=3, c=3;
        if (a==b && b==c){
            System.out.println("它是正三角形");
        }

        //其他的if條件
        else if(a==b && b==c || a==c){
            System.out.println("它是等腰三角形");
        }

        else{
            System.out.println("它既不是正三角形，也不是等腰三角形");
        }

        // 邏輯運算的&&(and)和||(or)出現的條件，
        //記得要先寫&&，因為&&的條件比較嚴苛， 
        // ||只要達成其一條件就可以達成。

        System.out.println("**************************************");

        //判斷成績等級
        //假設成績範圍: 90-100:A, 80-89 :B, 70-79:C, 60-69:D, 0-59:E

        int score = 75;
        if (score>=90){
            System.out.println("成績等級為A");
        } else if (score>=80) {
            System.out.println("成績等級為B");
        } else if (score>=70) {
            System.out.println("成績等級為C");
        } else if (score>=60) {
            System.out.println("成績等級為D");
        } else{
            System.out.println("成績等級為E");
        }

        System.out.println("**************************************");

        //判斷閏年
        //年份能被4整除且不能被100整除，或是能被400整除，就是閏年
        //每四年閏一次，逢百不閏，逢400要閏
        int year = 2100;
   

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+"年是閏年");
        } else{
            System.out.println(year+"年不是閏年");
        }   
        
        System.out.println("**************************************");


    }


}
