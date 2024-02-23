import java.util.Scanner;

public class PautaTurma {
    private int[][] notasTurma;

    public PautaTurma(int[][] notasTurma){
        this.notasTurma = notasTurma;
    }

    public void atualizaNota(int aluno, int uc, int nota){
        if (aluno >= 0 && aluno < notasTurma.length && uc >= 0 && uc < notasTurma[aluno].length){
            notasTurma[aluno][uc] = nota;
        }else{
            System.out.println("O respetivo aluno ou UC não existe na pauta.");
        }
    }

    public void imprimePauta(){
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                System.out.print(notasTurma[i][j]+" , ");
            }
            System.out.println("\n");
        }
    }

    public int calculaNotasUc (int uc){
        int ret = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (j == uc){
                    ret += notasTurma[i][j];
                }
            }
        }
        return ret;
    }

    public double mediaAluno (int aluno){
        int somaNotas = 0;
        int ucs = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma.length; j++){
                if (i == aluno){
                    somaNotas += notasTurma[i][j];
                    ucs++;
                }
            }
        }
        double ret = somaNotas/ucs;
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] notasTurma = {{15,12,10,17,20},
                              {9,10,15,12,11},
                              {15,10,9,5,12},
                              {9,10,8,11,10},
                              {19,17,15,20,19}
        };

        PautaTurma pauta = new PautaTurma(notasTurma);

        pauta.imprimePauta();

        System.out.println("Insira o aluno, de seguida a uc e depois a nota que deseja atualizar: ");
        int al = sc.nextInt();
        int uc = sc.nextInt();
        int nota = sc.nextInt();
        pauta.atualizaNota(al,uc,nota);
        pauta.imprimePauta();
        System.out.println("Insira uma uc para se calcular a soma: ");
        int ucSelect = sc.nextInt();
        int notasSomadas = pauta.calculaNotasUc(ucSelect);
        System.out.println("A soma das notas a essa uc foi: " + notasSomadas);
        System.out.println("Insira um aluno para se calcular a média: ");
        int alunoSelect = sc.nextInt();
        double mediaAlunoSelected = pauta.mediaAluno(alunoSelect);
        System.out.println("A média do aluno em causa é: " + mediaAlunoSelected);
    }
}
