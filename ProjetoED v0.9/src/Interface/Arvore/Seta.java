package Interface.Arvore;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Seta extends JPanel {
    
    
    private static ImageIcon leftDiagonal = new ImageIcon(new ImageIcon("src//assets//diagonalL.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
    private static ImageIcon rightDiagonal = new ImageIcon(new ImageIcon("src//assets//diagonalR.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
    
    private final boolean left;
    
    /** Creates new form Element
     * @param left */
    public Seta(boolean left) {
        this.left = left;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrowLabel = new javax.swing.JLabel();

        setForeground(new java.awt.Color(240, 240, 240));
        setMaximumSize(new java.awt.Dimension(100, 100));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));

        arrowLabel.setBackground(new java.awt.Color(195, 195, 210));
        arrowLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        arrowLabel.setToolTipText("Next Element");
        arrowLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        arrowLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        arrowLabel.setOpaque(true);
        arrowLabel.setPreferredSize(new java.awt.Dimension(100, 100));
        arrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
        arrowLabel.setVerticalAlignment(SwingConstants.CENTER);
        arrowLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                arrowLabelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arrowLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arrowLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arrowLabelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_arrowLabelComponentResized
        setNext();
    }//GEN-LAST:event_arrowLabelComponentResized

    public JLabel getLabel(){
        return arrowLabel;
    }

    public void setNext(){
        if(left) {
           
            arrowLabel.setIcon(leftDiagonal);
        } else {
            arrowLabel.setIcon(rightDiagonal);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLabel;
    // End of variables declaration//GEN-END:variables

}
