/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projlogicaprogramacao;

import java.util.ArrayList;

/**
 *
 * @author evertonportela
 */
public class ProjLogicaProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            lista.add(i, i + 1);
        }
        System.out.println(lista.get(4));
    }

}
