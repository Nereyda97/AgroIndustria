package AgroIndustria;
//lilinere97@gmail.com
//LIDIA NEREYDA HERNANDEZ CAMPOS

public class productoFresco extends producto{
//DECLARACION DE OBJECTOS
	private String fechaDeEnvasado;
	private String paisOrigen;
//CONSTRUCTOR	
	productoFresco(String fecha,long numlote,String nom){
		super(fecha,numlote,nom);
	}
//METODO PARA RECUPERAR FECHA DE ENVASADO
	public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }
//METODO PARA ESTABLECER LA FECHA DE ENVASADO
    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }
//METODO PARA RECUPERAR PAIS DE ORIGEN
    public String getPaisOrigen(){
    	return paisOrigen;
    }
//METODO PARA ESTABLECER PAIS DE ORIGEN
    public void setPaisOrigen(String paisOrigen){
    	this.paisOrigen = paisOrigen;
    }
//METODO PARA MOSTRAR INFORMACION DEL PRODUCTO
    public String Mostrar(){
        String cad1 = super.mostrarInfoProductoGen();
        String cad2 =  "\n Fecha de envasado: "+ fechaDeEnvasado + " \n Pais de origen: " + paisOrigen; 
        return cad1 + " " + cad2;
    }
}
