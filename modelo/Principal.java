/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Matheus Henrique
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago");
        funcionario.setSalario(999.99);
        funcionario.setCPF("43847365843");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Info: " + funcionario.getInformacao());
        
        Gerente gerente = new Gerente();
        gerente.setNome("Gabriela");
        gerente.setSalario(5000.00);
        gerente.setCPF("111222334");
        gerente.setSetor("TI");
        gerente.setSenha("123");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Info: " + gerente.getInformacao());
        System.out.println(gerente.getAutenticacao("123"));
        
        
        Funcionario f2 = new Gerente();
        // casting entre objetos
        // da mesma forma que vimos em tipos primitivos
        //Gerente g2 = (Gerente) new Funcionario();
        
        // atribuição entre objetos
        // usando casting
        //f2 = g2;
        //g2 = (Gerente) f2;
        
    }
    
}
