// Classe para testar os metodos de encapsulamento 
// de outras classes
public class MainEncapsulamento {

    public static void main(String[] args){

        //a. Teste conta bancária (Private + validação)
        System.out.println("------TESTANDO ENCAPSULAMENTO------");
        //Exercicio 1* Teste Conta Bancaria
        System.out.println("Exercicio 1: Conta Bancaria");
        //Criando um novo objeto a partir da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria("Hélter brandão");
        //verificando o saldo atual
        System.out.println("O saldo atual e...R$ " + minhaConta.getSaldo());
        
        //Deposito um valor invalido, vai devolver um erro
        minhaConta.depositar(-50.00);
        //tentendo acessar diretamente a propriedade minhaConta.saldo
        //não será possível, porque ela possui visibilidade PRIVATE

        //depositando um valor no saldo da conta
        minhaConta.depositar(153.50);
        System.out.println("O saldo apos deposito e ...R$"
                 + minhaConta.getSaldo());

    }

}
