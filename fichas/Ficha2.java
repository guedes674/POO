public class Ficha2 {
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
                }
            }
        }
        return arrayC;
    }
}
