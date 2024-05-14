package Functional_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.SocketOption;

public class MyWindow {
    public static void main(String[] args) {
        //Window : Object JFrame
        JFrame frame=new JFrame("MyWindow");
        //fixed size of button
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        //create button and add jframe
        JButton button=new JButton("CLICK ME!!");

        //Ananomious class using lambda
        button.addActionListener(e-> {
            System.out.println("Button click!!");
            JOptionPane.showMessageDialog(null,"Hey, Button Click");


//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button click!!");
//                JOptionPane.showMessageDialog(null,"Hey, Button Click");
//            }
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
