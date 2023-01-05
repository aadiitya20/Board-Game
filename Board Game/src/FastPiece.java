import java.awt.*;
import java.util.Scanner;

public class FastPiece extends SlowPiece{
    public FastPiece(String Name, String colour, Point position) {
        super(Name, colour, position);
    }

    /**
     * Taking input n from the user and it is basically showing the position if the limit crosses it pops Pot of Bond error
     * @param direction
     * @param n
     */


    public void move(String direction,int n){

        if (direction.equals("left")){
            if (super.getPosition().x-n<0){
                System.out.println("Out of Bound Error");
            }
            else {
                super.getPosition().move(super.getPosition().x-n,super.getPosition().y);
            }

        }
        if (direction.equals("right")){
            if (super.getPosition().x+n>7){
                System.out.println("Out of Bound Error");
            }
            else {
                super.getPosition().move(super.getPosition().x+n,super.getPosition().y);
            }
        }


    }
    public  String toString(){
        return getName()+getColour()+"F";
    }

}
