import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class WhichSex {
  public static void main(String[] args) {
    int opcao = 0;
    String nome, sexo;
    Scanner entrada = new Scanner(System.in);
    List<String> masculino = new ArrayList<String>();
    List<String> feminino = new ArrayList<String>();
    do {
      System.out.println("Escolha uma das opçoes\n 1- Para Cadastrar\n 2- Ver cadastros\n 3- Para Sair");
      opcao = entrada.nextInt();
      switch (opcao) {
        case 1:
          System.out.println("Insira o nome: ");
          nome = entrada.next();
          System.out.print("Insira o sexo (M - para masculino e F - para feminino): ");
          sexo = entrada.next();
          System.out.println("Cadastro de: " + nome + " Sexo: " + sexo + " feito com sucesso !");
          if (Objects.equals(sexo, "M") || Objects.equals(sexo, "m")) {
            masculino.add(nome);
          } else if (Objects.equals(sexo, "F") || Objects.equals(sexo, "f")) {
            feminino.add(nome);
          } else {
            System.out.println("Opçao Invalida ! Tente novamente");
          }
          continue;
        case 2:
          System.out.println("----Cadastros Masculinos----");
          System.out.println(masculino);
          System.out.println("----Cadastros Femininos----");
          System.out.println(feminino);
          continue;
        case 3 :
          System.out.println("Encerrando o programa...");
          break;
      }
    } while (opcao != 3);
  }
}