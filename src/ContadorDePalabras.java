
import javax.swing.JOptionPane;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

 
import java.util.Scanner;


public class ContadorDePalabras {

	
	public static void main(String[] args) {
		
	    // Texto
	    String sTexto = "pasapalabra palabra o palabra y palabra";
	    // Texto que vamos a buscar
	    String sTextoBuscado = "palabra";
	    // Contador de ocurrencias 
	    int contador = 0;

	    while (sTexto.indexOf(sTextoBuscado) > -1) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	      contador++; 
	    }

	    System.out.println (contador);

	    // Uso de mensaje 
	    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
	    
	    // Caja para introducir texto
	    String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
	    System.out.println("El usuario ha elegido "+respuesta);

	    // Caja con arreglo para seleccionar opción
	    Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
	    		   "COLORES", JOptionPane.QUESTION_MESSAGE, null,
	    		  new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
	    
	    System.out.println("El usuario ha elegido "+color);
	    
	    // Input/output de mensaje 
	    Scanner input = new Scanner(System.in);
	    System.out.println("Inserte texto a continuación:");
	    String text = input.nextLine();
	    System.out.println(text);
	    
	    
	    
	}
}