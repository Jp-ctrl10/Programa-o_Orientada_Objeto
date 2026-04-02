/*exercicio *1. Praticando ENCAPSULAMENTO: A Conta 
*   bancaria Segura.Uso de modificador
*  private e métodos públicos get/set com validação
*/
 
public class ContaBancaria {
    //Atributos privados: ninguém fora desta classe
    // pode altera-los diretamente 
    private String titularConta;
    private Double saldoConta; 

    public ContaBancaria(String nomeTitularConta){ 
        this.titularConta = nomeTitularConta;
        this.saldoConta = 0.0;
    }

        //criando um método para recuperar o saldo
    public Double getSaldo(){
        return this.saldoConta;
    }
        //este método devolve o nome do titular pela
        //pseudovariável (método + variavel) getTitular()

    public String getTitular(){
        return this.titularConta;
    }
        //agora um método para adicionar valores ao
        //saldo da conta
    public void depositar (Double valorDeposito){

        if(valorDeposito > 0){
            this.saldoConta += valorDeposito;
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }


    
}
