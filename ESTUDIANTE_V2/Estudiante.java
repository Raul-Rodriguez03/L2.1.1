

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

    public void setGetNombre(String nombre){
        this.nombre = nombre;
    }
    public String setGetNombre(){
        return nombre;
    }

    public int setGetMatricula() {
        return matricula;
    }
    public void setGetMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float setGetPromedio() {
        return promedio;
    }
    public void setGetPromedio(float promedio) {
        this.promedio = promedio;
    }
   
    
}
