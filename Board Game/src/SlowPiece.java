import java.awt.*;

public class SlowPiece  extends Piece{
    public SlowPiece(String Name, String colour, Point position) {
        super(Name, colour, position);
    }

    /**
     *
     * @param direction
     *  it is basically showing the position if the limit crosses it pops Pot of Bond error
     */

    public void move(String direction){
        if (direction.equals("left")){
            if (super.getPosition().x-1<0){
                System.out.println("Out of Bound Error");
            }
            else {
                super.getPosition().move(super.getPosition().x-1,super.getPosition().y);
            }
            if (direction.equals("right")){
                if (super.getPosition().x+1>7){
                    System.out.println("Out of bound error");

                }
                else{
                    super.getPosition().move(super.getPosition().x+1,super.getPosition().y);
                }
            }




        }


    }
    public String toString(){
        return getName()+getColour()+"S";
    }




}
