import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p144_Temperaturas {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Convertidor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel temperaturaLabel = new JLabel("Temperatura:");
        JTextField temperaturaTextField = new JTextField();

        JRadioButton fahrenheitRadio = new JRadioButton("Fahrenheit");
        JRadioButton celsiusRadio = new JRadioButton("Celsius");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(fahrenheitRadio);
        radioGroup.add(celsiusRadio);

        JButton convertirButton = new JButton("Convertir");

        JLabel resultadoLabel = new JLabel("Resultado:");

        panel.add(temperaturaLabel);
        panel.add(temperaturaTextField);
        panel.add(fahrenheitRadio);
        panel.add(celsiusRadio);
        panel.add(convertirButton);
        panel.add(resultadoLabel);

        frame.add(panel);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        frame.setVisible(true);

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperatura = Double.parseDouble(temperaturaTextField.getText());
                    if (fahrenheitRadio.isSelected()) {
                        double celsius = (temperatura - 32) * 5/9;
                        resultadoLabel.setText("Resultado: " + celsius + "°C");
                    } else if (celsiusRadio.isSelected()) {
                        double fahrenheit = (temperatura * 9/5) + 32;
                        resultadoLabel.setText("Resultado: " + fahrenheit + "°F");
                    } else {
                        resultadoLabel.setText("Por favor, seleccione una opción (°F o °C).");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Por favor, introduzca una temperatura válida.");
                }
            }
        });
    }
}
