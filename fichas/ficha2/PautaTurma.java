public class PautaTurma {
    private int[][] notasTurma;
    private int numAluno;
    private int uc;

    public PautaTurma(int[][] notasTurma){
        this.notasTurma = notasTurma;
    }

    public void setNota(int aluno, int uc, int nota){
        this.notasTurma[aluno][uc] = nota;
    }

    public int getNota(int aluno, int uc){
        return this.notasTurma[aluno][uc];
    }

    public void imprimePauta(){
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                System.out.print(getNota(i,j)+" , ");
            }
            System.out.println("\n");
        }
    }

    public void atualizaNota(int aluno, int uc, int nota){
        setNota(aluno, uc, nota);
    }

    public int calculaNotasUc (int uc){
        int ret = 0;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (j == uc)
                    ret += getNota(i,j);
            }
        }
        return ret;
    }

    public double mediaAluno (int aluno){
        double somaNotas = 0;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (i == aluno)
                    somaNotas += getNota(i,j);
            }
        }
        return somaNotas/5;
    }

    public double mediaUc (int uc){
        double somaNotas = 0;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if(j == uc)
                    somaNotas += getNota(i,j);
            }
        }
        return somaNotas/5;
    }

    public int notaMaisAlta (){
        int max_nota = 0;

        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (getNota(i,j) > max_nota)
                    max_nota = getNota(i,j);
            }
        }
        return max_nota;
    }

    public int notaMaisBaixa (){
        int min_nota = this.notaMaisAlta();

        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (getNota(i,j) < min_nota)
                    min_nota = getNota(i,j);
            }
        }
        return min_nota;
    }

    public int[] notasAcima (int nota){
        int tam = 0;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (getNota(i,j) > nota)
                    tam++;

            }
        }
        int[] ret = new int[tam];
        int r = 0;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if (getNota(i,j) > nota) {
                    ret[r] = getNota(i, j);
                    r++;
                }
            }
        }
        return ret;
    }

    public int indUcMedAlta (){
        int medMaisAlta = 0, ind = -1;
        for(int i = 0; i < this.notasTurma.length; i++){
            for(int j = 0; j < this.notasTurma.length; j++){
                if(this.mediaUc(j) > medMaisAlta){
                    medMaisAlta = getNota(i,j);
                    ind = j;
                }
            }
        }
        return ind;
    }
}
