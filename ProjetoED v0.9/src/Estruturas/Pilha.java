
package Estruturas;

import Exceptions.*;

/**
 *
 * @author Pablo Suria
 */
public class Pilha {
    
    private int[] dados;
    private int topo;
    
    public Pilha(int tam) {
        dados = new int[tam];
        topo = -1;
    }
    
    public Pilha() {
        this(100);
    }
    
    public boolean empty() {
        return topo == -1;
    }
    
    public boolean full() {
        return topo + 1 == dados.length;
    }
    
    public int size() {
        return topo + 1;
    }
    
    public int maxSize(){
        return dados.length;
    }
    
    public int top() throws EstruturaVaziaException{
        if(empty()){
            throw new EstruturaVaziaException("A Pilha esta Vazia");
        }
        return dados[topo];
    }
    
    public boolean push(int value) throws EstruturaCheiaException{
        if(full()) {
            throw new EstruturaCheiaException("A Pilha esta cheia");
        }
        
        topo++;
        dados[topo] = value;
        return true;
    }
    
    public int pop() throws EstruturaVaziaException {
        if(empty()){
            throw new EstruturaVaziaException("A Pilha esta Vazia");
        }
        
        int valor = dados[topo];
        topo--;
        return valor;
    }
    
    //Adaptações:
    public int[] getArray(){
        return dados;
    }
    
}
