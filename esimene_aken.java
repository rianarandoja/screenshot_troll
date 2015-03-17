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

    JFrame frame = new JFrame("Hammer time!");

    esimene_aken() {

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;

        JLabel ope = new JLabel("Mängu juhised: ", SwingConstants.CENTER);
        mainPanel.add(ope, gbc);

        JLabel üks = new JLabel("           "); mainPanel.add(üks, gbc);

        JLabel eesmärk = new JLabel("Mängu eesmärk on stressi maandamine.", SwingConstants.CENTER);
        mainPanel.add(eesmärk, gbc);

        JLabel kolm = new JLabel("           "); mainPanel.add(kolm, gbc);

        JLabel parem = new JLabel("     Et valida vahendit, millega edasi toimida, kliki numbriklahvidel 1 - ....     ", SwingConstants.CENTER);
        mainPanel.add(parem, gbc);

        JLabel kaks = new JLabel("           "); mainPanel.add(kaks, gbc);

        JLabel vasak = new JLabel("Vajuta vasakut hiireklahvi, et valitud vahendit rakendada.", SwingConstants.CENTER);
        mainPanel.add(vasak, gbc);

        JLabel neli = new JLabel("           "); mainPanel.add(neli, gbc);

        JButton start = new JButton("Alusta mängu!");
        mainPanel.add(start, gbc);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        start.addActionListener(this);}

    public void actionPerformed(ActionEvent e){frame.dispose();}}
