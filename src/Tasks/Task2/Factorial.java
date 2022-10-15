package Tasks.Task2;

public class Factorial {

    public static int factorialCounter(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double countUn(int n) {
        //un = (1 / n!) * (1! + 2! + 3! + ... + n!)
        double un = 1.0 / factorialCounter(n);
        int valueInBrackets = 0;
        for (int i = 1; i <= n; i++) {
            valueInBrackets += factorialCounter(i);
        }
        un *= valueInBrackets;
        return un;
    }

    public static void main(String[] args) {
        System.out.println(countUn(10));
    }
}
