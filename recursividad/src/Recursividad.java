public class Recursividad {
    
    public int llamadaRecursiva = 1;
    
    public int sumaConsecutivos(int n ) {    
        int idActual = llamadaRecursiva++;
        System.out.println("Llamada a "+idActual+" con numero n = "+n);
        if (n == 1) {
            System.out.println("Llamada a "+idActual+" caso base alcanzado n = 1 ");
            return 1;
        } else {
            // return n + sumaConsecutivos(n - 1);
            System.out.println("Llamada a "+idActual+" Llamando recursivamente con n = "+(n-1));
            int resultadoParcial = sumaConsecutivos(n - 1);
            int resultado = n + resultadoParcial;
            System.out.println("Llamada a "+idActual+" sumando "+n+" al resultado de "+resultadoParcial+ " = "+resultado);
            System.out.println("Llamada a "+idActual+" Retorno "+resultado);
            return resultado;
        }
    }
}