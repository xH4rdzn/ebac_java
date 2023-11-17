import java.util.Scanner;

public class Nota {
    public static void main(String args[]) {
        int valor1;
        Integer valor2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor1 = entrada.nextInt();
        System.out.println(valor1 + " é do tipo primitivo int");
        valor2 = (Integer) valor1;
        System.out.println(valor2 + " agora é do tipo Integer");
    }

}
