import mx.itesm.gda.fp.maquinadispensadora.CajaRegistradora
import javax.swing.*;

class testMaquinaDispensadora {
  public static void main(String[] args) {
    CajaRegistradora cajaRegistradora = new CajaRegistradora();
    cajaRegistradora.setEfectivoDisponible(100);
    System.out.println("Efectivo Disponible en la cajaRegistradora: " + cajaRegistradora.getEfectivoDisponible());
    System.out.println("cajaRegistradora puede aceptar efectivo si se compra algo de 15 y se ha dado 20: " + cajaRegistradora.aceptarEfectivo(20,15));
    System.out.println("Efectivo Disponible en la cajaRegistradora: " + cajaRegistradora.getEfectivoDisponible());
    System.out.println("cajaRegistradora puede aceptar efectivo si se compra algo de 115 y se ha dado 120: " + cajaRegistradora.aceptarEfectivo(120,115));
    System.out.println("Efectivo Disponible en la cajaRegistradora: " + cajaRegistradora.getEfectivoDisponible());
    System.out.println("cajaRegistradora puede aceptar efectivo si se compra algo de 20 y se ha dado 50: " + cajaRegistradora.aceptarEfectivo(50,20));    
    System.out.println("Efectivo Disponible en la cajaRegistradora: " + cajaRegistradora.getEfectivoDisponible());
  }  
}
