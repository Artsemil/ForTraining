package robot;

import java.util.ArrayList;

public class Robot {
    private double x;
    private double y;
    protected double course = 0;
    private ArrayList<RobotLine> robotLines = new ArrayList<RobotLine>();

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void forward(int distance) {
        final double xOld = x;
        final double yOld = y;
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        robotLines.add(new RobotLine(xOld, yOld, x, y));
    }

    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getRobotLines() {
        return robotLines;
    }
}
