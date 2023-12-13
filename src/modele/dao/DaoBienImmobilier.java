package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.BienImmobilier;

public class DaoBienImmobilier  extends DaoModele<BienImmobilier> implements Dao<BienImmobilier> {

	@Override
	public Collection<BienImmobilier> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BienImmobilier findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
    protected BienImmobilier creerInstance(ResultSet curseur) throws SQLException {
        // Récupérer les valeurs de la base de données
        String idBienImm = curseur.getString("Id_Bien_Imm");
        double surface = curseur.getDouble("Surface");
        String modeChauffage = curseur.getString("Mode_Chauffage");
        String modeEau = curseur.getString("Mode_Eau");
        int nbPiece = curseur.getInt("Nb_Piece");
        String typeBien = curseur.getString("Type_Bien");
        String nomProprio = curseur.getString("Nom_Proprio");
        String identifiant = curseur.getString("Identifiant");
        String etage = curseur.getString("Etage");
        String idBatiment = curseur.getString("Id_Batiment");

        // Créer et retourner une nouvelle instance de BienImmobilier
        BienImmobilier bienImmobilier = new BienImmobilier(idBienImm, surface, modeChauffage, modeEau, nbPiece, typeBien, nomProprio, identifiant, etage,idBatiment);
        

        return bienImmobilier;
    }
}
