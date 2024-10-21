package Ex2;

public class Biblioteca {
    ListaDuplamenteLigada listaLivros = new ListaDuplamenteLigada();

    public void adicionarNovoLivroNoInicio(int id, String titulo, String autor) {
        Livro livro = new Livro(id, titulo, autor);
        listaLivros.adicionarLivroInicio(livro);
    }

    public void adicionarNovoLivroNoFim(int id, String titulo, String autor) {
        Livro livro = new Livro(id, titulo, autor);
        listaLivros.adicionarLivroFim(livro);
    }

    public void removerPrimeiroLivro() {
        Livro livro = listaLivros.removerLivroInicio();
        if (livro != null) {
            System.out.println("Livro removido: " + livro);
        } else {
            System.out.println("Nenhum livro no início da lista.");
        }
    }

    public void removerUltimoLivro() {
        Livro livro = listaLivros.removerLivroFim();
        if (livro != null) {
            System.out.println("Livro removido: " + livro);
        } else {
            System.out.println("Nenhum livro no fim da lista.");
        }
    }

    public void buscarLivroPorId(int id) {
        Livro livro = listaLivros.buscarLivroPorId(id);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void imprimirLivrosNaOrdemOriginal() {
        listaLivros.imprimirLivrosOrdemInicial();
    }

    public void imprimirLivrosNaOrdemReversa() {
        listaLivros.imprimirLivrosAoContrario();
    }
}
