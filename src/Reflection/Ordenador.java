package Reflection;

public class Ordenador {

    private String id;
    private String descripcion;
    private String marca;

    public Ordenador(String id, String descripcion, String marca) {
        this.id = id;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
