public class Fn_overload {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Fn_overload calc = new Fn_overload();

        System.out.println(calc.add(5, 10));        // calls first method
        System.out.println(calc.add(5, 10, 15));    // calls second method
        System.out.println(calc.add(5.5, 10.5));    // calls third method
    }
}