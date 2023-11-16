import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        int nota1, nota2, nota3, nota4, media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno(a): ");
        nota1 = entrada.nextInt();
        System.out.println("Digite a segunda nota do aluno(a): ");
        nota2 = entrada.nextInt();
        System.out.println("Digite a terceira nota do aluno(a): ");
        nota3 = entrada.nextInt();
        System.out.println("Digite a quarta nota do aluno(a): ");
        nota4 = entrada.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
    }
}
