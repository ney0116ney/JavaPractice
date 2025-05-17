public class Expression {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
       
        System.out.println("加法:" + (a + b)); //加法
        System.out.println("減法:" + (a - b)); //減法
        System.out.println("乘法:" + (a * b)); //乘法
        System.out.println("除法:" + (a / b)); //除法
        System.out.println("取餘數:" + (a % b)); //取餘數

        System.out.println("=======================");

        //比較運算子
        System.out.println("a == b:" + (a == b)); //等於
        System.out.println("a != b:" + (a != b)); //不等於 

        System.out.println("a > b:" + (a > b)); //大於
        System.out.println("a < b:" + (a < b)); //小於    
        System.out.println("a >= b:" + (a >= b)); //大於等於 意思是大於或等於
        System.out.println("a <= b:" + (a <= b)); //小於等於 意思是小於或等於            
                 
        
        System.out.println("=======================");

        //邏輯運算子
        boolean x = true;
        boolean y = false;

        System.out.println("x && y:" + (x && y)); //AND 且 兩邊都要成立
        System.out.println("x || y:" + (x || y)); //OR 或者 只要有一邊成立就成立
        System.out.println("!x:" + (!x)); //NOT 反轉

        System.out.println("邏輯 與: " + (a > b && a != b)); //先做比較運算,再做邏輯運算
        //先做a>b,再做a!=b，再看&&整個式子成立與否
        

    
        System.out.println("=======================");


        //位元運算子
        //位元運算子是針對二進位的數字進行運算
        //位元運算子有: AND, OR, XOR, NOT, 左移, 右移       
        //AND: 兩個位元都為1,結果才為1
        //OR: 兩個位元只要有一個為1,結果就為1
       
        System.out.println("位元與:" + (a & b)); //AND
        System.out.println("位元或:" + (a | b)); //OR
        System.out.println("位元異或:" + (a ^ b)); //XOR

    
        System.out.println("位元左移:" + (a << 1)); //左移1位
        System.out.println("位元右移:" + (a >> 1)); //右移1位           
        System.out.println("右移(無符號):" + (a >>> 1)); //無符號右移1位

    }

}
