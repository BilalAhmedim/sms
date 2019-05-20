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

  public String getUserPassword() throws SQLException {
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

  public void setAdmission(String FirstName, String LastName, String FName, String MName, String DOB, String Mobile, String Address, String Tenth, String Inter, String TC, String CC, String IC)throws SQLException{
    Connection connection = DriverManager.getConnection(DatabaseUrl);
    Statement statement = connection.createStatement();
    statement.executeQuery(
        "insert into " +
        "Student_Information(Student_FName, Student_LName, Student_Father, Student_Mother, Student_DOB, Student_Mobile, Student_Address, Student_HS_Sheet, Student_IM_Sheet, Student_TC, Student_Cast, Student_Income)" +
        " Values('FirstName', 'LastName', 'FName', 'MName', 'DOB', 'Mobile' , 'Address', 'Tenth', 'Inter', 'TC', 'CC', 'IC')"
    );
    statement.close();
    connection.close();
  }

  public String[] getAdmission(int ID)throws SQLException{
    Connection connection = DriverManager.getConnection(DatabaseUrl);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Student_Information WHERE StudentID ="+ID);
    String Student[] = new String[12];
    int counter = 0;
    while (resultSet.next()){
      Student[counter] = resultSet.getString(counter);
    }
    statement.close();
    connection.close();
    return Student;
  }

}