package forTraining.collection;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.swing.*;

public class PropertiesExample extends JFrame {
    public PropertiesExample() {

        try {
            Properties properties = new Properties();
            properties.load(new FileReader("simple.properties"));
            String upText = properties.getProperty("up.button.title");
            String dnText = properties.getProperty("dn.button.title");
            JButton up = new JButton(upText);
            JButton dn = new JButton(dnText);
            add(up, BorderLayout.NORTH);
            add(dn, BorderLayout.SOUTH);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        setBounds(200, 200, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PropertiesExample pe = new PropertiesExample();
    }

}
