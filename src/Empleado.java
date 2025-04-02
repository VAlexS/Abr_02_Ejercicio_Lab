public class Empleado {

    private String nombre, email;

    private int edad;

    protected int sueldo;

    public Empleado(String nombre, String email, int edad, int sueldo) {
        setNombre(nombre);
        setEmail(email);
        setEdad(edad);
        setSueldo(sueldo);
    }

    protected Empleado(String nombre, String email, int edad){
        setNombre(nombre);
        setEmail(email);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.endsWith("@gmail.com"))
            System.err.println("Correo electronico no valido");
        else
            this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120)
            System.err.println("Edad no valida");
        else
            this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Este es "+nombre+", su direccion de coreo es "+email+". Tiene "+edad+" años y cobra "+sueldo+" sueldo";
    }
}
