package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.PageAjoutLocataire;

public class GestionPageAjoutLocataire implements ActionListener {

    private PageAjoutLocataire ajoutlocataire;

    public GestionPageAjoutLocataire(PageAjoutLocataire ajoutlocataire) {
        this.ajoutlocataire = ajoutlocataire;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;

            switch (button.getText()) {
                case "Valider":
                    break;
                case "Annuler":
                    ajoutlocataire.dispose();
                    break;
            }
        }
    }
}
