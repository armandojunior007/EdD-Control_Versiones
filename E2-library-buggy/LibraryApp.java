// LibraryApp.java - Aplicación principal
public class LibraryApp {
    public static void main(String[] args) {
        // Tu cambio local: Agregamos más libros
        Library library = new Library();
        
        library.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884"));
        library.addBook(new Book("The Pragmatic Programmer", "Hunt & Thomas", "978-0201616224"));
        
        System.out.println("📚 Biblioteca inicializada con 2 libros");
        
        // Tu código aquí
        Book found = library.findBookByTitle("Clean Code");
        if (found != null) {
            System.out.println("✅ Libro encontrado: " + found.getTitle());
        }
    }
}
