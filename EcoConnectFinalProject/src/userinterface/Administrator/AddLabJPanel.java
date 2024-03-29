/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Administrator;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import Business.Organization;
import Business.Role.LabAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Smithi
 */
public class AddLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddLabJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    public AddLabJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLabName = new javax.swing.JTextField();
        txtlabUName = new javax.swing.JTextField();
        addLab = new javax.swing.JButton();
        comboLocLab = new javax.swing.JComboBox<>();
        txtlabPwd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnLabBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLabAddr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLabEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLabNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLabName.setPreferredSize(new java.awt.Dimension(164, 30));
        txtLabName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabNameActionPerformed(evt);
            }
        });
        add(txtLabName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txtlabUName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtlabUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        addLab.setBackground(new java.awt.Color(52, 7, 116));
        addLab.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addLab.setForeground(new java.awt.Color(255, 255, 255));
        addLab.setText("Add lab ");
        addLab.setPreferredSize(new java.awt.Dimension(156, 43));
        addLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLabActionPerformed(evt);
            }
        });
        add(addLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 160, -1));

        comboLocLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboLocLab.setPreferredSize(new java.awt.Dimension(140, 30));
        comboLocLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocLabActionPerformed(evt);
            }
        });
        add(comboLocLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));

        txtlabPwd.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtlabPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(52, 7, 116));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-optical-microscope-64.png"))); // NOI18N
        jLabel8.setText("Add Lab");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 350, 70));

        btnLabBack.setBackground(new java.awt.Color(52, 7, 116));
        btnLabBack.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        btnLabBack.setForeground(new java.awt.Color(255, 255, 255));
        btnLabBack.setText("<<");
        btnLabBack.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLabBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabBackActionPerformed(evt);
            }
        });
        add(btnLabBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lab Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 90, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Location:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, -1));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtLabAddr.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtLabAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 7, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 80, -1));

        txtLabEmail.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtLabEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 164, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(52, 7, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Phone:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 70, -1));

        txtLabNum.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtLabNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 164, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab123.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 600, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLabNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabNameActionPerformed

    private void addLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLabActionPerformed
        // TODO add your handling code here:
        if (txtLabName.getText().isEmpty() || txtlabUName.getText().isEmpty() || txtlabPwd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {

            if (!txtLabName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name");
                txtLabName.setText("");
                return;

            } else if(!txtLabAddr.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                txtLabAddr.setText("");
                return;
            }

            else if(!txtLabEmail.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                txtLabEmail.setText("");
                return;
            }
            else if(!txtLabNum.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                txtLabNum.setText("");
                return;
            }

            else if (strongUsername() == false) {
                txtlabUName.setText("");
                JOptionPane.showMessageDialog(null, "should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else if (strongPassword() == false) {
                txtlabPwd.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }

            String name = txtLabName.getText();
            //        String address = labAddr.getText();
            //        String phoneNumber = labPhone.getText();
            String userName = txtlabUName.getText();
            String pwd = txtlabPwd.getText();
            Object selectedItem = comboLocLab.getSelectedItem();
            String loc = selectedItem.toString();
            Employee emp = business.getEmployeeDirectory().createEmployee(name);

            emp.setLocation(loc);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(userName, pwd, emp, new LabAdminRole());

            if (business.getEnterpriseDirectory().findEnterprise(name) == null) {
                business.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Lab);
                business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.LabAdmin, "Test");
                JOptionPane.showMessageDialog(this, " Lab created");
                txtLabName.setText("");
                txtLabAddr.setText("");
                txtLabEmail.setText("");
                txtLabNum.setText("");
                txtlabPwd.setText("");
                txtlabUName.setText("");
            } else {
                JOptionPane.showMessageDialog(this, " Lab already Exist");
            }

        }
    }//GEN-LAST:event_addLabActionPerformed

    private void comboLocLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLocLabActionPerformed

    private void btnLabBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabBackActionPerformed
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
    }//GEN-LAST:event_btnLabBackActionPerformed

    private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(txtlabUName.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(txtlabPwd.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLab;
    private javax.swing.JButton btnLabBack;
    private javax.swing.JComboBox<String> comboLocLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtLabAddr;
    private javax.swing.JTextField txtLabEmail;
    private javax.swing.JTextField txtLabName;
    private javax.swing.JTextField txtLabNum;
    private javax.swing.JTextField txtlabPwd;
    private javax.swing.JTextField txtlabUName;
    // End of variables declaration//GEN-END:variables
}
