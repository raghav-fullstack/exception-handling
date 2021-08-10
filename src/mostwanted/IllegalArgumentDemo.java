package mostwanted;

public class IllegalArgumentDemo {

    public int sum(int a, int b ){
        if(a==0 || b==0){
            throw new IllegalArgumentException("Numbers can't be zero.");
        }
        return a+b;
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(11);
    }
}
