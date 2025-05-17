package gui;

import javax.swing.*;
import java.awt.*;
import sudoku.*;

public class SudokuFrame extends JFrame {
    public SudokuFrame(String argumentos) {
        setTitle("Sudoku - Interface Gráfica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        Board board = new Board();
        board.loadFromArguments(argumentos);

        setLayout(new GridLayout(9, 9));
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Cell cell = board.getCell(row, col);
                add(new SudokuCell(cell));
            }
        }

        setVisible(true);
    }
}