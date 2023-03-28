/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 * @ver 1.0
 */
public class ControladorLogin implements DAOLogin{
/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 * Creando atributos, contraseña, usuario, controladorLgin todos privados
 */
    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;
    
    

    private ControladorLogin() {
        
    }
    
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }

    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }

    @Override
    public String getUsuario() {
        
        return this.usuario;
    }

    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}
