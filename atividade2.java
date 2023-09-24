// O arquivo abaixo soma os numeros positivos nao nulos passados na chamada do programa

// O que foi alterado

// 1. Foi corrigido a atribuição de variaveis, k não era inicializado e l não seriu propósito algum
// 2. O nome das variaveis foi alterado para ser mais claro e especifico
// 3. Foi corrigida o espaçamento e a identação do código para ficar mais legivel.
// 4. Foi aplicada programação defensiva, protegendo o código de entradas ruins
// 5. Foram separados blocos semantico de código com linhas, assim como paragrafos para texto.
// 6. Foi removido salvar a lista em vetor, já temos o vetor de args para usar.

class exemplo {
   public
    static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Informe uma lista de numeros");
        }

        int somaPositivos = 0;

        for (int i = 0; i < args.length; i++) {
            int valorAtual = Integer.parseInt(args[i]);
            if (valorAtual > 0) {
                somaPositivos = somaPositivos + valorAtual;
            }
        }

        System.out.println("A soma dos positivos é = " + somaPositivos);
    }
}