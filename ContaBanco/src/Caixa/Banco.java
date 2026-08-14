package Caixa;

public class Banco {
    public static void main(String[] args) throws Exception {
            ContaBanco cb = new ContaBanco();
             cb.setNumConta( 252311467);
            cb.abrirConta();
            cb.depositar();
            cb.dadosConta();
            cb.sacar();
            

    }
}
