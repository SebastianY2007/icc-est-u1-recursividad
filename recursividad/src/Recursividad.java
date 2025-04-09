public class Recursividad {
    public static int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaConsecutivos(n - 1);
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }
}