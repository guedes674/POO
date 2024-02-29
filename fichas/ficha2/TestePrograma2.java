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
            int valor = -1;
            System.out.println("Quantos inteiros vai ter o array? ");
            int tam = sc.nextInt();
            int[] valores = new int[tam];
            for(int i = 0; i < valores.length; i++){
                valor = sc.nextInt();
                valores[i] = valor;
            }
            System.out.println("Qual é o índice inferior do array? ");
            int i1 = sc.nextInt();
            System.out.println("Qual é o índice superior do array? ");
            int i2 = sc.nextInt();
            int[] arrayF = f.indicesArray(i1,i2,valores);
            System.out.println("O array entre os dois índices que estabeleceu é: " + Arrays.toString(arrayF));
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
        if (opcao == 6){
            //pergunta 3 A
            int[] arrayInt = {2332,123,43123,493,21};
            Arrays.sort(arrayInt);
            System.out.println("O array ordenado é: "+ Arrays.toString(arrayInt));
        }
        if (opcao == 7){
            //pergunta 3 B
            int[] arrayInt = {2332,123,43123,493,21};
            System.out.println("Qual o elemento que deseja do array de inteiros: ");
            int ind = sc.nextInt();
            int ret = Arrays.binarySearch(arrayInt, ind);
            System.out.println("O elemento pretendido é: "+ ret);
        }
        if (opcao == 21){
            //pergunta 6
            int[][] mat1 = {{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}};
            int[][] mat2 = {{15,12,10,17,20},
                    {9,10,15,12,11},
                    {15,10,9,5,12},
                    {9,10,8,11,10},
                    {19,17,15,20,19}};
            System.out.println("Indique o número de linhas e depois de colunas que a sua matriz vai conter: ");
            int linhas = sc.nextInt();
            int colunas = sc.nextInt();
            int[][] mat= f.lerMatriz(linhas, colunas);
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    System.out.print(mat[i][j]+" , ");
                }
                System.out.println("\n");
            }
            System.out.println("A soma entre as matrizes predefinidas é: ");
            int[][] somMat = f.somaMatrizes(mat1,mat2);
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    System.out.print(somMat[i][j]+" , ");
                }
                System.out.println("\n");
            }

        }
    }
}
