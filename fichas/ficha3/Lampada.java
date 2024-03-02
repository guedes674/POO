package ficha3;

import java.lang.StringBuilder;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Lampada {

    //Variáveis de classe

    private int modo;
    private static final int ON = 1;
    private static final int OFF = 0;
    private static final int ECO = 2;

    //Variáveis de instância

    private final double consumo_eco = 0.05;
    private final double consumo_normal = 0.1;
    private double consumo;
    private LocalDateTime time_stamp;
    private double consumo_reset;
    private double consumo_final;

    /**
     * Construtores da classe Lâmpada.
     */

    /**
     * Construtor por omissão de Lâmpada
     */
    public Lampada(){
        this.modo = Lampada.OFF;
        this.consumo = 0;
        this.time_stamp = LocalDateTime.now();
        this.consumo_reset = 0;
        this.consumo_final = 0;
    }

    /**
     * Construtor parâmetrizado de Lâmpada
     */
    public Lampada(double c, LocalDateTime ts, double cr, double cf){
        this.consumo = c;
        this.time_stamp = ts;
        this.consumo_reset = cr;
        this.consumo_final = cf;
    }

    /**
     * Construtor de cópia de Lâmpada.
     */
    public Lampada(Lampada umaLampada){
        this.modo = umaLampada.getModo();
        this.consumo = umaLampada.getConsumo();
        this.time_stamp = umaLampada.getTimeStamp();
        this.consumo_reset = umaLampada.getConsumoReset();
        this.consumo_final = umaLampada.getConsumoFinal();
    }

    /**
     * Método que liga a Lâmpada, ou seja, torna o modo dela em ON.
     */
    public void lampON(){
        double consumof = (this.getTimeStamp()).until(LocalDateTime.now(),ChronoUnit.MILLIS) * this.consumo;
        this.setConsumoFinal(this.consumo_final + consumof + this.getConsumoReset());
        this.setConsumoReset(0);
        this.setTimeStamp(LocalDateTime.now());
        this.setModo(Lampada.ON);
        this.setConsumo(consumo_normal);
    }

    /**
     * Método que desliga a Lâmpada, ou seja, torno o modo dela em OFF.
     */
    public void lampOFF(){
        double consumof = (this.getTimeStamp()).until(LocalDateTime.now(),ChronoUnit.MILLIS) * this.consumo;
        this.setConsumoFinal(this.consumo_final + consumof + this.getConsumoReset());
        this.setConsumoReset(0);
        this.setTimeStamp(LocalDateTime.now());
        this.setModo(Lampada.OFF);
        this.setConsumo(0);
    }

    /**
     * Método que liga a Lâmpada em modo ECO, ou seja, torno o modo dela em ECO.
     */
    public void lampECO(){
        double consumof = (this.getTimeStamp()).until(LocalDateTime.now(),ChronoUnit.MILLIS) * this.consumo;
        this.setConsumoFinal(this.consumo_final + consumof + this.getConsumoReset());
        this.setConsumoReset(0);
        this.setTimeStamp(LocalDateTime.now());
        this.setModo(Lampada.ECO);
        this.setConsumo(consumo_eco);
    }

    /**
     * Método que calcula e devolve o consumo final desde que a Lâmpada existe.
     * @return double consumo total da Lâmpada.
     */
    public double totalConsumo(){
        double consumof = (this.getTimeStamp()).until(LocalDateTime.now(),ChronoUnit.MILLIS) * this.consumo;
        return consumof + this.getConsumoReset() + this.getConsumoFinal();
    }

    public double periodoConsumo(){
        setConsumoReset((this.getTimeStamp()).until(LocalDateTime.now(),ChronoUnit.MILLIS) * this.consumo);
        return this.consumo_reset;
    }

    /**
     * Método que implementa a igualdade entre duas Lâmpadas.
     * @param o o objeto que é comparado com o recetor da mensagem.
     * @return boolean restulado booleano da comparação entre as Lâmpadas.
     */
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Lampada l = (Lampada) o;

        return (this.modo == l.getModo() && this.consumo == l.getConsumo()
                && this.time_stamp == l.getTimeStamp() && this.consumo_reset == l.getConsumoReset()
                && this.consumo_final == l.getConsumoFinal());
    }

    /**
     * Método que devolve a representação em String da Lâmpada.
     * @return String com o modo e o consumo da Lâmpada.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Modo: ").append(this.modo).append("\n")
                .append("Consumo: ").append(this.consumo).append("\n")
                .append("Time Stamp: ").append(this.time_stamp).append("\n")
                .append("Consumo desde o último reset: ").append(this.consumo_reset).append("\n")
                .append("Consumo Final: ").append(this.consumo_final).append("\n");

        return sb.toString();
    }

    /**
     * Método que faz uma cópia do objeto recetor da mensagem.
     * @return objeto clone do objeto que recebe a mensagem.
     */
    public Lampada clone(){
        return new Lampada(this);
    }

    /**
     * Devolve o modo da Lâmpada.
     * @return modo da Lâmpada.
     */
    public int getModo() {
        return this.modo;
    }

    /**
     * Devolve o consumo da Lâmpada.
     * @return consumo da Lâmpada.
     */
    public double getConsumo() {
        return this.consumo;
    }

    /**
     * Devolve o time stamp da Lâmpada.
     * @return time stamp da Lâmpada.
     */
    public LocalDateTime getTimeStamp(){
        return this.time_stamp;
    }

    /**
     * Devolve o consumo desde o último reset da Lâmpada.
     * @return consumo desde o último reset da Lâmpada.
     */
    public double getConsumoReset() {
        return consumo_reset;
    }

    /**
     * Devolve o consumo final da Lâmpada.
     * @return consumo final da Lâmpada.
     */
    public double getConsumoFinal() {
        return this.consumo_final;
    }

    /**
     * Atualiza o modo da Lâmpada.
     * @param nmodo novo modo da Lâmpada.
     */
    public void setModo(int nmodo) {
        this.modo = nmodo;
    }

    /**
     * Atualiza o consumo da Lâmpada.
     * @param nconsumo novo consumo da Lâmpada.
     */
    public void setConsumo(double nconsumo){
        this.consumo = nconsumo;
    }

    /**
     * Atualiza o time_stamp da Lâmpada.
     * @param nts novo time_stamp da Lâmpada.
     */
    public void setTimeStamp(LocalDateTime nts){
        this.time_stamp = nts;
    }

    /**
     * Atualiza o consumo desde o último reset da Lâmpada.
     * @param cr o novo consumo desde o último reset time_stamp da Lâmpada.
     */
    public void setConsumoReset(double cr) {
        this.consumo_reset = cr;
    }

    /**
     * Atualiza o consumo final da Lâmpada.
     * @param nconsumo_final novo consumo final da Lâmpada.
     */
    public void setConsumoFinal(double nconsumo_final) {
        this.consumo_final = nconsumo_final;
    }
}
