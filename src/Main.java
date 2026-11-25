
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        // 1. Membuat CharacterManager
        CharacterManager manager = new CharacterManager();

        // 2. Menambahkan karakter lama
        manager.addCharacter(
                new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
                new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
                new Character("Athena", CharacterType.ARCHER, 4)
        );

        // 3. Menambahkan karakter Sprint 3
        manager.addCharacter(
                new Character("Laksmi", CharacterType.HEALER, 6)
        );

        manager.addCharacter(
                new Character("Bima", CharacterType.WARRIOR, 7)
        );

        // 4. Menambahkan karakter Sprint 5
        manager.addCharacter(
                new Character("Morgana", CharacterType.MAGE, 8)
        );

        manager.addCharacter(
                new Character("Ragnar", CharacterType.WARRIOR, 2)
        );

        manager.addCharacter(
                new Character("Freya", CharacterType.ARCHER, 6)
        );

        // 5. Menjalankan GUI melalui Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}
