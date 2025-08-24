
import java.util.ArrayList;
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jefrey
 */
public class EjemploCollection {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO COLLECTION ===\n");
        
        // 1. CÓMO SE DECLARAN
        Collection<String> nombres = new ArrayList<>();
        System.out.println("Collection declarada: " + nombres);
        
        // 2. CÓMO SE ASIGNAN VALORES
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        System.out.println("Después de asignar valores: " + nombres);
        
        // 3. CÓMO SE ELIMINAN VALORES
        nombres.remove("María");
        System.out.println("Después de eliminar María: " + nombres);
    }
}
