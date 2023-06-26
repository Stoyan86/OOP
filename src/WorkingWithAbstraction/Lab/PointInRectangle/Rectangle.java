package WorkingWithAbstraction.Lab.PointInRectangle;

public class Rectangle {
   private int bottomLeftX;
   private int bottomLeftY;

   private int bottomRightX;
   private int bottomRightY;

    public Rectangle(int bottomLeftX, int bottomLeftY, int bottomRightX, int bottomRightY) {
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.bottomRightX = bottomRightX;
        this.bottomRightY = bottomRightY;
    }

    public boolean contains(Point point){
        boolean isPointAInside = this.bottomLeftX <= point.getPointA() && this.bottomRightX >= point.getPointA();
        boolean isPointBinside = this.bottomLeftY <= point.getPointB() && this.bottomRightY >= point.getPointB();
        if (isPointBinside && isPointAInside){
            return true;
        }
        return false;
    }

}
