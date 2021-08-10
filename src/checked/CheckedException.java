package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    void readFile() throws FileNotFoundException{
        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found.");
        }

    }

    public static void main(String[] args) {

        CheckedException ce = new CheckedException();
        try{
            ce.readFile();
        }catch (FileNotFoundException e){
            System.out.println("Pls provide file name.");
        }
    }
}
