import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            FileReader fin=new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c=fin.read())!=-1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
