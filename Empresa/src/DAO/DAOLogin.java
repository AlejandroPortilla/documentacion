/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 */
public interface DAOLogin {
    //aqui yo no supe si era documentarlo como nos enseño o como comentario asi que decidi hacerlo por comentario de doble slash
    
    // con esto se evita que accedan directamente a los datos, Y se proteje a los metodos de ControladorLogin
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    public String getUsuario();
    public boolean CambiarContrasenia(String contrasenia);
    
}
