package AgroIndustria;
//lilinere97@gmail.com
//LIDIA NEREYDA HERNANDEZ CAMPOS

public class productoCongelado extends producto{
//tiempo de congelacion recomendada en horas
	private double tiempoCongelacion;
	
	productoCongelado(String fecha,long numlote,String nom){
		super(fecha,numlote,nom);
	}
//METODO PARA RECUPERAR EL TIEMPO DE CPNGELACION
	public double getTiempoCongelacion() {
        return tiempoCongelacion;
    }
//METODO PARA ESTABLECER EL TIEMPO DE CONGELACION
    public void setTiempoCongelacion(double tiempoCongelacion) {
        this.tiempoCongelacion = tiempoCongelacion;
    }
//METODO PARA MOSTRAR INFORMACION DEL PRODUCTO
    public String Mostrar() {
        String cad1 = super.mostrarInfoProductoGen();
        String cad2 =  "\n Tiempo de congelacion recomendada en horas: "+ tiempoCongelacion+" horas"; 
        return cad1 + " " + cad2;
    }
}
