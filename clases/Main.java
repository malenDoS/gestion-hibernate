
package pac;

import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {
    
    
    public static Session sesion;
    private static Modulo modulo1;
    private static Modulo modulo2;
    private static Modulo modulo3;
    private static Modulo modulo4;
    
    public static void main(String []args){
        //Establezco la conexión.
        Configuration configuracion=new Configuration().configure();
        //Creo la sesión.
        SessionFactory sesionFc=configuracion.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        try{
        sesion=sesionFc.openSession();
        System.out.println("Configurado correctamente");
        
        //Insertar Módulos.
        insertarModulos();
        //Insertar Profesores.
        insertarProfesores();
        //Insertar Alumnos.
        insertarAlumnos();
        
        //Liberar recursos y cerrar sesión.
        sesion.close();
        sesionFc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
    }
    
    public static Modulo configurarModulo(String nombre,String codigo){
        Modulo nuevoModulo=new Modulo();
        nuevoModulo.setNombre(nombre);
        nuevoModulo.setCodigo(codigo);
        return nuevoModulo;
        
    }
    
    public static Profesor configurarProfesor(String nombre, String sexo){
        Profesor nuevoProfesor=new Profesor();
        nuevoProfesor.setNombre(nombre);
        nuevoProfesor.setSexo(sexo);
        return nuevoProfesor;
    }
    
    public static Alumno configurarAlumno(String nombre,String nacionalidad,int edad,String sexo,HashSet<Modulo>modulos){
        Alumno nuevoAlumno=new Alumno();
        nuevoAlumno.setNombre(nombre);
        nuevoAlumno.setNacionalidad(nacionalidad);
        nuevoAlumno.setEdad(edad);
        nuevoAlumno.setSexo(sexo);
        nuevoAlumno.setModulos(modulos);
        return nuevoAlumno;
    }
    
    public static void insertarModulos(){
        //Inserta módulos.
        modulo1=configurarModulo("Programacion B","M03B");
        Transaction transaccion1=sesion.beginTransaction();
        sesion.save(modulo1);
        transaccion1.commit();
        System.out.println("Insert into modulo, nombre:"+modulo1.getNombre()+" codigo:"+modulo1.getCodigo());
        
        modulo2=configurarModulo("Acceso a Datos","M06");
         Transaction transaccion2=sesion.beginTransaction();
        sesion.save(modulo2);
         transaccion2.commit();
        System.out.println("Insert into modulo, nombre:"+modulo2.getNombre()+" codigo:"+modulo2.getCodigo());
        
        modulo3=configurarModulo("Desarrollo de aplicaciones moviles","M08");
        Transaction transaccion3=sesion.beginTransaction();
        sesion.save(modulo3);
         transaccion3.commit();
        System.out.println("Insert into modulo, nombre:"+modulo3.getNombre()+" codigo:"+modulo3.getCodigo());
        
        modulo4=configurarModulo("Servicios y procesos","M09");
       Transaction transaccion4=sesion.beginTransaction();
        sesion.save(modulo4);
        transaccion4.commit();
        System.out.println("Insert into modulo, nombre:"+modulo4.getNombre()+" codigo:"+modulo4.getCodigo());
    }
    
    public static void insertarProfesores(){
        //Insertar profesores.
        Profesor profesor1=configurarProfesor("Alvaro","Hombre");
        Transaction transaccion1=sesion.beginTransaction();
        sesion.save(profesor1);
        transaccion1.commit();
        System.out.println("Insert into profesor, nombre:"+profesor1.getNombre()+" sexo:"+profesor1.getSexo());
    }
    
    public static void insertarAlumnos(){
         //Inserta alumnos.
        HashSet<Modulo>modulos=new HashSet<Modulo>();
        modulos.add(modulo1);
        modulos.add(modulo2);
        modulos.add(modulo3);
        modulos.add(modulo4);
        
        Alumno alumno1=configurarAlumno("Juan","Espaniola",26,"Hombre",modulos);
        Transaction transaccion1=sesion.beginTransaction();
        sesion.save(alumno1);
        transaccion1.commit();
        System.out.println("Insert into alumno, nombre:"+alumno1.getNombre()+", nacionalidad:"+alumno1.getNacionalidad()+", edad "+alumno1.getEdad()+", sexo: "+alumno1.getSexo()+", modulos: "+alumno1.getModulos().size());
        
        modulos.remove(modulo3);
        Alumno alumno2=configurarAlumno("Pedro","Andorrana",21,"Hombre",modulos);
        Transaction transaccion2=sesion.beginTransaction();
        sesion.save(alumno2);
        transaccion2.commit();
        System.out.println("Insert into alumno, nombre:"+alumno2.getNombre()+", nacionalidad:"+alumno2.getNacionalidad()+", edad "+alumno2.getEdad()+", sexo: "+alumno2.getSexo()+", modulos: "+alumno2.getModulos().size());
        
        modulos.remove(modulo1);
        modulos.remove(modulo2);
        modulos.add(modulo3);
        Alumno alumno3=configurarAlumno("Marta","Espaniola",19,"Mujer",modulos);
        Transaction transaccion3=sesion.beginTransaction();
        sesion.save(alumno3);
        transaccion3.commit();
        System.out.println("Insert into alumno, nombre:"+alumno3.getNombre()+", nacionalidad:"+alumno3.getNacionalidad()+", edad "+alumno3.getEdad()+", sexo: "+alumno3.getSexo()+", modulos: "+alumno3.getModulos().size());
        
        modulos.add(modulo2);
        Alumno alumno4=configurarAlumno("Carla","Francesa",35,"Mujer",modulos);
        Transaction transaccion4=sesion.beginTransaction();
        sesion.save(alumno4);
        transaccion4.commit();
        System.out.println("Insert into alumno, nombre:"+alumno4.getNombre()+", nacionalidad:"+alumno4.getNacionalidad()+", edad "+alumno4.getEdad()+", sexo: "+alumno4.getSexo()+", modulos: "+alumno4.getModulos().size());
    }
    
}
