import javax.swing*.


public class Rectangular{

	public static void main(String[] args) {
		
		

		// declaracion de variables y objetos
		double  i,
			j,
			modulus,
			angle;
		Angulo = new Angulo(); //declaracion de objeto, pero no hace nada

		//declarar las entradas y salidas para el usuario
		String  input;

		// pedir las coordenadas cartesianas al usuario
		input = JOptionPane.showInputDialog("EScribe las coordenadas cartesianas Ai=Bj sin espacios");

		//aqui se necesita un casting de x, y para convertir el Ax+Bj en #s, y 

		i = Double.parseDouble(Ai);
		j = Double.parseDouble(Bj);
		

		// demostrar el resultado "La coordenada cartesiana Ai+Bj equivale a la coordenada polar C @ D grados."
			JOptionPane.showMessageDialog(null, "La coordenada cartesiana Ai+Bj equivale a la coordenada polar" +  toPolarString(), JOptionPane.INFORMATION_MESSAGE);

	}
	public String[] toPolarString() {
		//poder operar con ellos como lo que sigue:		
			modulus = sqrt (x^2 + y^2),
			angle = atan(y/x);
			return modulus + " @ " + angle " grados"
	}

}