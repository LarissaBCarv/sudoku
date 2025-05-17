package gui;

import javax.swing.SwingUtilities;

public class SudokuGUI {
    public static void main(String[] args) {
        String argumentos = args.length > 0 ? args[0] : "";
        SwingUtilities.invokeLater(() -> new SudokuFrame(argumentos));
    }
}