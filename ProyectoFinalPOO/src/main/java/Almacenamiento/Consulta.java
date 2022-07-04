package Almacenamiento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {


    private final Connection conexion = null;

    public Consulta(){
        int i = 2;
        String consulta = "SELECT nombre, rareza FROM pokemon WHERE id = '"+i+"';";
        String resultado ="";
        try{
            ResultSet rs = conexion.createStatement().executeQuery(consulta);
            resultado = rs.toString();
            while(rs.next()){
                System.out.println("rs.getString(\"nombre\") = " + rs.getString("nombre"));
                System.out.println("rs.getString(\"rareza\") = " + rs.getString("rareza"));
            }
        }catch(SQLException e){

        }
    }





}
