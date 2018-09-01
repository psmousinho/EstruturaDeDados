package Estruturas;

import Exceptions.*;

/**
 *
 * @author aluno
 */
public class Fila {
    
    private int[] dados;
    private int inicio;
    private int fim;
    private int nElem;
    
    public Fila(int tam) {
        dados = new int[tam];
        inicio = 0;
        fim = -1;
        nElem = 0;
    }
    
    public Fila() {
        this(12);
    }
    
    public boolean empty() {
        return nElem == 0;
    }
    
    public boolean full() { 
        return nElem == dados.length;
    }
    
    public int size() {
        return nElem;
    }
    
    public int maxSize() {
        return dados.length;
    }
    public boolean insert(int value) throws EstruturaCheiaException {
        if(full()) {
            throw new EstruturaCheiaException("A fila está cheia.");
        }
        
        fim = (fim + 1) % dados.length;
        dados[fim] = value;
        nElem++;
        return true;
    }
    
    public int remove() throws EstruturaVaziaException {
        if(empty()) {
            throw new EstruturaVaziaException("A fila está vazia.");
        }
        
        int removido = dados[inicio];
        dados[inicio] = 0;
        inicio = (inicio + 1) % dados.length;
        nElem--;
        return removido;
    }
    
    public int consult() throws EstruturaVaziaException {
        if(empty()) {
            throw new EstruturaVaziaException("A fila está vazia.");
        }
        
        return dados[inicio];
    }
    
    public int[] getArray() {
        return dados;
    }
    
    public int getInicio() {
        return inicio;
    }
    
     public int getFinal() {
        return fim;
    }
}