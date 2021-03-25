/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author githinji
 */
public class Main extends javax.swing.JFrame {

           
    public Main() {
        initComponents();
       
    }
        int idd;
        String uctype;
       int newid;
       String uname;
       String usertype;
       
       public Main(int id, String username, String utype) {
            initComponents();
       
          this.uname = username;
          jLabel4.setText(username);
          
          this.usertype= utype;
          jLabel5.setText(usertype); 
          this.newid = id;
          
          idd=  newid;
          
           uctype=jLabel5.getText();
            if(uctype.equals("Doctor")){
                jButtonpatient.setVisible(false);
                jButton3createchannel.setVisible(false);
                jButton5prescription.setVisible(false);
                jButton6item.setVisible(false);
                jButtoncreateuser.setVisible(false);
                jButtonreport.setVisible(false);
            }
            else if(uctype.equals("Receptionist")){
                jButtondoctor.setVisible(false);
                 jButton5prescription.setVisible(false);
                jButtonreport.setVisible(false);
            }
            else if(uctype.equals("Pharmacist")){
                  jButtonpatient.setVisible(false);
                  jButtondoctor.setVisible(false);
                  jButton3createchannel.setVisible(false);
                  jButton4viewchannel.setVisible(false);
                  jButtoncreateuser.setVisible(false);
                  jButtonreport.setVisible(true);
            }
       
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonpatient = new javax.swing.JButton();
        jButtondoctor = new javax.swing.JButton();
        jButton3createchannel = new javax.swing.JButton();
        jButton4viewchannel = new javax.swing.JButton();
        jButton5prescription = new javax.swing.JButton();
        jButton6item = new javax.swing.JButton();
        jButtoncreateuser = new javax.swing.JButton();
        jButton8viewdoctor = new javax.swing.JButton();
        jButton9logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        jButtonpatient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonpatient.setText("Patient");
        jButtonpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpatientActionPerformed(evt);
            }
        });

        jButtondoctor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtondoctor.setText("Doctor");
        jButtondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondoctorActionPerformed(evt);
            }
        });

        jButton3createchannel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3createchannel.setText("Create Channel");
        jButton3createchannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3createchannelActionPerformed(evt);
            }
        });

        jButton4viewchannel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4viewchannel.setText("View Channel");
        jButton4viewchannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4viewchannelActionPerformed(evt);
            }
        });

        jButton5prescription.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5prescription.setText("View Prescription");
        jButton5prescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5prescriptionActionPerformed(evt);
            }
        });

        jButton6item.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6item.setText("Create Item");
        jButton6item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6itemActionPerformed(evt);
            }
        });

        jButtoncreateuser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtoncreateuser.setText("Create User");
        jButtoncreateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncreateuserActionPerformed(evt);
            }
        });

        jButton8viewdoctor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton8viewdoctor.setText("View Doctor");
        jButton8viewdoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8viewdoctorActionPerformed(evt);
            }
        });

        jButton9logout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton9logout.setText("Logout");
        jButton9logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5prescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonpatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtondoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3createchannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4viewchannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtoncreateuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8viewdoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonpatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtondoctor)
                .addGap(18, 18, 18)
                .addComponent(jButton3createchannel)
                .addGap(18, 18, 18)
                .addComponent(jButton4viewchannel)
                .addGap(18, 18, 18)
                .addComponent(jButton5prescription)
                .addGap(18, 18, 18)
                .addComponent(jButton6item)
                .addGap(18, 18, 18)
                .addComponent(jButtoncreateuser)
                .addGap(18, 18, 18)
                .addComponent(jButton8viewdoctor)
                .addGap(18, 18, 18)
                .addComponent(jButton9logout)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Kenyatta Hospital");

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("UserName");

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("UserType");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jButtonreport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonreport.setText("Report");
        jButtonreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonreport)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonreport)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6itemActionPerformed
         
        Item i = new Item();
        i.setVisible(true);
    }//GEN-LAST:event_jButton6itemActionPerformed

    private void jButton9logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9logoutActionPerformed
        // TODO add your handling code here:
       Login i= new Login();
       this.setVisible(false);
       i.setVisible(true);
    }//GEN-LAST:event_jButton9logoutActionPerformed

    private void jButtoncreateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncreateuserActionPerformed
        user u= new user();
        u.setVisible(true);
    }//GEN-LAST:event_jButtoncreateuserActionPerformed

    private void jButtonpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpatientActionPerformed
       
        Patient p = new Patient();
        p.setVisible(true);
    }//GEN-LAST:event_jButtonpatientActionPerformed

    private void jButtondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondoctorActionPerformed
        
         if(uctype.equals("Doctor")){
             new Doctor(idd,uctype).setVisible(true);
         }
        
          
        
    }//GEN-LAST:event_jButtondoctorActionPerformed

    private void jButton3createchannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3createchannelActionPerformed
        Channel ch= new Channel();
        ch.setVisible(true);
    }//GEN-LAST:event_jButton3createchannelActionPerformed

    private void jButton4viewchannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4viewchannelActionPerformed
        // TODO add your handling code here:
        
         
          viewchannel v=new viewchannel();
          v.setVisible(true);
          // new viewchannel(idd).setVisible(true);
    }//GEN-LAST:event_jButton4viewchannelActionPerformed

    private void jButton5prescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5prescriptionActionPerformed
        // TODO add your handling code here:
           viewPrescription v= new viewPrescription();
           v.setVisible(true);
    }//GEN-LAST:event_jButton5prescriptionActionPerformed

    private void jButtonreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreportActionPerformed
        // TODO add your handling code here:
        Report r= new Report();
        r.setVisible(true);
    }//GEN-LAST:event_jButtonreportActionPerformed

    private void jButton8viewdoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8viewdoctorActionPerformed
        // TODO add your handling code here:
        viewDoctor v= new viewDoctor();
        v.setVisible(true);
    }//GEN-LAST:event_jButton8viewdoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3createchannel;
    private javax.swing.JButton jButton4viewchannel;
    private javax.swing.JButton jButton5prescription;
    private javax.swing.JButton jButton6item;
    private javax.swing.JButton jButton8viewdoctor;
    private javax.swing.JButton jButton9logout;
    private javax.swing.JButton jButtoncreateuser;
    private javax.swing.JButton jButtondoctor;
    private javax.swing.JButton jButtonpatient;
    private javax.swing.JButton jButtonreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
