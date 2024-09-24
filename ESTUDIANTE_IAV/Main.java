package ESTUDIANTE_IAV;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de Estudiante
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "A001", 8.5);
        Estudiante estudiante2 = new Estudiante("Ana Gómez", "A002", 9.0);
        Estudiante estudiante3 = new Estudiante("Luis Martínez", "A003", 7.8);

        // Usar setGet para obtener los valores
        System.out.println("Nombre: " + estudiante1.setGet("nombre", null));
        System.out.println("Matrícula: " + estudiante2.setGet("matricula", null));
        System.out.println("Promedio: " + estudiante3.setGet("promedio", null));

        // Usar setGet para modificar los valores
        estudiante1.setGet("promedio", 8.7);
        System.out.println("Nuevo promedio de " + estudiante1.setGet("nombre", null) + ": " + estudiante1.setGet("promedio", null));
    }
}

/*public class Main {
    public static void main(String[] args) {
        // Crear objetos de Estudiante
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "A001", 8.5);
        Estudiante estudiante2 = new Estudiante("Ana Gómez", "A002", 9.0);
        Estudiante estudiante3 = new Estudiante("Luis Martínez", "A003", 7.8);

        // Usar getters para obtener los valores
        System.out.println("Nombre: " + estudiante1.getNombre() + ", Matrícula: " + estudiante1.getMatricula() + ", Promedio: " + estudiante1.getPromedio());
        System.out.println("Nombre: " + estudiante2.getNombre() + ", Matrícula: " + estudiante2.getMatricula() + ", Promedio: " + estudiante2.getPromedio());
        System.out.println("Nombre: " + estudiante3.getNombre() + ", Matrícula: " + estudiante3.getMatricula() + ", Promedio: " + estudiante3.getPromedio());

        // Usar setters para modificar los valores
        estudiante1.setPromedio(8.7);
        System.out.println("Nuevo promedio de " + estudiante1.getNombre() + ": " + estudiante1.getPromedio());
    }
}*/
