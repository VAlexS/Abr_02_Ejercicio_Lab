public class Interno extends Empleado{

    private final int SUELDO_MAXIMO = 20000;

    public Interno(String nombre, String email, int edad, int sueldo) {
        super(nombre, email, edad);
        setSueldo(sueldo);
    }

    @Override
    public void setSueldo(int sueldo) {
        if (sueldo > SUELDO_MAXIMO)
            System.err.println("Este salario excede del maximo");
        else
            super.sueldo = sueldo;
    }
}
