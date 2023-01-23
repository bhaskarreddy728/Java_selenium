package day3;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumbers(5, 6);
        calculator.subNumbers(5, 6);
        calculator.mulNumbers(5, 6);
        calculator.divNumbers(10, 5);
        calculator.modNumbers(18, 7);
    }

    public void addNumbers(int x, int y) {
        int sum = x + y;
        System.out.println("Sum : " + sum);
    }

    public void subNumbers(int x, int y) {
        int sub = x - y;
        System.out.println("Sub : " + sub);
    }

    public void mulNumbers(int x, int y) {
        int mul = x * y;
        System.out.println("Mul : " + mul);
    }

    public void divNumbers(int x, int y) {
        int div = x / y;
        System.out.println("Div : " + div);
    }

    public void modNumbers(int x, int y) {
        int mod = x / y;
        System.out.println("Mod : " + mod);
    }
}