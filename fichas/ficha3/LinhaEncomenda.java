package ficha3;

import java.lang.StringBuilder;

public class LinhaEncomenda {

    //Variáveis de instância
    private String referencia;
    private String descricao;
    private double preco;
    private int quantidade;
    private double rImposto;
    private double vDesconto;

    /**
     * Construtor por omissão
     */
    public LinhaEncomenda(){
        this.referencia = "";
        this.descricao = "";
        this.preco = 0.0;
        this.quantidade = 0;
        this.rImposto = 0;
        this.vDesconto = 0;
    }

    /**
     * Construtor parâmetrizado
     */
    public LinhaEncomenda(String ref, String des, double p, int q, double rI, double vD){
        this.referencia = ref;
        this.descricao = des;
        this.preco = p;
        this.quantidade = q;
        this.rImposto = rI;
        this.vDesconto = vD;
    }

    /**
     * Construtor de cópia
     */
    public LinhaEncomenda(LinhaEncomenda umaLE){
        this.referencia = umaLE.getReferencia();
        this.descricao = umaLE.getDescricao();
        this.preco = umaLE.getPreco();
        this.quantidade = umaLE.getQuantidade();
        this.rImposto = umaLE.getrImposto();
        this.vDesconto = umaLE.getvDesconto();
    }

    /**
     * Método de igualdade entre duas Linhas de Encomenda
     * @param o objeto a ser comparado com o que recebeu a mensagem.
     * @return boolean relação de igualdade entre os dois.
     */
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        LinhaEncomenda le = (LinhaEncomenda) o;

        return (this.referencia == le.getReferencia() && this.descricao == le.getDescricao()
                && this.preco == le.getPreco() && this.quantidade == le.getQuantidade()
                && this.rImposto == le.getrImposto() && this.vDesconto == le.getvDesconto());
    }

    /**
     * Método que representa a Linha de Encomenda como uma String.
     * @return String que representa a Linha de Encomenda.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Referência: ").append(this.referencia).append("\n")
                .append("Descrição: ").append(this.descricao).append("\n")
                .append("Preço: ").append(this.preco).append("\n")
                .append("Quantidade em stock: ").append(this.quantidade).append("\n")
                .append("Regime de imposto: ").append(this.rImposto).append("\n")
                .append("Valor de desconto: ").append(this.vDesconto).append("\n");

        return sb.toString();
    }

    /**
     * Método que representa faz clone de uma Linha de encomenda.
     * @return LinhaEncomenda clone da que recebeu a mensagem.
     */
    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }

    /**
     * Método que calcula o valor da Linha de Encomenda inteira.
     * @return double valor da Linha de Encomenda com os devidos impostos e valores aplicados.
     */
    public double calculaValorLinhaEnc(){
        double valorImposto = this.getPreco() * (1 + this.getrImposto());
        double valorDesconto = this.getPreco()*(this.getvDesconto());
        return this.getQuantidade() * (valorImposto - valorDesconto);
    }

    /**
     * Método que calcula o valor do desconto da Linha de Encomenda em euros.
     * @return double valor do desconto em euros.
     */
    public double calculaValorDesconto(){
        double valorDesconto = this.getPreco()*(this.getvDesconto());
        return getPreco() * valorDesconto;
    }

    /**
     * Getters e Setters da Linha de Encomenda.
     */
    public String getReferencia(){
        return this.referencia;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getrImposto() {
        return rImposto;
    }

    public double getvDesconto() {
        return vDesconto;
    }

    public void setReferencia(String ref){
        this.referencia = ref;
    }

    public void setDescricao(String desc){
        this.descricao = desc;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public void setQuantidade(int q){
        this.quantidade = q;
    }

    public void setrImposto(int rI){
        this.rImposto = rI;
    }

    public void setvDesconto(int vD){
        this.vDesconto = vD;
    }
}
