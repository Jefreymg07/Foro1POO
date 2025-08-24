import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jefrey
 */
public class EjercicioForo1 {
    
    // DECLARACIÓN DEL MAP
    // Map: carnet(String) -> nombre(String)
    private Map<String, String> estudiantes = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    
    // MÉTODO 1: INGRESAR ALUMNO
    public void ingresarAlumno() {
        System.out.print("Carnet: ");
        String carnet = scanner.nextLine();
        
        System.out.print("Nombre completo: ");
        String nombre = scanner.nextLine();
        
        // ASIGNAR VALOR AL MAP
        estudiantes.put(carnet, nombre);
        
        System.out.println("Alumno ingresado exitosamente");
    }
    
    // MÉTODO 2: BUSCAR ALUMNO
    public void buscarAlumno() {
        System.out.print("Carnet a buscar: ");
        String carnet = scanner.nextLine();
        
        // BUSCAR EN EL MAP
        String nombre = estudiantes.get(carnet);
        
        if (nombre != null) {
            System.out.println("Carnet: " + carnet + " - Nombre: " + nombre);
        } else {
            System.out.println("Alumno no encontrado, no se puede Mostrar");
        }
    }
    
    // MÉTODO 3: ELIMINAR ALUMNO
    public void eliminarAlumno() {
        System.out.print("Carnet a eliminar: ");
        String carnet = scanner.nextLine();
        
        // ELIMINAR DEL MAP
        String eliminado = estudiantes.remove(carnet);
        
        if (eliminado != null) {
            System.out.println("Alumno eliminado exitosamente");
        } else {
            System.out.println("Alumno no encontrado, No se puede Eliminar");
        }
    }
    
    // MÉTODO 4: MOSTRAR TODOS
    public void mostrarTodos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes");
            return;
        }
        
        System.out.println("=== TODOS LOS ESTUDIANTES ===");
        // RECORRER EL MAP
        for (String carnet : estudiantes.keySet()) {
            String nombre = estudiantes.get(carnet);
            System.out.println("Carnet: " + carnet + " - Nombre: " + nombre);
        }
    }
    
    // MENÚ PRINCIPAL
    public void menu() {
        int opcion;
        
        do {
            System.out.println("\n=== GESTIÓN ESTUDIANTES UDB ===");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1: ingresarAlumno(); break;
                case 2: buscarAlumno(); break;
                case 3: eliminarAlumno(); break;
                case 4: mostrarTodos(); break;
                case 5: System.out.println("¡Adiós!"); break;
                default: System.out.println("Opción inválida");
            }
            
        } while (opcion != 5);
    }
    
    // MAIN CORREGIDO - usando el nombre correcto de la clase
    public static void main(String[] args) {
        EjercicioForo1 sistema = new EjercicioForo1();
        sistema.menu();
    }
}
