
package com.unpri.charactermanager;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        // Data karakter
        characters.add(new Character(
            "Arjuna", CharacterType.WARRIOR, 5));

        characters.add(new Character(
            "Merlin", CharacterType.MAGE, 3));

        characters.add(new Character(
            "Athena", CharacterType.ARCHER, 4));

        characters.add(new Character(
            "Elara", CharacterType.HEALER, 2));

        characters.add(new Character(
            "Gandalf", CharacterType.MAGE, 10));

        characters.add(new Character(
            "Gatotkaca", CharacterType.WARRIOR, 7));

        characters.add(new Character(
            "Thor", CharacterType.TANK, 5));

        characters.add(new Character(
            "Robin", CharacterType.ARCHER, 2));

        // Jalankan aplikasi
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(characters);

            window.setVisible(true);

        });
    }
}
