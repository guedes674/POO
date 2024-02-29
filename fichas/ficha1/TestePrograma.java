import java.util.Scanner;


public class TestePrograma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ficha1 f = new Ficha1();

        System.out.println("Qual é o exercício que deseja escolher: ");
        int opcao = sc.nextInt();

        if (opcao == 0){
            //pergunta 1
            System.out.println("Insira um número de graus celsius:");
            double grausc = sc.nextDouble();
            double grausf = f.celsiusParaFarenheit(grausc);
            System.out.println("O número de graus em fh é : " + grausf);
        }if(opcao == 1){
            // pergunta 2
            System.out.println("Insira dois números inteiros:");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int max = f.maximoNumeros(first, second);
            System.out.println("O maior número entre os dois dados é: " + max);
        }if (opcao == 2){
            // pergunta 3
            System.out.println("Insira o seu nome e o seu saldo: ");
            String nome = sc.next();
            double saldo = sc.nextDouble();
            String str = f.criaDescricaoConta(nome, saldo);
            System.out.println(str);
        }if (opcao == 3){
            // pergunta 4
            System.out.println("Insira o dinheiro em euros: ");
            double euros = sc.nextDouble();
            double taxa = sc.nextDouble();
            double libras = f.eurosParaLibras(euros, taxa);
            System.out.println("O valor em libras é: " + libras);
        }if (opcao == 4){
            // pergunta 5
            System.out.println("Insira dois números á sua escolha: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            String str1 = f.ordMed(a,b);
            System.out.println(str1);
        }if(opcao == 5) {
            // pergunta 6
            System.out.println("Insira um número para ser calculado o seu fatorial:");
            int fac = sc.nextInt();
            long res = f.factorial(fac);
            System.out.println("O fatorial do número escolhido é: " + res);
        }if(opcao == 6){
            // pergunta 7
            long resultado = f.tempoGasto();
            System.out.println(resultado);
        }else{
            System.out.println("Exercício não existe.");
        }
    }
}
