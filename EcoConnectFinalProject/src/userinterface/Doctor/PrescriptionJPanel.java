/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Doctor;

import Business.EcoSystem;
import Business.Patient.Medicine;
import Business.Patient.Patient;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Malini
 */
public class PrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    BookAppointment pa;
    
    public PrescriptionJPanel(JPanel userProcessContainer,EcoSystem business,BookAppointment pa) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.pa = pa;
        
        txtAddPresPatName.setText(pa.getSender().getEmployee().getName());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddPresPatName = new javax.swing.JTextField();
        txtMed1Pat = new javax.swing.JTextField();
        btnAddPresPat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMed2Pat = new javax.swing.JTextField();
        txtMed3Pat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdcommentsPat = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        btnAddPres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setText("Patient Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setText("Medicine 1");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 80, -1));
        add(txtAddPresPatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 150, -1));
        add(txtMed1Pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, -1));

        btnAddPresPat.setBackground(new java.awt.Color(52, 7, 116));
        btnAddPresPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAddPresPat.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPresPat.setText("Add presecription");
        btnAddPresPat.setPreferredSize(new java.awt.Dimension(156, 43));
        btnAddPresPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPresPatActionPerformed(evt);
            }
        });
        add(btnAddPresPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setText("Medicine 2");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setText("Medicine 3");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 80, -1));
        add(txtMed2Pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 150, -1));
        add(txtMed3Pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 150, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setText("Comments");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 80, -1));
        add(txtdcommentsPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 150, -1));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-doctor-40.png"))); // NOI18N
        enterpriseLabel.setText("ADD PRESCRIPTION");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 350, 50));

        btnAddPres.setBackground(new java.awt.Color(52, 7, 116));
        btnAddPres.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAddPres.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPres.setText("<<");
        btnAddPres.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAddPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPresActionPerformed(evt);
            }
        });
        add(btnAddPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/docImg2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 910, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPresPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPresPatActionPerformed
        // TODO add your handling code here:
        if (txtMed1Pat.getText().isEmpty() && txtMed2Pat.getText().isEmpty() && txtMed2Pat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter atleast one medicine");
            return;
        } else {
            if ((!txtMed1Pat.getText().matches("[a-zA-Z_]+")) &&(!txtMed3Pat.getText().matches("[a-zA-Z_]+"))&& (!txtMed2Pat.getText().matches("[a-zA-Z_]+"))) {
                JOptionPane.showMessageDialog(this, "Enter proper medicine name");
                txtMed1Pat.setText("");
                txtMed2Pat.setText("");
                txtMed3Pat.setText("");
                return;
            }
            //            }
        //            else if(!dmed2.getText().matches("[a-zA-Z_]+")) {
            //                JOptionPane.showMessageDialog(this, "Enter proper medicine name");
            //                dmed2.setText("");
            //                return;
            //            } else if(!dmed3.getText().matches("[a-zA-Z_]+")) {
            //                JOptionPane.showMessageDialog(this, "Enter proper medicine name");
            //                dmed3.setText("");
            //                return;
            //            }
        else{}
        ArrayList<String> med = new ArrayList<>();
        if(!txtMed1Pat.getText().isEmpty()) {String med1 = txtMed1Pat.getText(); med.add(med1);}
        if(!txtMed2Pat.getText().isEmpty()) {String med2 = txtMed2Pat.getText();med.add(med2);}
        if(!txtMed3Pat.getText().isEmpty()) {String med3 = txtMed3Pat.getText();med.add(med3);}
        //
        //        med.add(med1);
        //        med.add(med2);
        //        med.add(med3);
        Medicine md = new Medicine();
        md.setMedicines(med);

        pa.setMeds(md);
        pa.setComments(txtdcommentsPat.getText());
        System.out.println("bbb  set med" +pa.getMeds().getMedicines().get(0));
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnAddPresPatActionPerformed

    private void btnAddPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPresActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_btnAddPresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPres;
    private javax.swing.JButton btnAddPresPat;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddPresPatName;
    private javax.swing.JTextField txtMed1Pat;
    private javax.swing.JTextField txtMed2Pat;
    private javax.swing.JTextField txtMed3Pat;
    private javax.swing.JTextField txtdcommentsPat;
    // End of variables declaration//GEN-END:variables
}
