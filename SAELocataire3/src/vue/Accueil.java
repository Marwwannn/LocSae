package vue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.GestionAccueil;

public class Accueil extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private GestionAccueil gestionClic;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Accueil frame = new Accueil();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Accueil() {
        this.gestionClic = new GestionAccueil(this);
        setBackground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 1080);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Image image1 = new ImageIcon(this.getClass().getResource("/image7.jpeg")).getImage();

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("image/image7.jpeg"));
        lblNewLabel_2.setBounds(54, 84, 561, 245);
        contentPane.add(lblNewLabel_2);

        //JButton btnNewButton = new JButton("Générer nouvelle facture");
        //btnNewButton.setBounds(539, 339, 145, 27);
        //contentPane.add(btnNewButton);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(20, 30, 1200, 22);
        contentPane.add(menuBar);

        // Menu "Ajouter/Consulter locataire"
        JMenu mnNewMenu = new JMenu("Ajouter/Consulter locataire");
        menuBar.add(mnNewMenu);

        JMenuItem mntmAjouterLocataire = new JMenuItem("Ajouter locataire");
        mntmAjouterLocataire.addActionListener(this.gestionClic);
        mnNewMenu.add(mntmAjouterLocataire);

        //JMenuItem mntmConsulterLocataire = new JMenuItem("Consulter locataire");
        //mntmConsulterLocataire.addActionListener(this.gestionClic);
        //mnNewMenu.add(mntmConsulterLocataire);

        // Menu "Ajouter/Consulter Logement"
        JMenu mnNewMenu_1 = new JMenu("Ajouter/Consulter Logement");
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmAjouterLogement = new JMenuItem("Ajouter logement");
        mntmAjouterLogement.addActionListener(this.gestionClic);
        mnNewMenu_1.add(mntmAjouterLogement);

        JMenuItem mntmConsulterLogement = new JMenuItem("Consulter logement");
        mntmConsulterLogement.addActionListener(this.gestionClic);
        mnNewMenu_1.add(mntmConsulterLogement);

        //Menu "Consulter historique locataire"
        JMenu mnNewMenu_2 = new JMenu("Consulter liste locataires");
        menuBar.add(mnNewMenu_2);

        JMenuItem mntmConsultation = new JMenuItem("Liste des locataires");
        mntmConsultation.addActionListener(this.gestionClic);
        mnNewMenu_2.add(mntmConsultation);

        // Menu "Gestion facture"
        JMenu mnNewMenu_3 = new JMenu("Gestion facture");
        menuBar.add(mnNewMenu_3);
        
        JMenuItem mntmGestionFacture = new JMenuItem("Gestion factures");
        mntmGestionFacture.addActionListener(this.gestionClic);
        mnNewMenu_3.add(mntmGestionFacture);

        // Menu "Detail propriétés"
        //JMenu mnNewMenu_4 = new JMenu("Detail propriétés");
        //mnNewMenu_4.addActionListener(this.gestionClic);
        //menuBar.add(mnNewMenu_4);

        JLabel lblNewLabel = new JLabel("Gestion de bien immobilier");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setBounds(298, 109, 297, 54);
        contentPane.add(lblNewLabel);
        
        JMenu mnNewMenu_4 = new JMenu("Connexion");
        menuBar.add(mnNewMenu_4);
    }

    public void actionPerformed(ActionEvent e) {
        gestionClic.actionPerformed(e);
    }
}
//testBordel
