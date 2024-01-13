/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.Enterprise;
import Business.LabAdmin.Lab;
import Business.LabAdmin.LabDirectory;
import Business.LabAdmin.Test;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malini
 */
public class BookTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookTestJPanel
     */
     JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    LabDirectory labDirectory;
    
    Lab lab;
    public BookTestJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem business ) {
        initComponents();
        
        this.userAccount=userAccount;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateComboBox();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabComboBox = new javax.swing.JComboBox<>();
        testJComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totalTxtField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(52, 7, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabComboBox.setForeground(new java.awt.Color(255, 255, 255));
        LabComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(LabComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 157, -1));

        testJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        testJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(testJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 157, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setText("TEST");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setText("DATE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(52, 7, 116));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 130, 30));

        jButton2.setBackground(new java.awt.Color(52, 7, 116));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 150, 30));

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lab Name", "Test Name", "Date Booked", "Price"
            }
        ));
        tblLab.setGridColor(new java.awt.Color(255, 255, 255));
        tblLab.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblLab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 115));

        jButton3.setBackground(new java.awt.Color(52, 7, 116));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CONFIRM");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 150, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setText("TOTAL:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 140, -1));

        jButton4.setBackground(new java.awt.Color(52, 7, 116));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Test History");
        jButton4.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 160, 40));

        jButton6.setBackground(new java.awt.Color(52, 7, 116));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("<<");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-test-48.png"))); // NOI18N
        enterpriseLabel.setText("Patient Book Test");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 260, 60));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Patient/patImg.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -70, 540, 510));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setText("LAB");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ViewTestBookingsJPanel cust = new ViewTestBookingsJPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("CustomerAreaJPanel", cust);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void totalTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String labName = String.valueOf(LabComboBox.getSelectedItem());
        //        lab = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(labName).getOrganizationDirectory().getLabDirectory().findLab(labName);
        // MSS check
        lab = business.getEnterpriseDirectory().findEnterprise(labName).getOrganizationDirectory().getLabDirectory().findLab(labName);
        System.out.println(lab.getBookedtestlist());
        int rowCount = tblLab.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Test t = (Test) tblLab.getValueAt(i, 1);
            lab.getBookedtestlist().addTest(t);
        }
        System.out.println(lab.getTestlist().getTestList());
        Boolean flag = true;
        if (lab.getTestlist().getTestList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no tests chosen!");
            flag = false;
        } else {

            BookTestWorkRequest bookNewTestWorkRequest = new BookTestWorkRequest();
            bookNewTestWorkRequest.setTestList(lab.getTestlist().getTestList());

            bookNewTestWorkRequest.setSender(this.userAccount);
            int selectedValue = LabComboBox.getSelectedIndex();
            System.out.println(lab.getName());
            System.out.println(lab.getClass());

            bookNewTestWorkRequest.setReceiver(business.getUserAccountDirectory().findUserAccount(labName));
            //            bookNewTestWorkRequest.getReceiver().setUsername(lab.getUserAccountDirectory().findUserAccount(lab.getName()).getUsername());

            bookNewTestWorkRequest.setTestId(1);

            //     bookNewTestWorkRequest.getReceiver().setUsername(lab.getUserAccountDirectory().findUserAccount(l1.getName()).getUsername());
            jDateChooser2. setMinSelectableDate(Calendar.getInstance().getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            Date d = jDateChooser2.getDate();
            bookNewTestWorkRequest.setDateBooked(d);
            bookNewTestWorkRequest.setRequestDate(new Date());
            bookNewTestWorkRequest.setStatus("Lab Test Booked");
            business.getWorkQueue().addWorkRequest(bookNewTestWorkRequest);

        }

        if (flag) {
            JOptionPane.showMessageDialog(null, "Lab test booked Successfully");
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
            System.out.println("prev");
            List<WorkRequest> r = this.userAccount.getWorkQueue().getWorkRequestList();

            ViewTestBookingsJPanel cust = new ViewTestBookingsJPanel(userProcessContainer, userAccount, business);
            userProcessContainer.add("CustomerAreaJPanel", cust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblLab.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblLab.getModel();
            dtm.removeRow(tblLab.getSelectedRow());
            totalTxtField.setText(String.valueOf(getTotal()));
            //            populateTable();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
        totalTxtField.setText(String.valueOf(getTotal()));
        //        int rowCount = LabTable.getRowCount();
        //        for (int i = 0; i < rowCount; i++) {
            //            Test t = (Test) LabTable.getValueAt(i, 1);
            //            if (rowCount > 0) {
                //                        int selectedValue = LabComboBox.getSelectedIndex();
                ////         labDirectory.getLabList().get(selectedValue);
                //        String name = LabComboBox.getItemAt(selectedValue);
                //               lab = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(name);
                //               lab.getTestlist().addTest(t);
                //            }
            //        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void testJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testJComboBoxActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblLab.getModel();
        dtm.setRowCount(0);
        int selectedValue = testJComboBox.getSelectedIndex();
        String name = testJComboBox.getItemAt(selectedValue);
    }//GEN-LAST:event_testJComboBoxActionPerformed

    private void LabComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabComboBoxActionPerformed
        // TODO add your handling code here:

        //        restList2.removeAllItems();
        //        hospitalName = String.valueOf(restList.getSelectedItem());
        //        populateComboBox1(hospitalName);
        //        testJComboBox.removeAllItems();

        testJComboBox.removeAllItems();
        String labName = String.valueOf(LabComboBox.getSelectedItem());
        populateTestItems(labName);
    }//GEN-LAST:event_LabComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LabComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLab;
    private javax.swing.JComboBox<String> testJComboBox;
    private javax.swing.JTextField totalTxtField;
    // End of variables declaration//GEN-END:variables


    private void populateLabComboBox(LabDirectory labDirectory) {
            for (Lab l : labDirectory.getLabList()) {
            System.out.println(l.getName());
            System.out.println("Lab names above");
            LabComboBox.addItem(l.getName());

        }
    }

    private void populateTestItems(String name) {
        // MSS check
//System.out.println("its coming here");
//System.out.println(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getOrganizationList());
//System.out.println("test list " +system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name).getTestlist().getTestList());
//                 for(Test t: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name).getTestlist().getTestList()){
//                 testJComboBox.addItem(t.getName());
//                 }

System.out.println("its coming here");
System.out.println(business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getOrganizationList());
System.out.println("test list " +business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name).getTestlist().getTestList());
                 for(Test t: business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name).getTestlist().getTestList()){
                 testJComboBox.addItem(t.getName());
                 }

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblLab.getModel();
//        dtm.setRowCount(0);
        int selectedValue = LabComboBox.getSelectedIndex();
//         labDirectory.getLabList().get(selectedValue);
        String name = LabComboBox.getItemAt(selectedValue);
        // MSS check
//        Lab lab =system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name);
        Lab lab =business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getLabDirectory().findLab(name);
        
System.out.println("Lab in table is "+lab.getName());

        for (Test t : lab.getTestlist().getTestList()) {
            if (t.getName().equalsIgnoreCase(testJComboBox.getSelectedItem().toString())) {
                Object[] row = new Object[5];
                row[0] = lab;
                row[1] = t;
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                String d = sdf.format(jDateChooser2.getDate());
                row[2] = d;
                row[3] = t.getPrice();
                dtm.addRow(row);
            }
    }
    }

    private Double getTotal() {
        int rowCount = tblLab.getRowCount();
        Double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            total = total + Double.parseDouble(String.valueOf(tblLab.getValueAt(i, 3)));
        System.out.println(total);    
    }return total;
    }

    private void populateComboBox() {
        // MSS check
//      for(Enterprise res: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
      for(Enterprise res: business.getEnterpriseDirectory().getEnterpriseList()){
             
if(res.getEnterpriseType().getValue().equals("Lab")){
                            LabComboBox.addItem(res.getName());
         
        }else{
                 System.out.println("nothing lab");
             }
        }
    }
}
