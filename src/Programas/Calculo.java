/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author aleca
 */

import java.util.Scanner;

public class Calculo {
public static void main(String[] args){
double venta1, venta2, venta3, tv , pv;
    String empleado;
    Scanner lectura=new Scanner(System.in);
    System.out.println("Ingrese nombre de empleado:");
    empleado=lectura.next();
    System.out.print("Ingresar venta1:");
    venta1=lectura.nextDouble();
    System.out.print("Ingresar venta2:");
    venta2=lectura.nextDouble();
    System.out.print("Ingresar venta3:");
    venta3=lectura.nextDouble();
    tv = venta1 + venta2 + venta3;
    pv = tv / 3;
    System.out.println("El total de ventas es:" + tv);
    System.out.println("El promedio de ventas es:" + pv);
} 
}
