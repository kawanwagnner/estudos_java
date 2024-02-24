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

    public teste_WB() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Fist Example - Grafic Interface;");
        frame.setBounds(200, 200, 401, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblQualUnidade = new JLabel("Qual é a unidade de media?");
        lblQualUnidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblQualUnidade.setBounds(90, 22, 181, 20);
        frame.getContentPane().add(lblQualUnidade);
        
        JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit - °F");
        rdbtnFahrenheit.setBounds(66, 51, 109, 23);
        frame.getContentPane().add(rdbtnFahrenheit);
        
        JRadioButton rdbtnCelsius = new JRadioButton("Celsius - °C");
        rdbtnCelsius.setBounds(201, 51, 109, 23);
        frame.getContentPane().add(rdbtnCelsius);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnFahrenheit);
        buttonGroup.add(rdbtnCelsius);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(25, 126, 150, 20);
        frame.getContentPane().add(label);

        textField = new JTextField();
        textField.setBounds(185, 126, 170, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblOValorEm = new JLabel("Digite o valor unitário:");
        lblOValorEm.setBounds(25, 157, 150, 20);
        frame.getContentPane().add(lblOValorEm);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(185, 157, 170, 20);
        frame.getContentPane().add(textField_1);
        
        resultName = new JLabel("");
        resultName.setToolTipText("");
        resultName.setBounds(10, 292, 269, 20);
        frame.getContentPane().add(resultName);
        
        resultLabel = new JLabel("");
        resultLabel.setToolTipText("");
        resultLabel.setBounds(10, 320, 365, 30);
        frame.getContentPane().add(resultLabel);
        
        JButton btnCalcular = new JButton("Calcular Unidade");
        btnCalcular.setBounds(90, 216, 181, 38);
        frame.getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	String nome = textField.getText();
                    Double intValorUnd = (double) Integer.parseInt(textField_1.getText());
                    
                    if (rdbtnFahrenheit.isSelected()) {
                    	Double dblCalcFahrenheit = intValorUnd * 1.8 + 32;
                    	
                    	resultName.setText("Olá " + nome + "!");
                    	resultLabel.setText("O valor de Celsius convertido à Fahrenheit é: " + dblCalcFahrenheit + "°F.");
                    	
                    	textField.setText("");
                    	textField_1.setText("");
                    } else if (rdbtnCelsius.isSelected()) {
                    	Double dblCalcCelsisus = (intValorUnd - 32) / 1.8;
                    	
                    	resultName.setText("Olá " + nome + "!");
                    	resultLabel.setText("O valor de Fahrenheit convertido à Celsius é: " + dblCalcCelsisus + "°C.");
                    	
                    	textField.setText("");
                    	textField_1.setText("");
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
