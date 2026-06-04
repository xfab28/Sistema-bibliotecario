import java.util.Scanner;

public class principal {
    
    static Scanner s1 = new Scanner(System.in);
    
    static libro l1 = new libro("Caperucita", "Alberto", 1926, true);
    static libro l2 = new libro("Los tres cerditos", "Ramiro", 1931, true);
    static libro l3 = new libro("Hansy y Greter", "Benito", 1934, true);
    
    public static void main(String[] args) {
        int opcion;
        boolean proceso = false;
        
        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");
        
        libro[] libros = {l1, l2, l3};
        
        do {
            do {
                System.out.println("\nLibros\n");
                
                for(int i = 0; i < libros.length; i++) {
                    System.out.println((i+1) + "." + " " + libros[i].getTitulo());
                }
                
                System.out.println("4. Salir");
                
                System.out.print("\nTu opcion: ");
                opcion = s1.nextInt();
            } while(opcion < 0 || opcion > 4);
            
            switch (opcion) {
                case 1: libro1();
                    break;
                case 2: libro2();
                    break;
                case 3: libro3();
                    break;
                case 4: proceso = true;
                    break;
                default: System.out.println("\nError");
                    break;
            }
        
        } while(proceso == false);
    }
    
    public static void libro1() {
        int opcion;
        boolean proceso = false;
        
        do {
            do {
                System.out.println("\n" + l1.getTitulo() + "\n");
                System.out.println("1. Ver informacion");
                System.out.println("2. Tomar prestado");
                System.out.println("3. Devolver");
                System.out.println("4. Salir");
                
                System.out.print("\nTu opcion: ");
                opcion = s1.nextInt();
            } while(opcion < 0 || opcion > 4);
            
            switch (opcion) {
                case 1: System.out.println("\n" + l1.mostrarInfo());
                break;
                case 2: l1.prestar();                        
                    break;
                case 3: l1.devolver();
                    break;
                case 4: proceso = true;
                    break;
                default: System.out.println("\nError");
                    break;
            }
            
        } while(proceso == false);
    }
    
    public static void libro2() {
        int opcion;
        boolean proceso = false;
        
        do {
            do {
                System.out.println("\n" + l2.getTitulo() + "\n");
                System.out.println("1. Ver informacion");
                System.out.println("2. Tomar prestado");
                System.out.println("3. Devolver");
                System.out.println("4. Salir");
                
                System.out.print("\nTu opcion: ");
                opcion = s1.nextInt();
            } while(opcion < 0 || opcion > 4);
            
            switch (opcion) {
                case 1: System.out.println("\n" + l2.mostrarInfo());
                break;
                case 2: l2.prestar();                    
                    break;
                case 3: l2.devolver();                        
                    break;
                case 4: proceso = true;
                    break;
                default: System.out.println("\nError");
                    break;
            }
            
        } while(proceso == false);
    }
    
    public static void libro3() {
        int opcion;
        boolean proceso = false;
        
        do {
            do {
                System.out.println("\n" + l3.getTitulo() + "\n");
                System.out.println("1. Ver informacion");
                System.out.println("2. Tomar prestado");
                System.out.println("3. Devolver");
                System.out.println("4. Salir");
                
                System.out.print("\nTu opcion: ");
                opcion = s1.nextInt();
            } while(opcion < 0 || opcion > 4);
            
            switch (opcion) {
                case 1: System.out.println("\n" + l3.mostrarInfo());
                break;
                case 2: l3.prestar();
                    break;
                case 3: l3.devolver();
                    break;
                case 4: proceso = true;
                    break;
                default: System.out.println("\nError");
                    break;
            }
            
        } while(proceso == false);
    }
}