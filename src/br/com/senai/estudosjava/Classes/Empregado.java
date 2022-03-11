package br.com.senai.estudosjava.Classes;

public class Empregado {  // Classe empregado vai receber seus atributos(caracteristicas)
     
      private String nome;
      private String cpf;
      private String telefone;
      private String endereco;


      // Criamos o nosso constuctor para que possamos passar os valores das caracteristicas 

      public Empregado(String nome, String cpf , String telefone , String endereco){
              this.nome = nome;
              this.cpf = cpf;
              this.telefone = telefone;
              this.endereco = endereco;
      }

    // Criei os getter e setters pois nossos atributos são privados
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
