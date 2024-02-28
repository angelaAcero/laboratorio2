/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratiorio2;

//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author amace
 */
public class MENU {
    
 public static float escalar;
 public static int [] rango = {100,500,1000,5000,10000};
 public static double [][] RESULTADO = new double [rango.length][5];
 public static int valorrango = 0; 
 // public static long startTime = System.nanoTime();
    
    public static void main(String[] args) {
           Scanner a = new Scanner(System.in);
            
           String continuar;
        do
        { 
            System.out.println("Escriba el numero de la operacion que desea usar");
            System.out.println("1. Calculadora matricial");
            System.out.println("2. Ordenar matrices aleatroias");
            System.out.println("3. Ordenar datos personales ");

            int Punto = a.nextInt();
            
            
 //objetos          
            Punto11 indicador = new Punto11();
            
          Punto2 ordenamiento = new Punto2();
            
            switch (Punto){

                case 1: 
                    System.out.println(" \n           CALCULADORA MATRICIAL\n\n");


                                System.out.println("Elija el número de la operacion a realizar");
                                System.out.println("1. Suma de matrices\n" +
                                                   "2. producto de matrices\n" +
                                                   "3. producto de un escalar con una matriz \n" +
                                                   "4. Traspuesta de una matriz");

                                             int operacion = a.nextInt();
                    if (operacion <1 || operacion >4)
                    {
                        System.out.println("        NO HAY");
                    }
                    else
                    {
 //llenar a
                        System.out.println("ingrese el tamaño de las filas de la matriz A");
                            int      fa=  a.nextInt();

                        System.out.println("ingrese el tamaño de las columnas de la matriz A");
                             int     ca= a.nextInt();


                        float[][]MatrizA = new float[fa][ca];

                        for (int i = 0; i <fa ; i++) {
                            for (int j = 0; j < ca; j++) {

                                System.out.println("valor para la ubicaion "+ i +" , "+ j);
                                MatrizA[i][j]= a.nextInt();
                            }
                        }

                        indicador.MatrizA = MatrizA;


     //operacion suma                    

                        if (operacion == 1) 
                        {
    // llenar b
                            System.out.println("ingrese el tamaño de las filas de la matriz B");
                             int    fB =  a.nextInt();

                            System.out.println("ingrese el tamaño de las columnas de la matriz B");
                             int    cB = a.nextInt() ;

                             float[][]MatrizB = new float[fB][cB];

                            for (int i = 0; i <fB; i++) {
                                for (int j = 0; j < cB; j++) {

                                    System.out.println("valor para la ubicaion "+ i +" , "+ j);
                                    MatrizB[i][j]= a.nextInt();
                                }
                            }
                            indicador.MatrizB = MatrizB;

    // operaciones -suma
                            if (fa==fB && ca==cB) 
                            {
                                fa=fB;
                                ca=cB;
    //imprimir a para suma
                                String impreisonMA = "";
                                for (int i = 0; i <fa; i++)
                                { 
                                    for (int j = 0; j < ca; j++)
                                    { 

                                    impreisonMA += MatrizA[i][j] +"     ";
                                    }
                                    impreisonMA += "\n";
                                }
                                System.out.println(" MATRIZ A ");     
                                System.out.println(impreisonMA);

    //imprimir b para suma
                                String impreisonMB = "";
                                for (int i = 0; i <fB; i++)
                                { 
                                    for (int j = 0; j < cB; j++) 
                                    { 
                                        impreisonMB += MatrizB[i][j] +"     ";
                                    }
                                    impreisonMB += "\n";
                                }
                                System.out.println(" MATRIZ B ");     
                                System.out.println(impreisonMB);


                                indicador.SUMA(fa, ca);
// imprimir suma 
                                String impreisonSUMA = "";

                                for (int i = 0; i < fa; i++) 
                                { 
                                    for (int j = 0; j < ca; j++)
                                    { 
                                        impreisonSUMA += indicador.RESULTADO[i][j] + "   ";
                                    }
                                    impreisonSUMA += "\n";
                                }
                            System.out.println(" SUMA ");
                            System.out.println(impreisonSUMA);
                            }
                            else
                            {
                                System.out.println("La suma no se puede realizar ya que las matrices no tienen las mismas filas y colmunas");
                            }
                        }
    // operacion- mult           
                        else if(operacion == 2) 
                        {
      //llenado b           
                            System.out.println("ingrese el tamaño de las filas de la matriz B");
                             int    fB =  a.nextInt();

                             System.out.println("ingrese el tamaño de las columnas de la matriz B");
                             int    cB = a.nextInt() ;

                            float[][]MatrizB = new float[fB][cB];

                            for (int i = 0; i <fB; i++) {
                                for (int j = 0; j < cB; j++) {

                                    System.out.println("valor para la ubicaion "+ i +" , "+ j);
                                    MatrizB[i][j]= a.nextInt();
                                }
                            }
                            indicador.MatrizB = MatrizB;
    // imprimir a
                            String impreisonMA = "";
                            for (int i = 0; i <fa; i++) 
                            { 
                                for (int j = 0; j < ca; j++)
                                { 
                                    impreisonMA += MatrizA[i][j] +"     ";
                                }
                                impreisonMA += "\n";
                            }
                            System.out.println(" MATRIZ A ");     
                            System.out.println(impreisonMA);

    //imprimir b
                            String impreisonMB = "";
                            for (int i = 0; i <fB; i++) 
                            { 
                                for (int j = 0; j < cB; j++) 
                                { 
                                    impreisonMB += MatrizB[i][j] +"     ";
                                }
                                impreisonMB += "\n";
                            }
                            System.out.println(" MATRIZ B ");     
                            System.out.println(impreisonMB);

                            if(ca == fB )
                            {
                                indicador.MULTIPLICAR( fa, ca, fB, cB);

                                String impreisonMULTIPLICAR= "";

                                for (int i = 0; i < fa; i++) 
                                { 
                                    for (int j = 0; j < cB; j++)
                                    { 

                                        impreisonMULTIPLICAR += indicador.RESULTADO[i][j] + "   ";
                                    }
                                    impreisonMULTIPLICAR += "\n";
                                }
                            System.out.println(" MULTIPLICACION ");
                            System.out.println(impreisonMULTIPLICAR);
                            }
                            else
                            {
                                System.out.println("La multipliacacion no se puede realizar ya que el número de columnas\n"
                                +" de la primera matriz NO coicide con el numero de filas de la segunda matriz ");

                            }
                        }
    // operacion escalar x matriz
                        else if (operacion == 3) 
                        {
                            System.out.println(" Ingrese el número por el que quiere multimplicar la matriz anterior");
                             escalar = a.nextInt();

                            indicador.escalarporvector(fa,ca,escalar);
    // imprimir a
                            String impreisonMA = "";
                            for (int i = 0; i <fa; i++) 
                            { 
                                for (int j = 0; j < ca; j++)
                                { 
                                    impreisonMA += MatrizA[i][j] +"     ";
                                }
                                impreisonMA += "\n";
                            }
                            System.out.println(" MATRIZ A ");     
                            System.out.println(impreisonMA);
// imprimir matriz mutilplicada 

                            String impreisonMULTIPLICARESCALAR= "";

                                for (int i = 0; i < fa; i++) 
                                { 
                                    for (int j = 0; j < ca; j++)
                                    { 

                                        impreisonMULTIPLICARESCALAR += indicador.RESULTADO[i][j] + "   ";
                                    }
                                    impreisonMULTIPLICARESCALAR += "\n";
                                }
                            System.out.println(" ECALAR X VECTOR ");
                            System.out.println(impreisonMULTIPLICARESCALAR);
                        }
// traspuesta 
                        else if (operacion == 4)
                        {
                             indicador.TRASPUESTA(fa,ca);
     // imprimir a
                            String impreisonMA = "";
                            for (int i = 0; i < fa; i++) 
                            { 
                                for (int j = 0; j < ca; j++)
                                { 
                                    impreisonMA += MatrizA[i][j] +"     ";
                                }
                                impreisonMA += "\n";
                            }
                            System.out.println(" MATRIZ A ");     
                            System.out.println(impreisonMA);
// imprimir traspuesta 

                            String impreisonTRASPUESTA = "";

                                for (int i = 0; i < ca; i++) 
                                { 
                                    for (int j = 0; j < fa; j++)
                                    { 

                                        impreisonTRASPUESTA += indicador.RESULTADO[i][j] + "   ";
                                    }
                                    impreisonTRASPUESTA += "\n";
                                }
                            System.out.println(" TRASPUESTA  ");
                            System.out.println(impreisonTRASPUESTA);
                        }
                    }
 //break del case 1                   
                    break;

                    
                case 2: 
                     System.out.println("\n           ALGORITMOS DE ORDENAMIENTO\n\n");
                     System.out.println("metodos a comparar");
                     System.out.println("1. inserción\n" +
                                        "2. burbuja \n" +
                                        "3. selección \n" +
                                        "4. mergesort");
                     
                                          

                    for (int i = 0; i < rango.length; i++) {
                        
                        valorrango = rango[i];
                        RESULTADO[i][0] = valorrango;
                        double [] A = new double [rango[i]]; 
                        

                        for (int j = 0; j < A.length ; j++) 
                        {
                            A[j]= (double)(Math.random()*A.length);   
                       
                        }
                        ordenamiento.A = A;
 // timepo burbuja                       
                        long startTime = System.nanoTime();

                        ordenamiento.burbuja(A);
                    
                        long tiempoLineal = (System.nanoTime() - startTime);

                         RESULTADO [i][1] = tiempoLineal ;
  // tiempo insercion                          
                        startTime = System.nanoTime();

                        ordenamiento.insercion();
                    
                        tiempoLineal = (System.nanoTime() - startTime);

                         RESULTADO [i][2] = tiempoLineal ;
// tiempo selecion                      
                          startTime = System.nanoTime();
                        
                        ordenamiento.seleccion();
                        
                        tiempoLineal = (System.nanoTime() - startTime);
                        RESULTADO [i][3] = tiempoLineal ;
                         
  // tiempo merge          
                        startTime = System.nanoTime();
                        
                        ordenamiento.mergesort(A);
                        
                        tiempoLineal = (System.nanoTime() - startTime);
                        RESULTADO [i][4] = tiempoLineal ;
  
                    }
                    ordenamiento.impresion();
     
// break del case 2 
                    break;
                case 3: 
                    
                    Punto3 obj = new Punto3();
                    obj.setVisible(true);
                    break;
            }

          System.out.println("desea continuar?");
          continuar = a.next();

        }while(continuar.equals("si")|| continuar.equals ("SI") || continuar.equals("Si"));
    }
    
}