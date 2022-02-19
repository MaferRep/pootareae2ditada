package pooCarros;

import javax.swing.JOptionPane;

public class UsuCarro {
	
	  public static void main (String[] args) {

	System.out.println("***datos carro***\n");
		  
	  Carro Renault= new Carro();
	  
	  System.out.println("que color quiere?");
	  Renault.setColor(JOptionPane.showInputDialog("Ingrese el color del coche"));
	  System.out.println(Renault.getColor());
	  
	  
	  System.out.println("\ntiene asientos de cuero?");
	  Renault.configAsiento(JOptionPane.showInputDialog("quiere asientos de cuero? Ingrese si o no"));
	  System.out.println(Renault.getAsientosCuero());
	  
	  System.out.println("\ntiene climatizador?");
	  Renault.configClimatizador(JOptionPane.showInputDialog("quiere climatizador? Ingrese si o no"));
	  System.out.println(Renault.getClimatizador());
   
	  System.out.println("\npresione enter para ver la informacion general del carro");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	  System.out.println(Renault.getInfo());
	
	  
	  System.out.println("\npresione enter para continuar con la camioneta");
	  new java.util.Scanner(System.in).nextLine(); 
	 
	  //camioneta
	  
	 System.out.println("\ndatos camioneta\n");
	  
	  Camioneta toyota= new Camioneta();

	  System.out.println("que color quiere?");
	  toyota.setColor(JOptionPane.showInputDialog("Ingrese el color de la camioneta"));
	  System.out.println(toyota.getColor());
	  
	  System.out.println("\ntiene asientos de cuero?");
	  toyota.configAsiento(JOptionPane.showInputDialog("quiere asientos de cuero? Ingrese si o no"));
	  System.out.println(toyota.getAsientosCuero());
	  
	  System.out.println("\ntiene climatizador?");
	  toyota.configClimatizador(JOptionPane.showInputDialog("quiere climatizador? Ingrese si o no"));
	  System.out.println(toyota.getClimatizador());
   
	  System.out.println("\npresione enter para ver la informacion general de la camioneta");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	  System.out.println(toyota.getInfo()); 
	  
	  System.out.println("\npresione enter para continuar con la moto");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	  //moto
	  
	  
	  System.out.println("\ndatos moto\n");
	  
	  Moto nanda= new Moto();
	    
	  System.out.println("que color quiere?");
	  nanda.setColor(JOptionPane.showInputDialog("Ingrese el color de la moto"));
	  System.out.println(nanda.getColor());
	  
	  System.out.println("\ntiene asientos de cuero?");
	  nanda.configAsiento(JOptionPane.showInputDialog("quiere asientos de cuero? Ingrese si o no"));
	  System.out.println(nanda.getAsientosCuero());
	  
	  System.out.println("\ntiene climatizador?");
	  nanda.configClimatizador(JOptionPane.showInputDialog("quiere climatizador? Ingrese si o no"));
	  System.out.println(nanda.getClimatizador());
   
	  System.out.println("\npresione enter para ver la informacion general de la moto");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	  System.out.println(nanda.getInfo()); 
	  
	  System.out.println("\npresione una tecla para continuar");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	  
	  //modificando datos en el carro
	  
	  System.out.println("\ndatos modificados carro\n");
	 
	 Renault.setRuedas (5);
	 
	 Renault.setLargo (1500);
	 
	 Renault.setMotor (8000);
	 
	 Renault.setAncho (8000);
	 
	 Renault.setPeso (1000);
	 
	 System.out.println(Renault.getInfo()); 
	 
	  System.out.println("\npresione una tecla para continuar");
	  new java.util.Scanner(System.in).nextLine(); 
	  
	 
	  //modificando datos en la camioneta
	 
	  System.out.println("\ndatos modificados camioneta\n");
		 
	 toyota.setRuedas (6);
	 
	 toyota.setLargo (100);
	 
	 toyota.setMotor (7000);
	 
	 toyota.setAncho (8000);
	 
	 toyota.setPeso (4000);
	 
	 System.out.println(toyota.getInfo()); 
	 
	  System.out.println("\npresione una tecla para continuar");
	  new java.util.Scanner(System.in).nextLine(); 
	   
	 
	 //modificando datos en la moto
	 
	  System.out.println("\ndatos modificados moto\n");
		 
		 nanda.setRuedas (3);
		 
		 nanda.setLargo (170);
		 
		 nanda.setMotor (800);
		 
		 nanda.setAncho (20);
		 
		 nanda.setPeso (1000);
		 
		 System.out.println(nanda.getInfo()); 
		 		 
}
}
