/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Administrator;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import Business.Organization;
import Business.Role.SupplierAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Smithi
 */
public class AddSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddSupplierJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    public AddSupplierJPanel(JPanel userProcessContainer, EcoSystem business) {
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

        txtSupName = new javax.swing.JTextField();
        txtSupAddr = new javax.swing.JTextField();
        txtSupUName = new javax.swing.JTextField();
        txtSupPwd = new javax.swing.JTextField();
        addHospital = new javax.swing.JButton();
        comboSupLoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnBackSup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSupEmail = new javax.swing.JTextField();
        txtSupNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSupName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtSupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        txtSupAddr.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtSupAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txtSupUName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtSupUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        txtSupPwd.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtSupPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        addHospital.setBackground(new java.awt.Color(52, 7, 116));
        addHospital.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addHospital.setForeground(new java.awt.Color(255, 255, 255));
        addHospital.setText("Add Supplier");
        addHospital.setPreferredSize(new java.awt.Dimension(164, 43));
        addHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalActionPerformed(evt);
            }
        });
        add(addHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, -1));

        comboSupLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboSupLoc.setPreferredSize(new java.awt.Dimension(140, 30));
        comboSupLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupLocActionPerformed(evt);
            }
        });
        add(comboSupLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(52, 7, 116));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-supplier-64.png"))); // NOI18N
        jLabel7.setText("ADD SUPPLIER");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 450, 60));

        btnBackSup.setBackground(new java.awt.Color(52, 7, 116));
        btnBackSup.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        btnBackSup.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSup.setText("<<");
        btnBackSup.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSupActionPerformed(evt);
            }
        });
        add(btnBackSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Supplier Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 140, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Location:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 120, -1));

        txtSupEmail.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtSupEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 164, -1));

        txtSupNum.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtSupNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 164, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(52, 7, 116));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 7, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Phone:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier123.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 420, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void addHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalActionPerformed
        // TODO add your handling code here:
        if (txtSupUName.getText().isEmpty() || txtSupPwd.getText().isEmpty() || txtSupName.getText().isEmpty() || txtSupAddr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {
            if (!txtSupName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                txtSupName.setText("");
                return;
            }
            else if(!txtSupAddr.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                txtSupAddr.setText("");
                return;
            }
            else if(!txtSupEmail.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                txtSupEmail.setText("");
                return;
            }
            else if(!txtSupNum.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                txtSupNum.setText("");
                return;
            }
            else if (strongUsername() == false) {
                txtSupUName.setText("");
                JOptionPane.showMessageDialog(null, "should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }
            else if (strongPassword() == false) {
                txtSupPwd.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
            String name = txtSupName.getText();
            //        String address = labAddr.getText();
            //        String phoneNumber = labPhone.getText();
            String userName = txtSupUName.getText();
            String pwd = txtSupPwd.getText();
            Object selectedItem = comboSupLoc.getSelectedItem();
            String loc = selectedItem.toString();
            Employee emp = business.getEmployeeDirectory().createEmployee(name);

            emp.setLocation(loc);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(userName, pwd, emp, new SupplierAdminRole());
            
            if (business.getEnterpriseDirectory().findEnterprise(name) == null) {
                business.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Supplier);
                business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.SupplierAdmin, "Test");
                JOptionPane.showMessageDialog(this, " Supplier Unit created");
                txtSupName.setText("");
                txtSupAddr.setText("");
                txtSupEmail.setText("");
                txtSupNum.setText("");
                txtSupUName.setText("");
                txtSupPwd.setText("");
            } else {
                System.out.println("already there");
                JOptionPane.showMessageDialog(this, " Supplier Unit already exist");
            }

        }
    }//GEN-LAST:event_addHospitalActionPerformed

      private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(txtSupUName.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(txtSupPwd.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
    
    private void comboSupLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupLocActionPerformed

    private void btnBackSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSupActionPerformed
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
    }//GEN-LAST:event_btnBackSupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospital;
    private javax.swing.JButton btnBackSup;
    private javax.swing.JComboBox<String> comboSupLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtSupAddr;
    private javax.swing.JTextField txtSupEmail;
    private javax.swing.JTextField txtSupName;
    private javax.swing.JTextField txtSupNum;
    private javax.swing.JTextField txtSupPwd;
    private javax.swing.JTextField txtSupUName;
    // End of variables declaration//GEN-END:variables
}
