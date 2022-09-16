
package pac;

import java.util.HashSet;


public class Alumno {
    
    private Long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private HashSet<Modulo> modulos;
    
    public Alumno(){}
    
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setModulos(HashSet modulos){
        this.modulos=modulos;
    }
    
    public HashSet getModulos(){
        return this.modulos;
    }
    
    public String toString(){
        return "ID: "+this.id+". Nombre: "+this.nombre+". Nacionalidad:"+this.nacionalidad+". Edad: "+this.edad+". Sexo: "+this.sexo;
    }
}
