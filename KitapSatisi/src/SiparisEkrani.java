/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
//1306170067 Esracan Güngör

import java.awt.FlowLayout;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
import java.util.LinkedHashMap;
import java.util.Map;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JComboBox;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SiparisEkrani extends JFrame{
 Map<String,Integer>siparisler=new LinkedHashMap<String,Integer>();


 public SiparisEkrani()
 {
     initComponents();
 } 
 
 
 public void    siparisGoster(){
String message="";int tutar=0;
    if (siparisler.isEmpty()) {
        message="Siprasiniz bulunmamaktadir";
    }
    else{
        message+="Siparisler:\n";
    for(Map.Entry<String,Integer>entry:siparisler.entrySet()){
    message+=entry.getKey()+"\n";
    tutar+=entry.getValue();
    }
       message+="Toplam Tutar:"+tutar;
    }
    JOptionPane.showMessageDialog(this, message);
}
    /**
     * Creates new form SiparisEkrani
     */
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hayvanciftligi = new javax.swing.JCheckBox();
        fahrenheit = new javax.swing.JCheckBox();
        ikıgai = new javax.swing.JCheckBox();
        GaziMustafaKemalAtatürk = new javax.swing.JCheckBox();
        siparis_goster = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        zaman = new javax.swing.JCheckBox();
        gungezgini = new javax.swing.JCheckBox();
        acılınben = new javax.swing.JCheckBox();
        sokrates = new javax.swing.JCheckBox();
        english = new javax.swing.JCheckBox();
        benneyim = new javax.swing.JCheckBox();
        odemeyapbutonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        hayvanciftligi.setText("Hayvan Çiftliği George Orwell-19TL");
        hayvanciftligi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayvanciftligiActionPerformed(evt);
            }
        });

        fahrenheit.setText("Fahrenheit 451 Ray Bradbury-12TL");

        ikıgai.setText("Ikıgai Hector Garcia-18 TL");

        GaziMustafaKemalAtatürk.setText("Gazi Mustafa Kemal Atatürk İlber Ortaylı-35TL");

        siparis_goster.setText("Siparisleri Ver");
        siparis_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_gosterActionPerformed(evt);
            }
        });

        jLabel1.setText("Kitap Listesi");

        zaman.setText("Zamanın Kısa Tarihi Stephen Hawking-25TL");

        gungezgini.setText("Güngezgini Gabriel Ba-50TL");

        acılınben.setText("Açılın Ben Öğretmenim Müjdat Ataman-29TL");

        sokrates.setText("Sokrates'in Savunması Platon-12TL");

        english.setText("English Grammar Today Murat Kurt-55TL");

        benneyim.setText("Ben Ney’im Hakan Mengüç-23TL");

        odemeyapbutonu.setText("Ödeme Yap");
        odemeyapbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeyapbutonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(gungezgini, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ikıgai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fahrenheit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GaziMustafaKemalAtatürk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hayvanciftligi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acılınben, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(benneyim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sokrates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(english, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(siparis_goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odemeyapbutonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(hayvanciftligi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ikıgai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GaziMustafaKemalAtatürk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gungezgini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acılınben)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(benneyim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sokrates)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(english)
                .addGap(45, 45, 45)
                .addComponent(siparis_goster)
                .addGap(18, 18, 18)
                .addComponent(odemeyapbutonu)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siparis_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_gosterActionPerformed
        if(hayvanciftligi.isSelected()){
            siparisler.put("Hayvan Çiftliği George Orwell",19);

        }
        else{
            siparisler.remove("Hayvan Çiftliği George Orwell");
        }
        if(fahrenheit .isSelected()){
            siparisler.put("Fahrenheit 451 Ray Bradbury",12);

        }
        else{
            siparisler.remove("Fahrenheit 451 Ray Bradbury");
        }
        if(ikıgai.isSelected()){
            siparisler.put("Ikıgai Hector Garcia",18);

        }
        else{
            siparisler.remove("Ikıgai Hector Garcia");
        }
        if(GaziMustafaKemalAtatürk.isSelected()){
            siparisler.put("Gazi Mustafa Kemal Atatürk-Ilber Ortaylı",35);

        }
        else{
            siparisler.remove("Gazi Mustafa Kemal Atatürk");
        }
         if(zaman.isSelected()){
            siparisler.put("Zamanın Kısa Tarihi Stephen Hawking",25);

        }
        else{
            siparisler.remove("Zamanın Kısa Tarihi Stephen Hawking");
        }
         if(gungezgini.isSelected()){
            siparisler.put("Güngezgini Gabriel Ba",50);

        }
        else{
            siparisler.remove("Güngezgini Gabriel Ba");
        }
          if(acılınben.isSelected()){
            siparisler.put("Açılın Ben Öğretmenim Müjdat Ataman",29);

        }
        else{
            siparisler.remove("Açılın Ben Öğretmenim Müjdat Ataman");
        }
           if(benneyim.isSelected()){
            siparisler.put("Ben Ney’im Hakan Mengüç",23);

        }
        else{
            siparisler.remove("Ben Ney’im Hakan Mengüç");
        }
         if(sokrates.isSelected()){
            siparisler.put("Sokrates'in Savunması Platon",12);

        }
        else{
            siparisler.remove("Sokrates'in Savunması Platon");
        }
          if(english .isSelected()){
            siparisler.put("English Grammar Today Murat Kurt",55);

        }
        else{
            siparisler.remove("English Grammar Today Murat Kurt");
        }
        
        
        siparisGoster();
    }//GEN-LAST:event_siparis_gosterActionPerformed

    private void hayvanciftligiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayvanciftligiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hayvanciftligiActionPerformed

    private void odemeyapbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyapbutonuActionPerformed
        String message="";int tutar=0;
            
           if (siparisler.isEmpty()) {
        message="Ödeme yapılacak siprasiniz bulunmamaktadir";
    }
    else{
        message+="Siparisler:\n";
    for(Map.Entry<String,Integer>entry:siparisler.entrySet()){
    message+=entry.getKey()+"\n";
    tutar+=entry.getValue();
    }
       message+="Toplam Tutar:"+tutar+"  TL basariyla ödenmistir.";
    }
    JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_odemeyapbutonuActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox GaziMustafaKemalAtatürk;
    private javax.swing.JCheckBox acılınben;
    private javax.swing.JCheckBox benneyim;
    private javax.swing.JCheckBox english;
    private javax.swing.JCheckBox fahrenheit;
    private javax.swing.JCheckBox gungezgini;
    private javax.swing.JCheckBox hayvanciftligi;
    private javax.swing.JCheckBox ikıgai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton odemeyapbutonu;
    private javax.swing.JButton siparis_goster;
    private javax.swing.JCheckBox sokrates;
    private javax.swing.JCheckBox zaman;
    // End of variables declaration//GEN-END:variables

  
}