/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8bucles;

/**
 *
 * @author Miguel
 */
public class Vector {
    
   private int mmayor[][]= new int[3][3];
   
   public Vector(){
       
        this.mmayor[0][0]= 6;
        this.mmayor[0][1]= 62;
        this.mmayor[0][2]= 7;
        this.mmayor[1][0]= 78;
        this.mmayor[1][1]= 6/2;
        this.mmayor[1][2]= 6*8;
        this.mmayor[2][0]= 3;
        this.mmayor[2][1]= 2;
        this.mmayor[2][2]= 3*66;
       
}
   public int validarNumerMayor(){
       int aux=0;
       
        for (int i =0; i<3 ; i++)
        {
            for (int j=0; j<3; j++)
            {
           if (this.mmayor[i][j]>aux){
            
               aux = this.mmayor[i][j];   
            }
            }               
        }
       
   return aux;
   }
    
   public void imprimirVector(){
       
        for (int i =0; i<3 ; i++)
        {
            for (int j=0; j<3; j++)
            {
            System.out.print(" "+mmayor[i][j]);
            }
        System.out.println();
        }
   
   
   }
}
