/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author NGSi
 */
 public class snail extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
public boolean isIdentificateur(String str)
        {
            char e = str.charAt(0);
             if(!Character.isLetter(e))
             {
                return false ;
             }
             for(int i=1;i<str.length();i++)
             {
                 char c = str.charAt(i);
                 if(!Character.isLetter(c) && !Character.isDigit(c)){
                     if(c != '_'){
                         return false ;
                         }
                     else{
                         if(i+1>=str.length()){
                             return false;
                         }
                         else{
                            i++;
                            c = str.charAt(i);
                            if(c == '_'){
                                return false;
                            }
                         }
                     }
                 }         
             }
             return true ;
        }
     boolean ent ;
static boolean isint(String str) 
    { 
        byte [] bytes = str.getBytes();
        for (int n = 0; n < bytes.length; n++) {
          if ( ! Character.isDigit((char)bytes[n])) return false;
        }
        return true;
    }
    String tmp [];
    
boolean isFloat(String str)
    {
            try{
            Float.parseFloat(str);
        }catch(NumberFormatException e){
            return false;
        }
            return true;
    }

    String chemin;
    boolean symbole(String str) {
		boolean bool =true;
		if (str.length()>2) {
			bool =false;
		}
		
			if("<".equals(str)|| ">".equals(str)|| "<=".equals(str) || ">=".equals(str)  || "==".equals(str)) {
				
			}
			else {
				bool =false;
			}
		
		
		return bool;
		
	}
    /**
     * Creates new form snail
     */
    public snail() {
        initComponents();
        setResizable(false);
        setLocation(250, 100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Charger_un_fichier = new javax.swing.JButton();
        Syntaxe = new javax.swing.JButton();
        Sémantique = new javax.swing.JButton();
        Lexique = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setText("nom de fichier");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 50, 190, 20);

        Charger_un_fichier.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Charger_un_fichier.setText("CHARGER LE FICHIER");
        Charger_un_fichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Charger_un_fichierActionPerformed(evt);
            }
        });
        jPanel1.add(Charger_un_fichier);
        Charger_un_fichier.setBounds(10, 40, 150, 40);

        Syntaxe.setText("A.SYNTAXIQUE");
        Syntaxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyntaxeActionPerformed(evt);
            }
        });
        jPanel1.add(Syntaxe);
        Syntaxe.setBounds(10, 230, 150, 40);

        Sémantique.setText("A.SEMENTIQUE");
        Sémantique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SémantiqueActionPerformed(evt);
            }
        });
        jPanel1.add(Sémantique);
        Sémantique.setBounds(10, 320, 150, 40);

        Lexique.setText("A.LEXICAL");
        Lexique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LexiqueActionPerformed(evt);
            }
        });
        jPanel1.add(Lexique);
        Lexique.setBounds(10, 140, 150, 40);

        Result.setColumns(20);
        Result.setRows(5);
        Result.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Result);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(416, 6, 380, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniprojet/snailm.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-6, -6, 830, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Charger_un_fichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Charger_un_fichierActionPerformed
 JFileChooser chooser =new JFileChooser();
      chooser.showOpenDialog(null);
File f = chooser.getSelectedFile();
   String path;
   chemin = f.getAbsolutePath();
        jLabel2.setText(chemin);       
        try {
    
     BufferedReader br = new BufferedReader(new FileReader(f));
     String str = br.readLine();
      
    } catch (FileNotFoundException ex) {
        Logger.getLogger(snail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(snail.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_Charger_un_fichierActionPerformed

    private void LexiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LexiqueActionPerformed
       Result.setText("");
        Path path = Paths.get(chemin);
        try {  
            
            List<String> lignes = Files.readAllLines(path, Charset.forName("ISO-8859-1"));
            
            for (String ligne : lignes){
                ligne=ligne.replace("<"," < ");
                ligne=ligne.replace(" , ",",");
                ligne=ligne.replace(", ",",");
                ligne=ligne.replace(" ,",",");
                ligne=ligne.replace("="," = ");
                ligne=ligne.replace("="," = ");
                String mot[] = ligne.split("( )|(,)");
               
                for(int i=0; i<mot.length; i++)
                { 
                    switch(mot[i]) 
                    { 
                        case "Snl_Start": 
                           Result.append("Snl_Start:Mot réservé début du programme\n"); 
                            break; 
                        case "Snl_Int": 
                            Result.append("Snl_Int    :Mot réservé pour déclaration d'un entier\n"); 
                            break; 
                        case "Snl_Real": 
                            Result.append("Snl_Real    :Mot réservé pour déclaration d'un réel\n"); 
                            break; 
                        case "Snl_Close": 
                            Result.append("Snl_Close   :Mot réservé fin du programme\n"); 
                            break;
                        case "Get": 
                            Result.append("Get      :Mot réservé pour l'affectation d'une valeur de variable a une autre\n"); 
                            i++;
                            break;
                        case "Set": 
                            Result.append("Set     :Mot réservé pour l'affectation d'une valeur a une variable\n"); 
                            i++;
                            break;
                        case "If": 
                            Result.append("If      :Mot réservé pour une condition\n");
                            i++;
                            break;
                        case "Else":
                            Result.append("Else   :Sinon\n");
                            break;
                        case "Start":
                            Result.append("Start  :Début d'un bloc\n");
                            break;
                        case "Finish":
                            Result.append("Finish   :Fin d'un bloc\n");
                            break;
                            case "%.":
                              Result.append("%.  : reserver pour fin ligne.\n");
                             break;
                              case "%..":
                              Result.append("%..  : reserver pour debut d'un commenteur.\n");
                             break;
                             case "%":
                              Result.append("%   : parenthèse \n");
                             break;
                        case "Snl_Put":
                            Result.append("Snl_Put   :Instruction d'affichage\n");
                         
                        break;
                        default: 
                            if(this.isIdentificateur(mot[i]))
                            {
                                Result.append(mot[i]+"  :identificateur\n");
                            }
                            else if(snail.isint(mot[i]))
                            {
                                Result.append(mot[i]+"  :entier\n");
                            }
                            else if(this.isFloat(mot[i]))
                            {
                                Result.append(mot[i]+"  :réel\n");
                            }
                            else if (this.symbole(mot[i]))
                            {
                            Result.append(mot[i]+"  :symbole \n");
                            }
                            else
                            {
                                Result.append(mot[i]+":erreur\n");
                            }
                                
                    } 
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(snail.class.getName()).log(Level.SEVERE, null, ex);
        }
                           
    }//GEN-LAST:event_LexiqueActionPerformed

    private void SyntaxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyntaxeActionPerformed
       Result.setText("");
        Path path = Paths.get(chemin);
        try {    
           
            List<String> lignes = Files.readAllLines(path, Charset.forName("ISO-8859-1"));
             for (String ligne : lignes){
                  ligne=ligne.replace("<"," < ");
                ligne=ligne.replace(" , ",",");
                ligne=ligne.replace(", ",",");
                ligne=ligne.replace(" ,",",");
                ligne=ligne.replace("="," = ");
                ligne=ligne.replace("="," = ");
             String mot[] = ligne.split("( )|(,)");
              for(int i = 0; i < mot.length; i++)
                {
                    switch(mot[i]) 
                    {    
                            case "Snl_Start": 
                            Result.append(ligne+"    :Mot réservé début du programme\n"); 
                            continue; 
                            case "Snl_Int":
                                i++;
                            List<String> variable = new ArrayList<>();
                            if(this.isIdentificateur(mot[i]))
                            {                                
                                variable.add(mot[i]);
                                i++;                                    
                            }

                            if(this.isIdentificateur(mot[i-1]))
                            {
                                if(mot[i].equals("%."))
                                {
                                    Result.append(ligne+ " :Déclaration de "+variable.size()+" entiers\n");
                                }
                            }
                            else{ 
                                Result.append(ligne+ " erreur\n");
                            }
                            continue;  
                            case "Set" :
                                  i++;
                            if(this.isIdentificateur(mot[i]) && (snail.isint(mot[i+1]) || this.isFloat(mot[i+1])))
                            {  Result.append(ligne+"    :Affectation de la valeur "+mot[i+1]+" a "+mot[i]+"\n");
                            }
                            else{ 
                                Result.append(ligne+ " erreur\n");
                            }
                            continue;
                            case "Snl_Real" :
                                i++;
                            List<String> real = new ArrayList<>();
                            while(this.isIdentificateur(mot[i]))
                            {                                
                                real.add(mot[i]);
                                i++;                                    
                            }
                          
                            if(this.isIdentificateur(mot[i-1]))
                            {
                                if(mot[i].equals("%."))
                                {
                                    Result.append(ligne+"     :Déclaration de "+real.size()+" reel\n");
                                }
                            }
                            else{ 
                                Result.append(ligne+ " erreur\n");
                            }
                            continue;
                            case "if" :
                               i++;
                               if(isIdentificateur(mot[i])){
                            Result.append(ligne+ "   :condition\n "   );
                               }
                               else{ 
                                Result.append(ligne+ " erreur\n");
                            }
                            continue;
                            case "Else" :
                            Result.append(ligne+   "  :sinon \n"   );
                            continue;
                            case "Start" :
                            Result.append(ligne+  "   :debut d'un block\n"   );
                            continue;
                            case "Get" :
                                i++;
                                             if(this.isIdentificateur(mot[i]) && "from".equals(mot[i+1]) && this.isIdentificateur(mot[i+2]))
                            {
                                Result.append(ligne+"   :Affectation de la valeur de la variable "+mot[i+2]+" a la variable "+mot[i]+"\n");
                            }
                                             else{ 
                                Result.append(ligne+ " erreur\n");
                            }
                            continue;
                            case "Finishe" :
                            Result.append(ligne+"  :fin d'un block\n"   );
                            continue;
                            case "Snl_Put":
                            i++;
                            if(this.isIdentificateur(mot[i]))
                            {
                             Result.append(ligne+"    :ecrire la valeur de "+mot[i]+"\n");
                            }
                            else{
                            Result.append(ligne+  "   :affichage d'un message al'ecran \n");
                            }
                            
                                    
                            continue;
                            case "%.." :
                            Result.append(ligne+  "     :ligne reserver pour comenteur\n"   );
                            continue;
                            case "Snl_Close" :
                            Result.append(ligne+ "       :fin programme\n "   );
                            break;
                        
                        
                    }
             }
            
             }
            
            
  
    }                                       
catch (IOException ex) {
            Logger.getLogger(snail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SyntaxeActionPerformed

    private void SémantiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SémantiqueActionPerformed
        Result.setText("");
        Path path = Paths.get(chemin);
        try {    
            List<String> lignes = Files.readAllLines(path, Charset.forName("ISO-8859-1"));
             for (String ligne : lignes){
             ligne=ligne.replace("<"," < ");
                ligne=ligne.replace(" , ",",");
                ligne=ligne.replace(", ",",");
                ligne=ligne.replace(" ,",",");
                ligne=ligne.replace("="," = ");
                ligne=ligne.replace("="," = ");
             String mot[] = ligne.split("( )|(,)");
              for(int i = 0; i < mot.length; i++)
                {
                    switch(mot[i]) 
                    {    
                            case "Snl_Start": 
                            Result.append("main(){\n"); 
                            continue; 
                            case "Snl_Int":
                                 i++;
                            List<String> sint = new ArrayList<String>();
                            while(this.isIdentificateur(mot[i]))
                            {                                
                                sint.add(mot[i]);
                                i++;                                    
                            }
                            if(this.isIdentificateur(mot[i-1]))
                            {
                                if(mot[i].equals("%."))
                                {
                                    Result.append("int ");
                                    for(int j=0;j<sint.size();j++)
                                    {
                                        if(j==sint.size()-1)
                                        {
                                            Result.append(sint.get(j));
                                        }
                                        else
                                        {
                                            Result.append(sint.get(j)+",");
                                        }
                                    }
                                    Result.append(";\n");
                                }
                            }
                           break;  
                            case "Set" :
                                  i++;
                            if(this.isIdentificateur(mot[i]) && (snail.isint(mot[i+1]) || this.isFloat(mot[i+1])))
                            {  Result.append(mot[i]+" = "+mot[i+1]+";\n");
                            }
                            continue;
                            case "Snl_Real" :
                              i++;
                            List<String> sreal = new ArrayList<String>();
                            while(this.isIdentificateur(mot[i]))
                            {                                
                                sreal.add(mot[i]);
                                i++;                                    
                            }
                            if(this.isIdentificateur(mot[i-1]))
                            {
                                if(mot[i].equals("%."))
                                {
                                    Result.append("float ");
                                    for(int j=0;j<sreal.size();j++)
                                    {
                                        if(j==sreal.size()-1)
                                        {
                                            Result.append(sreal.get(j));
                                        }
                                        else
                                        {
                                            Result.append(sreal.get(j)+",");
                                        }
                                    }
                                    Result.append(";\n");
                                }
                            }   
                            continue;
                            case "Start" :
                            Result.append( "{\n"   );
                            continue;
                            case "Get" :
                                i++;
                                             if(this.isIdentificateur(mot[i]) && "from".equals(mot[i+1]) && this.isIdentificateur(mot[i+2]))
                            {
                                Result.append(mot[i]+" = "+mot[i+2]+";\n");
                            }
                            continue;
                            case "Finish" :
                            Result.append(  "}\n"   );
                            continue;
                            case "Snl_Put" :
                            i++;
                            if(this.isIdentificateur(mot[i]))
                            {
                             Result.append("System.out.println("+mot[i]+");\n");
                            }
                            else{
                             Result.append("System.out.println("+mot[i]+");\n");
                            }
                                          
                            continue;
                            case "%.." :
                                i++;
                            Result.append(  "//"+Arrays.toString(ligne.split("%.."))+"\n"   );
                            continue;
                            
                            case "If" :
                                i++;
                            Result.append( "if("+mot[i+1]+mot[i+2]+mot[i+3]+")\n"   );
                            continue;   
                            case "Else":
                                 Result.append( "else\n"   );
                                continue;
                            case "Snl_Close" :
                            Result.append( "} "   );
                            break;
                        
                        
                    }
                }
             
    }//GEN-LAST:event_SémantiqueActionPerformed
  }
            
            
  
                                           
catch (IOException ex) {
            Logger.getLogger(snail.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
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
            java.util.logging.Logger.getLogger(snail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(snail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(snail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(snail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new snail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Charger_un_fichier;
    private javax.swing.JButton Lexique;
    private javax.swing.JTextArea Result;
    private javax.swing.JButton Syntaxe;
    private javax.swing.JButton Sémantique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
