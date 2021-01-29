package empleado;

import java.util.Objects;

public class Socio {
    private String nif;
    private String nombre;
    private String apellidos;
    private int numeroSocio;
    private int codigoPostal;

    public Socio(String nif, String nombre, String apellidos, int numeroSocio, int codigoPostal) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSocio = numeroSocio;
        this.codigoPostal = codigoPostal;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroSocio == socio.numeroSocio &&
                codigoPostal == socio.codigoPostal &&
                Objects.equals(nif, socio.nif) &&
                Objects.equals(nombre, socio.nombre) &&
                Objects.equals(apellidos, socio.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellidos, numeroSocio, codigoPostal);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSocio=" + numeroSocio +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
