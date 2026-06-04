public class libro {
    String titulo;
    String autor;
    int anio;
    boolean disponible;
    
    public libro(String titulo, String autor, int anio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }
    
    public String mostrarInfo() {
        return "\nInformacion: \n" +
                "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAño: " + this.anio +
                "\nDisponible: " + disponible;
    }
    
    public void prestar() {
        System.out.println("\nLibro prestado");
        this.disponible = false;
    }
    
    public void devolver() {
        System.out.println("\nLibro devuelto");
        this.disponible = true;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
}
