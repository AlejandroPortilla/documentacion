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
    /*
     *Creacion del singleton   
     */    
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }

    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
    /*
    * Verificacion de usuario y contraseña    
    */
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
