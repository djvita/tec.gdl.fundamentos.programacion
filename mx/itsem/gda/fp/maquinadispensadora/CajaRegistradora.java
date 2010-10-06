package mx.itesm.gda.fp.maquinadispensadora

import javax.swing.*;
public class CajaRegistradora{

  private int efectivoDisponible;

  public CajaRegistradora( ){
    efectivoDisponible = 0;
  }

  public CajaRegistradora(int efectivo){
   setEfectivoDisponible(efectivo);
  }
  
  public void setEfectivoDisponible(int efectivo){ 
    efectivoDisponible = efectivo;
    if (efectivo < 0) {
      efectivoDisponible = 0;
    }
  }

  public int getEfectivoDisponible( ){
    return efectivoDisponible;
  }

  private boolean puedoDarCambio(int pago, int precio){
    int cambio = pago - precio;
    if (cambio > efectivoDisponible) {
      return false;
    } else {
      return true;
    }    
  }
  
  public boolean aceptarEfectivo(int pago, int precio){
    if (puedoDarCambio(pago, precio)) {
      setEfectivoDisponible(efectivoDisponible + precio);
      return true;
    } else {
      return false;
    }
  }
}