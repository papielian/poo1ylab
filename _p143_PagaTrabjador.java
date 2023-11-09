import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_PagaTrabjador {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculadora de Pago");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel horasLabel = new JLabel("Horas trabajadas:");
        JTextField horasTextField = new JTextField();
        JLabel pagaPorHoraLabel = new JLabel("Paga por hora:");
        JTextField pagaPorHoraTextField = new JTextField();
        JLabel tasaImpuestosLabel = new JLabel("Tasa de impuestos (%):");
        JTextField tasaImpuestosTextField = new JTextField();

        JButton calcularButton = new JButton("Calcular");
        JLabel pagaBrutaLabel = new JLabel("Paga Bruta:");
        JLabel impuestoLabel = new JLabel("Impuesto:");
        JLabel pagaNetaLabel = new JLabel("Paga Neta:");

        panel.add(horasLabel);
        panel.add(horasTextField);
        panel.add(pagaPorHoraLabel);
        panel.add(pagaPorHoraTextField);
        panel.add(tasaImpuestosLabel);
        panel.add(tasaImpuestosTextField);
        panel.add(calcularButton);
        panel.add(new JLabel()); // Espacio vacío

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double horas = Double.parseDouble(horasTextField.getText());
                    double pagaPorHora = Double.parseDouble(pagaPorHoraTextField.getText());
                    double tasaImpuestos = Double.parseDouble(tasaImpuestosTextField.getText());

                    double pagaBruta = horas * pagaPorHora;
                    double impuesto = (pagaBruta * tasaImpuestos) / 100;
                    double pagaNeta = pagaBruta - impuesto;

                    pagaBrutaLabel.setText("Paga Bruta: " + pagaBruta);
                    impuestoLabel.setText("Impuesto: " + impuesto);
                    pagaNetaLabel.setText("Paga Neta: " + pagaNeta);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, introduzca valores válidos.");
                }
            }
        });

        frame.add(panel);
        frame.add(pagaBrutaLabel);
        frame.add(impuestoLabel);
        frame.add(pagaNetaLabel);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        frame.setVisible(true);
    }
}
