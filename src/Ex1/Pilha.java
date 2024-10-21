package Ex1;

public class Pilha {
    No topo;

    public void push(Pedido pedido) {
        No novoNo = new No(pedido);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public Pedido pop() {
        if (topo == null) return null;
        Pedido pedido = topo.pedido;
        topo = topo.proximo;
        return pedido;
    }

    public void imprimirPilha(){
        No atual = topo;
        System.out.println("Pedidos Cancelados");
        while(atual != null){
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
