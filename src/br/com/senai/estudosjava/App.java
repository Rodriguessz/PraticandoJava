package br.com.senai.estudosjava;

import br.com.senai.estudosjava.Classes.Empregado;

public class App {
    public static void main(String[] args) {
        
         // Entrada de dados//
        

         // Setters
        var enzo = new Empregado("Enzo de oliveira Rodrigues", "460.402.988-12", "(11)96314-2692", "Rua Circular 525");

        System.out.println("========Empregado " + enzo.getNome() + "========");
        //getters
           System.out.println("Nome do empregado:" + enzo.getNome());
           System.out.println("CPF do empregado:" + enzo.getCpf());
           System.out.println("Telefone do empregado:" + enzo.getTelefone());
           System.out.println("Endereço do empregado:" + enzo.getEndereco());
        
    }
    
}
