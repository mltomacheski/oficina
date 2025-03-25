import java.util.Scanner;

public class Oficina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAgendamento = 2;
        int agendamentoAtual = 0;

        String responsavel[] = new String[10];
        String dataEntrada[] = new String  [10];
        


        do{
            System.out.println(" Digite a data e o horario de entrada do veículo");
            dataEntrada[agendamentoAtual] = scanner.nextLine();

            System.out.println(" Digite o responsável pelo veículo");
            responsavel[agendamentoAtual] = scanner.nextLine();

           
           
            agendamentoAtual++;
        } while (agendamentoAtual <= totalAgendamento);



        for(int contador = 0; contador <= totalAgendamento; contador++ ){
            System.out.println("========================================");
            System.out.println( responsavel[contador]);
            System.out.println( dataEntrada[contador]);
            System.out.println("========================================");
        }

    }
}




