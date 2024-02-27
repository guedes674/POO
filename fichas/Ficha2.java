import java.util.Scanner;
public class Ficha2 {

    Scanner sc = new Scanner(System.in);
    public int minimo (int[] array){
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public int[] indicesArray (int i1, int i2, int[] array){
        int tam = (i2 - i1)+1;
        int z = 0;
        int[] return_array = new int[tam];
        for(int i = i1; i <= i2; i++){
            return_array[z] = array[i];
            z++;
        }
        return return_array;
    }

    public int[] arrayComum (int[] a1, int[] a2) {
        int z = 0;
        int tam = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a2[j] == a1[i]) {
                    tam++;
                }
            }
        }
        int[] arrayC = new int[tam];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a2[j] == a1[i]) {
                    arrayC[z] = a2[j];
                    z++;
                    tam++;
                }
            }
        }
        return arrayC;
    }

    public int[][] lerMatriz (int numLinhas, int numColunas){
        int[][] ret = new int[numLinhas][numColunas];
        int valor = 0;
        System.out.println("Insira os valores da matriz da esquerda para a direita e de cima para baixo: ");
        for (int i = 0; i < numLinhas; i++){
            for (int j = 0; j < numColunas; j++){
                valor = sc.nextInt();
                ret[i][j] = valor;
            }
        }
        return ret;
    }

    public int[][] somaMatrizes (int mat1[][], int mat2[][]){
        int[][] ret = new int[mat1.length][mat1.length];
        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat2.length; j++){
                ret[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return ret;
    }
}
