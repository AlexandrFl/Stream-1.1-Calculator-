public class Main {

    public static void main(String[] args) {
	Calculator calculator = Calculator.instance.get();
    int a = calculator.plus.apply(8,2);
    int b = calculator.minus.apply(a, 6);
    int c = calculator.divide.apply(b,2);
    int d = calculator.multiply.apply(c,a);
    calculator.println.accept(d);
    }
}
