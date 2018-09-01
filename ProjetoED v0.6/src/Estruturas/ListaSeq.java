
package Estruturas;

import Exceptions.*;

/**
 *
 * @author Pablo Suria
 */
public class ListaSeq {
    
    private int[] dados;
    private int numElem;
    
    public ListaSeq(int tam) {
        dados = new int[tam];
        numElem = 0;
    }
    
    public ListaSeq() {
        this(100);
    }
    
    /** verifica se a lista esta vazia*/
    public boolean empty() {
        return numElem == 0;
    }
    
    /** verifica se a lista esta cheia*/
    public boolean full() {
        return numElem == dados.length;
    }
    
    /** retorna o tamanho atual da lista*/
    public int size() {
        return numElem;
    }
    
    /** retorna o tamanho maximo da lista*/
    public int maxSize() {
        return dados.length;
    }
    
    /** retorna um elemento da lista a partir de uma posição*/
    public int searchPosition(int pos) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        
        return dados[pos - 1];
    }
    
    /** retorna uma posição da lista a partir de um valor*/
    public int searchValue(int value) throws DadoNaoEncontradoException {
        for(int i = 0; i < numElem; i++) {
            if(dados[i] == value) {
                return i+1;
            }
        }
        
        throw new DadoNaoEncontradoException("Valor Não Encontrado");
    }
    
    /** modifica um valor de uma dada posição*/
    public boolean changeValue(int pos, int value) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        
        dados[pos-1] = value;
        return true;
    }
    
    /** insere um valor numa dada posição*/
    public boolean insert(int pos, int value) throws NumeroInvalidoException,EstruturaCheiaException {
        if ((pos-1 > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        else if(full()) {
            throw new EstruturaCheiaException("A Lista está cheia");
        }
        
        for(int i = numElem; i >= pos; i--){
            dados[i] = dados[i-1];
	}
        
        dados[pos - 1] = value;
        numElem++;
        return true;
    }
    
    /** remove um valor de uma dada posição*/
    public int remove(int pos) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos < 1 )) {
		throw new NumeroInvalidoException("Posição Inválido.");
        }
        
        int dado = dados[pos -1];
        
        for(int i = pos -1; i < numElem -1 ; i++) {
            dados[i] = dados[i+1];
        }
        
        numElem--;
        return dado;
    }
    
}
