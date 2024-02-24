import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class testWB {

    private JFrame frame;
    private JTextField textField;
    private JLabel resultLabel;


    public testWB() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Fist Example - Grafic Interface;");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(25, 30, 150, 20);
        frame.getContentPane().add(label);

        textField = new JTextField();
        textField.setBounds(180, 30, 150, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnExibirNome = new JButton("Exibir Nome");
        btnExibirNome.setBounds(180, 60, 150, 23);
        frame.getContentPane().add(btnExibirNome);

        resultLabel = new JLabel("");

        resultLabel.setBounds(180, 100, 150, 20);
        frame.getContentPane().add(resultLabel);

        btnExibirNome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String nome = textField.getText();
                
            	if (!nome.equals("")) {
            		 textField.setText("");
            		resultLabel.setText("Olá, " + nome + "!");
                } else {
                	resultLabel.setText("[ERROR] Defina seu nome!");
                }
            }
        });
    }

    public static void main(String[] args) {
    	testWB window = new testWB();
        window.frame.setVisible(true);
    }
}
