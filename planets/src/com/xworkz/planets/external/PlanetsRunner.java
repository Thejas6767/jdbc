package com.xworkz.planets.external;

import java.sql.*;

public class PlanetsRunner {

        public static void main(String[] args){
            try{
                String url= "jdbc:mysql://localhost:3306/planet_database";
                String  userName="root";
                String password="root";
                String query="insert into planet_table values (9,'mercury',1)";
                Connection connection = DriverManager.getConnection(url,userName,password);
                Statement statement = connection.createStatement();
                int rows=statement.executeUpdate(query);
                System.out.println(rows);
                if(rows==1){
                    System.out.println("it is inserted");

                }else {
                    System.out.println("not inserted");
                }
                if(connection!=null){
                    System.out.println("connected");
                }
                System.out.println("this is class");
            }catch (SQLSyntaxErrorException e){
                e.printStackTrace();
            }catch (SQLException b) {
                b.printStackTrace();

            }

        }
    }


