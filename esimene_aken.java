package projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;


public class esimene_aken implements ActionListener{

    //public static void main(String[] args) {algus();}
    JFrame frame = new JFrame("Hammer time!");

    esimene_aken() {

        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.PAGE_START;

        JLabel ope = new JLabel("Mängu juhised: ", SwingConstants.CENTER);
        mainPanel.add(ope, gbc);



        gbc.gridx = 0;
        gbc.gridy = 2;

        JLabel parem = new JLabel("Parem hiireklõps - valid vahendi, millega edasi toimida.", SwingConstants.CENTER);
        mainPanel.add(parem, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;

        JLabel vasak = new JLabel("Vajuta vasakut hiireklahvi, et valitud vahendit rakendada.", SwingConstants.CENTER);
        mainPanel.add(vasak, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel eesmärk = new JLabel("Mängu eesmärk on stressi maandamine.", SwingConstants.CENTER);
        mainPanel.add(eesmärk, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;


        JButton start = new JButton("Alusta mängu!");
        mainPanel.add(start, gbc);

        mainPanel.add(Box.createRigidArea(new Dimension(150, 300)));


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        start.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        frame.dispose();

    }
}
