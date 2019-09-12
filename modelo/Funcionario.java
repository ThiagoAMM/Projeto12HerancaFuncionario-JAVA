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
public class Funcionario {
    // inicialmente os ATR serão PRIVATE
    protected String nome;
    protected double salario;
    protected String CPF;
    
    //construtores e getters e setters

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String CPF) {
        this.nome = nome;
        this.salario = salario;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getInformacao(){
        return "Funcionário " + this.nome + " recebe R$" + this.salario;
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    
    
}
