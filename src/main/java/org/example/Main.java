package org.example;

import org.example.listeners.MouseHandler;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main extends JFrame {
    JLabel title;
    JPanel mainPanel = new GradientPanel(new Color(0xFF8E8E), new Color(0x59CDFF), GradientPanel.DIAGONAL_FILL);
    JButton choice1 = new JButton("choice 1");
    JButton choice2 = new JButton("choice 2");
    JButton choice3 = new JButton("choice 3");
    JButton choice4 = new JButton("choice 4");
    MouseHandler mh = new MouseHandler();
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(600,400));
        this.setResizable(false);
        this.setTitle("hackathon");

        mainPanel.setLayout(null);
        this.add(mainPanel);

        title = new JLabel("Mental Health Choiceboard", JLabel.CENTER);
        title.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 26));
        title.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(0xB093E0), 4, true),
                "hi",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16),
                new Color(0xebddff)));
        title.setForeground(Color.white);

        setButtons(choice1);
        setButtons(choice2);
        setButtons(choice3);
        setButtons(choice4);


        mainPanel.add(title);
        mainPanel.add(choice1);
        mainPanel.add(choice2);
        mainPanel.add(choice3);
        mainPanel.add(choice4);


        title.setBounds(100, 20, 400, 75);
        choice1.setBounds(90, 115, 200, 100);
        choice2.setBounds(310, 115, 200, 100);
        choice3.setBounds(90, 235, 200, 100);
        choice4.setBounds(310, 235, 200, 100);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }

    private void setButtons(JButton button) {
        button.setActionCommand("Buy Tiles");
        button.setFocusable(false);
        button.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 32));
        button.setForeground(new Color(0xffffff));
        button.setContentAreaFilled(false);
        button.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
        button.addMouseListener(mh);
    }
}