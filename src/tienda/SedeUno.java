package tienda;

public class SedeUno extends Tienda {
    private String nombreDeLaSedeUno;
    private Boolean nuevaColeccion;

    public SedeUno(
            String duenoDeLaTienda, 
            String productos, 
            String barrio, 
            int precios, 
            int personal,
            Boolean atencion,
            String nombreDeLaSedeUno, 
            Boolean nuevaColeccion) {
        super (duenoDeLaTienda, 
                productos, 
                barrio, 
                precios, 
                personal, 
                atencion);
        this.nombreDeLaSedeUno = nombreDeLaSedeUno;
        this.nuevaColeccion = nuevaColeccion;
    }

    public String getNombreDeLaSedeUno() {
        return nombreDeLaSedeUno;
    }

    public void setNombreDeLaSedeUno(String nombreDeLaSedeUno) {
        this.nombreDeLaSedeUno = nombreDeLaSedeUno;
    }

    public Boolean getNuevaColeccion() {
        return nuevaColeccion;
    }

    public void setNuevaColeccion(Boolean nuevaColeccion) {
        this.nuevaColeccion = nuevaColeccion;
    }
    
    
    
}
