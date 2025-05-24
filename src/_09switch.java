import java.util.Scanner;

public class _09switch {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //鑄造物件

        //這是建立一個可以輸入的物件。

         System.out.println("請輸入1-7的數字:");

        int day = scanner.nextInt();
        
        
        // int day = 4; //1-7的整數 

        switch(day){
            case 1:
                System.out.println("今天是星期日");
                break;
            case 2:
                System.out.println("今天是星期一");
                break;
            case 3:
                System.out.println("今天是星期二");
                break;
            case 4:
                System.out.println("今天是星期三");
                break;
            case 5:
                System.out.println("今天是星期四");
                break;
            case 6:
                System.out.println("今天是星期五");
                break;
            case 7:
                System.out.println("今天是星期六");
                break;
            default:
                System.out.println("未知的日期");
                break;
            //如果上述case都沒有滿足的條件就設一個預設的default，
        }


        System.out.println("******************************");

        //用Switch來判斷成績等第
        //假設成績範圍: 90-100:A, 80-89 :B, 70-79:C, 60-69:D, 0-59:E

        System.out.println("請輸入成績0-100:");
        int score = scanner.nextInt();
        
        switch (score / 10){
            case 10:
                System.out.println("等級A");
                break;
            case 9:
                System.out.println("等級A");
                break;
            case 8:
                System.out.println("等級B");
                break;
            case 7:
                System.out.println("等級C");
                break;
            case 6:
                System.out.println("等級D");
                break;
            default:
                System.out.println("等級E");
                break;
            
        }
        



        scanner.close();
        //把scanner close放在所有程式點的最下面
        //把scanner關掉，釋放資源

    }


}
