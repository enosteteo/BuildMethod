import java.util.ArrayList;

public class Venda {
    String data;
    Funcionario funcionario;
    Cliente cliente;
    Frete frete;
    ArrayList<ItemVenda> itemVenda = new ArrayList<ItemVenda>();

    public Venda() {
    }

    @Override
    public String toString() {
        return "Venda{" +
                "data='" + data + '\'' +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", frete=" + frete +
                ", itemVenda=" + itemVenda +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public ArrayList<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda.add(itemVenda);
    }

    public void addItem(ItemVenda item){
        this.itemVenda.add(item);
    }
}
