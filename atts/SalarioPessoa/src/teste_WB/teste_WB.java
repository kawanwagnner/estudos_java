package teste_WB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

public class teste_WB {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel resultLabel;
    private JLabel resultName;
    private JLabel resultName_1;
    private JLabel resultName_2;

    public teste_WB() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Fist Example - Grafic Interface;");
        frame.setBounds(200, 200, 401, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblQualUnidade = new JLabel("Bem-Vindo(a)!");
        lblQualUnidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblQualUnidade.setBounds(135, 24, 106, 20);
        frame.getContentPane().add(lblQualUnidade);

        JLabel lblQualO = new JLabel("Qual é o seu nome?");
        lblQualO.setBounds(25, 105, 150, 20);
        frame.getContentPane().add(lblQualO);

        textField = new JTextField();
        textField.setBounds(185, 105, 170, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblOValorEm = new JLabel("Por favor, digite seu salário:");
        lblOValorEm.setBounds(25, 136, 150, 20);
        frame.getContentPane().add(lblOValorEm);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(185, 136, 170, 20);
        frame.getContentPane().add(textField_1);
        
        resultName = new JLabel("");
        resultName.setToolTipText("");
        resultName.setBounds(10, 265, 269, 20);
        frame.getContentPane().add(resultName);
        
        resultLabel = new JLabel("");
        resultLabel.setToolTipText("");
        resultLabel.setBounds(10, 305, 365, 30);
        frame.getContentPane().add(resultLabel);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 216, 181, 38);
        frame.getContentPane().add(btnCalcular);
        
        resultName_1 = new JLabel("");
        resultName_1.setToolTipText("");
        resultName_1.setBounds(2, 330, 269, 20);
        frame.getContentPane().add(resultName_1);
        
        resultName_2 = new JLabel("");
        resultName_2.setToolTipText("");
        resultName_2.setBounds(10, 283, 269, 20);
        frame.getContentPane().add(resultName_2);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	String strNome = textField.getText();
                    Double intValorUnd = (double) Integer.parseInt(textField_1.getText());
                    
                    resultName.setText("Olá " + strNome + "!");
                	
                	if (intValorUnd >= 0 && intValorUnd <= 645) {
                		resultLabel.setText("Até 1 salário minímo.");
                	} else if (intValorUnd >= 646 && intValorUnd <= 1935) {
                		resultLabel.setText("Até 3 salários minímos.");
                	} else if (intValorUnd >= 1936 && intValorUnd < 3225) {
                		resultLabel.setText("Até 5 salários minímos.");
                	} else if (intValorUnd >= 3225) {
                		resultLabel.setText("Acima de 5 salários minímos.");
                	}

                } catch (NumberFormatException ex) {
                	resultLabel.setText("Por favor, insira números válidos nos campos.");
                }
            }
        });


    }

    public static void main(String[] args) {
    	teste_WB window = new teste_WB();
        window.frame.setVisible(true);
    }
}
