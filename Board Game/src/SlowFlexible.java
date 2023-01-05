import java.awt.*;
import java.util.Scanner;

public class SlowFlexible extends SlowPiece{
    public SlowFlexible(String Name, String colour, Point position) {
        super(Name, colour, position);
    }

    /**
     *
     * @param direction
     *  it is basically showing the position if the limit crosses it pops Pot of Bond error
     */
    public void move(String direction){

        if (direction.equals("up")){
            if (super.getPosition().x-1<0){
                System.out.println("Out of Bound Error");

            }
            else {
                super.getPosition().move(super.getPosition().x-1,super.getPosition().y);
            }

        }
        if (direction.equals("down")){
            if (super.getPosition().x+1>7){
                System.out.println("Out of Bound Error");
            }
            else {
                super.getPosition().move(super.getPosition().x+1,super.getPosition().y);
            }
        }

    }

    @Override
    public String toString() {
        return getName()+getColour()+"SF";
    }
}
