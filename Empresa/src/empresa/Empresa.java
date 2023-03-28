/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 * 
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // estamos llamando al a clase Login y la muestra
        Login login=Login.getLogin();
        login.setVisible(true);
    }
    
}
