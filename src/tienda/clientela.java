package tienda;


class Clientela {
    private int cantidad;
    private String productoComprado;

    public Clientela(int cantidad, String productoComprado) {
        this.cantidad = cantidad;
        this.productoComprado = productoComprado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(String productoComprado) {
        this.productoComprado = productoComprado;
    }
    
}

