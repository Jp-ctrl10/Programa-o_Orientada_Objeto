public class MainEncapsulamento {

    public static void main(String[] args){

        System.out.println("TESTANDO ENCAPSULAMENTO");

        // EXERCÍCIO 1 - CONTA BANCÁRIA
        
        System.out.println("Exercicio 1: Conta Bancaria");

        ContaBancaria minhaConta = new ContaBancaria("Helter Brandao");

        System.out.println("O saldo atual ee: R$ " + minhaConta.getSaldo());

        // Depósito inválido
        minhaConta.depositar(-50.00);

        // Depósito válido
        minhaConta.depositar(153.50);

        System.out.println("O saldo apos deposito ee: R$ "
                + minhaConta.getSaldo());

        // EXERCÍCIO 2 - PRODUTO
       
        System.out.println("Exercicio 2: Produto");

        Produto produto = new Produto("Teclado", 100.50);

        System.out.println("Produto: " + produto.getNomeProduto());
        System.out.println("Preco:R$ " + produto.getPrecoProduto());

        // Testando preço inválido
        produto.setPreco(-20);

        System.out.println("---------------------");


       // EXERCÍCIO 3 - TESTE funcionario e Gerente (protected)
        System.out.println("Exercicio 3: Hierarquia e Protected");
        // criando um novo obejtivo da classe gerente
        Gerente gerenteVendas = new Gerente("Henrique", 8580.30);
        System.out.println("O salario do gerente: " + gerenteVendas.getSalario());
        // testando o metodo bonus salarial gerente 
        gerenteVendas.bonusSalarial();
         System.out.println("O salario do gerente: " 
         + gerenteVendas.nomeFuncionario 
         + " acrescentado de bonus e igual ....R$ " + gerenteVendas.getSalario());
 
    }
}