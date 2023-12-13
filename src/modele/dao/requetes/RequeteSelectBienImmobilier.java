package modele.dao.requetes;

import modele.BienImmobilier;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RequeteSelectBienImmobilier extends Requete<BienImmobilier> {
    @Override
    public String requete() {
        return "SELECT * FROM Bien_Immobilier";
    }

    @Override
    public void parametres(PreparedStatement prSt, String... id) throws SQLException {
        // Empty body, as there are no parameters for this query
    }

    @Override
    public void parametres(PreparedStatement prSt, BienImmobilier donnee) throws SQLException {
        // Empty body, as there are no parameters for this query
    }
}
