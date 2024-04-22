package house_cleaning_booking_system;

import javax.swing.JOptionPane;


public class PERSONAL_INFO extends javax.swing.JFrame {

    
    public PERSONAL_INFO() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        t1_txtname = new javax.swing.JLabel();
        t1_txtusername = new javax.swing.JLabel();
        t1_txtaddress = new javax.swing.JLabel();
        t1_txtphonenumber = new javax.swing.JLabel();
        t1_txtemail = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t1_txtage = new javax.swing.JLabel();
        t1_txtgender = new javax.swing.JLabel();
        t1_txtbirthdate = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        ai_address = new javax.swing.JTextField();
        ai_name = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        ai_username = new javax.swing.JTextField();
        ai_email = new javax.swing.JTextField();
        ai_phonenumber = new javax.swing.JTextField();
        ai_birthdate = new javax.swing.JTextField();
        ai_age = new javax.swing.JTextField();
        ai_gender = new javax.swing.JTextField();
        updatebutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSONAL INFORMATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 781, 99));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1_txtname.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtname.setText("NAME:");
        jPanel1.add(t1_txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 93, 20));

        t1_txtusername.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtusername.setText("USERNAME:");
        jPanel1.add(t1_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 93, 20));

        t1_txtaddress.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtaddress.setText("ADDRESS:");
        jPanel1.add(t1_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 93, 21));

        t1_txtphonenumber.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtphonenumber.setText("PHONE NUMBER:");
        jPanel1.add(t1_txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 26));

        t1_txtemail.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtemail.setText("EMAIL:");
        jPanel1.add(t1_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 21));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel15.setText("ADDITIONAL INFO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, -1));

        t1_txtage.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtage.setText("AGE:");
        jPanel1.add(t1_txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 90, 20));

        t1_txtgender.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtgender.setText("GENDER:");
        jPanel1.add(t1_txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 90, 20));

        t1_txtbirthdate.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtbirthdate.setText("BIRTHDATE:");
        jPanel1.add(t1_txtbirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, 20));

        updatebutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updatebutton.setText("BACK");
        updatebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 30));
        jPanel1.add(ai_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, 30));

        ai_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai_nameActionPerformed(evt);
            }
        });
        jPanel1.add(ai_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 87, 334, 0));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 97, 334, 0));

        ai_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(ai_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 30));
        jPanel1.add(ai_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, 30));
        jPanel1.add(ai_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 230, 30));

        ai_birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai_birthdateActionPerformed(evt);
            }
        });
        jPanel1.add(ai_birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 220, 30));
        jPanel1.add(ai_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 220, 30));
        jPanel1.add(ai_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, 30));

        updatebutton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updatebutton1.setText("UPDATE");
        updatebutton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(updatebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 100, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 680, 360));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ai_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai_usernameActionPerformed

    private void ai_birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai_birthdateActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
       
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void ai_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai_nameActionPerformed
        
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
            java.util.logging.Logger.getLogger(PERSONAL_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERSONAL_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERSONAL_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERSONAL_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSONAL_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ai_address;
    public javax.swing.JTextField ai_age;
    public javax.swing.JTextField ai_birthdate;
    public javax.swing.JTextField ai_email;
    public javax.swing.JTextField ai_gender;
    private javax.swing.JTextField ai_name;
    public javax.swing.JTextField ai_phonenumber;
    public javax.swing.JTextField ai_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel t1_txtaddress;
    private javax.swing.JLabel t1_txtage;
    private javax.swing.JLabel t1_txtbirthdate;
    private javax.swing.JLabel t1_txtemail;
    private javax.swing.JLabel t1_txtgender;
    private javax.swing.JLabel t1_txtname;
    private javax.swing.JLabel t1_txtphonenumber;
    private javax.swing.JLabel t1_txtusername;
    private javax.swing.JButton updatebutton;
    private javax.swing.JButton updatebutton1;
    // End of variables declaration//GEN-END:variables
}
