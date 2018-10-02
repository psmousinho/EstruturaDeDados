
package Estruturas;

import Exceptions.*;

/**
 *
 * @author Pablo Suria
 */
public class ListaEnc {
    
    class No {
        private int value;
        private No prox;
        
        public No() {
            value = 0;
            prox = null;
        }

        public int getValue() {
            return value;
        }

        public No getProx() {
            return prox;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setProx(No prox) {
            this.prox = prox;
        }
   
    }
    
    private No cabeca;
    private int numElem;
    
    public ListaEnc() {
        cabeca = null;
        numElem = 0;
    }
    
    /** verifica se a lista esta vazia*/
    public boolean empty() {
        return numElem == 0;
    }
    
    /** retorna o tamanho atual da lista*/
    public int size() {
        return numElem;
    }
    
    /** retorna um elemento da lista a partir de uma posição*/
    public int searchPosition(int pos) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        
        No aux = cabeca;
        for(int i = 1; i < pos; i++) {
            aux = aux.getProx();
        }
        
        return aux.getValue();
    }
    
    /** retorna uma posição da lista a partir de um valor*/
    public int searchValue(int value) throws DadoNaoEncontradoException {
        No aux = cabeca;
        
        for(int i = 1; i <= numElem; i++) {
            if(aux.getValue() == value){
                return i;
            }
            aux = aux.getProx();
        }
        
        throw new DadoNaoEncontradoException("Valor Não Encontrado");
    }
    
    /** modifica um valor de uma dada posição*/
    public boolean changeValue(int pos, int value) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        
        No aux = cabeca;
        for(int i = 1; i < pos; i++) {
            aux = aux.getProx();
        }
        aux.setValue(value);
        
        return true;
    }
    
    /** insere um valor numa dada posição*/
    public boolean insert(int pos, int value) throws NumeroInvalidoException {
        if ((pos-1 > numElem) || (pos <= 0)) {
            throw new NumeroInvalidoException("Posição inválida.");
        }
        else if(pos == 1){
            No newNo = new No();
            newNo.setValue(value);
            newNo.setProx(cabeca);
            cabeca = newNo;
        }
        else {
            No aux = cabeca;
            for(int i = 1; i < pos-1; i++) {
                 aux = aux.getProx();
            }
            
            No newNo = new No();
            newNo.setValue(value);
            newNo.setProx(aux.getProx());
            aux.setProx(newNo);
        }
        
        numElem++;
        return true;
    }

    /** remove um valor de uma dada posição*/
    public int remove(int pos) throws NumeroInvalidoException {
        int dado;
        if ((pos > numElem) || (pos < 1 )) {
		throw new NumeroInvalidoException("Psição Inválido.");
        }
        else if(pos == 1) {
            No ant = cabeca;
            dado = ant.getValue();
            cabeca = cabeca.getProx();
            
            ant = null;
        }
        else {
            No ant = cabeca;
            for(int i = 1; i < pos-1; i++) {
                 ant = ant.getProx();
            }
            
            No atual = ant.getProx();
            ant.setProx(atual.getProx());
            
            dado = atual.getValue();
            atual = null;
        }
       
        numElem--;
        return dado;
    }

}