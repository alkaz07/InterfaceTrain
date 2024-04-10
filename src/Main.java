import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //example1();
        example2();
    }
    private static void example2() {
        try {
            System.out.println("введите два числа");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Mathematician mat = new Mathematician("Кубарик");
            mat.setOperation(new Summator());
            System.out.println(mat.doOperation(x, y));

            mat.setOperation(new Divider());
            System.out.println(mat.doOperation(x, y));

            mat.setOperation(new Multiplicator());
            System.out.println(mat.doOperation(x, y));

            Mathematician mat2 = new Mathematician("Томатик");
            System.out.println(mat2.doOperation(x, y));
        }
        catch (InputMismatchException e){
            System.out.println("ничего не получается, введены не целые числа");
            e.printStackTrace();
        }
        catch (ArithmeticException ae){
            System.out.println("на ноль делить нельзя");
            ae.printStackTrace();
        }
    }


    private static void example1() {
        System.out.println("введите два числа");
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Summator su = new Summator();
        System.out.println(su.calculate(x,y));
        System.out.println(new Substractor().calculate(x, y));
        System.out.println(new Multiplicator().calculate(x, y));
        System.out.println(new Divider().calculate(x, y));
    }
}

