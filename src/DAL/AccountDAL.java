package DAL;

import UTILS.ConnectionUtils;
import DTO.AccountDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
public class AccountDAL {
    static ConnectionUtils dbUtils;
    static Connection con;
    static PreparedStatement preparedStatement=null;
    static ResultSet resultset=null;
    public static ResultSet Login(String UserName, String Password) {
        con = dbUtils.getMyConnection();
        String sql="SELECT * FROM `dangnhap` WHERE  UserName=? and Password=?";
        try{
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,UserName);
            preparedStatement.setString(2,Password);
            return preparedStatement.executeQuery();
        }
        catch(Exception e){
            return resultset=null;
        }
    }
}
        


