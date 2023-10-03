package FileHandlingExample;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter w=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\abc.txt");
        w.write("Java is a programming language and very intresting language....!");
        w.close();
    }
    //System.out.println("Sucessfully data written in file");
}
