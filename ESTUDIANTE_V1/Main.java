
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Estudiante[] listaEstudiantes = new Estudiante[3];

        listaEstudiantes[0] = new Estudiante();
        listaEstudiantes[1] = new Estudiante();
        listaEstudiantes[2] = new Estudiante();

        for(int i = 0; i < listaEstudiantes.length; i++){
            System.out.println("Ingrese el nombre del estudiante " + (i+1) + ": ");
            listaEstudiantes[i].setNombre(input.next());

            System.out.println("Ingrese la matricula de  " + listaEstudiantes[i].getNombre() + ": ");
            listaEstudiantes[i].setMatricula(input.nextInt());

            System.out.println("Ingrese el promedio de  " +  listaEstudiantes[i].getNombre() + ": ");
            listaEstudiantes[i].setPromedio(input.nextFloat());

        }
        
        for(int i = 0; i < listaEstudiantes.length; i++){
            System.out.println("Estudiante #" + (i+1));
            System.out.println("Nombre : " + listaEstudiantes[i].getNombre());
            System.out.println("Matricula : " + listaEstudiantes[i].getNombre());
            System.out.println("Promedio : " + listaEstudiantes[i].getNombre());

        }
        
    }
}
