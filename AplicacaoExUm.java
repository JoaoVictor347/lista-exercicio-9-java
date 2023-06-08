import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AplicacaoExUm {
    public void aplicacao(){

        try {
            FileWriter fileWriter = new FileWriter("alunos_universidade.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o nome do aluno " + i + ": ");
                String nome = scanner.nextLine();
                System.out.print("Digite a nota final do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                printWriter.println("Aluno: " + nome + " - Nota: " + nota);
            }

            printWriter.close();
            System.out.println("As informações dos alunos foram salvas no arquivo alunos_universidade.txt.");
            scanner.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar as informações dos alunos: " + e.getMessage());
        }
     
        
    }    
}
