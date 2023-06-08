import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AplicacaoExTres {
    

    public void aplicacao(){

        Scanner scanner = new Scanner(System.in);

        // Obter dados pessoais
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o CPF: ");
        long cpf = scanner.nextLong();
        scanner.nextLine(); // Limpar o buffer do teclado

        // Mostrar o menu de destinos
        System.out.println("\nEscolha o destino:");
        System.out.println("1. São Paulo");
        System.out.println("2. Nova York");
        System.out.println("3. Berlim");
        System.out.print("Digite o número correspondente ao destino: ");
        int destino = scanner.nextInt();

        // Definir preço e destino selecionado
        String destinoNome;
        double preco;
        switch (destino) {
            case 1:
                destinoNome = "São Paulo";
                preco = 250.0;
                break;
            case 2:
                destinoNome = "Nova York";
                preco = 2400.0;
                break;
            case 3:
                destinoNome = "Berlim";
                preco = 3800.0;
                break;
            default:
                System.out.println("Destino inválido.");
                return;
        }
        
        scanner.close();

        // Gerar número da poltrona aleatória
        Random random = new Random();
        int numeroPoltrona = random.nextInt(20) + 1;

        // Gerar o recibo
        String recibo = "Recibo de Viagem\n\n";
        recibo += "Nome: " + nome + "\n";
        recibo += "Idade: " + idade + "\n";
        recibo += "CPF: " + cpf + "\n";
        recibo += "Destino: " + destinoNome + "\n";
        recibo += "Valor: $ " + preco + "\n";
        recibo += "Poltrona: " + String.format("%02d", numeroPoltrona);


        // Salvar o recibo em um arquivo
        try {
            FileWriter fileWriter = new FileWriter("recibo_viagem.txt");
            fileWriter.write(recibo);
            fileWriter.close();
            System.out.println("\nRecibo de viagem salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o recibo de viagem.");
        }
    }
}



    
