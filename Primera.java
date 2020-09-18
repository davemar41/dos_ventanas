package datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primera extends JFrame {
    private JPanel Frame;
    private JTextField envio;
    private JButton botonqueenvia;

    Primera(){
        setContentPane(Frame);


        botonqueenvia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Secundaria mienvio=new Secundaria();
                mienvio.setVisible(true);
                mienvio.setSize(300,300);
                String info=envio.getText();
                Secundaria.recibir.setText(info);
            }
        });
    }


    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Primera().setSize(300,300);
                new Primera().setVisible(true);
            }
        });


    }
}
