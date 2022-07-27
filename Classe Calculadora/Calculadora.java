public abstract class Calculadora {

    public void soma(double v1, double v2) {
        double resultado = v1 + v2;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public void subtracao(double v1, double v2) {
        double resultado = v1 - v2;
        System.out.println("O resultado da subtracao é: " + resultado);
    }

    public void multiplicacao(double v1, double v2) {
        double resultado = v1 * v2;
        System.out.println("O resultado da multiplicacao é: " + resultado);
    }

    public void divisao(double v1, double v2) {
        if (v2 == 0) {
            System.out.println("Divisão por 0");
        } else {

            double resultado = v1 / v2;
            System.out.println("O resultado da divisao é: " + resultado);
        }

    }
}