
package tienda;


public class SedeDos extends Tienda{
    private String nombreDeLaSedeDos;
    private Boolean nuevoDiseñador;
    private Boolean ropaExhibida;
    
     public SedeDos(
            String duenoDeLaTienda, 
            String productos, 
            String barrio, 
            int precios, 
            int personal,
            Boolean atencion,
            String nombreDeLaSedeDos, 
            Boolean nuevoDiseñador,
            Boolean ropaExhibida) {
        super (duenoDeLaTienda, 
                productos, 
                barrio, 
                precios, 
                personal, 
                atencion, 
                nombreDeLaSedeDos, 
                nuevoDiseñador,
                ropaExhibida);
        this.nombreDeLaSedeDos = nombreDeLaSedeDos;
        this.nuevoDiseñador = nuevoDiseñador;
        this.ropaExhibida = ropaExhibida;
    }

    public String getNombreDeLaSedeDos() {
        return nombreDeLaSedeDos;
    }

    public void setNombreDeLaSedeDos(String nombreDeLaSedeDos) {
        this.nombreDeLaSedeDos = nombreDeLaSedeDos;
    }

    public Boolean getNuevoDiseñador() {
        return nuevoDiseñador;
    }

    public void setNuevoDiseñador(Boolean nuevoDiseñador) {
        this.nuevoDiseñador = nuevoDiseñador;
    }

    public Boolean getRopaExhibida() {
        return ropaExhibida;
    }

    public void setRopaExhibida(Boolean ropaExhibida) {
        this.ropaExhibida = ropaExhibida;
    }
    
     
}
