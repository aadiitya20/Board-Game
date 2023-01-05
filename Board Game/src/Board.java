import java.awt.*;
public class Board extends Piece{
    private Piece[][] board;


    public Board() {
        board = new Piece[8][8];

    }

    /**
     *  it adds the piece
     * @param p
     * @return
     */
    public String add(Piece p){
        if(board[p.getPosition().x][p.getPosition().y]!=null){
            return "the Piece cannot be added.";
        }
        else{
            board[p.getPosition().x][p.getPosition().y]=p;

            return p.toString();
        }

        /**
         *  The move methode
         */


    }
    public String move(Piece p,String direction,int num){
        int x = p.getPosition().x;
        int y = p.getPosition().y;
        switch(direction){
            case "left":
                if (x-num<0 && board[p.getPosition().x-num][p.getPosition().y]!=null){
                    System.out.println("Out of Bound Error OR place not empty");
                }
                else {
                    p.setPosition(new Point(p.getPosition().x-num,p.getPosition().y));
                }
                    break;
            case "right":
                if (x+num>7 && board[p.getPosition().x+num][p.getPosition().y]!=null){
                    System.out.println("Out of Bound Error OR place not empty");
                }
                else{
                    p.setPosition(new Point(p.getPosition().x-num,p.getPosition().y));
                }
                break;
            case "up":
                if (y-num<0 && board[p.getPosition().x][p.getPosition().y-num]!=null){
                    System.out.println("Out of Bound Error OR place not empty");
                }
                else {
                    Point rad = new Point(p.getPosition().x,p.getPosition().y-num);

                    p.setPosition(new Point(p.getPosition().x,p.getPosition().y-num));

                }
                break;
            case "down":
                if (y+num>7 && board[p.getPosition().x][p.getPosition().y+num]!=null){
                    System.out.println("Out of Bound Error OR place not empty");
                }
                else{
                    p.setPosition(new Point(p.getPosition().x,p.getPosition().y+num));
                }
                break;
            default:
                System.out.println("Error Occured");
                break;
        }

    return p.toString();
    }


    public void Display() {

        for(int i=0; i< board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                if(board[j][i] == null) {
                    System.out.print("  -   ");
                }
                else {
                    System.out.print(board[j][i].toString());
                }
            }
            System.out.println();
        }
    }
}










