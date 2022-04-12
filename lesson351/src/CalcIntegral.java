import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {

//метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 1e-7;
        double s = 0;
        while (a < b)
        {   s = s + n * f.applyAsDouble(a + n);
            a = a + n;
        }
        return s;
    }
}