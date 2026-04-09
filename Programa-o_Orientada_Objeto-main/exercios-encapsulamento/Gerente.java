// Classe filha gerente 
public class Gerente extends Funcionario {
  // metodo construtor 
  public Gerente (String nome, Double salario) {
    super(nome, salario);

  } 
  // criando um metodo public para incrementar o salario
  public void bonusSalarial(){
     this.salarioFuncionario += 500.00;

  }  
  public Double getSalario(){
     return this.salarioFuncionario;
  }
}