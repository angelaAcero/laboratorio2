/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratiorio2;

public class Punto2 extends MENU{
    
  
    
      double [] A = new double [valorrango];   
      double [] B = new double [valorrango];
    

    public double [] burbuja(double [] X)
    {

        // System.out.println("startime : " + startTime  );
      B = X.clone();
      // System.out.println(" TAMAÑO VECTOR : " + B.length);
          
        for (int k = 1; k < B.length-1; k++) {
            for (int j = 0; j < B.length-k; j++) {

                if (B[j] > B[j+1]) 
                {
                    double temp;
                    temp = B[j] ;
                    B[j] = B[j+1] ;
                    B[j+1] = temp;
                }
            }
        }

        return B;
    }  

    public void insercion()
    {
       // System.out.println("    insercion   ");
        
         B = A.clone();
         
       //  System.out.println(" TAMAÑO VECTOR : " + B.length);
        double temp;
        int k, j;
        for (k = 1; k < B.length; k++) 
        {
             temp = B[k]; 

            for (j = k ; (j > 0 ) && (temp < B[j-1]); j--)
            {

                B[j] = B[j - 1];
                
                B[j-1] = temp;
             
            }
  
        }
 
    }
    public void seleccion(){
        B = A.clone();
        double temp;
        int i, j, posicionMenor;

        for (i=0; i<B.length-1; i++)
        {
                
            posicionMenor = i;
            for (j=i+1; j<B.length; j++)
            {
                if (B[j]<B[posicionMenor])
                posicionMenor = j;
            }

            temp = B[i];
            B[i] = B[posicionMenor];
            B[posicionMenor] = temp;
        }
 
    }
    public void mergesort(double []H){
 /*String impreisonMA = "";
                                for (int i = 0; i <H.length; i++)
                                { 

                                    impreisonMA += H[i] +"     ";
                                    
                                    impreisonMA += "\n";
                                }
                                System.out.println(" MATRIZ A ");     
                                System.out.println(impreisonMA);*/

       if (H.length > 1)
       {
            int i = 0,j = 0,k = 0;
            int c = H.length/2;
            int d = H.length-c;

            double []C = new double [c]; 
            double []D = new double [d]; 
     
            System.arraycopy(H, 0, C, 0, c);
            System.arraycopy(H, c, D, 0, d);
            mergesort(C);
            mergesort(D);
            
            while (i < C.length && j <D.length)
            {
                if (C[i] < D[j])
                {
                    H[k] = C[i];
                    i++;
                } else 
                {
                    H[k] = D[j];
                    j++;
                }
                k++;
            }
            while (i < C.length) 
            {
                H[k] = C[i];
                i++;
                k++;
            }
            while (j < D.length) 
            {
                H[k] = D[j];
                j++;
                k++;
            }
       }
    }
    public void impresion ()
    {
      /* String impreisonMA = "";
                                for (int i = 0; i <A.length; i++)
                                { 

                                    impreisonMA += A[i] +"     ";
                                    
                                    impreisonMA += "\n";
                                }
                                System.out.println(" MATRIZ Adios ");     
                                System.out.println(impreisonMA);*/
        
        System.out.println("                            TABLA DE VELOCIDADDES DE ORDENAMIENTO EN MILISEGUNDOS       ");
  
    System.out.println(
        "-----------------------------------------------------------------------------------------------------------");
    System.out.printf("%10s %16s %20s %20s %20s", "TAMAÑO VECTOR", "BURBUJA", "INSERCION", "SELECCION", "MERGESORT");
    System.out.println();
    System.out.println(
        "-----------------------------------------------------------------------------------------------------------");
      
            for (int l = 0; l < rango.length; l++)
            {  
               System.out.format("%10.0f      | %15.3f    | %15.3f    | %15.3f    | %15.3f    | %n", RESULTADO[l][0], RESULTADO[l][1], RESULTADO[l][2],  RESULTADO[l][3],  RESULTADO[l][4]); 
            }
 
        

    System.out.println(
        "-----------------------------------------------------------------------------------------------------------");
  }   
        
        
        
        
        
        
        
        
        
        
    
    
    
}
