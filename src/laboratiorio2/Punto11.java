/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratiorio2;

/**
 *
 * @author amace
 */
public class Punto11 extends MENU {

    int fa=100,ca=100;
         float[][]MatrizA = new float[fa][ca];
         float[][]MatrizB = new float[fa][ca]; 
         float[][]RESULTADO = new float[fa][ca]; 
// primer punto
    public void SUMA (int fa, int ca){
        
        for (int i = 0; i < fa; i++) 
        { 
            for (int j = 0; j < ca; j++) 
            { 

                RESULTADO[i][j] = MatrizA[i][j] + MatrizB[i][j];
            }
        }
    }
    public void MULTIPLICAR (int fa, int ca,int fB, int  cB){
 
        for (int i = 0; i < fa; i++ ) 
        {
            for (int j = 0; j < cB; j++) {
                    
                int suma=0;
                int k=0;
        
                while (k < ca)
                {
                    // System.out.println("ca: " + ca + ", cb: " + cB + ", Fa: " + fa+ ", fB : " + fB);
                    //    System.out.println("i :" + i + ", jota : "+j+", ka : " +k);
                    suma +=  (MatrizA[i][k] * MatrizB[k][j]);

                    k++;
                    //  System.out.println("ka: " +k);
                    //   System.out.println("suma :" + suma );

                }
                
                RESULTADO[i][j] = suma;
                // System.out.println("resultado en : (" +i + ", " + j + ") : "+RESULTADO[i][j]);
            }      

        }      
    }
    public void escalarporvector(int fa, int ca, float escalar){
        
       for (int i = 0; i < fa ; i++) 
        {
            for (int j = 0; j < ca; j++) 
            {
                 RESULTADO[i][j] =  MatrizA [i][j] * escalar ;
            }
        }
    }
    public void TRASPUESTA(int fa, int ca){
   
        
        for (int i = 0; i <fa; i++) 
        {
            for (int j = 0; j <ca; j++) 
            {
                 RESULTADO[j][i] =  MatrizA [i][j];
            }
        }
        
    }
    
}


