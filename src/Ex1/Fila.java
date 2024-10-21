package Ex1;

public class Fila {
    No inicio, fim;

    public void enfileirar(Pedido pedido) {
        No novoNo = new No(pedido);
        if (fim != null) {
            fim.proximo = novoNo;
        }
        fim = novoNo;
        if (inicio == null) {
            inicio = fim;
        }
    }

    public Pedido desenfileirar() {
        if (inicio == null) return null;
        Pedido pedido = inicio.pedido;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return pedido;
    }

    public void imprimirFila() {
        No atual = inicio;
        System.out.println("Pedidos Pendentes:");
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
