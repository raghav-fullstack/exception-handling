package mostwanted;

public class StackOverflowDemo {

    public static void method1(){
        System.out.println("Inside method1");
        method2();
    }

    public static void method2(){
        System.out.println("Inside method2");
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}
