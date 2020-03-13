import static org.junit.Assert.*;
import org.junit.Test;

public class VendaBuilderTest {
    Frete frete = new Frete(99.21);
    Funcionario funcionario = new Funcionario("Funcionario João");
    Produto pao = new Produto("Pão", 2.0);

    @Test
    public void criarVendaClientePF() {

        Venda vendaPF = new VendaBuilder()
                .data("15/02/2020")
                .clientePF("nome", "123456")
                .frete(frete)
                .funcionario(funcionario)
                .item(2, pao)
                .build();

        String vendaClientePF = "Venda{data='15/02/2020', funcionario=Funcionario{nome='Funcionario João'}, " +
                "cliente=ClientePF{nome='nome', cpf='123456'}, " +
                "frete=Frete{valor=99.21}, itemVenda=[ItemVenda{quantidade=2, " +
                "produto=Produto{descricao='Pão', preco=2.0}}]}";
        assertEquals(vendaClientePF, vendaPF.toString());



    }
    @Test
    public void criarVendaClientePJ(){
        Venda vendaPJ = new VendaBuilder()
                .data("15/02/2020")
                .clientePJ("nomepj", "654321")
                .frete(frete)
                .funcionario(funcionario)
                .item(2, pao)
                .build();

        String vendaClientePJ = "Venda{data='15/02/2020', funcionario=Funcionario{nome='Funcionario João'}, " +
                "cliente=ClientePJ{nome='nomepj', cnpj='654321'}, " +
                "frete=Frete{valor=99.21}, itemVenda=[ItemVenda{quantidade=2, " +
                "produto=Produto{descricao='Pão', preco=2.0}}]}";
        assertEquals(vendaClientePJ, vendaPJ.toString());

    }
}
