/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto12funcionarioheranca;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author thais
 */
public class Projeto12FuncionarioHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Thais");
        objFunc01.setSalario(500);
        objFunc01.setCPF("441.295.708/30");
        System.out.println("Funcionario 01 : "+objFunc01.getNome()); 
        System.out.println("Info : "+objFunc01.getInformacao());         
        
        Gerente objGeren01 = new Gerente();
        objGeren01.setNome("Victor");
        objGeren01.setSalario(0);         
        objGeren01.setCPF("111.111.111/00");
        objGeren01.setSetor("Vagabundo");
        objGeren01.setSenha("102030");
        
        System.out.println("Gerente 01 : "+objGeren01.getNome());
        
        Funcionario objFunc02 = new Gerente();
        //Gerente objGeren02 = (Gerente) new Funcionario();
        
        //objFunc02 = objGeren02;
        //objGeren02 = (Gerente) objFunc02;
        
                
        
        
    }
    
}
