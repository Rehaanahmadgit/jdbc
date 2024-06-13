package org.example;

import java.sql.*;
import java.util.Scanner;

public class jdbcsite {
 static    ResultSet resultSet=null;
 static    Statement statement=null;
 static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/b_tech";
        String user = "root";
        String password = "9336119497";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();


            System.out.println("display the data press 1");
            System.out.println("insert the data press 2");
            System.out.println("if you want to del the data ,plese inter the id");
            int val = scanner.nextInt();
            switch (val) {
                case 1:
                    resultSet = statement.executeQuery("select*from emp");
                    fatchdata.display(resultSet);
                    break;
                case 2:
                    resultSet = statement.executeQuery("select max(id) as nummax from emp");

                    int max_id = 0;
                    while (resultSet.next()) {
                        max_id = resultSet.getInt("nummax");
                        System.out.println(max_id);

                    }
                    max_id++;

                    fatchdata store = new fatchdata();
                    store.insert();
                    int col = statement.executeUpdate("insert into emp(id,name,email,phone) values( " + max_id + " ,'" + store.name + "','" + store.email + "','" + store.phone + "')");
                    if (col > 0) {
                        System.out.println("insert the data ");
                    } else {
                        System.out.println("not insert");
                    }
                    break;
                case 3:
                    System.out.println("which value are you delect");
                    int key = scanner.nextInt();
                    fatchdata.del(key);
                    break;
            }


            }
        catch(Exception e){
                e.printStackTrace();
            }

    }
}
