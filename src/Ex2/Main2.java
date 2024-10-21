package Ex2;

public class Main2 {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();

        // adicionando livros no incio e fi da lista
        sistema.adicionarNovoLivroNoInicio(1, "livro1", "alonso");
        sistema.adicionarNovoLivroNoInicio(2, "livro4", "lully");
        sistema.adicionarNovoLivroNoFim(3, "livro2", "alonso");
        sistema.adicionarNovoLivroNoFim(4, "livro3", "lully");

        // removendo o primeiro livro
        System.out.println("\nRemovendo o primeiro livro:");
        sistema.removerPrimeiroLivro();
        sistema.imprimirLivrosNaOrdemOriginal();

        // removendo o último livro
        System.out.println("\nRemovendo o último livro:");
        sistema.removerUltimoLivro();
        sistema.imprimirLivrosNaOrdemOriginal();

        // buscando livro por ID
        System.out.println("\nBuscando livro com ID 2:");
        sistema.buscarLivroPorId(2);

        // imprimindo livros na ordem inicial
        System.out.println("\nLivros na ordem inicial:");
        sistema.imprimirLivrosNaOrdemOriginal();

        // imprimindo livros ao contrario
        System.out.println("\nLivros ao contrário:");
        sistema.imprimirLivrosNaOrdemReversa();
    }
}
