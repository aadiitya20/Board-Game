import java.awt.*;
import java.util.Scanner;

public class FastFlexible extends FastPiece{
    public FastFlexible(String Name, String colour, Point position) {
        super(Name, colour, position);
    }


    public void move(String direction, int n ){
        if (direction.equals("up")){
            if (super.getPosition().x-n<0){
                System.out.println("Out of Bound Error");
            }
            else {
                super.getPosition().move(super.getPosition().x-n,super.getPosition().y);
            }
        }
        if (direction.equals("down")){
            if(super.getPosition().x+7>0){
                System.out.println("Out Of Bound Error");
            }
            else{
                super.getPosition().move(super.getPosition().x+n,super.getPosition().y);
            }
        }
    }

    @Override
    public String toString() {
        return getName()+getColour()+"FF";
    }
}
