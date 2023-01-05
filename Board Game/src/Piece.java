import java.awt.*;

public class Piece {
   private String Name;
   private  String colour;
   private Point Position;

   /**
    *
    * @param Name
    * @param colour
    * @param position
    */

   public Piece( String Name, String colour, Point position){
      this.Name=Name;
      this.colour= colour;
      this.Position=position;


   }

   public Piece() {
   }

   public void setName(String name) {
      Name = name;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public void setPosition(Point position) {
      Position = position;
   }

   public String getName() {
      return Name;
   }

   public String getColour() {
      return colour;
   }
   public Point getPosition(){
      return new Point(Position);
   }

   @Override
   public String toString() {
      return getName()+getColour()+getPosition();

   }
}