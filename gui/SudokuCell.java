package gui;

import javax.swing.*;
import java.awt.*;
import sudoku.Cell;

public class SudokuCell extends JPanel {
    public SudokuCell(Cell cell) {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setLayout(new BorderLayout());

        if (cell.isFixed()) {
            JLabel label = new JLabel(String.valueOf(cell.getValue()), SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.BLUE);
            add(label, BorderLayout.CENTER);
            setBackground(new Color(230, 230, 255));
        } else {
            JTextField textField = new JTextField();
            textField.setHorizontalAlignment(JTextField.CENTER);
            textField.setFont(new Font("Arial", Font.PLAIN, 18));
            if (cell.getValue() != 0) {
                textField.setText(String.valueOf(cell.getValue()));
            }
            add(textField, BorderLayout.CENTER);
        }
    }
}