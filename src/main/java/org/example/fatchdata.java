package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.jdbcsite.scanner;

public class fatchdata {
    int id;
    String name;
    String email;
    int phone;
    public static void display(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            System.out.print("id "+resultSet.getInt("id")+" ");
            System.out.print("name "+resultSet.getNString("name")+" ");
            System.out.print("email "+resultSet.getNString("email")+" ");
            System.out.print("phone "+resultSet.getNString("phone")+" ");
            System.out.println();
        }
    }
    public  void insert(ResultSet resultSet){
        System.out.println("insert id num");
        id=scanner.nextInt();
        System.out.println("insert name");
        name=scanner.next();
        System.out.println("insert email");
         email=scanner.next();
        System.out.println("insert phone num");
        phone =scanner.nextInt();

    }
}
