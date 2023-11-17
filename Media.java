import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        verificaAluno(calculaMedia());
    }

    public static int calculaMedia(){
        int nota1, nota2, nota3, nota4, media;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno(a): ");
        nota1 = entrada.nextInt();
        System.out.print("Digite a segunda nota do aluno(a): ");
        nota2 = entrada.nextInt();
        System.out.print("Digite a terceira nota do aluno(a): ");
        nota3 = entrada.nextInt();
        System.out.print("Digite a quarta nota do aluno(a): ");
        nota4 = entrada.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        return  media;

    }

    public static void verificaAluno(int media) {
        if (media >= 7) {
            System.out.println("O Aluno está Aprovado !");
        } else if (media >= 5 && media < 7) {
            System.out.println("O Aluno está de Recuperação !");
        } else {
            System.out.println("O Aluno está Reprovado !");
        }
    }
}
