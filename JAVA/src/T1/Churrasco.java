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
public class Churrasco {
    double qtdCarne;
    
    public double verificarConsumo(Pessoa pessoa){
    
        if((pessoa.getIdade()>0 && pessoa.getIdade()<=3) || pessoa.isVegetariana())
            return 0;
        else if(pessoa.getIdade()>3 && pessoa.getIdade()<13)
            return 1;
        else if(pessoa.getIdade()>12)
            return 2;
        else
            return 0;
    }
    
}
