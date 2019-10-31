
package MODEL;

public class Venda {
    
    private int id_venda;
    private int fk_estoque;
    private int fk_funcionario;
    private int quantidade_item;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getFk_estoque() {
        return fk_estoque;
    }

    public void setFk_estoque(int fk_estoque) {
        this.fk_estoque = fk_estoque;
    }

    public int getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(int fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

    public int getQuantidade_item() {
        return quantidade_item;
    }

    public void setQuantidade_item(int quantidade_item) {
        this.quantidade_item = quantidade_item;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    private double valor_total;
}
