import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        String nombre, email;

        int edad, sueldo;

        Empleado empleado;

        System.out.println("Ahora te voy a pedir que me metas 10 empleados: ");

        ArrayList<String> empleados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Empleado numero %d", i);
            System.out.printf("%n");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();

            System.out.print("Direccion de correo electrónico: ");
            email = scanner.nextLine();

            System.out.print("Edad: ");
            edad = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Sueldo: ");
            sueldo = scanner.nextInt();

            empleado = new Empleado(nombre, email, edad, sueldo);

            empleados.add(empleado.toString());

            scanner.nextLine();
        }

        try {
            FileWriter escritor = new FileWriter("empleados.txt");

            for(String elem : empleados) {
                escritor.write(elem+"\n");
            }

            escritor.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


    }
}