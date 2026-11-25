package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import com.unpri.charactermanager.model.CharacterType;

public final class AppTheme {

    // Background colors
    public static final Color BG_MAIN = Color.decode("#13131F");
    public static final Color BG_PANEL = Color.decode("#1E1E30");
    public static final Color BG_CARD = Color.decode("#292941");
    public static final Color BG_STATUS = Color.decode("#1E1E30");

    // Text colors
    public static final Color TEXT_MAIN = Color.decode("#DFE6E9");
    public static final Color TEXT_LIGHT = Color.WHITE;
    public static final Color TEXT_MUTED = Color.decode("#B2BEC3");
    public static final Color GOLD = Color.decode("#FDCB6E");

    // Status colors
    public static final Color ERROR = Color.decode("#ff7675");
    public static final Color SUCCESS = Color.decode("#55efc4");

    // Character role colors
    public static final Color WARRIOR = Color.decode("#D63031");
    public static final Color MAGE = Color.decode("#0984E3");
    public static final Color ARCHER = Color.decode("#00B894");
    public static final Color HEALER = Color.decode("#6C5CE7");

    // Fonts
    public static final Font FONT_TITLE =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font FONT_BODY =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font FONT_BOLD =
            new Font("SansSerif", Font.BOLD, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 12);

    // Borders
    public static final Border PANEL_BORDER =
            BorderFactory.createEmptyBorder(15, 15, 15, 15);

    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(BG_CARD, 1),
                    BorderFactory.createEmptyBorder(10, 12, 10, 12)
            );

    // Get color based on character type
    public static Color colorFor(CharacterType type) {
        switch (type) {
            case WARRIOR:
                return WARRIOR;
            case MAGE:
                return MAGE;
            case ARCHER:
                return ARCHER;
            case HEALER:
                return HEALER;
            default:
                return Color.GRAY;
        }
    }

    // Get description based on character type
    public static String describe(CharacterType type) {
        switch (type) {
            case WARRIOR:
                return "Petarung dengan kemampuan serangan fisik";
            case MAGE:
                return "Penyihir dengan kemampuan sihir";
            case ARCHER:
                return "Pemanah dengan serangan jarak jauh";
            case HEALER:
                return "Penyembuh yang membantu memulihkan HP";
            default:
                return "Tipe karakter tidak diketahui";
        }
    }

    private AppTheme() {
    }
}