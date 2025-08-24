
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jefrey
 */
public class EjemploList {
    public static void main(String[] args) {
         System.out.println("=== EJEMPLO LIST ===\n");
        
        // 1. CÓMO SE DECLARAN
        List<Integer> numeros = new ArrayList<>();
        System.out.println("List declarada: " + numeros);
        
        // 2. CÓMO SE ASIGNAN VALORES
        numeros.add(10);        // posición 0
        numeros.add(20);        // posición 1
        numeros.add(30);        // posición 2
        System.out.println("Después de asignar valores: " + numeros);
        
        // 3. CÓMO SE ELIMINAN VALORES
        numeros.remove(0);      // eliminar posición 0
        System.out.println("Después de eliminar posición 0: " + numeros);
    }
}
