package br.com.senai.estudosjava;

import br.com.senai.estudosjava.Classes.Carro;
import br.com.senai.estudosjava.Classes.Moto;
import br.com.senai.estudosjava.Classes.VeiculoSuperClasse;


// Exibiçao da super classe//

public class AppSuperClasse {

    public static void main(String[] args) {  
          // Exibindo info da subclasse carro//

       
          var ferrari = new Carro("Ferrari Italia", 200, " 2022 "," Ferrari ",1000000);
           System.out.println("========" + ferrari.getMarca()+ "========");
           System.out.println("Nome do veiculo:" + ferrari.getNome());
           System.out.println("Velocidade(KM/h):" + ferrari.getVelocidade());
           System.out.println("Ano de lançamento:" + ferrari.getAnoLancamento());
           System.out.println("Marca do veiculo:" + ferrari.getMarca());
           System.out.println("Valor do veiculo: " + ferrari.getValor());
           

           // Exibindo info subclasse moto//

           var honda = new Moto("Kawasaki Ninja",120, "2016","Kawasaki" );
           System.out.println("========="+ honda.getMarca() + "=========");
           System.out.println("Nome do veiculo:" + honda.getNome());
           System.out.println("Velocidade(KM/h):" + honda.getVelocidade());
           System.out.println("Ano de lançamento:" + honda.getAnoLancamento());
           System.out.println("Marca do veiculo:" + honda.getMarca());
           

    }
    
}
