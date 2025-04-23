public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("這是我的第1個Java程式!");
        // System.out.println("這是我的第2個Java程式!");
        // System.out.println("這是我的第3個Java程式!");
        // System.out.println("這是我的第4個Java程式!");
        // System.out.println("這是我的第5個Java程式!");
        // System.out.println("這是我的第6個Java程式!");

        // int age=25;
        // System.out.println(age);

        // double weight = 49.49;
        // System.out.println(weight);

        // String name="Laney";
        // System.out.println(name);

        // int[]bingo = {7, 22,55,89};
        // System.out.println(bingo[2]);

        // String [] students = {"A","B","C","D"};
        // System.out.println(students[3]);

        // boolean isStudent = true; //false;
        // System.out.println(isStudent);

        // for 迴圈
        // for (int index= 0; index<=10; index++){
        // System.out.println(index);
        // }

        int[] bingo = { 7, 22, 55, 89, 33, 99, };

        // 第一種
        // for (int index = 0; index < bingo.length; index++) {
        // System.out.println(bingo[index]);
        // }

        // 第二種
        for (int index = 0; index < bingo.length - 1; index++) {
            System.out.println(bingo[index]);
        }
        
        // 


        //While
        int index = 0;
        while(index<5){
            System.out.println(index);
            index++;
        }

        String[] students = { "Laney", "David", "Aaron", "Michael", "Lydia" };
        for(String stu: students){
            System.out.println(stu);
        }

       
























    }
}

