import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        int a,b,c;
        try {
            System.out.println("Enter two integers");
            Scanner obj = new Scanner(System.in);
            a = obj.nextInt();
            b = obj.nextInt();
            c = a / b;
            System.out.println("Division Results :" + c);
        }catch (ArithmeticException e){
            System.out.println("division by zero is not possible.");
        }finally {
            System.out.println("This is inside the finally blocked.");
        }
        System.out.println("More code can do here.");

    }
}
