package Taller14.uso_incorrecto.dos;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto();
        miAuto.encender();
    }
}
 //En la clase Auto, sobrescribimos el método encender
  //pero no cambiamos nada en la implementación; el mensaje
  // es exactamente el mismo que en la clase base Vehiculo

  //ESTO ES UNA MALA PRACTICA POR QUE:
  /*
ya que genera código redundante, falta de
claridad y problemas de mantenimiento.
Si el comportamiento de un método no cambia,
 es mejor heredar directamente de la clase base. */