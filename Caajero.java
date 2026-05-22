/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caajero;

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.Scanner;

public class Caajero {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String usuario;
        double saldo, deposito, retiro;

        System.out.println("Ingrese usuario:");
        usuario = sc.nextLine();

        System.out.println("Ingrese saldo inicial:");
        saldo = sc.nextDouble();

        try (FileWriter archivo = new FileWriter("cajero.txt")) {
            archivo.write(usuario + " " + saldo);
        }

        System.out.println("Saldo actual: " + saldo);

        System.out.println("Ingrese deposito:");
        deposito = sc.nextDouble();

        saldo = saldo + deposito;

        System.out.println("Nuevo saldo: " + saldo);

        System.out.println("Ingrese retiro:");
        retiro = sc.nextDouble();

        if(retiro <= saldo){
            saldo = saldo - retiro;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo final: " + saldo);
    }
}