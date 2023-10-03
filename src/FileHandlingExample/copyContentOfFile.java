package FileHandlingExample;
import java.io.*;
public class copyContentOfFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\abc.txt");
        FileOutputStream f=new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\def.txt");
        int i;
        while((i=r.read())!=-1){
            f.write((char)i);
        }
        System.out.println("Copied Succesfully");
    }
}
