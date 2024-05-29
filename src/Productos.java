public class Productos {
    private int Id;
    private String nombre;
    private String marca;
    private double precio;
    
    public Productos() {
    }

    public Productos(int Id, String nombre, String marca, double precio) {
        this.Id = Id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Producto " +
                "id=" + Id +
                " nombre='" + nombre + '\'' +
                " marca='" + marca + '\'' +
                " precio=" + precio +
                ' ';
    }
}
