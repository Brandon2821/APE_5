/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
 import java.util.Scanner;
public class mini_proyecto_integrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch(opcion){

                case 1 -> System.out.println("Producto creado");

                case 2 -> System.out.println("Mostrando productos");

                case 3 -> System.out.println("Producto actualizado");

                case 4 -> System.out.println("Producto eliminado");

                case 5 -> System.out.println("Fin del programa");

                default -> System.out.println("Opcion incorrecta");
            }

        } while(opcion != 5);
    }
} 

