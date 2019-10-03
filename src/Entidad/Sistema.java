/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Sistema {
    
    public ArrayList <Usuario> usuarios;
    
    public Sistema(){
        
    }
    
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    
    public void setUsuarois(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    
}
