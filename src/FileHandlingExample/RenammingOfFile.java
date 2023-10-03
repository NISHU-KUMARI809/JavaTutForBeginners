package FileHandlingExample;
import java.io.File;
import java.io.IOException;
public class RenammingOfFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\abc.txt");
        File r=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Nishu.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesnot exist.....");
        }

    }
}
