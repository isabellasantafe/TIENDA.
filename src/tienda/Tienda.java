package Tienda;


public class Tienda {
    
    private String duenoDeLaTienda;
    private String productos;
    private String barrio;
    private int precios;
    private int personal;
    private Boolean atencion; 

    //Atributos de compocision//
    
    private clientela clientes = null; 
    private cajero elCajero;

    public Tienda(
            String duenoDeLaTienda, 
            String productos, 
            String barrio, 
            int precios, 
            int personal, 
            Boolean atencion) {
        this.duenoDeLaTienda = duenoDeLaTienda;
        this.productos = productos;
        this.barrio = barrio;
        this.precios = precios;
        this.personal = personal;
        this.atencion = atencion;
        this.clientes = new clientela(30, "vaqueros, camisa");
    }
    
    //este metodo nos permite saber la cantidad de personal disponible 
    //en nuestra tienda, precios y horarios de atencion
    public void cantidadDepersonal(){
        this.personal += 10;
        this.precios += 30000;
        this.atencion =true;
    }
    
    //este metodos nos permite definir el nombre del dueño, del barrio 
    //y tipo de productos
    public void nombreDefinido(
            String nuevoDueno, 
            String nuevoProducto, 
            String nuevoBarrio){
        this.duenoDeLaTienda = nuevoDueno;
        this.productos = nuevoProducto;
        this.barrio = nuevoBarrio;
    }

    public clientela getClientes() {
        return clientes;
    }

    public void setClientes(clientela clientes) {
        this.clientes = clientes;
    }

    public cajero getElCajero() {
        return elCajero;
    }

    public void setElCajero(cajero elCajero) {
        this.elCajero = elCajero;
    }

    
    
    public String getDuenoDeLaTienda() {
        return duenoDeLaTienda;
    }

    public void setDuenoDeLaTienda(String duenoDeLaTienda) {
        this.duenoDeLaTienda = duenoDeLaTienda;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }
    
    public static void main(String[] args) {
        Tienda tiendaUno = new Tienda(
                "santiago",
                "ropa",
                "villa del prado",
                2500,
                20,
                true);
        
        clientela clientesDeLaTienda = new clientela(
                30, 
                "vestidos,zapatos, medias, sombreros");
        
        tiendaUno.setClientes(tiendaUno);
        
        System.out.println("Cantidad de cliente en un dia es:");
        
        System.out.println(tiendaUno.getClientes().getCantidad());
        System.out.println("productos vendidos:");
        System.out.println(tiendaUno.getClientes().getProductoComprado());
    }
    
}

