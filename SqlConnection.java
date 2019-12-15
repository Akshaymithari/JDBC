import java.sql.*;

public class SqlConnection {
    public static void main(String[] args){
            String url="jdbc:mysql://localhost:3306/employee",pass="root123",user="root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,user,pass);
            PreparedStatement pre = con.prepareStatement("create table emp13(emp_id int,emp_name char(50))");
            int res=pre.executeUpdate();
            if(res==0)
            System.out.println("table is created :"+res);
        }catch (ClassNotFoundException | SQLException e ){
            e.printStackTrace();
        }
    }
}
