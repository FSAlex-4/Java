package Caixa;
import java.util.Scanner;

public class ContaBanco {
        public ContaBanco() {
                this.setSaldoEC(0);
                this.setLimiteC(800.00f);
                status = false;
                
        }

        public int numConta;

        public int getNumConta() {
                return this.numConta;
        }

        public void setNumConta(int N) {
                this.numConta = N;
        }

        protected String tipo;

        public String getTipo() {
                return this.tipo;
        }

        public void setTipo(String T) {
                this.tipo = T;

        }

        private String titular;

        public String getTitular() {
                return this.titular;
        }

        public void setTitular(String D) {
                this.titular = D;
        }

        private float saldoEmConta;

        public float getSaldoEC() {
                return this.saldoEmConta;
        }

        public void setSaldoEC(float SC) {
                this.saldoEmConta = SC;
        }

        private float limiteCredito;

        public float getLimiteC() {
                return this.limiteCredito;
        }

        public void setLimiteC(float LC) {
                this.limiteCredito = LC;
        }

        private boolean status;

        public boolean getStatus() {
                return this.status;
        }

        public void setStatus(boolean S) {
                this.status = S;
                if (S == true) {
                        System.out.println("Conta ativa.");

                } else {
                        System.out.println("Conta Encerrada.");
                }
        }

        public void dadosConta(){
                System.out.println("-----------------------------");
                System.out.println("Conta: " + this.getNumConta());
                System.out.println("Tipo de conta: " + this.getTipo());
                System.out.println("Titular : " + this.getTitular());
                System.out.println("Saldo: " + this.getSaldoEC());
                System.out.println("Limite de Crédito: " + this.getLimiteC());
                System.out.println("Status: " + this.getStatus());
        }

        private Scanner teclado = new Scanner(System.in);

        public void abrirConta() {

                System.out.println("Digite o nome completo do titular da Conta: ");
                String titularDIgitado = teclado.nextLine();
                this.setTitular(titularDIgitado);

                System.out.println(
                                "Ao abrir uma conta corrente inicia-se com R$50 de saldo, caso opite pela poupança R$150.");
                System.out.println("Escolha um tipo de conta Conta Corrente(CC) ou Conta Poupança(CP) :");

                String tipoDigitado = teclado.nextLine();
                this.setTipo(tipoDigitado);
                this.setStatus(true);

                if(tipo == "CC") {
                        this.setSaldoEC(50);
                } else {
                        this.setSaldoEC(150);
                }

                System.out.println("Abertura de conta realizada com sucesso!");
                System.out.println("Conta do tipo " + getTipo() + " aberta.");
                System.out.println("O número da sua conta é " + getNumConta());
                System.out.println("Obrigado por criar uma conta conosco " + titular + "!");
        }

        public void fecharConta() {

                System.out.println("Realmente deseja encerrar sua conta? (s/n)");

                char respostaDigitado = teclado.next().charAt(0);

                if (respostaDigitado == 'S' || respostaDigitado == 's') {
                        if (this.getSaldoEC() > 0) {
                                System.out.println("Para encerrar a conta é preciso sacar o saldo disponível.");
                        } else {
                                if (this.getSaldoEC() < 0) {
                                        System.out.println("Não é possível encerrar a conta possuindo divídas");
                                }
                        }
                } else {
                        System.out.println("Será um prazer ainda termos você conosco!");
                }

        }

        public void depositar() {
                float sd;
                System.out.println("Digite o número da conta:");

                int contaDigitada = teclado.nextInt();
                if (contaDigitada == this.getNumConta()) {
                        System.err.println("Sua conta é " + getNumConta() + ".");
                        if (this.getStatus() == true) {
                                System.out.println("Digite o valor que deseja depositar:");

                                float saldoDIgitado = teclado.nextFloat();
                                sd = saldoDIgitado;

                                System.out.println("Deposito feito com sucesso!");
                                this.setSaldoEC(getSaldoEC() + sd);
                        } else {
                                System.out.println("Conta inexistente favor criar uma conta para poder sacar.");
                        }

                }

        }

        public void sacar() {
                System.out.println("Digite o número da conta:");

                int contaDigitada = teclado.nextInt();
                if (contaDigitada == this.getNumConta()) {
                        System.out.println("Qual o valor que deseja sacar? ");
                        System.out.println("Valor disponível : " + getSaldoEC());
                        int valorSaque = teclado.nextInt();
                        if (valorSaque < getSaldoEC() || valorSaque == getSaldoEC()) {
                                this.setSaldoEC(this.getSaldoEC() - valorSaque);
                                System.out.println("Saque no valor " + valorSaque + "realizado com sucesso!");
                                // System.out.println("Confirma o sauqe do valor " + valorSaque);
                                // char confirmDigitado = teclado.next().charAt(0);
                                // if()
                        } else {
                                System.out.println("Erro! Valor solicitado maior que o dísponível. ");
                        }
                }
        }

        public void pagarMensal() {
                if (getTipo().equals("CC")) {
                        saldoEmConta -= 12.00;
                } else {
                        saldoEmConta -= 20.00;
                }
        }
}
