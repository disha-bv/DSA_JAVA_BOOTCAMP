package DAY5;


import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionUsingThrows {
    public static void openFile() throws IOException{
        FileReader file = new FileReader("data.txt");
        
    }
    public static void main(String[] args) {
        try {
            openFile();
        } catch (IOException e) {
            System.out.println("Unable to open file");
        }
        
    }
    
}
