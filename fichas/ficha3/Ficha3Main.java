package ficha3;
import java.util.Scanner;

public class Ficha3Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Escolha o número do exercício: ");
                int ex = sc.nextInt();

                if(ex == 1){
                        Circulo circulo = new Circulo();
                        System.out.println(circulo.toString());
                        System.out.println("Escolha a coordenada do x");
                        double x = sc.nextDouble();
                        circulo.setX(x);
                        System.out.println("Escolha a coordenada do y");
                        double y = sc.nextDouble();
                        circulo.setY(y);
                        System.out.println("Escolha o raio");
                        double raio = sc.nextDouble();
                        circulo.setRaio(raio);
                        System.out.println(circulo.toString());
                        System.out.println("Escolha a nova coordenada do x");
                        x = sc.nextDouble();
                        System.out.println("Escolha a nova coordenada do y");
                        y = sc.nextDouble();
                        circulo.alteraCentro(x,y);
                        double area = circulo.calculaArea();
                        double perimetro = circulo.calculaPerimetro();
                        System.out.println("O perímetro do círculo é: "+perimetro+"\nA área do círculo é: "+area);
                }
                if(ex == 2){
                        Lampada lampada = new Lampada();
                        System.out.println(lampada.toString());
                        lampada.lampON();
                        System.out.println(lampada.toString());
                }
        }
}
