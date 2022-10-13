/*
 * Nuesta clase ManejoDeArchivos va a contener los siguientes metodos
*- Crear Archivo
*- Guardar la informacion de un Archivo
*- Eliminar la informacion de un Archivo
*- Eliminar Archivo
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {

    
    /*public static void main(String[] args) {
        // TODO code application logic here
    }*/
    
    public static void crearArchivo(String name){
        File archivo=new File(name);
        try{
            PrintWriter salida=new PrintWriter(archivo);
            salida.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}
