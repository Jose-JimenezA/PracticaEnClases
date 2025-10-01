package ec.edu.uea.proyecto3;
public class Estudiante {
    //atributos
    public String Nombre;
    public int id;
    public double CalificacionPromedio;
    
    //metodos
    public void Inscribirse(){
        
    }
    public void Retirarse(){
        
    }
    public void MostrarInformacion(){
        System.out.println("Informacion del estudiante");
        System.out.println("");
        System.out.println("nombre"+Nombre);
        System.out.println("id"+id);
        System.out.println("calificacion promedio"+CalificacionPromedio);
    }
}