//exercicio 3
public class Funcionario {
    public String nomeFuncionario;
    //protected: visivel para a classe e suas filhas
    protected Double salarioFuncionario;
    //metodo contrutor publico desta classe 
    public Funcionario(String nome, Double salario) {
        this.nomeFuncionario = nome;
        this.salarioFuncionario = salario;
        System.out.println(" ");
    }
}
