import.javax.swing.*;
public class CajaRegistradora{

	pr�vate int efectivoDisponible;
	public void setEfectivoDisponible(int efectivo){ 
this.efectivo =efectivoDisponible;
if(efectivo <0){
efectivo =0,
}
	else {
this.efectivo = efectivoDisponible;
}
return  efectivoDisponible;
}

	public int getEfectivoDisponible( int efectivoDisponible){
this. efectivoDisponible = efectivoDisponible;
.}
	public boolean aceptarEfectivo(int pago, int precio){ Este m�todo recibe cuanto
se ha depositado en la m�quina y cu�nto se debe de cobrar. Debe actualizar la cantidad de efectivo
disponible cuando se pueda hacer la venta. Regresa false en caso de que no se pueda cobrar esa
cantidad porque no se puede dar el cambio requerido, en caso contrario regresa true.
		do{ JOptionPane.showInputDialog(null, �Introduce  � + precio � pesos porfavor� )

while(precio<pago){
		
if(pago>=efectivo){
System.out.println(�true�);
}
else{
System.out.println(�false�);
}
	}

}

	public CajaRegistradora( ){
efectivoDisponible=0;
}
	public void setEfectivoDisponible(int efectivo){//Constructor con par�metro, inicializa el efectivo con la cantidad pasada como par�metro.
	}


}

public class Dispensador{

	private int numeroDeProductos;
	private int precio;

	public Dispensador( ){
	numeroDeProductos=50;
	costo = 10;
	}
	public Dispensador(int numProductos, int costo){//Inicializa la cantidad de producto
que tiene el dispensador y el costo de cada producto. En caso de que alguno de los par�metros sea
negativo entonces inicializara ese atributo en cero en caso contrario en el valor del par�metro pasado}

	public int getNumeroDeProductos(int numeroDeProductos){// Regresa el numero de productos que tiene el
dispensador.
		this.numerodeProductos =  numeroDeProductos;
		return numeroDeProductos;
}

	public int getPrecio(int precio){// Regresa el precio de uno de los jugos
		this.precio = precio;
	}
	public void vender( ){// Reduce en uno la cantidad de jugos disponibles en el dispensador
	}
	public void agregarProductos(int cantidad){// A la cantidad actual de productos le
agrega la cantidad pasada como par�metro.
	
	}

}


public class MaquinaDispensadora{


	public static mostrarMenu{

	//Este m�todo muestra la informaci�n necesaria para ayudar al usuario a seleccionar y comprar el juego. Contiene el siguiente mensaje:
JOptionPane.showMessageDialog(null, �*** Bienvenido a la m�quina expendedora de jugos***! Seleccione una opci�n:�);
1 para jugo de manzana
2 para jugo de naranja
3 para jugo de mango
4 para jugo de ponche de frutas
9 para salir.
	}

	public static venderProducto{

	//Este m�todo intenta vender un jugo en particular seleccionado por el cliente. La m�quina
contiene 4 dispensadores, los cuales corresponden a los 4 productos.
La primera tarea de este m�todo es determinar si el dispensador tiene producto para vender. Si el
dispensador est� vac�o, el m�todo informa al cliente que el producto est� agotado. Si hay jugo disponible,
le dice al usuario que deposite la cantidad necesaria para comprar el jugo. Entonces el usuario introducir�
monedas mientras no se complete el precio del jugo. Si el usuario excede el precio entonces le regresa el
cambio correspondiente. La caja registradora se actualiza agregando el dinero recibido por el usuario.
Como se puede observar este m�todo necesita tener acceso a la caja registradora y a Dispensador que
contiene el producto seleccionado, por lo tanto ambos objetos se le deber�n pasar como par�metros.
	}


	public static void main(String[] args){

//1) Crear la caja registradora
2) Crear los dispensadores
3) Declarar las variables que vayan a ser necesarias
4) Mostrar el men�
5) Registrar la selecci�n hecha por el usuario
6) Vender el producto
7) Repetir los pasos 4 a 6 mientras no se seleccione salir.
(while)
	}
}
