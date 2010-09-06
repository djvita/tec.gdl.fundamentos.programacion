import javax.swing.*;

public class Rectangular {
	// declaracion de variables y objetos
	double
		coord_x,
		coord_y,
		modulus,
		angle;	
	//  constructor de la Class
	public Rectangular(double i, double j) {
		coord_x = i;
		coord_y = j;
	}

	public static void main(String[] args) {
		//declarar las entradas y salidas para el usuario
		String  input;

		// pedir las coordenadas cartesianas al usuario
		input = JOptionPane.showInputDialog("Escribe las coordenadas cartesianas Ai+Bj sin espacios");

		//aqui se necesita un casting de x, y para convertir el Ax+Bj en #s, y 

		double i = Double.parseDouble(input.substring(0,input.indexOf("i")));
		double j = Double.parseDouble(input.substring(input.indexOf("+") + 1, input.indexOf("j")));
		Rectangular myRectangule = new Rectangular(i,j);
		
		String result = "La coordenada cartesiana Ai+Bj equivale a la coordenada polar " +  myRectangule.toPolarString();

		// demostrar el resultado "La coordenada cartesiana Ai+Bj equivale a la coordenada polar C @ D grados."
		JOptionPane.showMessageDialog(null, result, result, JOptionPane.INFORMATION_MESSAGE);

	}
	public String toPolarString() {
		//poder operar con ellos como lo que sigue:		
			modulus = Math.sqrt(coord_x*coord_x + coord_y*coord_y);
			angle = Math.atan(coord_y/coord_x) * (180.0/Math.PI);
			return Double.toString(modulus) + " @ " + Double.toString(angle) + " grados";
	}

}