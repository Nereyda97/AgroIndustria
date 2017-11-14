package AgroIndustria;
//lilinere97@gmail.com
//LIDIA NEREYDA HERNANDEZ CAMPOS

public class probarHerencia2 {

	public static void main(String[] args) {
//DECLARACION DE OBJETOS
		productoFresco Queso;
		productoRefrigerado Refresco;
		productoCongelado Carne;

//CONSTRUCCION DE PRODUCTO
		Queso=new productoFresco("12 enero 2017", 011216203,"Queso");
		Queso.setFechaDeEnvasado("01 diciembre 2016");
		Queso.setPaisOrigen("Mexico");
//MOSTRAR iNFORMACION
		System.out.println(Queso.Mostrar());
//CONSTRUCCION DE PRODUCTO	
		Refresco=new productoRefrigerado("10 febrero 2017", 010716302,"Refresco");
		Refresco.setCodigoOrganismo(123);
//MOSTRAR INFORMACION
		System.out.println(Refresco.Mostrar());
//CONSTRUCCION DE PRODUCTO	
		Carne=new productoCongelado("07 abril 2017", 030216306,"Carne");
		Carne.setTiempoCongelacion(4.3);
//MOSTAR INFORMACION
		System.out.println(Carne.Mostrar());
	}

}
