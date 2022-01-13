package vo;

public class ClienteVO {

    private int numeroCliente;
    private String nombre;
    private String apellido;
    private String email;

    public ClienteVO(int numeroCliente, String nombre, String apellido, String email) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "NUMERO DE CLIENTE:  " + numeroCliente + "\n" + "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n" + "EMAIL: " + email + "\n" + "***************************";
    }
    

}
