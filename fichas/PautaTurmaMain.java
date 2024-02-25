import java.util.Scanner;

public class PautaTurmaMain {
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
        System.out.println("Insira uma UC para se calcular a média: ");
        int ucSelected = sc.nextInt();
        double mediaUcSelected = pauta.mediaUc(ucSelected);
        System.out.println("A média da UC em causa é: " + mediaUcSelected);
        int maiorNota = pauta.notaMaisAlta();
        System.out.println("A nota mais alta da turma é: " + maiorNota);
        int menorNota = pauta.notaMaisBaixa();
        System.out.println("A nota mais baixa da turma é: " + menorNota);
    }
}
