package com.GUI.SQL;

import java.sql.*;

public class SQLConnection {
  public void Connection() throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:sqlite:E:\\java\\sms\\src\\com\\GUI\\SQL\\sms.db");
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from Users");
    while (resultSet.next()){
      System.out.println("User Id is " + resultSet.getInt("userID"));
      System.out.println("User Name is "+ resultSet.getString("Name"));
      System.out.println("User Password is "+ resultSet.getString("Password"));
    }
    statement.close();
    connection.close();
  }
}