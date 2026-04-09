public class Produto {

    private String nome;
    private double preco;

    //implementando o metodo contrutor recebendo
    //o nome e o peço do produto
    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco); // validação aplicada aqui
    }
    //implementando um metod para alterar o preco 
    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Erro: preco nao pode ser negativo ou zero");
        }
    }
   // metodo para recuperar o nome do produto
    public String getNomeProduto(){
        return this.nome;
    }
    // metodo para recuperar o preço do produto 
    public double getPrecoProduto(){
        return this.preco;
    }
}