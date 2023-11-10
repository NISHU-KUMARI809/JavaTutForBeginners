package DatabaseTable;
import java.sql.*;
public class InsertDataInTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@123456");
            Statement s=c.createStatement();
            String s1=("INSERT INTO Nishu_Info VALUES(12,112,34.45,3,'12.11.2003')");
            String s2=("INSERT INTO Nishu_Info VALUES(13,113,34.46,3,'1.11.2003')");
            String s3=("INSERT INTO Nishu_Info VALUES(14,114,34.47,3,'12.1.2003')");
            String s4=("INSERT INTO Nishu_Info VALUES(15,115,34.48,3,'10.10.2003')");
            String s5=("INSERT INTO Nishu_Info VALUES(16,116,34.49,3,'10.11.2003')");
            
            //s.executeUpdate(s1);
            s.executeUpdate(s2);
            s.executeUpdate(s3);
            s.executeUpdate(s4);
            s.executeUpdate(s5);
            
            
        }
        catch(Exception exe){
            System.out.println(exe);
        }
    }
    
}
