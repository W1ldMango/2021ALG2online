package point;

/**
 * Library class - knihovní třída, sada statických metod
 * @author JV
 */
public class PointTools {
    
    private PointTools(){
        
    }
    
    public static double calculateDistaceBetween(Point a, Point b){
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }
}
