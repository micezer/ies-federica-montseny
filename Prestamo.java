package empleado;

import java.util.Objects;

public class Prestamo {
    private int isbn;
    private String nifSocio;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(int isbn, String nifSocio, String fechaPrestamo, String fechaDevolucion) {
        this.isbn = isbn;
        this.nifSocio = nifSocio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNifSocio() {
        return nifSocio;
    }

    public void setNifSocio(String nifSocio) {
        this.nifSocio = nifSocio;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return isbn == prestamo.isbn &&
                Objects.equals(nifSocio, prestamo.nifSocio) &&
                Objects.equals(fechaPrestamo, prestamo.fechaPrestamo) &&
                Objects.equals(fechaDevolucion, prestamo.fechaDevolucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, nifSocio, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "isbn=" + isbn +
                ", nifSocio='" + nifSocio + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                '}';
    }
}
