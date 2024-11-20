public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area = largo * ancho;
        System.out.println("Área del rectángulo: " + area);
    }
}
