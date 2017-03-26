import javax.swing.JOptionPane;

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

	    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
	    
		
	    String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
	    
	    Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
	    		   "COLORES", JOptionPane.QUESTION_MESSAGE, null,
	    		  new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
	    
	    
	}

}