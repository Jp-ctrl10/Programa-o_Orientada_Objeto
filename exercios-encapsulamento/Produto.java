public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco); // validação aplicada aqui
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Erro: preco nao pode ser negativo ou zero");
        }
    }

    public String getNomeProduto(){
        return this.nome;
    }

    public double getPrecoProduto(){
        return this.preco;
    }
}