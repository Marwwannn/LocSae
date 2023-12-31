package modele.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import SQL.CictOracleDataSource;
import modele.Locataire;
import modele.dao.requetes.RequeteSelectLocataire;
import modele.dao.requetes.SousProgrammeInsertLocataire;

public class DaoLocataire extends DaoModele<Locataire> implements Dao<Locataire> {

	@Override
	public Collection<Locataire> findAll() throws SQLException {

		RequeteSelectLocataire sketuveux = new RequeteSelectLocataire();
		return find(sketuveux);

	}

	@Override
	public Locataire findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Locataire locataire) throws SQLException {
	    SousProgrammeInsertLocataire sousProgrammeInsertLocataire = new SousProgrammeInsertLocataire();
	    try (CallableStatement cs = CictOracleDataSource.getConnectionBD().prepareCall(sousProgrammeInsertLocataire.appelSousProgramme())) {
	        sousProgrammeInsertLocataire.parametres(cs, locataire);
	        cs.execute();
	    }
	}


	@Override
	public void delete(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	protected Locataire creerInstance(ResultSet curseur) throws SQLException {
		Locataire locataire = null;
		try {
			locataire = new Locataire(
					curseur.getString("ID_LOCATAIRE"),
					curseur.getString("NOM"),
					curseur.getString("PRENOM"),
					curseur.getString("TELEPHONE"),
					curseur.getString("MAIL"),
					curseur.getString("ADRESSE"),
					curseur.getString("CODE_POSTAL")
					);
		} catch (SQLException e) {
			// Handle the exception appropriately, e.g., log or throw a custom exception
			e.printStackTrace();
		}
		return locataire;
	}

}
