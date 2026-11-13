
package com.unpri.charactermanager.view;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.unpri.charactermanager.model.Character;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private ArrayList<Character> characterList;
    private double averageLevel;

    // Batas level tinggi
    private static final int HIGH_LEVEL_THRESHOLD = 8;

    public MainWindow(ArrayList<Character> characterList,
                      double averageLevel) {

        super("Character Manager v0.4");

        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setSize(450, 500);
        setMinimumSize(new Dimension(420, 360));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {

        mainPanel = new JPanel(new GridLayout(0, 1, 0, 8));

        mainPanel.setBackground(AppTheme.BG_MAIN);

        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(16, 16, 16, 16)
        );

        mainPanel.add(createTitleLabel());

        // Menampilkan karakter secara dinamis
        for (Character c : characterList) {
            mainPanel.add(createCharacterLabel(c));
        }

        mainPanel.add(createFooterLabel());

        add(mainPanel);
    }

    // Judul aplikasi
    private JLabel createTitleLabel() {

        JLabel lbl = new JLabel(
            "Daftar Karakter (" + characterList.size() + ")",
            SwingConstants.CENTER
        );

        lbl.setFont(AppTheme.FONT_TITLE);
        lbl.setForeground(AppTheme.TEXT_MAIN);

        return lbl;
    }

    // Tampilan setiap karakter
    private JLabel createCharacterLabel(Character c) {

        String info = c.getName()
                    + " | " + c.getType()
                    + " | Lv." + c.getLevel()
                    + " | HP:" + c.getHitPoints()
                    + " | ATK:" + c.getAttackPower();

        JLabel lbl = new JLabel(info);

        lbl.setBackground(AppTheme.colorFor(c.getType()));
        lbl.setOpaque(true);
        lbl.setBorder(AppTheme.CARD_BORDER);

        String tooltipText =
            AppTheme.describe(c.getType())
            + " (HP: " + c.getHitPoints()
            + ", ATK: " + c.getAttackPower() + ")";

        lbl.setToolTipText(tooltipText);

        lbl.setCursor(
            Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
        );

        // Karakter dengan level tinggi
        if (c.getLevel() >= HIGH_LEVEL_THRESHOLD) {

            lbl.setForeground(AppTheme.GOLD);

            lbl.setFont(
                AppTheme.FONT_BODY.deriveFont(Font.BOLD)
            );

        } else {

            lbl.setForeground(AppTheme.TEXT_LIGHT);
            lbl.setFont(AppTheme.FONT_BODY);
        }

        return lbl;
    }

    // Statistik rata-rata level
    private JLabel createFooterLabel() {

        JLabel lbl = new JLabel(
            "Rata-rata Level: "
            + String.format("%.2f", averageLevel).replace('.', ','),
            SwingConstants.CENTER
        );

        lbl.setFont(AppTheme.FONT_MONO);
        lbl.setForeground(AppTheme.TEXT_MAIN);

        return lbl;
    }
}
