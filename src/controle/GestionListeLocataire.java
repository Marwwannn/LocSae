package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import SQL.CictOracleDataSource;
import modele.Locataire;
import modele.dao.DaoLocataire;
import vue.FenetreListeLocataire;

public class GestionListeLocataire implements ActionListener {

    private FenetreListeLocataire listeLocataire;
    private DaoLocataire daoLocataire;

    public GestionListeLocataire(FenetreListeLocataire listeLocataire) {
        this.listeLocataire = listeLocataire;
        this.daoLocataire = new DaoLocataire();
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;

            switch (button.getText()) {
                case "Voir le bien immobilier concerné":
                	break;
			case "Modifier":
				try {
					this.afficherLocataire();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}   

                    break;
                case "Supprimer":
                    // Code pour la suppression du locataire
                    break;
                case "Annuler":
                    listeLocataire.dispose();
                    break;
            }
        }
    }
    
    public void afficherLocataire() throws SQLException {
        Collection<Locataire> locataires = daoLocataire.findAll();
        DefaultTableModel tableModel = (DefaultTableModel) listeLocataire.getTable().getModel();

        // Clear existing data from the table model
        tableModel.setRowCount(0);

        // Populate the table model with data
        int ligne = 0;
        for (Locataire loc : locataires) {
            if (tableModel.getRowCount() <= ligne) {
                // Add a new row if needed
                tableModel.addRow(new Object[0]);
            }

            tableModel.setValueAt(loc.getNom(), ligne, 0);
            tableModel.setValueAt(loc.getPrenom(), ligne, 1);
            tableModel.setValueAt(loc.getTelephone(), ligne, 2);
            tableModel.setValueAt(loc.getMail(), ligne, 3);
            tableModel.setValueAt(loc.getAdresse(), ligne, 4);
            tableModel.setValueAt(loc.getCode_Postal(), ligne, 5);

            ligne++;
        }
    }





//    public void ecrireLigneTable(int numeroLigne, Locataire loc) {
//        if (numeroLigne != -1) {
//            this.listeLocataire.getTable().setValueAt(loc.getNom(), numeroLigne, 0);
//            this.listeLocataire.getTable().setValueAt(loc.getPrenom(), numeroLigne, 1);
//            this.listeLocataire.getTable().setValueAt(loc.getTelephone(), numeroLigne, 2);
//            this.listeLocataire.getTable().setValueAt(loc.getMail(), numeroLigne, 3);
//            this.listeLocataire.getTable().setValueAt(loc.getAdresse(), numeroLigne, 4);
//            this.listeLocataire.getTable().setValueAt(loc.getCode_Postal(), numeroLigne, 5);
//        }       
//    }
}
