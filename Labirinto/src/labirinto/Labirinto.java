/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;
import javafx.util.Pair;
import java.util.LinkedList;
/**
 *
 * @author Gustavo
 */
public class Labirinto {
    int[][] arr;
    
    private boolean invalid(Pair<Integer, Integer> par){
        if(par.getKey() < 0 || par.getValue() < 0){
            return false;
        }else if(arr[par.getKey()][par.getValue()] == '#'){
            return false;
        }else{
            return true;
        }     
    }
    
    private void buscaEmProfundidade(Pair<Integer, Integer> ini, Pair<Integer, Integer> end){
        if(invalid(ini)){
            return;
        }else if(ini == end){
            System.out.println("Achei!");
            return;
        }else{
            buscaEmProfundidade( new Pair(ini.getKey()-1, ini.getValue()), end);
            buscaEmProfundidade(new Pair(ini.getKey(), ini.getValue()+1), end);
            buscaEmProfundidade(new Pair(ini.getKey()+1, ini.getValue()), end);
            buscaEmProfundidade(new Pair(ini.getKey(), ini.getValue()-1), end);
        }
    }
    
    private void buscaEmLargura(Pair<Integer, Integer> ini,  Pair<Integer, Integer> end){
        LinkedList fila = new LinkedList();
        Pair<Integer, Integer> atual;
        fila.add(ini);
        while(!fila.isEmpty()){
            fila.poll();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
