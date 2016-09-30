package classReader;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Written by SCurley on 9/27/2016.
 */
public class Menu extends JFrame
{
    private JButton addStudent;
    private JPanel main;
    private JButton removeStudent;
    private JButton viewClass;
    private JButton viewStudent;
    private JButton closeProgram;
    private Class c = new Class();
    private static HashMap<String, Student> students = new HashMap<String, Student>();

    public Menu() {
        addStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    AddStudent.run();
                }
            }
        });
        removeStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    c.removeStudent();
                }
            }
        });
        viewClass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    c.printAll();
                }
            }
        });
        viewStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    c.printStudent();
                }
            }
        });

        closeProgram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){

                }
            }
        });
    }

    public static void setMap(String name, String address, String phone, String major){
        students.put(name, new Student(name, address, phone, major));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
