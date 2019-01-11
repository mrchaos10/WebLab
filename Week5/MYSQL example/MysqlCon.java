
import java.sql.*;

public class MysqlCon{
public static void main(String args[]){
try{
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@192.168.1.150:1521:SFLDB1","WEBTECH","COMMON");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
String a="cccc";
String b="ddd";
//stmt.executeUpdate("INSERT INTO EMP VALUES(1,'"+a+"','"+b+"')");

ResultSet rs=stmt.executeQuery("SELECT *FROM EMP");
System.out.println("Querrying");
while(rs.next())
{
System.out.println(rs.getString("name")+" Hello \n "+rs.getString("department"));
}
con.close();

}catch(Exception e){ System.out.println(e);}

}
}
