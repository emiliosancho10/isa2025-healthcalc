package uma.isa.healthcalc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HealthCalcView extends JFrame implements IHealthCalcView {
    private JComboBox<String> sexoBox = new JComboBox<>(new String[]{"Hombre", "Mujer"});
    private JTextField edadField = new JTextField(10);
    private JTextField alturaField = new JTextField(10);
    private JTextField pesoField = new JTextField(10);
    private JTextArea resultadoArea = new JTextArea(5, 30);
    private JButton btnPesoIdeal = new JButton("Calcular Peso Ideal");
    private JButton btnTMB = new JButton("Calcular TMB");
    private JButton btnIMC = new JButton("Calcular IMC");
    private JButton btnRMC = new JButton("Calcular RMC");

    public HealthCalcView() {
        setTitle("Calculadora de Salud");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Sexo:"));
        inputPanel.add(sexoBox);
        inputPanel.add(new JLabel("Edad:"));
        inputPanel.add(edadField);
        inputPanel.add(new JLabel("Altura (cm):"));
        inputPanel.add(alturaField);
        inputPanel.add(new JLabel("Peso (kg):"));
        inputPanel.add(pesoField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(btnPesoIdeal);
        buttonPanel.add(btnTMB);
        buttonPanel.add(btnIMC);
        buttonPanel.add(btnRMC);

        resultadoArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultadoArea);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);
    }

    public String getSexo() { return (String) sexoBox.getSelectedItem(); }
    public String getEdad() { return edadField.getText(); }
    public String getAltura() { return alturaField.getText(); }
    public String getPeso() { return pesoField.getText(); }

    public void setResultado(String resultado) { resultadoArea.setText(resultado); }
    public void mostrarError(String mensaje) { JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE); }

    public void addCalcularPesoIdealListener(ActionListener listener) { btnPesoIdeal.addActionListener(listener); }
    public void addCalcularTMBListener(ActionListener listener) { btnTMB.addActionListener(listener); }
    public void addCalcularIMCListener(ActionListener listener) { btnIMC.addActionListener(listener); }
    public void addCalcularRMCListener(ActionListener listener) { btnRMC.addActionListener(listener); }
}
