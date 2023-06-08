import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AplicacaoExDois {
    
    public void FuncaoExDois(){

        Scanner scanner = new Scanner(System.in);
    
        try {
            FileWriter fileWriter = new FileWriter("itens_supermercado.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o nome do item " + i + ": ");
                String nomeItem = scanner.nextLine();
                System.out.print("Digite o valor do item " + i + ": ");
                double valorItem = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                printWriter.println("Item: " + nomeItem + " - Valor: " + valorItem);
            }

            printWriter.close();
            System.out.println("As informações dos itens de compra foram salvas no arquivo itens_supermercado.txt.");

            scanner.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar as informações dos itens de compra: " + e.getMessage());
        }
    

    }

}
