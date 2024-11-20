package Taller14.uso_incorrecto.uno;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
        
        // Intento incorrecto: la referencia de la clase base no conoce el método `moverCola()`
        // miAnimal.moverCola(); // Error de compilación

        /*El método moverCola existe únicamente en la clase derivada Perro,
         por lo que la referencia de tipo base
         no tiene acceso a él. */
    }
}

