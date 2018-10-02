
package Estruturas;

import Exceptions.*;
import Interface.pnlListaSeq;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Pablo Suria
 */
public class ListaSeq {
    
    private int[] dados;
    private int numElem;
    private pnlListaSeq painel;
    
    public ListaSeq(int tam, pnlListaSeq painel) {
        dados = new int[tam];
        this.painel = painel;
        numElem = 0;
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
        } else {
            numElem++;
            new Timer().scheduleAtFixedRate(new TimerTask(){
                int i = numElem-1;

                @Override
                public void run(){
                    if(i >= pos){
                        dados[i] = dados[i-1];
                        i--;
                        painel.atualizar();
                    } else {
                        dados[pos-1] = value;                      
                        painel.atualizar();
                        cancel();
                    }
                }
            }, 500, 500);
            return true;
        }
    }
    
    /** remove um valor de uma dada posição*/
    public int remove(int pos) throws NumeroInvalidoException {
        if ((pos > numElem) || (pos < 1 )) {
            throw new NumeroInvalidoException("Posição Inválido.");
        } 
        else {
            int dado = dados[pos -1];
            
            new Timer().scheduleAtFixedRate(new TimerTask(){
                int i = pos -1;
                
                @Override
                public void run(){
                    if(i <= numElem-1){
                        dados[i] = dados[i+1];
                        i++;
                        painel.atualizar();
                    } else {                    
                        painel.atualizar();
                        cancel();
                    }
                }
            }, 500, 500);
            
            numElem--;
            return dado;
        }
    }
    
}
