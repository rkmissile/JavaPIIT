package day7;

import java.sql.*;

public class DatabaseConnectivity2 {
    public static ResultSet getTable(String query) throws SQLException, ClassNotFoundException {



        String username = "root";
        String password = "rkmissile";
        String dbName = "peoplentech";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String query = "select * from student;";
        ResultSet resultSet = getTable(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");
            System.out.println(id + " " + name + " " + location);
        }
    }
}
