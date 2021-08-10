package mostwanted;

public class ClassCastDemo {
    public static void main(String[] args) {

        Object o = new Object();
        String str = (String) o;

        if(o instanceof String){
            String s = (String) o;
        }

    }
}
