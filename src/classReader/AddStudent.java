package classReader;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Written by SCurley on 9/29/2016.
 */
public class AddStudent extends Menu{
    private JTextField name;
    private JPanel panel1;
    private JTextField address;
    private JTextField phoneNumber;
    private JTextField major;
    private JButton acceptButton;
    private JButton cancelButton;
    private JTextArea Label1;
    private JTextArea Label2;
    private JTextArea Label3;
    private JTextArea Label4;

    public AddStudent() {
        acceptButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setSuperMap(name.getText(), address.getText(), phoneNumber.getText(), major.getText());
                AddStudent.this.dispose();
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddStudent.this.dispose();
                ;
            }
        });
    }

    public void setSuperMap(String name, String address, String phone, String major){
        Menu.setMap(name, address, phone, major);

    }

    public static void run() {
        JFrame frame = new JFrame("AddStudent");
        frame.setContentPane(new AddStudent().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
