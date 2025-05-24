public class _07FloatingPointPrecision {
    public static void main(String[] args) {
        double x = 0.1;
        double y = 0.2;
        double sum = x+y;

        System.out.println(sum);

        //比較浮點數的時候，應避免使用==，而是容許一個誤差範圍，
        //因為浮點數的精度問題可能導致比較結果不正確
    }

}