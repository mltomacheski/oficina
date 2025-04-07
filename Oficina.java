import java.util.Scanner;

public class Oficina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAgendamento = 2;
        int agendamentoAtual = 0;
        
        String responsavel[] = new String[10];
        String dataEntrada[] = new String[10]; 

        do {
        
            if (agendamentoAtual < totalAgendamento) {
                System.out.println("Digite a data e o horario de entrada do veículo");
                dataEntrada[agendamentoAtual] = scanner.nextLine();

                System.out.println("Digite o responsável pelo veículo");
                responsavel[agendamentoAtual] = scanner.nextLine();

                agendamentoAtual++;

                System.out.println("Agendamento realizado com sucesso.");
            } else {
                System.out.println("Número máximo de agendamentos atingido.");
            }
        } while (agendamentoAtual < totalAgendamento);

        for (int contador = 0; contador < agendamentoAtual; contador++) { 
            System.out.println("========================================");
            System.out.println("Responsável: " + responsavel[contador]);
            System.out.println("Data de Entrada: " + dataEntrada[contador]);
            System.out.println("========================================");
        }
    }
}
