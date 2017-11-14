package AgroIndustria;
//lilinere97@gmail.com
//LIDIA NEREYDA HERNANDEZ CAMPOS


public class productoRefrigerado extends producto {
//codigo del organismo de supervicion alimentaria
	private int codigoOrganismo;
	
	productoRefrigerado(String fecha,long numlote,String nom){
		super(fecha,numlote,nom);
	}
//METODO PARA RECUPERAR EL CODIGO DEL ORGANISMO DE SUPERVIVENCIA ALIMENTARIA
	public int getCodigoOrganismo() {
        return codigoOrganismo;
    }
//METODO PARA ESTABLECER EL CODIGO DEL ORGANISMO DE SUPERVIVENCIA ALIMENTARIA
    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
//METODO PARA MOSTRAR INFORMACION DEL PRODUCTO	
	 public String Mostrar() {
	        String cad1 = super.mostrarInfoProductoGen();
	        String cad2 =  "\n Codigo de organismo de supervicion alimentaria: "+ codigoOrganismo; 
	        return cad1 + " " + cad2;
	    }
}
