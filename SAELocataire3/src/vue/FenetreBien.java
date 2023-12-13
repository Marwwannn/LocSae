package vue;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controle.GestionFenetreBien;

public class FenetreBien extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textFieldAdresse;
    private JTextField textFieldCodePostal;
    private JTextField textFieldBatiment;
    private JTextField textFieldEtage;
    private JTextField textFieldDescription;

    private JTextField textFieldNumeroPolice;
    private JTextField textFieldTarifInitial;
    private JTextField textFieldTypeAssurance;
    private JTextField textFieldDateDebut;

    private JTable tableLocataires;
    private JPanel panelButton;
    private JButton btnAnnuler;
    private GestionFenetreBien gestionClic;
    

    public FenetreBien() {
    	this.gestionClic = new GestionFenetreBien(this);
        setTitle("Gestion de Logement");
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setSize(800, 400);

        // Panel principal avec BorderLayout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        getContentPane().add(panel);

        // Panel Adresse avec GridLayout
        JPanel panelAdresse = new JPanel(new GridLayout(5, 2, 5, 5));
        panel.add(panelAdresse, BorderLayout.NORTH);

        panelAdresse.add(new JLabel("Adresse:"));
        textFieldAdresse = new JTextField(10);
        panelAdresse.add(textFieldAdresse);

        panelAdresse.add(new JLabel("Code Postal:"));
        textFieldCodePostal = new JTextField(5);
        panelAdresse.add(textFieldCodePostal);

        panelAdresse.add(new JLabel("Bâtiment:"));
        textFieldBatiment = new JTextField(3);
        panelAdresse.add(textFieldBatiment);

        panelAdresse.add(new JLabel("Étage:"));
        textFieldEtage = new JTextField(3);
        panelAdresse.add(textFieldEtage);

        panelAdresse.add(new JLabel("Description:"));
        textFieldDescription = new JTextField(20);
        panelAdresse.add(textFieldDescription);

        // Panel Locataires à droite avec BorderLayout
        JPanel panelLocataires = new JPanel(new BorderLayout());
        panel.add(panelLocataires, BorderLayout.EAST);

        JLabel lblHistoriqueDesLocataires = new JLabel("Historique des Locataires");
        lblHistoriqueDesLocataires.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelLocataires.add(lblHistoriqueDesLocataires, BorderLayout.NORTH);

        // Tableau des locataires avec JScrollPane
        tableLocataires = new JTable(new DefaultTableModel(
                new Object[][] {
                        {"Locataire 1", "Date début 1", "Date fin 1"},
                        {"Locataire 2", "Date début 2", "Date fin 2"},
                },
                new String[] {
                        "Nom", "Date Début", "Date Fin"
                }
        ));
        JScrollPane scrollPane = new JScrollPane(tableLocataires);
        panelLocataires.add(scrollPane, BorderLayout.CENTER);

        // Panel Assurance avec GridLayout à droite
        JPanel panelAssurance = new JPanel(new GridLayout(0, 1, 5, 5));
        panel.add(panelAssurance, BorderLayout.CENTER);

        JLabel lblAssurance = new JLabel("Assurance");
        lblAssurance.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelAssurance.add(lblAssurance);

        panelAssurance.add(new JLabel("Numéro de Police"));
        textFieldNumeroPolice = new JTextField(10);
        panelAssurance.add(textFieldNumeroPolice);

        panelAssurance.add(new JLabel("Tarif Initial"));
        textFieldTarifInitial = new JTextField(5);
        panelAssurance.add(textFieldTarifInitial);

        panelAssurance.add(new JLabel("Type d'Assurance"));
        textFieldTypeAssurance = new JTextField(10);
        panelAssurance.add(textFieldTypeAssurance);

        panelAssurance.add(new JLabel("Date d'Effet (Début)"));
        textFieldDateDebut = new JTextField(10);
        panelAssurance.add(textFieldDateDebut);
        
        panelButton = new JPanel();
        panel.add(panelButton, BorderLayout.SOUTH);
                
        btnAnnuler = new JButton("Annuler");
        btnAnnuler.addActionListener(this.gestionClic);
        panelButton.add(btnAnnuler);
        
        // Bouton Valider en bas
        JButton btnValider = new JButton("Valider");
        btnValider.setHorizontalAlignment(SwingConstants.RIGHT);
        panelButton.add(btnValider);

    }

    public static void main(String[] args) {
        FenetreBien frame = new FenetreBien();
        frame.setVisible(true);
    }
}
