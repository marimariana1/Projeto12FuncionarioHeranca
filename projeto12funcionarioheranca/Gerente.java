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
public class Gerente extends  Funcionario{
    
    private String Setor;
    private String Senha;

    public Gerente() {
    }

    public Gerente(String Setor, String Senha, String Nome, Double Salario, String CPF) {
        super(Nome, Salario, CPF);
        this.Setor = Setor;
        this.Senha = Senha;
    }
    
    // Get's
    public String getSetor() {
        return Setor;
    }

    public String getSenha() {
        return Senha;
    }

    //Set's
    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }    

    @Override
    public String getInformacao(){
        return "Gerente : "+this.Nome+" Salario : "+this.Salario;
    }
    
    @Override
    public Double getBonificacao(){
        return this.Salario * 0.10;
    }       
    
    
}
