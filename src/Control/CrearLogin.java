/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Estudiante
 */
import Entidad.Usuario;
import Frontera.FramePrincipal;
import Entidad.Sistema;
/**
 *
 * @author Estudiante
 */
public class CrearLogin {
    
    private Sistema sistema = FramePrincipal.sistema;
    
    public CrearLogin(){
        
    }
    
    public String verificarLogin (Usuario usuario){
        if (!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
        
        if (!verificarLongitudPassword(usuario.getPassword())){
            return ("Longitud contraseña incorrecta");
        }
        for (Usuario u: sistema.getUsuarios()){
            if (u.getNombre().equals(usuario.getNombre()) &&  u.getPassword().equals(usuario.getPassword())){
            return ("Ya Registrado");            
        }
        }
        return ("Datos incorrectos");
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() > 1 && nombre.length() <= 6);
    }
    
    
    
    public boolean verificarLongitudPassword(String password){
         return (password.length() >= 3 && password.length() < 6);
    }
     
    
            
            
         
    
}
