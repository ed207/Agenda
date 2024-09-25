
package agenda.telefonica;


public class persona {
    private int telefono;
    private String correo,nombre;

    public persona(int telefono, String correo, String nombre) {
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
