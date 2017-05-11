package dado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author carlos
 */
public class Ventana extends JFrame implements ActionListener {

    JLabel rs = new JLabel("");
    int dd;

    public Ventana() {
        init();
    }

    private void init() {
        setLayout(null);
        JButton tira = new JButton("Tira el dado");
        setTitle("Dado 1000%Real");
        setSize(500, 450);
        setResizable(false);//Para no maximizar la ventana :V
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        tira.setBounds(350, 10, 100, 50);
        add(tira);
        tira.addActionListener(this);
        rs.setBounds(350, 70, 200, 20);
        add(rs);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random rd = new Random();
        dd = rd.nextInt(6) + 1;
        rs.setText("En el dado salio... " + dd);
        CdDado c1 = new CdDado(dd);
        add(c1);
        c1.setBounds(10, 10, 300, 300);
    }
}
