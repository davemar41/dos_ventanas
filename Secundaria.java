package datos;

import javax.swing.*;

public class Secundaria extends JFrame{
    private JPanel Frame2;
    public static JTextField recibir;

    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secundaria().setVisible(true);
            }
        });

    }



}
