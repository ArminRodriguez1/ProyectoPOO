package Almacenamiento;


import java.util.ArrayList;


public class UserData {
    private String nombre;
    private String clave;


    public UserData(String nombre, String clave, String email) {

        componentesIniciales(nombre,clave,email);
    }
    public UserData() {

    }
    //clase para guardar, NO IMPLEMENTADA

    private void componentesIniciales(String nickname, String clave,String email) {
        this.nombre = nickname ;
        System.out.println("Registrado Exitosamente: " + nickname);


    }




}

