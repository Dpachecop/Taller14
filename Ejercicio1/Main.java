public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(4);
        Figura figura2 = new Rectangulo(4.0, 7.0);

        figura1.calcularArea();
        figura2.calcularArea();
    }
}
