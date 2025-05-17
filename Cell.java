public class Cell {
    private int value;
    private boolean fixed;

    public Cell() {
        this(0, false);
    }

    public Cell(int value, boolean fixed) {
        this.value = value;
        this.fixed = fixed;
    }

    public int getValue() {
        return value;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setValue(int value) {
        if (!fixed) {
            this.value = value;
        }
    }
}