public class Board {
    private Cell[][] grid = new Cell[9][9];

    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public void loadFromArguments(String input) {
        String[] entries = input.split(" ");
        for (String entry : entries) {
            try {
                String[] parts = entry.split(";");
                String[] coords = parts[0].split(",");
                int row = Integer.parseInt(coords[1]);
                int col = Integer.parseInt(coords[0]);
                int value = Integer.parseInt(parts[1].split(",")[0]);
                boolean fixed = Boolean.parseBoolean(parts[1].split(",")[1]);
                grid[row][col] = new Cell(value, fixed);
            } catch (Exception e) {
                System.out.println("Erro ao interpretar argumento: " + entry);
            }
        }
    }

    public void print() {
        System.out.println("=== Sudoku ===");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                Cell cell = grid[i][j];
                if (cell.getValue() == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(cell.getValue() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }
}