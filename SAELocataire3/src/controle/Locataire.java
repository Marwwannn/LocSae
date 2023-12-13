package controle;

public class Locataire {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String adresse;
    private String codePostal;

    public Locataire(String nom, String prenom, String telephone, String email, String adresse, String codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
        this.codePostal = codePostal;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }
}
