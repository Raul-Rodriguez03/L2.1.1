

public class Estudiante {

    private String nombre;
    private int matricula;
    private float promedio;

    public Estudiante(String nombre, int matricula, float promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    public Estudiante(){};

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
   
    
}
