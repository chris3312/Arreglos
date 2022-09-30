/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_arreglos2 {

public static void main(String[] args) {
//Creo un array con nuevo valor que es 100
int[] numeros=new int[100];
//Declaro las variables necesarias para la suma y la media
int suma=0;
double media;
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la media con la funcion print lo  imprime
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;//
System.out.println("La media es "+media);
}
}