package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import controle.GestionPageAjoutLocataire;

public class PageAjoutLocataire extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_4;
    private JTextField champNom;
    private JTextField champPrenom;
    private JTextField champTelephone;
    private JTextField champMail;
    private JTextField champAdresse;
    private JTextField champCodePostal;
    private JTextField champBatiment;
    private JTextField champEtage;
    private JTextField textField_9;
    private GestionPageAjoutLocataire gestionClic;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    PageAjoutLocataire frame = new PageAjoutLocataire();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PageAjoutLocataire() {
		this.gestionClic = new GestionPageAjoutLocataire(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel libInfoLocataire = new JLabel("Information sur le locataire");
		panel.add(libInfoLocataire, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(5, 5));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panelNom = new JPanel();
		panel_1.add(panelNom);

		JLabel libNom = new JLabel("Nom");
		libNom.setHorizontalAlignment(SwingConstants.LEFT);

		champNom = new JTextField();
		champNom.setHorizontalAlignment(SwingConstants.RIGHT);
		champNom.setColumns(10);
		panelNom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelNom.add(libNom);
		panelNom.add(champNom);

		JPanel panelPrenom = new JPanel();
		panel_1.add(panelPrenom);

		JLabel libPrenom = new JLabel("Prénom");
		libPrenom.setHorizontalAlignment(SwingConstants.LEFT);

		champPrenom = new JTextField();
		champPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		champPrenom.setColumns(10);
		panelPrenom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelPrenom.add(libPrenom);
		panelPrenom.add(champPrenom);

		JPanel panelTelephone = new JPanel();
		panel_1.add(panelTelephone);

		JLabel libTelephone = new JLabel("Télephone");
		panelTelephone.add(libTelephone);

		champTelephone = new JTextField();
		champTelephone.setColumns(10);
		panelTelephone.add(champTelephone);

		JPanel panelMail = new JPanel();
		panel_1.add(panelMail);

		JLabel libMail = new JLabel("Mail");
		panelMail.add(libMail);

		champMail = new JTextField();
		champMail.setColumns(10);
		panelMail.add(champMail);

		JPanel panelDateEntree = new JPanel();
		panel_1.add(panelDateEntree);

		JLabel libDateEntree = new JLabel("Date d'entrée");
		panelDateEntree.add(libDateEntree);

		JSpinner spinnerDate = new JSpinner();
		panelDateEntree.add(spinnerDate);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this.gestionClic);
		panel_2.add(btnAnnuler, BorderLayout.WEST);

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(this.gestionClic);
		panel_2.add(btnValider, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel libAjouterLocataire = new JLabel("Ajouter un nouveau locataire");
		libAjouterLocataire.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(libAjouterLocataire, BorderLayout.CENTER);

		JPanel panelLogementAssocie = new JPanel();
		contentPane.add(panelLogementAssocie, BorderLayout.EAST);
		panelLogementAssocie.setLayout(new BorderLayout(0, 0));

		JLabel libLogementAssocie = new JLabel("Logement associé");
		panelLogementAssocie.add(libLogementAssocie, BorderLayout.NORTH);

		JPanel panelInfosLogementAssocie = new JPanel();
		panelLogementAssocie.add(panelInfosLogementAssocie, BorderLayout.WEST);
		panelInfosLogementAssocie.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panelLogement = new JPanel();
		panelInfosLogementAssocie.add(panelLogement);
		panelLogement.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel Logement = new JLabel("Logement");
		panelLogement.add(Logement);

		JList list = new JList();
		panelLogement.add(list);

		JPanel panelAdresse = new JPanel();
		panelInfosLogementAssocie.add(panelAdresse);

		JLabel libAdresse = new JLabel("Adresse");
		panelAdresse.add(libAdresse);

		champAdresse = new JTextField();
		panelAdresse.add(champAdresse);
		champAdresse.setColumns(10);

		JPanel panelCodePostal = new JPanel();
		panelInfosLogementAssocie.add(panelCodePostal);

		JLabel libCodePostal = new JLabel("Code Postal");
		panelCodePostal.add(libCodePostal);

		champCodePostal = new JTextField();
		panelCodePostal.add(champCodePostal);
		champCodePostal.setColumns(10);

		JPanel panelBatiment = new JPanel();
		panelInfosLogementAssocie.add(panelBatiment);

		JLabel libBatiment = new JLabel("Batiment");
		panelBatiment.add(libBatiment);

		champBatiment = new JTextField();
		panelBatiment.add(champBatiment);
		champBatiment.setColumns(10);

		JPanel panelEtage = new JPanel();
		panelInfosLogementAssocie.add(panelEtage);

		JLabel libEtage = new JLabel("Etage");
		panelEtage.add(libEtage);

		champEtage = new JTextField();
		panelEtage.add(champEtage);
		champEtage.setColumns(10);

		JPanel panel_6 = new JPanel();
		panelLogementAssocie.add(panel_6, BorderLayout.SOUTH);

		textField_4 = new JTextField();
		panel_6.add(textField_4);
		textField_4.setColumns(10);

//		JPanel panel_7 = new JPanel();
//		panelLogementAssocied_4 = new JTextField();
//		panel_6.add(textField_4);
//		textField_4.setColumns(10);
//
//		JPanel panel_7 = new JPanel();
//		panel_4.add(panel_7, BorderLayout.EAST);
//		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//
//		JLabel lblNewLabel_7 = new JLabel("");
//		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sirfo\\Downloads\\179337 (3).png"));
//		panel_7.add(lblNewLabel_7);
		
		
	}

}
