package tienda;


class Cajero {
    private int edad;
    private int cantidadRecogida;

    public Cajero(int edad, int cantidadRecogida) {
        this.edad = edad;
        this.cantidadRecogida = cantidadRecogida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadRecogida() {
        return cantidadRecogida;
    }

    public void setCantidadRecogida(int cantidadRecogida) {
        this.cantidadRecogida = cantidadRecogida;
    }
    
}

