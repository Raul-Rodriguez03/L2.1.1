package ESTUDIANTE_IAV;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Método combinado setGet
    public Object setGet(String atributo, Object valor) {
        switch (atributo) {
            case "nombre":
                if (valor != null) this.nombre = (String) valor;
                return this.nombre;
            case "matricula":
                if (valor != null) this.matricula = (String) valor;
                return this.matricula;
            case "promedio":
                if (valor != null) this.promedio = (Double) valor;
                return this.promedio;
            default:
                return null;
        }
    }
}

/*public class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
*/