
package socios;

/**
 *
 * @author Daniela Gil
 */
public class TSocio {
    //Se definen los atributos que tendrá TSocio:
    private String nombre, apellido, dni, telefono, categoria;

    //Se define el método constructor:
    public TSocio(String nombre, String apellido, String dni, String telefono, String categoria){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    //Se definen los getters y setters:
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

    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Se sobrescribe el método toString() para establecer lo que devolverá el objeto:
   @Override
    public String toString(){
        return nombre+","+apellido+","+dni+","+telefono+","+categoria;
    }

    //Se define un método estático que crea un objeto TSocio a partir de una cadena de texto:
    public static TSocio fromString(String str){
        String[] parts = str.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Error al agregar línea.");
        }
        return new TSocio(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }
}
