package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.jdbcsite.*;

public class fatchdata {
    int id;
    String name;
    String email;
    int phone;
    public static void display(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            System.out.print("id "+resultSet.getInt("id")+ " ");
            System.out.print("name "+resultSet.getNString("name")+" ");
            System.out.print("email "+resultSet.getNString("email")+" ");
            System.out.print("phone "+resultSet.getNString("phone")+" ");
            System.out.println();
        }
    }
    public  void insert(){

        System.out.println("insert name");
        name=scanner.next();
        System.out.println("insert email");
         email=scanner.next();
        System.out.println("insert phone num");
        phone =scanner.nextInt();
    }
    public static void del(int key) throws SQLException {
//        int suc = statement.executeUpdate("delete from emp where id=" + "+key+");
        int suc = statement.executeUpdate("delete from emp where id=" + key);

        if (suc > 0) {
            System.out.println("delect sucess full");
        } else {
            System.out.println("not sslect");
        }
    }}