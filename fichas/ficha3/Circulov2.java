package ficha3;

public class Circulov2 {

    //Variáveis de instância
    private Ponto ponto;
    private double raio;

    /**
     * Construtor por omissão;
     */
    public Circulov2(){
        this.ponto = new Ponto();
        this.raio = 0;
    }

    /**
     * Construtor parâmetrizado
     */
    public Circulov2(Ponto p, double r){
        this.ponto = p.clone();
        this.raio = r;
    }

    /**
     * Construtor de cópia
     */
    public Circulov2(Circulov2 c2){
        this.ponto = c2.getPonto();
        this.raio = c2.getRaio();
    }

    public void alteraCentro(int x, int y){
        this.ponto.setX(x);
        this.ponto.setY(y);
    }

    public double calculaArea(){
        return Math.PI * Math.pow(this.getRaio(),2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    /**
     * Getters e Setters
     */

    public Ponto getPonto() {
        return this.ponto.clone();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setPonto(Ponto p) {
        this.ponto = p.clone();
    }

    public void setRaio(double r) {
        this.raio = r;
    }
}
