
package Interface;


import Estruturas.Fila;
import Exceptions.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class pnlFila extends javax.swing.JPanel {

    private Fila fila;
    
    public pnlFila(int tamanho) {
        initComponents();
        fila = new Fila(tamanho);
        atualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTamAtual = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlFila = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();

        setBackground(new java.awt.Color(195, 195, 210));

        lblTamAtual.setText("Numero de Elementos: ");

        btnAdicionar.setBackground(new java.awt.Color(195, 195, 210));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblValor.setText("Valor:");

        btnRemover.setBackground(new java.awt.Color(195, 195, 210));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        pnlFila.setBackground(new java.awt.Color(195, 195, 210));
        pnlFila.setLayout(new javax.swing.BoxLayout(pnlFila, javax.swing.BoxLayout.X_AXIS));
        jScrollPane1.setViewportView(pnlFila);

        btnInicio.setBackground(new java.awt.Color(195, 195, 210));
        btnInicio.setText("Início");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValor)
                            .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 323, Short.MAX_VALUE)
                                .addComponent(lblTamAtual))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRemover)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInicio)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamAtual)
                    .addComponent(lblValor))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {  
            int valor = Integer.parseInt(txtValor.getText());
            fila.insert(valor);
            atualizar();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Caractere Inválido. Digite um numero");
        } catch (EstruturaCheiaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            int removido = fila.remove();
            JOptionPane.showMessageDialog(null, removido);
            atualizar();
        } catch (EstruturaVaziaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        try {
            int inicio = fila.consult();
            JOptionPane.showMessageDialog(null, inicio);
        } catch (EstruturaVaziaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void atualizar() {
        lblTamAtual.setText("Número de Elementos: " + fila.size());
        
        pnlFila.removeAll();
        
        // Mudar o valor de txtValor para null.
        // Fazer imagens para a representação do início, fim e elemento neutro.
        int[] array = fila.getArray();
        
            for(int i = 0; i < fila.maxSize(); i++) {
                    JLabel lbl;
                    if(fila.size() == 1 && i == fila.getInicio()) {
                        lbl = new JLabel(new ImageIcon("Fotos//noduloInicioFinal.png"));
                        lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                    }
                    else if(i == fila.getInicio()) {
                        lbl = new JLabel(new ImageIcon("Fotos//noduloInicio.png"));
                        lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                    } 
                    else if(i == fila.getFinal()){
                        lbl = new JLabel(new ImageIcon("Fotos//noduloFinal.png"));
                        lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                    }
                    else if(fila.getInicio() <= fila.getFinal()) {
                        if(i < fila.getInicio() || i > fila.getFinal()) {
                            lbl = new JLabel(new ImageIcon("Fotos//noduloNull2.png"));
                        }
                        else{
                        lbl = new JLabel(new ImageIcon("Fotos//noduloSeq2.png"));
                            lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                        }
                    }
                    else if(fila.getInicio() > fila.getFinal()) {
                        if(i < fila.getInicio() && i > fila.getFinal()) {
                            lbl = new JLabel(new ImageIcon("Fotos//noduloNull2.png"));
                        }
                        else{
                        lbl = new JLabel(new ImageIcon("Fotos//noduloSeq2.png"));
                            lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                        }
                    }
                    else{
                        lbl = new JLabel(new ImageIcon("Fotos//noduloSeq2.png"));
                            lbl.setFont(new Font("Tahoma",Font.PLAIN,48));
                            lbl.setText("" + array[i] );
                            lbl.setHorizontalTextPosition(JLabel.CENTER);
                    }
                    
                    pnlFila.add(lbl);
            } 
        
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTamAtual;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlFila;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}