/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filtro;

import Dao.*;
import Controller.*;
import View.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Main {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int errores = 0;  

            while (true) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                                   Panel de Control                                     ║");
                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════╝");
                System.out.println("║Hola usuario, bienvenido a nuestro software de gestión de eventos.           ║");
                System.out.println("║¿Con qué rol te identificas en nuestra compañía?                             ║");
                System.out.println("║                                                                             ║"  );
                System.out.println("║1. Ninjas                                                                    ║");
                System.out.println("║══════════════════════════════════════════════════════════════════════════════════════════║");
                System.out.print("Por favor, selecciona una opción: ");

                int opcion = 0;

                try {
                    opcion = scanner.nextInt(); 
                    errores = 0; 

                    switch (opcion) {
                        case 1:
                            ninja(scanner);
                            break;
                        /*case 2:
                            CoordinadorDeActividades(scanner);
                            break;
                        case 3:
                            GerenteDeRestaurante(scanner);
                            break;
                        case 4:
                            GerenteDeTienda(scanner);
                            break;
                        case 5:
                            SupervisorDeTaquilla(scanner);  
                            break;*/
                        case 6:
                        System.out.println("Saliendo del sistema.");
                        return; 
                        default:
                            errores++;
                            if (errores < 3) {
                                System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 5.");
                            } else {
                                System.out.println("Has cometido varios errores. Por favor, selecciona una opción válida.");
                            }
                            scanner.nextLine(); 
                            break;
                    }
                } catch (InputMismatchException e) {

                    System.out.println("Entrada no válida. Por favor ingresa un número entero.");
                    errores++;
                    scanner.nextLine(); 
                    if (errores >= 3) {
                        System.out.println("Has cometido varios errores. Por favor, selecciona una opción válida.");
                    }
                }

                if (opcion >= 1 && opcion <= 6) {
                    break;
                }
            }

            scanner.close();
        }

      // -----------------------------------------------------------------
      //-----------------------        NINJA         ---------------------
      //------------------------------------------------------------------

    private static void ninja(Scanner scanner) {
        int errores = 0; 

        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                          Ninja                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("║Hola luchador, te damos la bienvenida a nuestro panel de ninjas ║");
            System.out.println("║¿Podrías regalarnos tu nombre para referirnos a ti?              ║");
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = scanner.next();
            System.out.println("Listo " + nombre + ", en esta sección podrás entrar a los siguientes módulos:");
            System.out.println("║1. Gestionar ninja                                                           ║");
            System.out.println("║═════════════════════════════════════════════════════════════════════════════║");
            System.out.print("Por favor, selecciona una opción: ");

            int opcion = 0;

            try {
                opcion = scanner.nextInt(); 
                errores = 0; 

                switch (opcion) {
                    case 1:
                        System.out.println("Seleccionaste para crear un ninja.");
                        NinjaDao ticketDao = new NinjaDao();
                        NinjaView ticketView = new NinjaView(null);
                        NinjaController ticketController = new NinjaController(ticketDao, ticketView);
                        ticketView.setNinjaController(ticketController);
                        ticketView.showMenu();
                        break;
                
                    default:
                        errores++;
                        if (errores < 3) {
                            System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 4.");
                        } else {
                            System.out.println("Has cometido varios errores. Por favor, selecciona una opción válida.");
                        }
                        scanner.nextLine(); 
                        break;
                }
            } catch (InputMismatchException e) {

                System.out.println("Entrada no válida. Por favor ingresa un número entero.");
                errores++;
                scanner.nextLine(); 
                if (errores >= 3) {
                    System.out.println("Has cometido varios errores. Por favor, selecciona una opción válida.");
                }
            }
        }
    }
}