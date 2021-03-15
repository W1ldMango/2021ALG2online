package nshape.version2;

import java.util.Scanner;

/**
 * 
 * Test 4 0 0 2 0 2 2 0 2
 * @author JV
 */
public class NShapeApp {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        double[][] points = new double[n][2];
        System.out.println("Zadej souradnice");
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }
        
        NShape shape1 = new NShape(points);
        System.out.println(shape1);
        System.out.format("Obvod = %.2f%n",shape1.perim());
        System.out.format("Obsah = %.2f%n",shape1.area());
        
        System.out.println("");
        NShape shape2 = new NShape(); 
        System.out.println(shape2);
        shape2.add(0, 0);
        shape2.add(3, 0);
        shape2.add(3, 4);
        System.out.println(shape2);
        System.out.format("Obvod = %.2f%n",shape2.perim());
        System.out.format("Obsah = %.2f%n",shape2.area());
    }
    
}
