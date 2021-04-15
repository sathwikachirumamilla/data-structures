/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.solutions.arrays;

import java.lang.reflect.Constructor;

/**
 *
 * @author SujanChirumamilla
 */
class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class RectangleOverlapping {

    public static boolean checkOverlapRectangle(Point s, Point p, Point s1, Point p1) {

        // for y-axis
        if (s.y < p1.y || s1.y < p.y) {
            return false;
        }

        if (s.x > s1.x || p.x > p1.x) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        Point s = new Point(0,10);
        Point p= new Point(10,0);
        
        Point s1= new Point(5,5);
        Point p1 = new Point(15,0);
        
        if(checkOverlapRectangle(s, p, s1, p1)){
            System.out.println("Rectangles overlappings");
        }else{
            System.out.println("Rectangles are not overlapping");
        }
       
    }

}
