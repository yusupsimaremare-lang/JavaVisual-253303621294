
package com.unpri.charactermanager;

import javax.swing.SwingUtilities;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        // Membuat Character Manager
        CharacterManager manager = new CharacterManager();

        // Menambahkan 7 karakter
        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
            new Character("Athena", CharacterType.ARCHER, 4)
        );

        manager.addCharacter(
            new Character("Elara", CharacterType.HEALER, 2)
        );

        manager.addCharacter(
            new Character("Gandalf", CharacterType.MAGE, 10)
        );

        manager.addCharacter(
            new Character("Gatotkaca", CharacterType.WARRIOR, 7)
        );

        manager.addCharacter(
            new Character("Morgana", CharacterType.MAGE, 1)
        );

        // Menjalankan GUI
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(
                manager.getAllCharacters(),
                manager.getAverageLevel()
            );

            window.setVisible(true);

        });
    }
}
