
package PaqueteB;


public class ClasePersoal {
    private String telefono;
    private String correo;
    
    public ClasePersoal(){
    
}

    public ClasePersoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "ClasePersoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }

}


