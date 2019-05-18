package com.GUI.SQL;

import java.sql.*;

public class SQLConnection {
  final String DatabaseUrl = "jdbc:sqlite:E:\\java\\sms\\src\\com\\GUI\\SQL\\sms.db";
  private String UserName, Password;

  public void Connection(String Query) throws SQLException {
    Connection connection = DriverManager.getConnection(DatabaseUrl);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(Query);
    while (resultSet.next()){
      System.out.println("User Id is " + resultSet.getInt("userID"));
      System.out.println("User Name is "+ resultSet.getString("Name"));
      System.out.println("User Password is "+ resultSet.getString("Password"));
    }
    statement.close();
    connection.close();
  }

  public String getPassword() throws SQLException {
    Connection connection = DriverManager.getConnection(DatabaseUrl);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT Password FROM Users");
    Password = resultSet.getString("Password");
    statement.close();
    connection.close();
    return Password;
  }

  public String getUserName() throws SQLException{
    Connection connection = DriverManager.getConnection(DatabaseUrl);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT Name FROM Users");
    UserName = resultSet.getString("Name");
    statement.close();
    connection.close();
    return UserName;
  }

}