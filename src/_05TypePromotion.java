public class _05TypePromotion {
    public static void main(String[] args) {
        
        //在Java中, 若兩個運算元的型別不同，會進行型別提升(type promotion)
        //遵循以下規則:

        //1.byte, short, 和char 在運算時會自動提升為int

        byte a =10 ;
        byte b = 20;
        // byte c = a+b;  無法成立，因為資料型態變為int 
        int c = a+b ; 
        System.out.println(c);

        //2. 如果int和long運算，結果會是long
        //如果long(整數)4bytes跟float(單精準浮點數)8bytes運算，結果會是float
        //如果float跟double運算，結果會是double
        //運算，一般來說小的bytes會被提升成大的bytes, long&float相加不同。

        //3. 數值跟字串運算，結果會轉為字串
        int num = 42; 
        String str = "Hello";
        String result = num + str;
        System.out.println("int + Strin = String: " + result);


        //4. 數值跟布林運算 (不合法)
        boolean bool = true; 
        //int invalidResult = num + bool ; 
        System.out.println("數值無法與布林運算");

        
        //ASCII code會用在位元的運算
        char aa = '1'; //ASCII 1 =十進制的 49 (變成int)
        char bb = '2'; //ASCII 2 =十進制的 50 (變成int)
        int r = aa+bb; 
        System.out.println(r);




    }


}
