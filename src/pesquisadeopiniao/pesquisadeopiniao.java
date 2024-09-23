import java.util.Scanner; // Importa a classe Scanner, que permite capturar entradas do usuário via console.

public class pesquisadeopiniao { // Declara a classe principal do programa.

    public static void main(String[] args) { // Método principal, onde o programa começa a execução.
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para capturar dados do teclado.
        int excelente = 0, bom = 0, ruim = 0; // Inicializa variáveis para contar as respostas "EXCELENTE", "BOM" e "RUIM".

        // Executa a pesquisa para 10 entrevistados (ajuste para 50 conforme necessário).
        // O loop for se repete até que todos os entrevistados tenham dado sua opinião.
        for (int i = 1; i <= 10; i++) { 
            System.out.println("Entrevistado " + i); // Exibe o número do entrevistado atual.

            // Captura o nome do entrevistado.
            System.out.print("Digite o nome do entrevistado: ");
            String nome = scanner.nextLine(); // Armazena o nome inserido pelo usuário.
            
            // Captura a idade do entrevistado.
            System.out.print("Digite a idade do entrevistado: ");
            int idade = scanner.nextInt(); // Armazena a idade inserida.
            
            // Captura a opinião do entrevistado sobre o atendimento.
            System.out.print("Digite a opinião sobre o atendimento (1-EXCELENTE, 2-BOM, 3-RUIM): ");
            int opiniao = scanner.nextInt(); // Armazena a opinião inserida (1, 2 ou 3).
            scanner.nextLine(); // Limpa o buffer do Scanner para evitar problemas ao capturar o próximo input.

            // Verifica qual foi a opinião digitada e atualiza as variáveis de contagem de acordo com a resposta.
            if (opiniao == 1) { 
                excelente++; // Incrementa a variável "excelente" se a opinião for 1.
            } else if (opiniao == 2) { 
                bom++; // Incrementa a variável "bom" se a opinião for 2.
            } else if (opiniao == 3) { 
                ruim++; // Incrementa a variável "ruim" se a opinião for 3.
            } else { 
                // Caso o usuário insira um valor fora do intervalo esperado (1, 2 ou 3), exibe uma mensagem de erro.
                System.out.println("Opção inválida, por favor digite 1, 2 ou 3.");
                i--; // Subtrai um valor de 'i' para repetir o loop com o mesmo entrevistado.
            }
        }

        // Após o loop, exibe a quantidade de respostas para cada categoria.
        System.out.println("Quantidade de respostas EXCELENTE: " + excelente); // Exibe a quantidade de respostas "EXCELENTE".
        System.out.println("Quantidade de respostas BOM: " + bom); // Exibe a quantidade de respostas "BOM".
        System.out.println("Quantidade de respostas RUIM: " + ruim); // Exibe a quantidade de respostas "RUIM".
        
        scanner.close(); // Fecha o objeto Scanner para liberar recursos.
    }
}
