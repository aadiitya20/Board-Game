import java.util.Scanner;
import java.awt.*;

public class GameDemo {
    public static void main(String[] args) {

        Board gameBoard = new Board();
        Piece piece;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a command (type help for details): ");

        String input = in.nextLine();

        while(!input.equals("exit")) {
            String[] inSplit = input.split(" ");

            if (inSplit[0].equals("help")) {
                System.out.println("Possible commands are as follows:");
                System.out.println("create location [fast][flexible]: Creates a new piece.");
                System.out.println("move location direction [spaces]: Moves a piece.");
                System.out.println("print: Displays the board.");
                System.out.println("help: Displays help.");
                System.out.println("exit: Exits the program.");
                System.out.println("Enter a command (type help for details): ");
            }

            if (inSplit[0].equals("print")) {
                gameBoard.Display();
                System.out.println("Enter a command (type help for details): ");
            }

            if (inSplit[0].equals("create")) {
                System.out.println("Input a name for the new piece: ");
                String name = in.next();
                System.out.println("Input a color for the new piece: ");
                String color = in.next();
                Point position = new Point(Integer.parseInt(inSplit[1]), Integer.parseInt(inSplit[2]));
                if (inSplit.length == 3) {
                    piece = new Piece(name, color,position);
                    gameBoard.add(piece);
                } else if (inSplit.length == 4) {
                    if (inSplit[3].equals("fast")) {
                        piece = new FastPiece(name, color, position);
                        gameBoard.add(piece);
                    } else {
                        piece = new SlowFlexible(name, color, position);
                        gameBoard.add(piece);
                    }
                } else {
                    piece = new FastFlexible(name, color, position);
                    gameBoard.add(piece);
                }
                System.out.println("Enter a command (type help for details): ");

            }

            if (inSplit[0].equals("move")) {
                int x = Integer.parseInt((inSplit[1]));
                int y = Integer.parseInt(inSplit[2]);
                int[] position = {x, y};
                piece = new Piece(gameBoard.getName(), gameBoard.getColour(), new Point(x,y));
                String direction = inSplit[3];
                if (inSplit.length == 4) {
                    gameBoard.move(piece, direction, 1);
                } else if (inSplit.length == 5) {
                    System.out.println(piece.getPosition());

                    gameBoard.move(piece,direction, Integer.parseInt(inSplit[4]));
                    System.out.println(piece.getPosition());
                }
                System.out.println("Enter a command (type help for details): ");
            }
            input = in.nextLine();
        }

        System.out.println("Done.");

    }
}