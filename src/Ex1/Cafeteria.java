package Ex1;

public class Cafeteria {
    Fila filaPedidosPendentes = new Fila();
    Pilha pilhaPedidosCancelados = new Pilha();

    public void adicionarNovoPedido(int id, String descricao) {
        Pedido pedido = new Pedido(id, descricao);
        filaPedidosPendentes.enfileirar(pedido);
    }

    public void atenderPedido() {
        Pedido pedido = filaPedidosPendentes.desenfileirar();
        if (pedido != null) {
            System.out.println("Pedido atendido: " + pedido);
        } else {
            System.out.println("Nenhum pedido pendente.");
        }
    }

    public void cancelarPedido() {
        Pedido pedido = filaPedidosPendentes.desenfileirar();
        if (pedido != null) {
            pilhaPedidosCancelados.push(pedido);
            System.out.println("Pedido cancelado: " + pedido);
        } else {
            System.out.println("Nenhum pedido pendente.");
        }
    }

    public void restaurarPedido() {
        Pedido pedido = pilhaPedidosCancelados.pop();
        if (pedido != null) {
            filaPedidosPendentes.enfileirar(pedido);
            System.out.println("Pedido restaurado: " + pedido);
        } else {
            System.out.println("Nenhum pedido cancelado.");
        }
    }

    public void imprimirPedidosPendentes() {
        filaPedidosPendentes.imprimirFila();
    }

    public void imprimirPedidosCancelados() {
        pilhaPedidosCancelados.imprimirPilha();
    }
}
