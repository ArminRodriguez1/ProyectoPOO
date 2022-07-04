package Almacenamiento;


import java.sql.*;


public class ConexionBD {
    public Connection conexion = null;

    public Statement sentencia;
    public ResultSet resultado;
    public PreparedStatement pst;
    public ConexionBD() {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
            System.out.println("error");
        }

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://bruselas.ceisufro.cl/proyectoPokemon", "pokemon", "pokemon.2022");
            //conexion = DriverManager.getConnection("jdbc:mysql://bruselas.ceisufro.cl/proyectoPokemon", "pokemon", "pokemon.2022");
            System.out.println("conectado");
        } catch (SQLException e) {
            System.out.println("no fue posible realizar la conexión a la BD");
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }

    public void intercambioCarta(int idUsuario, int idCarta){

    }
    public void agregarUsuarioABD(String nickname, String password){

    }

}























    //}
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, username, password);

        }catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error de conexion");
        }
        return connection;

        //Consulta c0 = new Consulta();

        //PreparedStatement insertarNombre = connection.prepareStatement("INSERT INTO `proyectoPokemon`.`pokemon` (`nombre`) VALUES ('Onix');");
        //PreparedStatement insertarRareza= connection.prepareStatement("INSERT INTO `proyectoPokemon`.`pokemon` (`rareza`) VALUES ('Comun');");
        //int status = insertarNombre.executeUpdate();
        //int status2= insertarRareza.executeUpdate();
        //if(status!=0 && status2!=0){
        //   System.out.println("Cambio realizado :)");

        //}
    }

         */

