

public class ItemPedido {
    private int itemPedidoID;
    private String item;
    private int quantidade;
    private float precoUnitario;
    private float total=0;
    
    public int getItemPedidoID() {
        return itemPedidoID;
    }

    public void setItemPedidoID(int itemPedidoID) {
        this.itemPedidoID = itemPedidoID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
 
}
