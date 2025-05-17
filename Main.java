public class Main {
  public static void main(String[] args) {
      String argumentos = args.length > 0 ? args[0] : "";
      Board board = new Board();
      board.loadFromArguments(argumentos);
      board.print();
  }
}
