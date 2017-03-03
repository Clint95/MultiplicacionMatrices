
package multiplicaionmatrices;

/**
 * esta clase contiene los metodos necesarios para el proyecto
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since MultiplicacionMatrices 1.0.0
 */
import java.util.Scanner;
public class OperacionesM 
{  
   Scanner ingresado = new Scanner(System.in);
  /**
     * este metodo permite llenar la primera matriz 
     * @param m   recibe como parametro una matriz vacia  
     * @param a   recibe como parametro el numero de filas
     * @param b   recibe como parametro el numero de columnas
     * @return  retorna una matriz llena
     * @since MultiplicacionMatrices 1.0.0
   */
   public int[][] llenar(int m[][], int a , int b){
       System.out.println("Digita los valores de la primera matriz");
           for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
                   m[i][j]=ingresado.nextInt();
                   
               }
           }
           return m;
   } 
   /**
     * este metodo permite llenar la segunda matriz 
     * @param m   recibe como parametro una matriz vacia  
     * @param a   recibe como parametro el numero de filas
     * @param b   recibe como parametro el numero de columnas
     * @return  retorna una matriz llena
     * @since MultiplicacionMatrices 1.0.0
   */
   public int[][] llenar2(int m[][], int a , int b){
       System.out.println("Digita los valores de la segunda matriz");
           for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
                   m[i][j]=ingresado.nextInt();
                   
               }
           }
           return m;
   } 
   /**
     *este metodo muestra la matriz con el numero de filas y columnas 
     * que reciba como parametro 
     * @param m matriz que se desea imprimir   
     * @param f numero de filas de la matriz  
     * @param c numero de columnas de la matriz
     * @since MultiplicacionMatrices 1.0.0
     */
   public static void mostrar(int m[][], int f,int c){
       for(int i=0;i<f;i++){
           for(int j=0;j<c;j++){
               System.out.print(m[i][j] + " \t");
           }
           System.out.println();
       }
   }
   /**
     * este metodo realiza la multiplicacion de la matrices que recibe como parametro
     * y retorna la matriz resultante
     * @param m   primera matriz
     * @param n   segunda matriz
     * @param g   matriz vacia para lennar
     * @param f   numero de filas 
     * @param c   numero de columnas
     * @param y   numero de columnas de la segunda matriz
     * @return g  retorna la matriz resultante
     * @since MultiplicacionMatrices 1.0.0
   */
   public int[][] multiplicacion(int m[][], int n[][],int g[][], int f, int c , int y){    
       for(int i=0;i<f;i++){
           for(int j=0;j<y;j++){
               for(int k=0;k<c;k++){
                   g[i][j] += m[i][k] * n[k][j];
               }
               
           }
       }
       return g;
   }
   
    
    
    /*
     fin de la clase OperacionesM
   */
}       
