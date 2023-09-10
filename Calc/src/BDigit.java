import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BDigit extends JButton implements Digit {
    @Override
    public void click() {
        String in = this.txtField.getText();
        in += this.getText() ;
        this.txtField.setText(in);
    }
    private JTextField txtField ;
    BDigit ()
    {

    }
    BDigit (JTextField txt, String title)
    {
        super (title) ;
        this.txtField = txt ;
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                click () ;
            }
        });
    }
}
