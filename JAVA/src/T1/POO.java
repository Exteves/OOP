/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

import T2.Lampada;

/**
 *
 * @author renan.miranda
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa renan = new Pessoa();
        //renan.setNome("Renan");
        //renan.setIdade(1-3);
        //renan.setVegetariana(false);
        //Churrasco casaDoMaozinha = new Churrasco();
        //System.out.println(casaDoMaozinha.verificarConsumo(renan));
        
        Lampada quarto = new Lampada();
        //SETA A DURABILIDADE MÁXIMA PARA 10 DIAS
        quarto.setDuraMax(10);
        //ACENDE A LAMPADA
        quarto.setAcesa(true);
        //VERIFICA O ESTADO DA LAMPADA
        quarto.isAcesa();
    }
    
}
