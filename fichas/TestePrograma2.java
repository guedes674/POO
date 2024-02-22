import java.util.Arrays;
import java.util.Scanner;

public class TestePrograma2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Ficha2 f = new Ficha2();

        System.out.println("Qual é o exercício que deseja escolher: ");
        int opcao = sc.nextInt();

        if (opcao == 0){
            //pergunta 1 A
            int valor = 0;
            System.out.println("Quantos inteiros vai ter o array? ");
            int tam = sc.nextInt();
            int[] valores = new int[tam];
            for(int i = 0; i < valores.length; i++){
                valor = sc.nextInt();
                valores[i] = valor;
            }
            int min = f.minimo(valores);
            System.out.println("O elemento mais pequeno do array é: " + min);
        }
        if (opcao == 1){
            //pergunta 1 B
            System.out.println("Qual é o limite inferior do array? ");
            int i1 = sc.nextInt();
            System.out.println("Qual é o limite superior do array? ");
            int i2 = sc.nextInt();
            int[] arrayF = f.constroiArray(i1,i2);
            System.out.println("O array entre os dois limites que estabeleceu é: " + Arrays.toString(arrayF));
        }
        if (opcao == 2){
            //pergunta 1 C
            int valor = 0;
            System.out.println("Quantos inteiros vai ter o primeiro array? ");
            int tam1 = sc.nextInt();
            int[] valores1 = new int[tam1];
            for(int i = 0; i < valores1.length; i++){
                valor = sc.nextInt();
                valores1[i] = valor;
            }
            System.out.println("Quantos inteiros vai ter o segundo array? ");
            int tam2 = sc.nextInt();
            int[] valores2 = new int[tam2];
            for(int i = 0; i < valores2.length; i++){
                valor = sc.nextInt();
                valores2[i] = valor;
            }
            int[] arrayC = f.arrayComum(valores1, valores2);
            System.out.println("O array que contém os elementos comuns é: " + Arrays.toString(arrayC));
        }
    }
}
