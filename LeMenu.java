/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetadher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author taserface
 */
public class LeMenu extends JMenuBar{  
    
/*  CONSTRUCTEUR PAR DEFAUT  */
  public LeMenu(){
    ActionListener afficherMenuListener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Elément de menu [" + event.getActionCommand()+"] utilisé.");
      }
    };
    
    /* Création des Menus  */
    
    // Création du menu Adherant
    JMenu Adherants = new JMenu("ADHERANTS");

    JMenuItem item = new JMenuItem("Ajout", 'A');
    item.addActionListener(afficherMenuListener);
    Adherants.add(item);

    item = new JMenuItem("Mise à jour Contrat", 'M');
    item.addActionListener(afficherMenuListener);
    Adherants.add(item);

    item = new JMenuItem("Supprimer", 'S');
    item.addActionListener(afficherMenuListener);
    //Adherants.insertSeparator(1);
    Adherants.add(item);

    item = new JMenuItem("Date fin Contrat",'D');
    item.addActionListener(afficherMenuListener);
    Adherants.add(item);

    item = new JMenuItem("Renouvellement Contrat",'R');
    item.addActionListener(afficherMenuListener);
    Adherants.add(item);

    /*  CREATION DU MENU CLIENT  */
    JMenu client = new JMenu("Client");
    
    item = new JMenuItem("Nouveau", 'N');
    item.addActionListener(afficherMenuListener);
    client.add(item);
    
    item = new JMenuItem("Afficher",'A');
    item.addActionListener(afficherMenuListener);
    client.add(item);

    /*  CREATION DU MENU INTERVENTION  */
    JMenu intervention = new JMenu("Intervention");
    
    item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    intervention.add(item);
    
    JMenu listeInterventions = new JMenu("Lister les interventions");
    
    item = new JMenuItem("En cours");
    listeInterventions.add(item);
    item.addActionListener(afficherMenuListener);
    
    item = new JMenuItem("Déjà éffectué");
    listeInterventions.add(item);
    item.addActionListener(afficherMenuListener);
    
    intervention.add(listeInterventions);
    //Adherants.add(item); 
    add(Adherants);
    add(client);
    add(intervention);


  }
  
}
