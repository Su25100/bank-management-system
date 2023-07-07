package bank.management.system;

import java.sql.*;

public class Connt {

    Connection connection;
    Statement statement;
    public Connt(){
        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bankmgmt_system","postgres","abc");
            statement=connection.createStatement();

            //after "connection.createStatement()" : now the connection of java with postgres sql is done.
        }
        catch(Exception e){
                 e.printStackTrace();
        }
    }
}
