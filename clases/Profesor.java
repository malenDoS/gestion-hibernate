
package pac;


public class Profesor {
    
    private Long id;
    private String nombre;
    private String sexo;
    
    public Profesor(){}
    
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
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public String toString(){
        return "ID: "+this.id+". Nombre: "+this.nombre+". Sexo: "+this.sexo;
    }
}
