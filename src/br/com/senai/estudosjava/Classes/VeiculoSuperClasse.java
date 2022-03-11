package br.com.senai.estudosjava.Classes;



// Trabalhando com superclasse
public class VeiculoSuperClasse {
       private String nome;
       private double velocidade;
       private String anoLancamento;
       private String marca;


    // Criando o constructor da super classe
     public VeiculoSuperClasse(String nome, double velocidade , String anoLancamento , String marca){
                 this.nome = nome;
                 this.velocidade = velocidade;
                 this.anoLancamento = anoLancamento;
                 this.marca = marca;
                
     }

 //Criando getter and setters pois os atributos sao privados
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    public String getAnoLancamento() {
        return anoLancamento;
    }


    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    
     

}
