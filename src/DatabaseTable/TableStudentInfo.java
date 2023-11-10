package DatabaseTable;
import java.sql.*;
public class TableStudentInfo {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@123456");
            String str="create table Nishu_Info"+ "(SNO INTEGER NOT NULL,"+
                    "ROLL_NUMBER INTEGER,"+
                    "FEES FLOAT,"+
                    "SEMESTER VARCHAR(255),"+
                    "DOB DATE,"+
                    "PRIMARY KEY(SNO))";
            Statement stmt=c.createStatement();
            stmt.executeUpdate(str);
            System.out.println("table created successfully");
            stmt.close();
            c.close();
        }
        catch(Exception exe){
            System.out.println(exe);
        }
        
        
    }
    
}
