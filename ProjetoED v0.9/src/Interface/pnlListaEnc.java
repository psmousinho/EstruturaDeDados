package Interface;

import Estruturas.ListaEnc;
import Exceptions.*;
import javax.swing.*;

/**
 *
 * @author Pablo Suria
 */
public class pnlListaEnc extends javax.swing.JPanel {

    private ListaEnc lista;
    private int pA;

    public pnlListaEnc() {
        initComponents();
        lista = new ListaEnc();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlLista = new javax.swing.JPanel();
        rBtnPosicao = new javax.swing.JRadioButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        rBtnValor = new javax.swing.JRadioButton();
        txtPosicao = new javax.swing.JTextField();
        lblBusca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblPosicao = new javax.swing.JLabel();
        lblTamAtual = new javax.swing.JLabel();

        setBackground(new java.awt.Color(195, 195, 210));

        pnlLista.setBackground(new java.awt.Color(195, 195, 210));
        pnlLista.setLayout(new javax.swing.BoxLayout(pnlLista, javax.swing.BoxLayout.X_AXIS));
        jScrollPane1.setViewportView(pnlLista);

        rBtnPosicao.setBackground(new java.awt.Color(195, 195, 210));
        buttonGroup1.add(rBtnPosicao);
        rBtnPosicao.setText("Por Posi��o");

        btnRemover.setBackground(new java.awt.Color(195, 195, 210));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(195, 195, 210));
        btnAdicionar.setText("Adiconar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblValor.setText("Valor:");

        rBtnValor.setBackground(new java.awt.Color(195, 195, 210));
        buttonGroup1.add(rBtnValor);
        rBtnValor.setText("Por Valor");

        txtPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicaoActionPerformed(evt);
            }
        });

        lblBusca.setText("Busca:");

        btnBuscar.setBackground(new java.awt.Color(195, 195, 210));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblPosicao.setText("Posi�ao:");

        lblTamAtual.setText("Numero de Elementos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(txtValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBusca)
                                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rBtnValor)
                                        .addGap(0, 205, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rBtnPosicao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTamAtual)))
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPosicao)
                        .addComponent(lblBusca)
                        .addComponent(rBtnPosicao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTamAtual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rBtnValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            int pos = Integer.parseInt(txtPosicao.getText());
            int dado = lista.remove(pos);
            pA = -1;

            Elemento elem = new Elemento("" + dado, "src//assets//noduloSeq.png");
            JOptionPane.showMessageDialog(this, elem, "Removido", JOptionPane.PLAIN_MESSAGE);

            atualizar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Caractere Invalido. Digite uma posicao");
        } catch (NumeroInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            int pos = Integer.parseInt(txtPosicao.getText());
            int valor = Integer.parseInt(txtValor.getText());
            lista.insert(pos, valor);
            pA = pos;
            atualizar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Caracter invalido. Digite um numero.");
        } catch (NumeroInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (rBtnPosicao.isSelected()) {
            try {
                int bus = Integer.parseInt(txtBusca.getText());
                int dado = lista.searchPosition(bus);

                Elemento elem = new Elemento("" + dado, "src//assets//noduloSeq.png");
                JOptionPane.showMessageDialog(this, elem, "Info", JOptionPane.PLAIN_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Caractere invalido. Digite um numero.");
            } catch (NumeroInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (rBtnValor.isSelected()) {
            try {
                int bus = Integer.parseInt(txtBusca.getText());
                int pos = lista.searchValue(bus);
                JOptionPane.showMessageDialog(null, "Valor encontrado na posicao: " + pos);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Caractere invalido. Digite um numero.");
            } catch (DadoNaoEncontradoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Escolha uma das opcoes de busca.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicaoActionPerformed
        btnAdicionar.doClick();
    }//GEN-LAST:event_txtPosicaoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        btnAdicionar.doClick();
    }//GEN-LAST:event_txtValorActionPerformed

    private void atualizar() {
        lblTamAtual.setText("Numero de Elementos " + lista.size());
        pnlLista.removeAll();

        Elemento elem;
        Elemento pont;
        for (int i = 1; i <= lista.size() + 1; i++) {
            try {

                if (i == pA) {
                    elem = new Elemento("" + lista.searchPosition(i), "src//assets//noduloSeq3.png");
                    pont = new Elemento("", "src//assets//ponteiro2.png");
                } else {
                    elem = new Elemento("" + lista.searchPosition(i), "src//assets//noduloSeq.png");
                    pont = new Elemento("", "src//assets//ponteiro.png");

                }

                pnlLista.add(elem);
                pnlLista.add(pont);
            } catch (NumeroInvalidoException ex) {
                elem = new Elemento("", "src//assets//noduloNull.png");
                pnlLista.add(elem);
            }
        }

        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblTamAtual;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JRadioButton rBtnPosicao;
    private javax.swing.JRadioButton rBtnValor;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
