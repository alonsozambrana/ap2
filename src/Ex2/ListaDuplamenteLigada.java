package Ex2;

public class ListaDuplamenteLigada {
    NoDuplo inicio, fim;

    public void adicionarLivroInicio(Livro livro) {
        NoDuplo novoNo = new NoDuplo(livro);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;

        }
    }

    public void adicionarLivroFim(Livro livro) {
        NoDuplo novoNo = new NoDuplo(livro);
        if (fim == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public Livro removerLivroInicio() {
        if (inicio == null) return null;
        Livro livro = inicio.livro;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        return livro;
    }


    public Livro removerLivroFim() {
        if (fim == null) return null;
        Livro livro = fim.livro;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        return livro;
    }

    public Livro buscarLivroPorId(int id) {
        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.livro.id == id) {
                return atual.livro;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprimirLivrosOrdemInicial() {
        NoDuplo atual = inicio;
        System.out.println("Livros na ordem original:");
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }

    public void imprimirLivrosAoContrario() {
        NoDuplo atual = fim;
        System.out.println("Livros na ordem reversa:");
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.anterior;
        }
    }
}
