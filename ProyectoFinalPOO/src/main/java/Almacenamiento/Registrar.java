package Almacenamiento;

import UserInterface.PanelInicio;
import UserInterface.PanelRegistro;

import javax.swing.*;
import java.sql.SQLException;
//AUTOR ARMIN, TODOS LOS DERECHOS RESERVADOS
public class Registrar {
    PanelRegistro panelRegistro;

    public Registrar(PanelRegistro panelRegistro) {
        this.panelRegistro = panelRegistro;
    }

    public void registrarUsuario() {
            String textName = panelRegistro.getTextoNombre().getText();
            String textPass = panelRegistro.getTextoClave().getText();
            try {
                ConexionBD con = new ConexionBD();
                String sql = "insert into usuario(nombre,contrasenia) values (?,?)";
                con.pst = con.conexion.prepareStatement(sql);
                con.pst.setString(1, textName);
                con.pst.setString(2, textPass);
                con.pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se han insertado los datos");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión:" + ex.getMessage());
            }




    }
}
