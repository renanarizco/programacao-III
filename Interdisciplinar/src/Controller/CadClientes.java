package Controller;

import java.sql.*;

public class CadClientes{
    String route = "F:\\Inter Novo\\Inter\\mart.db";
    Connection c = null;
    Statement stat = null;
    String op;

    public void connect(){
        try{
            c = DriverManager.getConnection("jdbc:sqlite:"+route);
            if (c!=null)
                System.out.println("Connected to db.");
        }
        catch (SQLException ex) {
            System.err.println("Couldn't connect."+ex.getMessage());
        }
    }

    public void insert_DB(String NAME, String LNAME, String ID, int AGE, int TIME, int SALARY) throws SQLException{
        connect();
        try {
            stat = c.createStatement();
            op = "INSERT INTO Remuneraciones (Nombre, Apellido, Rut, Edad, Tiempo, Sueldo) VALUES (" + NAME + ", " + LNAME + ", " + ID + ", " + AGE + ", " + TIME + ", " + SALARY + ");";
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
        }
        catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        c.close();
    }
}
