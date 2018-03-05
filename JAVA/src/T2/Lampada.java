/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T2;
/**
 *
 * @author renan.miranda
 */
public class Lampada {
    boolean acesa;
    int durabilidade, duraMax;
    
    public int getDurabilidade(){
        return this.durabilidade;
    }
    
    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }
    public void setDuraMax(int duraMax){
        this.duraMax = duraMax;
    }
    
    public int getDuraMax(){
        return this.duraMax;
    }
    
    public boolean isAcesa(){       
    return this.acesa;
    }
    
    public void setAcesa(boolean acesa){
        if(durabilidade==duraMax)
        {
            this.acesa = false;
        }
        else{
            durabilidade++; 
            this.acesa = acesa;
        }
    }        
}