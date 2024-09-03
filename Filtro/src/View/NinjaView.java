/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package View;

import Controller.NinjaController;
import Model.Ninja;
import java.util.Scanner;

/**
 *
 * @author camper
 */

public class NinjaView {
     private NinjaController ninjaController;

    // Constructor que acepta un controlador
    public NinjaView(NinjaController ninjaController) {
        this.ninjaController = ninjaController;
    }

    // Método para asignar el controlador
    public void setNinjaController(NinjaController ninjaController) {
        this.ninjaController = ninjaController;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Obtener Ninja:");
        
         // Validar el nombre del participante
        String nombre = "";
        boolean validName = false;
        while (!validName) {
        System.out.println("Ingrese nombre del ninja: ");
            nombre = scanner.nextLine();
            
            if (ninjaController.isEventNameExists(nombre)) {
                System.out.println("Lamentablemente ya existe un visitante con este nombre, por favor ingrese un nombre diferente.");
            } else {
                validName = true;
            }
        }
        
        System.out.println("Ingrese el rango: ");
        String rango = scanner.nextLine();
        
        System.out.println("Ingrese la aldea del ninja: ");
        String aldea = scanner.nextLine();
        
        Ninja ninja = new Ninja(
            0, nombre, rango, aldea
        );
        
        if (ninjaController.AddNinja(ninja)) {
            System.out.println("Ninja obtenido exitosamente.");
        } else {
            System.out.println("No se pudo obtener el ninja.");
        }
        
        // Mostrar la lista de participantes
        System.out.println("Lista de todos los Ninjas:");
        ninjaController.getAllNinja().forEach(System.out::println);
        
        // Cerrar el escáner
        scanner.close();
    }
}