package ficha3;

import java.lang.StringBuilder;
import java.lang.Math;

public class Circulo {

    // variáveis de instância
    private double x;
    private double y;
    private double raio;

    /**
     * Contrutores da classe Círculo.
     * Declaração dos construtores por omissão,
     * parametrizado e de cópia.
     */

    /**
     * Construtor por omissão de Círculo.
     */
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor parametrizado de Ponto.
     * Aceita como parâmetros os valores de cada coordenada e do respetivo raio.
     */
    public Circulo(int cx, int cy, int r){
        this.x = cx;
        this.y = cy;
        this.raio = r;
    }

    /**
     * Construtor de cópia de Ponto.
     * Aceita como parâmetro outro ponto e utiliza os métodos de acesso
     * aos valores das variáveis de instância.
     */
    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    /**
     * Método que altera o centro do círculo em questão.
     * @param x nova coordenada do x do círculo.
     * @param y nova coordenada do y do círculo.
     */
    public void alteraCentro(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    /**
     * Método que calcula a área do círculo em questão.
     * @return valor da área do círculo.
     */
    public double calculaArea(){
        return Math.PI * Math.pow(this.getRaio(),2);
    }

    /**
     * Método que calcula o perímetro do círculo em questão.
     * @return valor do perimetro do círculo.
     */
    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    /**
     * Métodos de instância
     */

    /**
     * Devolve o valor da coordenada em x.
     * @return valor da coordenada em x.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Devolve o valor da coordenada em y.
     * @return valor da coordenada em y.
     */
    public double getY(){
        return this.y;
    }

    /**
     * Devolve o valor do raio.
     * @return valor do raio.
     */
    public double getRaio(){
        return this.raio;
    }

    /**
     * Atualiza o valor da coordenada em x.
     * @param cx novo valor da coordenada em x.
     */
    public void setX(double cx) {
        this.x = cx;
    }

    /**
     * Atualiza o valor da coordenada em y.
     * @param cy novo valor da coordenada em y.
     */
    public void setY(double cy) {
        this.y = cy;
    }

    /**
     * Atualiza o valor do raio.
     * @param r novo valor do raio.
     */
    public void setRaio(double r){
        this.raio = r;
    }

    /**
     * Método que implementa a igualdade entre dois círculos.
     * Reescrita do método equals que todos os objetos possuem.
     *
     * @param o objeto que é comparado com o receptor da mensagem.
     * @return boolean resultado booleano da comparação do parâmetro.
     * com o receptor.
     */
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())){
            return false;
        }
        Circulo c = (Circulo) o;

        return (this.x == c.getX() && this.y == c.getY() && this.raio == c.getRaio());
    }

    /**
     * Método que devolve a representação em String do Círculo.
     * @return String com as coordenadas x, y do Círculo e também o raio.
     */
    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("X: ").append(this.getX()).append("\n")
                .append("Y: ").append(this.getY()).append("\n")
                .append("Raio: ").append(this.getRaio());

        return sb.toString();
    }

    /**
     * Método que faz uma cópia do objeto receptor da mensagem.
     * Para tal invoca o construtor de cópia.
     *
     * @return objeto clone do objeto que recebe a mensagem.
     */
    public Circulo clone(){
        return new Circulo(this);
    }
}
