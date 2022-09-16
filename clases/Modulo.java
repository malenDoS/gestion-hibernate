
package pac;

public class Modulo {
    
    private Long id;
    private String nombre;
    private String codigo;
    
    public Modulo(){}
    
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
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+". ID: "+this.id+". Código: "+this.codigo;
    }
    
   
}
