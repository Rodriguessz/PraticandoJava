package br.com.senai.estudosjava.Classes;


// Como carro tem os mesmos atributos que a super classe, vamos apenas extender ele à superclasse//
public class Carro extends VeiculoSuperClasse{ 
    
     private double valor;  // Atributo especifico dessa subclasse


    //Criando o cosntructor do carro
    public Carro(String nome , double velocidade , String anoLancamento, String marca, double valor){
      super(nome, velocidade, anoLancamento, marca);  // Super é utilizado para passas os valores da superclasse para a sub
        this.valor = valor;

    }


    public double getValor() {
      return valor;
    }


    public void setValor(double valor) {
      this.valor = valor;
    }


   





      
}
