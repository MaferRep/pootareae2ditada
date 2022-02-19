package pooCarros;

public class Carro {
	
	 private int ruedas;
     private int largo;
     private int ancho;
     private int motor;
     private int peso;
     
     private String color;
     private int pesoTotal;
     private boolean asientosCuero, climatizador;
     

     //metodo constructor ()
     
     public Carro() {
            
             ruedas= 4;
             largo = 2000;
             ancho = 300;
             motor = 1600;
             peso  = 500;
            
     }     
    	 
     public String getRuedas() {
    	 return "\nlas ruedas del carro son: "+ ruedas;
     }
     
     public String getLargo() {
    	 return "el largo del carro es: "+ largo;
     }
     
     public String getAncho() {
    	 return "el Ancho del carro es: "+ ancho;
     }
     
     public String getMotor() {
    	 return "el Motor del carro es: "+ motor;
     }
     public String getPeso() {
    	 return "el Peso del carro es: "+ peso;
     }
     
     public String getColor() {
    	 return "el color del carro que escogio es: "+ color;
     }
     
     public String getAsientosCuero() {
    	 return "los asientos del carro son: "+ asientosCuero;
     }
     
     public String getClimatizador() {
    	 return "climatizador: "+ climatizador;
     }
     
     
     public String getPesoTotal() {
    	 pesoTotal=motor+peso;
    	 return " el carro pesa en total:"+pesoTotal;
    	
     }
     
     // info general
     public String getInfo() {
         return getRuedas() +"\n"+getLargo() +"\n"+getAncho() +"\n"+getMotor() +"\n"+getPeso() +"\n"+getColor() +"\n"+getAsientosCuero()+"\n"+getClimatizador()+"\n"+getPesoTotal();
     }
     
     //setters
     
     public void setRuedas(int ruedas)
     {
             this.ruedas = ruedas;
     }
     
     public void setLargo(int largo)
     {
             this.largo = largo;
     }

     public void setAncho(int ancho)
     {
             this.ancho = ancho;
     }
     
     public void setMotor(int motor)
     {
             this.motor = motor;
     }
     
     public void setPeso(int peso)
     {
             this.peso = peso;
     }
     
     public void setColor(String color)
     {
             this.color = color;
     }
     
     public void setPesoTotal(int pesoTotal)
     {
             this.pesoTotal = pesoTotal;
     }
 
 //setter asiento cuero 
     public void configAsiento(String asientosCuero)
     {
    	 if (asientosCuero.equalsIgnoreCase ("si")) {
    		 this.asientosCuero= true;
    		 System.out.println("si tiene asientos de cuero");
    	 }
    	 else {
    		 this.asientosCuero= false;
    		 System.out.println("no tiene asientos de cuero");
    	 }
    	 
     }
//setter climatizador
     public void configClimatizador(String climatizador)
     {
    	 if (climatizador.equalsIgnoreCase ("si")) {
    		 this.climatizador= true;
    		 System.out.println("si tiene climatizador");
    	 }
    	 else {
    		 this.climatizador= false;
    		 System.out.println("no tiene climatizador");
    	 }
    	 
     }
     
     
}

