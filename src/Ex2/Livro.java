package Ex2;

public class Livro {
    int id;
    String titulo;
    String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro Id: " + id + " Titulo: " + titulo + " Autor: " + autor;
    }
}
