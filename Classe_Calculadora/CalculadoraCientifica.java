public class CalculadoraCientifica extends Calculadora {

    public void raizQuadrada(double v1) {
        double resultado = Math.sqrt(v1);
        System.out.println("O resultado da raiz quadrada é: " + resultado);
    }

    public void potencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        System.out.println("O resultado da potencia é: " + resultado);
    }
}
