package AgroIndustria;
//lilinere97@gmail.com
//LIDIA NEREYDA HERNANDEZ CAMPOS

public class producto {
//DECLARACION DE OBJETOS	
	private String fechaCaducidad;
	private long numeroDeLote;
	private String nombreProducto;
//CONSTRUCTOR	
	producto(String fecha,long numLote,String nom){		
		this.fechaCaducidad=fecha;
		this.numeroDeLote=numLote;
		this.nombreProducto=nom;
	}
//METODO PARA RECUPERAR FECHA DE CADUCIDAD
	public String getFechaDeCaducidad() {
        return fechaCaducidad;
    }
//METODO PARA ESTABLECER LA FECHA DE CADUCIDAD
    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaCaducidad = fechaDeCaducidad;
    }
//METODO PARA RECUPERAR NUMERO DE LOTE
	public long getNumeroDeLote() {
        return numeroDeLote;
    }
//METODO PARA ESTABLECER NUMERO DE LOTE
    public void setFechaDeEnvasado(long numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
  //METODO PARA RECUPERAR NOMBRE DEL PRODUCTO
	public String getNombreProducto() {
        return nombreProducto;
    }
//METODO PARA ESTABLECER NOMBRE DEL PRODUCTO
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
//METODO DE MOSTRAR INFORMACION DE LA CALASE PADRE DE CADA PRODUCTO	
	public String mostrarInfoProductoGen() {
		 return "Producto creado: "+nombreProducto+"\n Fecha de caducidad: "  
		 + fechaCaducidad + "\n Numero de lote: " + numeroDeLote ;
		 }
}
