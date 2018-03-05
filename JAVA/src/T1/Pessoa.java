/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

/**
 *
 * @author renan.miranda
 */
public class Pessoa {
    private String nome;
    private int idade;
    private boolean vegetariana, sexo;  
    
    public String getNome(){
    return this.nome;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public int getIdade(){
    return this.idade;
    }
    
    public void setIdade (int idade){
    
        if(idade<0)
            System.out.println("Favor inserir uma idade maior que zero");
        else
        this.idade = idade;
    }
    
    public boolean isVegetariana(){
        return this.vegetariana;
    }
    
    public void setVegetariana(boolean vegetariana){
        this.vegetariana = vegetariana;
    }
    
}
