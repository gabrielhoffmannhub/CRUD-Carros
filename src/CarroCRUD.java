import java.util.ArrayList;
import java.util.Scanner;


class CarroCRUD {
    private ArrayList<Carro> carros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int idCounter = 1;

    public void criarCarro(){
        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("Digite o tipo do carro:");
        String tipo = scanner.nextLine();

        System.out.println("Digite o valor de mercado do carro:");
        double valor = scanner.nextDouble();

        Carro novoCarro = new Carro(idCounter++, marca, modelo, ano, placa, tipo, valor);
        carros.add(novoCarro);
        System.out.println("Carro cadastrado com sucesso!");
    }
    public void listarCarros(){
        if (carros.isEmpty()){
            System.out.println("Nenhum carro cadastrado!");
            return;
        }
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
    public void atualizarCarro(){
        System.out.println("Digite a placa do carro que deseja atualizar: ");
        String placa = scanner.nextLine();

        Carro carro = buscarCarroPorPlaca(placa);
        if (carro == null){
            System.out.println("Carro não encontrado!");
            return;
        }
        System.out.println("Digite a nova marca (ou pressione Enter para manter: ");
        String novaMarca = scanner.nextLine();
        if (!novaMarca.isEmpty())carro.setMarca(novaMarca);

        System.out.println("Digite o novo modelo (ou pressione Enter para manter ")  ;
        String novoModelo = scanner.nextLine();
        if (!novoModelo.isEmpty())carro.setModelo(novoModelo);

        System.out.println("Digite o novo ano (ou 0 para manter): ");
        int novoAno = scanner.nextInt();
        scanner.nextLine();
        if (novoAno > 0) carro.setAno(novoAno);

        System.out.println("Digite o novo tipo (ou pressione Enter para manter): ");
        String novoTipo = scanner.nextLine();
        if (!novoTipo.isEmpty()) carro.setTipo(novoTipo);

        System.out.println("Digite o novo valor (ou -1 para manter): ");
        double novoValor = scanner.nextDouble();
        scanner.nextLine();
        if (novoValor >= 0) carro.setValor(novoValor);

        System.out.println("Carro atualizado com sucesso!");

    }
    public void excluirCarro () {
        System.out.println("Digite a placa do carro que deseja excluir: ");
        String placa = scanner.nextLine();

        Carro carro = buscarCarroPorPlaca(placa);
        if (carro == null) {
            System.out.println("Carro não encontrado!");
            return;
        }
        carros.remove(carro);
        System.out.println("Carro excluído com sucesso!");
    }

    public Carro buscarCarroPorPlaca (String placa){
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }
}
