import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja cadastrar alguém ?");
        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite o nome e o sexo:");
            String nome = scanner.nextLine();
            String sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);

            System.out.println("Cadastrando .....");


            System.out.println("Deseja cadastrar mais alguém ?");
            resposta = scanner.nextLine();
        }
        System.out.println("Muito Obrigado !");
        Pessoa.exibirListaMasculina();
        Pessoa.exibirListaFeminina();
    }
}