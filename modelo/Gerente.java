/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class Gerente extends Funcionario {
    private String setor;
    private String senha;

    public Gerente() {
    }

    public Gerente(String setor, String senha, String nome, double salario, String CPF) {
        // palavra reservada SUPER
        // this.nome = nome
        // this.salario = salario
        // this.CPF = CPF
        super(nome, salario, CPF);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /* 
    public void setNome(String nome) {
        this.nome = nome;
    }
    */
    
    // sobrecarga (OVERRIDE) permite o uso
    // do conceito de Polimorfismo da Orientação a Objetos
    // usando para isto a notação @Override
    @Override
    public String getInformacao(){
        return "Gerente " + this.nome + " recebe R$" + this.salario;
    }
    
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
    public boolean getAutenticacao(String senha){
        // comparacao string usa equals
        // comparaçao int ==
        if(this.senha.equals(senha)){
            System.out.println("Acesso permitido");
            return true;
        }else{
            System.out.println("Acesso negado!");
            return false;
        }
    }
    
}
