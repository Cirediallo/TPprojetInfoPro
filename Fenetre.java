/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetadher;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author taserface
 */
public class Fenetre extends JFrame {
    
    public Fenetre(String NomFen){
      // Listener générique qui affiche l'action du menu utilisé
  
      setJMenuBar(new LeMenu());
      setResizable(false);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLayout(new FlowLayout());
      setSize(700,700);
      setVisible(true);
    }
}
