import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarroCRUD carroCRUD = new CarroCRUD();

        while (true){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Atualizar carro");
            System.out.println("4 - Excluir um carro");
            System.out.println("5 - Buscar carro pela placa");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    carroCRUD.criarCarro();
                    break;
                case 2:
                    carroCRUD.listarCarros();
                    break;
                case 3:
                    carroCRUD.atualizarCarro();
                    break;
                case 4:
                    carroCRUD.excluirCarro();
                    break;
                case 5:
                    System.out.println("Digite a placa do carro");
                    String placa = scanner.nextLine();
                    Carro carro = carroCRUD.buscarCarroPorPlaca(placa);
                    System.out.println(carro!=null? carro:"Carro não encontrado!");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
