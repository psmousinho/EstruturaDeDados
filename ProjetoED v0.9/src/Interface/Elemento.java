
package Interface;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Pablo Suria
 */
public class Elemento extends JLabel {

    public Elemento(String text, String path) {
        setFont(new Font("Tahoma", Font.PLAIN, 48));
        setHorizontalTextPosition(JLabel.CENTER);
        setText(text);
        setIcon(new ImageIcon(path));
    }

}
