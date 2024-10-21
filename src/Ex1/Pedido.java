package Ex1;

public class Pedido {
    int id;
    String descricao;

    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Pedido Id: " + id + " Descricao: " + descricao;
    }
}
