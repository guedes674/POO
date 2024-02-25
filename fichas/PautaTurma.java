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
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                System.out.print(notasTurma[i][j]+" , ");
            }
            System.out.println("\n");
        }
    }

    public void atualizaNota(int aluno, int uc, int nota){
        setNota(aluno, uc, nota);
    }

    public int calculaNotasUc (int uc){
        int ret = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (j == uc)
                    ret += notasTurma[i][j];
            }
        }
        return ret;
    }

    public double mediaAluno (int aluno){
        double somaNotas = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (i == aluno)
                    somaNotas += notasTurma[i][j];
            }
        }
        return somaNotas/5;
    }

    public double mediaUc (int uc){
        double somaNotas = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if(j == uc)
                    somaNotas += notasTurma[i][j];
            }
        }
        return somaNotas/5;
    }

    public int notaMaisAlta (){
        int max_nota = 0;

        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (notasTurma[i][j] > max_nota)
                    max_nota = notasTurma[i][j];
            }
        }
        return max_nota;
    }

    public int notaMaisBaixa (){
        int min_nota = this.notaMaisAlta();

        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (notasTurma[i][j] < min_nota)
                    min_nota = notasTurma[i][j];
            }
        }
        return min_nota;
    }
}
