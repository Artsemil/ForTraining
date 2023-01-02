package robot;

import javax.swing.*;

public class RobotManager {
    public static void main(String[] args) {

        final int COUNT = 12;
        final int SIDE = 600 / COUNT;
        final int alfa = 360 / COUNT / 2;
        Robot robot = new Robot(50, 100);
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() - 2 * alfa);
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / (double) COUNT + 2 * alfa);
        }

        // Создаем форму для отрисовки пути нашего робота
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
