package Ex1;


public class Main {
    public static void main(String[] args) {
        Cafeteria sistema = new Cafeteria();

        // adicionando pedidos
        sistema.adicionarNovoPedido(1, "cafe");
        sistema.adicionarNovoPedido(2, "leite");
        sistema.adicionarNovoPedido(3, "cafe com leite");

        // imprimindo os pedidos ainda pendentes
        System.out.println("\nPedidos pendentes após adicionar:");
        sistema.imprimirPedidosPendentes();

        // atendnedno pedido
        System.out.println("\nAtendendo o pedido:");
        sistema.atenderPedido();
        sistema.imprimirPedidosPendentes();

        // cancelando o pedido
        System.out.println("\nCancelando o pedido:");
        sistema.cancelarPedido();
        sistema.imprimirPedidosPendentes();
        sistema.imprimirPedidosCancelados();

        // restaurando o pedido que foi cancelado
        System.out.println("\nRestaurando pedido:");
        sistema.restaurarPedido();
        sistema.imprimirPedidosPendentes();
    }
}