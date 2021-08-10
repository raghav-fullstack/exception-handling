public class ArrayIndexOOBDemo {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index beyond meaningful length.");
        }
        System.out.println("This is after the for-loop.");

    }
        void method1() {
            System.out.println("This is just for demo.");
        }

}
