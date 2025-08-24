
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jefrey
 */
public class EjemploMap {
    public static void main(String[] args) {
         System.out.println("=== EJEMPLO MAP ===\n");
        
        // 1. CÓMO SE DECLARAN
        Map<String, String> estudiantes = new HashMap<>();
        System.out.println("Map declarado: " + estudiantes);
        
        // 2. CÓMO SE ASIGNAN VALORES
        estudiantes.put("001", "Ana García");
        estudiantes.put("002", "Luis Pérez");
        estudiantes.put("003", "Carmen López");
        System.out.println("Después de asignar valores: " + estudiantes);
        
        // 3. CÓMO SE ELIMINAN VALORES
        estudiantes.remove("002");
        System.out.println("Después de eliminar carnet 002: " + estudiantes);
    }
    
}
