package Interface.Arvore;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class ConstantsLabels {

    public final static ImageIcon[] NORMAL_NODE = {
        null,
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore1.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))
    };
    
    public final static ImageIcon[] SELECTED_NODE = {
        null,
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/NoArvore2.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))
    };

    public final static ImageIcon[] LEFT_ARROW = {
        null,
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalL.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))
    };

    public final static ImageIcon[] RIGHT_ARROW = {
        null,
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH)),
        new ImageIcon(new ImageIcon(ConstantsLabels.class.getResource("/assets/diagonalR.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))
    };
    
    public final static int[] DIMENSIONS = {0, 25, 50, 75, 100, 125, 150, 175, 200};
    public final static int[] FONT_SIZES = {0, 14, 18, 24, 30, 38, 48, 60, 75};
}
