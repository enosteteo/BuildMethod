public class VendaBuilder {
    Venda venda;

    public VendaBuilder() {
        this.venda = new Venda();
    }
    public VendaBuilder data (String data){
        this.venda.setData(data);
        return this;
    }
    public VendaBuilder clientePF (String nome, String numero){
        Cliente cliente = new ClientePF(nome, numero);
        this.venda.setCliente(cliente);
        return this;
    }
    public VendaBuilder clientePJ (String nome, String numero){
        Cliente cliente = new ClientePJ(nome, numero);
        this.venda.setCliente(cliente);
        return this;
    }
    public VendaBuilder item(int quantidade, Produto produto){
        ItemVenda itemVenda = new ItemVenda(quantidade, produto);
        this.venda.setItemVenda(itemVenda);
        return this;
    }

    public VendaBuilder funcionario(Funcionario func){
        this.venda.setFuncionario(func);
        return this;
    }
    public VendaBuilder frete(Frete frete){
        this.venda.setFrete(frete);
        return this;
    }

    public Venda build(){
        return  venda;
    }

}
