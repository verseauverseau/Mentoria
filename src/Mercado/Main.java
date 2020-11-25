package Mercado;

public class Main {
    private static Pedido pedido;

    enum FormasDePagamento {
        DINHEIRO,
        CHEQUE,
        CARTAO
    }

    static Supermercado supermercado;

    public static void main(String[] args) {
        int option = 0;

        while(true) {
            try {
                System.out.println("Bem-vindo ao supermercado, digite 1 para continuar ou 0 para sair: ");
                //ler
                if (option == 1) {
                    System.out.println("Digite a quantidade de batatas: ");
                    // ler
                    System.out.println("Digite a quantidade de batatas: ");
                    // ler

                    // montar os itens e dps inicializar o pedido
                    //                    pedido.setItens([]);

                    // processar o pedido com a instância de supermercado
                    float valorAPagar = supermercado.processarPedido(new Pedido());
                } else {
                    break;
                }

            } catch(Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
