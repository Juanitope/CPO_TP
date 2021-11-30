/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp3_superpuissance_douillet_tall;
/**
 *
 * @author douil
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    Joueur[] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grilledeJeu = new Grille() ;
    
    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
        PannelInfoJoueur.setVisible(false);
        PannelInfoPartie.setVisible(false);
       
        for (int i=5 ; i>=0 ; i--){
            for (int j=0 ; j<7 ; j++){
                CelluleGraphiique cellGraph = new CelluleGraphiique(grilledeJeu.CellulesduJeu[i][j]);
                PannelGrille.add(cellGraph);
                
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannelGrille = new javax.swing.JPanel();
        PannelInfoPartie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        PannelCréationPartie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomjoueur2 = new javax.swing.JTextField();
        nomjoueur1 = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        PannelInfoJoueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        d2 = new javax.swing.JLabel();
        nj1 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nj2 = new javax.swing.JLabel();
        bouton6 = new javax.swing.JButton();
        bouton0 = new javax.swing.JButton();
        boutin1 = new javax.swing.JButton();
        bouton2 = new javax.swing.JButton();
        bouton3 = new javax.swing.JButton();
        bouton4 = new javax.swing.JButton();
        bouton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PannelGrille.setBackground(new java.awt.Color(0, 0, 255));
        PannelGrille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(PannelGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 672, 576));

        PannelInfoPartie.setBackground(new java.awt.Color(255, 128, 0));
        PannelInfoPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("ROG Fonts", 1, 11)); // NOI18N
        jLabel10.setText("Infos Jeu");
        PannelInfoPartie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setText("Joueur Courant : ");
        PannelInfoPartie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jcourant.setText("nomjoueur");
        PannelInfoPartie.add(jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        PannelInfoPartie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 150));
        PannelInfoPartie.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 10));

        getContentPane().add(PannelInfoPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 200, 250));

        PannelCréationPartie.setBackground(new java.awt.Color(255, 128, 0));
        PannelCréationPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom du joueur 2 :");
        PannelCréationPartie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setText("Nom du joueur 1 :");
        PannelCréationPartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        nomjoueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomjoueur2ActionPerformed(evt);
            }
        });
        PannelCréationPartie.add(nomjoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        nomjoueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomjoueur1ActionPerformed(evt);
            }
        });
        PannelCréationPartie.add(nomjoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        start.setBackground(new java.awt.Color(0, 0, 240));
        start.setFont(new java.awt.Font("ROG Fonts", 1, 11)); // NOI18N
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        PannelCréationPartie.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        getContentPane().add(PannelCréationPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 200, 120));

        PannelInfoJoueur.setBackground(new java.awt.Color(255, 128, 0));
        PannelInfoJoueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("ROG Fonts", 1, 11)); // NOI18N
        jLabel3.setText("Info Joueurs");
        PannelInfoJoueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 20));

        jLabel5.setText("Jouer 1");
        PannelInfoJoueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setText("Couleur");
        PannelInfoJoueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setText("Désintegrateurs");
        PannelInfoJoueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel8.setText("Couleur");
        PannelInfoJoueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setText("Désintegrateurs");
        PannelInfoJoueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        PannelInfoJoueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 10));
        PannelInfoJoueur.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 10));

        d2.setText("desintegrateur2");
        PannelInfoJoueur.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        nj1.setText("nomjoueur1");
        PannelInfoJoueur.add(nj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        c1.setText("couleur1");
        PannelInfoJoueur.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        d1.setText("desintegrateur1");
        PannelInfoJoueur.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        c2.setText("couleur2");
        PannelInfoJoueur.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel11.setText("Joueur 2");
        PannelInfoJoueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        nj2.setText("nomjoueur2");
        PannelInfoJoueur.add(nj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        getContentPane().add(PannelInfoJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 200, 210));

        bouton6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton6.setText("7");
        bouton6.setToolTipText("");
        getContentPane().add(bouton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 50, 50, 40));

        bouton0.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton0.setText("1");
        getContentPane().add(bouton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 40));

        boutin1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        boutin1.setText("2");
        getContentPane().add(boutin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 50, 50, 40));

        bouton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton2.setText("3");
        getContentPane().add(bouton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 50, 50, 40));

        bouton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton3.setText("4");
        getContentPane().add(bouton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 50, 50, 40));

        bouton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton4.setText("5");
        bouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton4ActionPerformed(evt);
            }
        });
        getContentPane().add(bouton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 50, 50, 40));

        bouton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bouton5.setText("6");
        getContentPane().add(bouton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 50, 40));

        jLabel12.setFont(new java.awt.Font("ROG Fonts", 1, 24)); // NOI18N
        jLabel12.setText("SUPER PUISSANCE 4");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 450, -1));

        setBounds(0, 0, 936, 775);
    }// </editor-fold>//GEN-END:initComponents

    private void nomjoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomjoueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomjoueur1ActionPerformed

    private void bouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouton4ActionPerformed

    private void nomjoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomjoueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomjoueur2ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        PannelInfoJoueur.setVisible(true);
        PannelInfoPartie.setVisible(true);
        PannelCréationPartie.setVisible(false);
        //attribuerCouleursAuxJoueurs();
        initialiserPartie();
        
        PannelGrille.repaint();
                    // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FenetreDeJeu().setVisible(true);
        });
    }
    public void attribuerCouleursAuxJoueurs(){
       int [] variablepossible = {0,1};
       int random;
       random = variablepossible [(int) (Math.random()* variablepossible.length)];
       if (random==0){
       ListeJoueurs[0].Couleur = "Rouge";
       ListeJoueurs[1].Couleur = "Jaune";
       }
       else {
           ListeJoueurs[1].Couleur = "Rouge";
           ListeJoueurs[0].Couleur = "Jaune";
       }
    }
    public void initialiserPartie(){ // Création de la grille et des jetons + Initialisation des paramètres joueurs
        
        grilledeJeu= new Grille();
        String nomjoueur0 = nomjoueur1.getText();
        Joueur Joueur0 =new Joueur(nomjoueur0);
        String nomjoueur3 = nomjoueur2.getText();
        Joueur Joueur1 =new Joueur(nomjoueur3);
        
        nj1.setText(nomjoueur0);
        c1.setText(Joueur0.Couleur);
        d1.setText(Joueur0.nombreDesintegrateurs+"");
        nj2.setText(nomjoueur3);
        c2.setText(Joueur1.Couleur);
        d2.setText(Joueur1.nombreDesintegrateurs+"");
        
        
        //donner les jetons aux joueur 

        for (int i = 0; i < 21; i++){
            Jeton Jaune = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterjeton(Jaune);
            Jeton Rouge = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[1].ajouterjeton(Rouge);

        }
        //Jeton listeJetons[] = new Jeton[21];
        
        
        //grilledeJeu.afficherGrilleSurConsole();

        //Joueur commencant aléatoire
        int[] choice ={0,1};
        int aleatoire;
        aleatoire = choice[(int) (Math.random() * choice.length)];
        if (aleatoire==0){
            joueurCourant = ListeJoueurs[0];
            
        }else{
            joueurCourant = ListeJoueurs[1];
        }
        
       jcourant.setText(joueurCourant.Nom);
        
        int[] choixcol ={0,1,2,3,4,5};
        int aleacol;
        int[] choixlin ={0,1,2,3,4,5,6};
        int alealin;
        int i = 0;
        while (i < 2) {

            aleacol = choixcol[(int) (Math.random() * choixcol.length)];    //tirer aleatoirement un entier
            alealin = choixlin[(int) (Math.random() * choixlin.length)];
            if ((grilledeJeu.CellulesduJeu[aleacol][alealin].trouNoir == false) && (grilledeJeu.CellulesduJeu[aleacol][alealin].presenceDesintegrateur() == false)) {
                grilledeJeu.placerDesintegrateur(aleacol, alealin);
                i += 1;
            }

        }
        int j = 0;

        while (j < 3) {

            aleacol = choixcol[(int) (Math.random() * choixcol.length)];    //tirer aleatoirement un entier
            alealin = choixlin[(int) (Math.random() * choixlin.length)];
            if ((grilledeJeu.CellulesduJeu[aleacol][alealin].trouNoir == false) && (grilledeJeu.CellulesduJeu[aleacol][alealin].presenceDesintegrateur() == false)) {
                grilledeJeu.placerDesintegrateur(aleacol, alealin);
                j += 1;
            }
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelCréationPartie;
    private javax.swing.JPanel PannelGrille;
    private javax.swing.JPanel PannelInfoJoueur;
    private javax.swing.JPanel PannelInfoPartie;
    private javax.swing.JButton boutin1;
    private javax.swing.JButton bouton0;
    private javax.swing.JButton bouton2;
    private javax.swing.JButton bouton3;
    private javax.swing.JButton bouton4;
    private javax.swing.JButton bouton5;
    private javax.swing.JButton bouton6;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel nj1;
    private javax.swing.JLabel nj2;
    private javax.swing.JTextField nomjoueur1;
    private javax.swing.JTextField nomjoueur2;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
