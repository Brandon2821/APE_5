/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author USUARIO
 */
    import java.io.*;
import java.util.Scanner;
public class Biblioteca {

 
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String codigo, titulo, autor, estado;

        System.out.println("Ingrese codigo:");
        codigo = sc.nextLine();

        System.out.println("Ingrese titulo:");
        titulo = sc.nextLine();

        System.out.println("Ingrese autor:");
        autor = sc.nextLine();

        System.out.println("Ingrese estado:");
        estado = sc.nextLine();

        try (FileWriter archivo = new FileWriter("biblioteca.txt")) {
            archivo.write(codigo + " ");
            archivo.write(titulo + " ");
            archivo.write(autor + " ");
            archivo.write(estado);
        }

        System.out.println("Libro registrado correctamente");

        try (BufferedReader br = new BufferedReader(
                new FileReader("biblioteca.txt"))) {
            String linea;
            
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }
    }
}