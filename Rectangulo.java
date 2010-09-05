import javax.swing.*;

public class Rectangulo{

	public static void main(String[] args) {

		double lado1,
		       lado2,
		       perimetro,
		       area;

		String a,
		       b;

		a = JOptionPane.showInputDialog(null, "A", "Introduce la longitud del primer lado ", JOptionPane.QUESTION_MESSAGE);
		b = JOptionPane.showInputDialog(null, "B", "Introduce la longitud del segundo lado", JOptionPane.QUESTION_MESSAGE);			 
		
		lado1 = Double.parseDouble(a);
		lado2 = Double.parseDouble(b);


		perimetro = 2*lado1 + 2*lado2;
		area = lado1*lado2;
	

		JOptionPane.showMessageDialog(null, perimetro, "Se calcula  el perimetro asi: ", JOptionPane.INFORMATION_MESSAGE);


		JOptionPane.showMessageDialog(null, area,  "Se calcula  el area asi: ", JOptionPane.INFORMATION_MESSAGE);

  	}
}