public class App {
    public static void main(String[] args) throws Exception {
        public int potencia(int base, int exponente) {
            if (exponente == 0) {
                return 1;
            } else {
                return base * potencia(base, exponente - 1);
            }
        }
    
        public int sumaDigitos(int numero) {
            if (numero < 10) {
                return numero;
            } else {
                return (numero % 10) + sumaDigitos(numero / 10);
            }
        }
    }
}