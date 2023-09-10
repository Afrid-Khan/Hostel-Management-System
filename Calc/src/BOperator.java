import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BOperator extends JButton implements Digit {
    private JTextField txtField ;
    @Override
    public void click() {
        String in = this.txtField.getText();
        in += this.getText() ;
        this.txtField.setText(in);
    }
    BOperator (JTextField txt, String title)
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