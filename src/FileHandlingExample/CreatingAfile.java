package FileHandlingExample;
import java.io.*;
public class CreatingAfile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\abc.txt");
        if(f.createNewFile()){
            System.out.println("File successfully created");
        }
        else{
            System.out.println("file is already exist......");
        }
    }

}
