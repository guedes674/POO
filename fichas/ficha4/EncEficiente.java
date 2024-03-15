package ficha4;

import ficha3.LinhaEncomenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class EncEficiente {

    private String nome;
    private int NIF;
    private String morada;
    private int nr_encomenda;
    private LocalDateTime dta_encomenda;
    private List<LinhaEncomenda> le;

    public EncEficiente(){
        this.nome = "";
        this.NIF = 0;
        this.morada = "";
        this.nr_encomenda = -1;
        this.dta_encomenda = LocalDateTime.now();
        this.le = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String n, int nif, String m, int nr, LocalDateTime data, ArrayList<LinhaEncomenda> l){
        this.nome = n;
        this.NIF = nif;
        this.morada = m;
        this.nr_encomenda = nr;
        this.dta_encomenda = data;
        this.le = new ArrayList<LinhaEncomenda>(l);
    }

    public EncEficiente(EncEficiente ef){
        this.nome = ef.getNome();
        this.NIF = ef.getNIF();
        this.morada = ef.getMorada();
        this.nr_encomenda = ef.getNumeroEncomenda();
        this.dta_encomenda = ef.getDataEncomenda();
        this.le = ef.getLinhaEncomenda();
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        EncEficiente ef = (EncEficiente) o;

        return (this.getNome().equals(ef.getNome()) && this.getNIF() == ef.getNIF() &&
                this.getMorada().equals(ef.getMorada()) && this.getNumeroEncomenda() == ef.getNumeroEncomenda()&&
                this.getDataEncomenda().equals(ef.getDataEncomenda()) && this.getLinhaEncomenda().equals(ef.getLinhaEncomenda()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(this.nome).append("\n")
                .append("NIF: ").append(this.NIF).append("\n")
                .append("Morada: ").append(this.morada).append("\n")
                .append("Número da Encomenda: ").append(this.nr_encomenda).append("\n")
                .append("Data da Encomenda: ").append(this.dta_encomenda).append("\n")
                .append("Linha de Encomenda: ").append(this.le.toString()).append("\n");

        return sb.toString();
    }

    public double calculaValorTotal(){
        return this.le.stream().mapToDouble(LinhaEncomenda::calculaValorLinhaEnc).sum();
    }

    public double calculaValorDesconto(){
        return this.le.stream().mapToDouble(LinhaEncomenda::calculaValorDesconto).sum();
    }

    public int numeroTotalProdutos(){
        return this.le.stream().mapToInt(LinhaEncomenda::getQuantidade).sum();
    }

    public boolean existeProdutoEncomenda(String refProduto){
        return this.le.stream().anyMatch(l -> l.getReferencia().equals(refProduto));
    }

    public void adicionaLinha(LinhaEncomenda linha){
        this.le.add(linha.clone());
    }

    public void removeProduto(String codProd){
        this.le.removeIf(l -> l.getReferencia().equals(codProd));
    }

    public EncEficiente clone(){
        return new EncEficiente(this);
    }

    //Getters e Setters
    public String getNome(){
        return this.nome;
    }

    public int getNIF(){
        return this.NIF;
    }

    public String getMorada(){
        return this.morada;
    }

    public int getNumeroEncomenda(){
        return this.nr_encomenda;
    }

    public LocalDateTime getDataEncomenda(){
        return this.dta_encomenda;
    }

    public ArrayList<LinhaEncomenda> getLinhaEncomenda(){
        ArrayList<LinhaEncomenda> linha = new ArrayList<LinhaEncomenda>();
        for (LinhaEncomenda l: this.le){
            linha.add(l.clone());
        }
        return linha;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setNIF(int nif){
        this.NIF = nif;
    }

    public void setMorada(String m){
        this.morada = m;
    }

    public void setNr_encomenda(int nr){
        this.nr_encomenda = nr;
    }

    public void setDta_encomenda(LocalDateTime dt){
        this.dta_encomenda = dt;
    }

    public void setLinhaEncomenda(ArrayList<LinhaEncomenda> linhaEnc){
        linhaEnc = new ArrayList<>();
        for (LinhaEncomenda l: linhaEnc){
            this.le.add(l.clone());
        }
    }
}
