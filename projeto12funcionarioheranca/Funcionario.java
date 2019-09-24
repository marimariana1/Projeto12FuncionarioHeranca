/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto12funcionarioheranca;

/**
 *
 * @author thais
 */
public class Funcionario {
    
    private String Nome;
    private double Salario;
    private String CPF;

    public Funcionario() {
    }

    public Funcionario(String Nome, double Salario, String CPF) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.CPF = CPF;
    }
    
    //Get's
    public String getNome() {
        return Nome;
    }

    public double getSalario() {
        return Salario;
    }

    public String getCPF() {
        return CPF;
    }
    
    //Set's
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getInformacao(){
        return "Funcionario : "+this.Nome+" Salario : "+this.Salario;
    }
    
    public Double getBonificacao(){
        return this.Salario * 0.10;
    }    
    
}
