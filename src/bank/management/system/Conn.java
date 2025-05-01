package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagament","root","System@123@");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//public static void main(String[] args) {

  //  }
}
class InsertExample {
    public static void main(String[] args) {
        try {
            Conn conn = new Conn();
            String query = "INSERT INTO users (uername, password) VALUES ('root', 'System@123@')";
            conn.statement.executeUpdate(query);
            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

