package teste_WB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;

public class teste_WB {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel resultLabel;

    public teste_WB() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Fist Example - Grafic Interface;");
        frame.setBounds(200, 200, 401, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(25, 30, 150, 20);
        frame.getContentPane().add(label);

        textField = new JTextField();
        textField.setBounds(180, 30, 170, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel label_2 = new JLabel("Digite o 1º número:");
        label_2.setBounds(25, 61, 150, 20);
        frame.getContentPane().add(label_2);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(180, 61, 170, 20);
        frame.getContentPane().add(textField_1);
        
        JLabel label_3 = new JLabel("Digite o 2º número:");
        label_3.setBounds(25, 92, 150, 20);
        frame.getContentPane().add(label_3);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(180, 92, 170, 20);
        frame.getContentPane().add(textField_2);
        
        resultLabel = new JLabel("");
        resultLabel.setToolTipText("");

        resultLabel.setBounds(25, 144, 399, 20);
        frame.getContentPane().add(resultLabel);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(200, 261, 150, 23);
        frame.getContentPane().add(btnCalcular);
        
        JRadioButton rdbtnAdicao = new JRadioButton("Adição");
        rdbtnAdicao.setBounds(25, 183, 109, 23);
        frame.getContentPane().add(rdbtnAdicao);
        
        JRadioButton rdbtnSubtracao = new JRadioButton("Subtração");
        rdbtnSubtracao.setBounds(25, 209, 109, 23);
        frame.getContentPane().add(rdbtnSubtracao);
        
        JRadioButton rdbtnDivisao = new JRadioButton("Divisão");
        rdbtnDivisao.setBounds(25, 261, 109, 23);
        frame.getContentPane().add(rdbtnDivisao);
        
        JRadioButton rdbtnMultplicacao = new JRadioButton("Multiplicação");
        rdbtnMultplicacao.setBounds(25, 235, 109, 23);
        frame.getContentPane().add(rdbtnMultplicacao);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnAdicao);
        buttonGroup.add(rdbtnSubtracao);
        buttonGroup.add(rdbtnDivisao);
        buttonGroup.add(rdbtnMultplicacao);
        
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	String nome = textField.getText();
                    int num1 = Integer.parseInt(textField_1.getText());
                    int num2 = Integer.parseInt(textField_2.getText());
                    
                    if (rdbtnAdicao.isSelected()) {
                        int adicacao = num1 + num2;
                        resultLabel.setText("Olá " + nome + "! A soma entre os número é: " + adicacao + " UNDs.");
                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                    } else if (rdbtnSubtracao.isSelected()) {
                    	int subtracao = num1 - num2;
                        resultLabel.setText("Olá " + nome + "! A subtração entre os número é: " + subtracao + " UNDs.");
                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                        
                    } else if (rdbtnDivisao.isSelected()) {
                    	int subtracao = num1 / num2;
                        resultLabel.setText("Olá " + nome + "! A divisão entre os número é: " + subtracao + " UNDs.");
                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                        
                    } else if (rdbtnMultplicacao.isSelected()) {
                    	int subtracao = num1 * num2;
                        resultLabel.setText("Olá " + nome + "! A Multiplicação entre os número é: " + subtracao + " UNDs.");
                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                        
                    } else {
                    	resultLabel.setText("Selecione uma operação.");
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
