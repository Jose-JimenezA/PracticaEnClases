package ec.edu.uea.proyecto3;
public class Proyecto3 {
    public static void main(String[] args) {
        Estudiante EstudianteUno = new Estudiante(); // Objeto
        EstudianteUno.Nombre = "Jose";
        EstudianteUno.id = 225304454;
        EstudianteUno.CalificacionPromedio = 10;
        System.out.println("Nombre "+ EstudianteUno.Nombre);
        System.out.println("Identificacion "+EstudianteUno.id);
        System.out.println("Calificacion Promedio "+EstudianteUno.CalificacionPromedio);
        Estudiante EstudianteDos = new Estudiante(); // Objeto
        EstudianteDos.Nombre = "Nico";
        EstudianteDos.id = 22784555;
        EstudianteDos.CalificacionPromedio = 6;
        System.out.println("Nombre "+ EstudianteDos.Nombre);
        System.out.println("Identificacion "+EstudianteDos.id);
        System.out.println("Calificacion Promedio "+EstudianteDos.CalificacionPromedio);
    }
}
