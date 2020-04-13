package UTILS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQLConnUtils {
 
 // Kết nối vào MySQL.
 public static Connection getMySQLConnection() throws SQLException,
         ClassNotFoundException {
     String hostName = "localhost";//mặc định
     String dbName = "dangnhap";//tên database 
     String userName = "root";//mặc định
     String password = "";//mặc định
 
     return getMySQLConnection(hostName, dbName, userName, password);
 }
 
 public static Connection getMySQLConnection(String hostName, String dbName,
         String userName, String password) throws SQLException,
         ClassNotFoundException {
 
     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
 
     Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
 /*public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
 
      // Lấy ra đối tượng Connection kết nối vào DB.
      Connection connection = ConnectionUtils.getMyConnection();
 
      // Tạo đối tượng Statement.
      Statement statement = connection.createStatement();
 
      String sql = "Select UserName from dangnhap";
      
 
      // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
      ResultSet rs = statement.executeQuery(sql);
 
      // Duyệt trên kết quả trả về.
      while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
          String username = rs.getString(1);          
          System.out.println("Username:" + username);         
         
      }
     
      // Đóng kết nối
      connection.close();
  }*/

} 