public class Ficha1 {

    public double celsiusParaFarenheit (double graus){

        double nvgraus = 0;

        nvgraus = graus *1.8 + 32;

        return nvgraus;
    }

    public int maximoNumeros (int a, int b){
        return Math.max(a, b);
    }

    public String criaDescricaoConta(String nome, double saldo){
        return "Nome: " + nome + "\nSaldo: " + saldo + "$";
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        return valor * taxaConversao;
    }

    public long factorial (int num){
        long acc = num;

        while ((num - 1) > 0){
            acc*=(num - 1);
            num--;
        }
        return acc;
    }

    public long tempoGasto(){
        long a = System.currentTimeMillis();
        factorial(5000);
        long b = System.currentTimeMillis();
        return b - a;
    }
}
