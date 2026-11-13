
package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import com.unpri.charactermanager.model.CharacterType;

/**
 * Pusat gaya tampilan Character Manager.
 */
public final class AppTheme {

    // ---------- Palet warna ----------
    public static final Color BG_MAIN =
            Color.decode("#13131f");

    public static final Color BG_STATUS =
            Color.decode("#1e1e2e");

    public static final Color TEXT_MAIN =
            Color.decode("#dfe6e9");

    public static final Color TEXT_LIGHT =
            Color.WHITE;

    public static final Color TEXT_MUTED =
            Color.decode("#a0a0b0");

    public static final Color GOLD =
            Color.decode("#fdcb6e");

    // ---------- Statistik ----------
    public static final int HIGH_LEVEL_THRESHOLD = 5;

    // ---------- Font ----------
    public static final Font FONT_TITLE =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font FONT_BODY =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 13);

    // ---------- Border ----------
    public static final Border CARD_BORDER =
            BorderFactory.createEmptyBorder(8, 12, 8, 12);

    // Konstruktor private
    private AppTheme() {
    }

    // ---------- Warna berdasarkan Role ----------
    public static Color colorFor(CharacterType type) {

        switch (type) {

            case WARRIOR:
                return Color.decode("#d63031");

            case MAGE:
                return Color.decode("#0984e3");

            case ARCHER:
                return Color.decode("#00b894");

            default:
                return Color.GRAY;
        }
    }

    // ---------- Deskripsi Role ----------
    public static String describe(CharacterType type) {

        switch (type) {

            case WARRIOR:
                return "Warrior: jarak dekat, HP tinggi";

            case MAGE:
                return "Mage: serangan sihir, HP rendah";

            case ARCHER:
                return "Archer: jarak jauh, seimbang";

            default:
                return "Role belum terdaftar";
        }
    }
}
