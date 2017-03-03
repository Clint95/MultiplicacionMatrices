
package multiplicaionmatrices;

/**
 * esta clase contiene la estructura del proyecto
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since MultiplicacionMatrices 1.0.0
 */
import java.util.Scanner;
public class MultiplicaionMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            OperacionesM Matriz =  new OperacionesM();
            Scanner ingresado = new Scanner(System.in);
            
            /*
            se solicitan los datos referentes a las dos matrices
            */
            System.out.println("Digita el numero de filas de la primera matriz");
                int m = ingresado.nextInt();
            System.out.println("Digita el numero de columnas de la primera matriz");
                int n = ingresado.nextInt();
            System.out.println("Digita el numero de filas de la segunda matriz");
                int k = ingresado.nextInt();
            /*
             se notifica y se validan los datos necesarios para que el programa pueda seguir
             su camino, en este caso que el numero de columnas de la primer matriz
             debe sewr igual al numero de filas de la segunda.
            */
                while(k != n){
                System.out.println("******ATENCION*******");
                System.out.println("Para poder multiplicar 2 matrices el numero de "
                        + "columnas en la primera matriz debe ser igual al numero"
                        + "de filas de la segunda matriz");
                System.out.println("Digite nuevamente el numero de filas ");
                    k = ingresado.nextInt();
            }
            System.out.println("Digita el numero de columnas de la segunda matriz");
                int p = ingresado.nextInt();
            /*
                se inicializan las matrices que se utilizaran
            */
                int a[][] = new int[m][n];
                int b[][] = new int[k][p];
                int c[][] = new int[m][p];
            /*
                se llaman a los metodos de la clase OperacionesM para operar 
                las matrices
            */
            Matriz.llenar(a, m, n);
            Matriz.llenar2(b, k, p);
                System.out.println("....... Matriz 1 ........");
            Matriz.mostrar(a, m, n);
                System.out.println("....... Matriz 2 ........");
            Matriz.mostrar(b, k, p);
                System.out.println("....... Matriz Resultante ........");
            Matriz.multiplicacion(a, b,c, m, n, p);
            Matriz.mostrar(c, m, p);
            
            
    }
    /*
    Fin del programa
    */
}
