// LibraryApp.java - Aplicación principal
public class LibraryApp {
    public static void main(String[] args) {
        // TU CAMBIO: Agregar comentario y lógica
        Library library = new Library();
        
        // Inicializamos la biblioteca
        library.addBook(new Book("Clean Code", "Robert Martin", "978-0132350775"));
        library.addBook(new Book("The Pragmatic Programmer", "Hunt & Thomas", "978-0201616115"));
        
        System.out.println("✅ Biblioteca lista con 3 libros");
        
        Book found = library.findBookByTitle("Clean Code");
        System.out.println(found);
    }
}
