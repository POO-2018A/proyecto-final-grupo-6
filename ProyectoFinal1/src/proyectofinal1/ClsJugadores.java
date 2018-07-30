
package proyectofinal1;

import java.io.Serializable;
import java.util.Objects;

public class ClsJugadores implements Serializable {

    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String usuario;

    public ClsJugadores() {

    }

    public ClsJugadores(int id, String nombre, String apellido, String cedula, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;

    }

    @Override
    public String toString() {
        return this.id + " " + this.nombre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the nombre to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the estado
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the estado to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClsJugadores other = (ClsJugadores) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

}
