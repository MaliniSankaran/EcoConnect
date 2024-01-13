/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise;
import Business.SupplierAdmin.Inventory;
import Business.SupplierAdmin.InventoryDirectory;
import Business.SupplierAdmin.Supplier;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smithi
 */
public class OrderNewInventoryItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderNewInventoryItemJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    String supplierName;
    ArrayList<Inventory> order;
    public OrderNewInventoryItemJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem business ) {
        initComponents();
        this.userAccount=userAccount;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        order = new ArrayList<>();
        populateLogComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        QuantityJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCommentsHO = new javax.swing.JTextArea();
        txtQuantityHO = new javax.swing.JTextField();
        comboSupHO = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventoryOrderHO = new javax.swing.JTable();
        TotalJLabel = new javax.swing.JLabel();
        txtHOInvTotal = new javax.swing.JTextField();
        NewOrderJLabel = new javax.swing.JLabel();
        btnConfirmationHO = new javax.swing.JButton();
        RestaurantJLabel = new javax.swing.JLabel();
        btnDeleteHO = new javax.swing.JButton();
        MenuItemJLabel = new javax.swing.JLabel();
        btnAddOrderHO = new javax.swing.JButton();
        comboInventoryItem = new javax.swing.JComboBox<>();
        btnBackHosOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setText("Additional Comments:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 170, 20));

        QuantityJLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        QuantityJLabel.setForeground(new java.awt.Color(52, 7, 116));
        QuantityJLabel.setText("Quantity");
        add(QuantityJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtAreaCommentsHO.setColumns(20);
        txtAreaCommentsHO.setRows(5);
        jScrollPane2.setViewportView(txtAreaCommentsHO);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 186, -1));
        add(txtQuantityHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 138, -1));

        comboSupHO.setForeground(new java.awt.Color(255, 255, 255));
        comboSupHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupHOActionPerformed(evt);
            }
        });
        add(comboSupHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 138, -1));

        tblInventoryOrderHO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Item Name", "Manufacturer", "Pricer per unit", "Quantity"
            }
        ));
        tblInventoryOrderHO.setGridColor(new java.awt.Color(255, 255, 255));
        tblInventoryOrderHO.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblInventoryOrderHO.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tblInventoryOrderHOComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventoryOrderHO);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 100));

        TotalJLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TotalJLabel.setForeground(new java.awt.Color(52, 7, 116));
        TotalJLabel.setText("Total:");
        add(TotalJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 50, -1));

        txtHOInvTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHOInvTotalActionPerformed(evt);
            }
        });
        add(txtHOInvTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 130, -1));

        NewOrderJLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NewOrderJLabel.setForeground(new java.awt.Color(52, 7, 116));
        NewOrderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-order-64.png"))); // NOI18N
        NewOrderJLabel.setText("HOSPITAL ORDER DASHBOARD");
        add(NewOrderJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 440, 60));

        btnConfirmationHO.setBackground(new java.awt.Color(52, 7, 116));
        btnConfirmationHO.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnConfirmationHO.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmationHO.setText("Confim");
        btnConfirmationHO.setPreferredSize(new java.awt.Dimension(156, 43));
        btnConfirmationHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmationHOActionPerformed(evt);
            }
        });
        add(btnConfirmationHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        RestaurantJLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        RestaurantJLabel.setForeground(new java.awt.Color(52, 7, 116));
        RestaurantJLabel.setText("Logistics Company");
        add(RestaurantJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, -1));

        btnDeleteHO.setBackground(new java.awt.Color(52, 7, 116));
        btnDeleteHO.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDeleteHO.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteHO.setText("DELETE");
        btnDeleteHO.setPreferredSize(new java.awt.Dimension(156, 43));
        btnDeleteHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHOActionPerformed(evt);
            }
        });
        add(btnDeleteHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        MenuItemJLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        MenuItemJLabel.setForeground(new java.awt.Color(52, 7, 116));
        MenuItemJLabel.setText("Inventory Item");
        add(MenuItemJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnAddOrderHO.setBackground(new java.awt.Color(52, 7, 116));
        btnAddOrderHO.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAddOrderHO.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrderHO.setText("ADD");
        btnAddOrderHO.setPreferredSize(new java.awt.Dimension(156, 43));
        btnAddOrderHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderHOActionPerformed(evt);
            }
        });
        add(btnAddOrderHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        comboInventoryItem.setForeground(new java.awt.Color(255, 255, 255));
        comboInventoryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInventoryItemActionPerformed(evt);
            }
        });
        add(comboInventoryItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 138, -1));

        btnBackHosOrder.setBackground(new java.awt.Color(52, 7, 116));
        btnBackHosOrder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackHosOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnBackHosOrder.setText("<<");
        btnBackHosOrder.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackHosOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHosOrderActionPerformed(evt);
            }
        });
        add(btnBackHosOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -60, 1190, 960));
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupHOActionPerformed
        // TODO add your handling code here:

        comboInventoryItem.removeAllItems();
        supplierName = String.valueOf(comboSupHO.getSelectedItem());
        System.out.println("supplier" +supplierName);
        populateInventoryItems(supplierName);

    }//GEN-LAST:event_comboSupHOActionPerformed

    private void tblInventoryOrderHOComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblInventoryOrderHOComponentAdded
        // TODO add your handling code here:
        txtHOInvTotal.setText(getTotal());
    }//GEN-LAST:event_tblInventoryOrderHOComponentAdded

    private void txtHOInvTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHOInvTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHOInvTotalActionPerformed

    private void btnConfirmationHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmationHOActionPerformed
        // TODO add your handling code here:
        String supplierName = String.valueOf(comboSupHO.getSelectedItem());
        // MSS check
//        Supplier sup = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName);
        Supplier sup = business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName);

        int rowCount = tblInventoryOrderHO.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Inventory inv = (Inventory) tblInventoryOrderHO.getValueAt(i, 0);
            //        sup.getInventoryDirectory().addInventory(inv);
        }

        Boolean flag = true;
        if (sup.getInventoryDirectory().getInventoryList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no items chosen!");
            flag = false;
        } else {

            OrderInventoryWorkRequest orderInventoryWorkRequest = new OrderInventoryWorkRequest();
            orderInventoryWorkRequest.setInventoryList(sup.getInventoryDirectory().getInventoryList());
            System.out.println("list of items "+sup.getInventoryDirectory().getInventoryList());
            orderInventoryWorkRequest.setSender(this.userAccount);
            int selectedValue = comboSupHO.getSelectedIndex();
            //           System.out.println(lab.getName());
            //           System.out.println(lab.getClass());
            //
            orderInventoryWorkRequest.setReceiver(business.getUserAccountDirectory().findUserAccount(supplierName));
            orderInventoryWorkRequest.setMessage(txtAreaCommentsHO.getText());
            orderInventoryWorkRequest.setRequestDate(new Date());
            orderInventoryWorkRequest.setStatus("Item ordered");
            business.getWorkQueue().addWorkRequest(orderInventoryWorkRequest);

        }

        if (flag) {
            JOptionPane.showMessageDialog(null, "inventory item order placed");
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
            System.out.println("prev");
            List<WorkRequest> r = this.userAccount.getWorkQueue().getWorkRequestList();

            ViewInventoryOrderJPanel cust = new ViewInventoryOrderJPanel(userProcessContainer, userAccount, business);
            userProcessContainer.add("CustomerAreaJPanel", cust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnConfirmationHOActionPerformed

    private void btnDeleteHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHOActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblInventoryOrderHO.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblInventoryOrderHO.getModel();
            dtm.removeRow(tblInventoryOrderHO.getSelectedRow());
            txtHOInvTotal.setText(getTotal());
            txtQuantityHO.setText("");
            //            populateTable();
        }
    }//GEN-LAST:event_btnDeleteHOActionPerformed

    private void btnAddOrderHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderHOActionPerformed
        // TODO add your handling code here:
        // MSS check
//        System.out.println("list of items "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().getInventoryList());
        int selectedValue = comboInventoryItem.getSelectedIndex();
        String name = comboInventoryItem.getItemAt(selectedValue);
        Inventory i1 = new Inventory();
        i1.setAvailability(Integer.parseInt(txtQuantityHO.getText()));
        i1.setName(name);
//        i1.setManufacturer(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getManufacturer());
//        i1.setPrice(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getPrice());
        
        i1.setManufacturer(business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getManufacturer());
        i1.setPrice(business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().findInventory(name).getPrice());
        
        order.add(i1);
        populateTable();
        txtHOInvTotal.setText(getTotal());
        int rowCount = tblInventoryOrderHO.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            int quantity = Integer.parseInt(tblInventoryOrderHO.getValueAt(i, 2).toString());
            Inventory item = (Inventory) tblInventoryOrderHO.getValueAt(i, 0);
        }
    }//GEN-LAST:event_btnAddOrderHOActionPerformed

    private void comboInventoryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInventoryItemActionPerformed
        // TODO add your handling code here:
        //        int index = MenuItemJComboBox.getSelectedIndex();
        //clear of the selected items

        int selectedValue = comboInventoryItem.getSelectedIndex();
        String name = comboInventoryItem.getItemAt(selectedValue);

    }//GEN-LAST:event_comboInventoryItemActionPerformed

    private void btnBackHosOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHosOrderActionPerformed
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
    }//GEN-LAST:event_btnBackHosOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenuItemJLabel;
    private javax.swing.JLabel NewOrderJLabel;
    private javax.swing.JLabel QuantityJLabel;
    private javax.swing.JLabel RestaurantJLabel;
    private javax.swing.JLabel TotalJLabel;
    private javax.swing.JButton btnAddOrderHO;
    private javax.swing.JButton btnBackHosOrder;
    private javax.swing.JButton btnConfirmationHO;
    private javax.swing.JButton btnDeleteHO;
    private javax.swing.JComboBox<String> comboInventoryItem;
    private javax.swing.JComboBox<String> comboSupHO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInventoryOrderHO;
    private javax.swing.JTextArea txtAreaCommentsHO;
    private javax.swing.JTextField txtHOInvTotal;
    private javax.swing.JTextField txtQuantityHO;
    // End of variables declaration//GEN-END:variables


 private void populateLogComboBox() {
     // MSS check
//      for(Enterprise res: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
      for(Enterprise res: business.getEnterpriseDirectory().getEnterpriseList()){
             
        if(res.getEnterpriseType().getValue().equals("Supplier")){
                            comboSupHO.addItem(res.getName());
         
        }
        }
    }

    private void populateInventoryItems(String name2) {
        // MSS check
//       int si = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getOrganizationList().size();
//        int si1 = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().getSupplierDirectory().size();
        int si = business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getOrganizationList().size();
        int si1 = business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().getSupplierDirectory().size();
                
        System.out.println(si);
        System.out.println(si1);
//                 for(Inventory i: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().getInventoryList()){
        for(Inventory i: business.getEnterpriseDirectory().findEnterprise(supplierName).getOrganizationDirectory().getSupplierDirectory().findSupplier(supplierName).getInventoryDirectory().getInventoryList()){
 
                 comboInventoryItem.addItem(i.getName());
                 }

    }

    private void populateTable() {
         //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = (DefaultTableModel) tblInventoryOrderHO.getModel();
//        dtm.setRowCount(0);
        int selectedValue = comboSupHO.getSelectedIndex();
        String name = comboSupHO.getItemAt(selectedValue);
        // MSS check
//        Supplier sup =system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getSupplierDirectory().findSupplier(name);
        Supplier sup = business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getSupplierDirectory().findSupplier(name);


        for (Inventory i : order) {
          
                Object[] row = new Object[4];
                row[0] = i;
                row[1] = i.getManufacturer();
                row[2] = i.getPrice();
                row[3] = i.getAvailability();
                dtm.addRow(row);
            
    }
    }

    private String getTotal() {
        int rowCount = tblInventoryOrderHO.getRowCount();
        Double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            total = total + ((Double.parseDouble(tblInventoryOrderHO.getValueAt(i, 2).toString())) * (Integer.parseInt(tblInventoryOrderHO.getValueAt(i, 3).toString())));
        }
        System.out.println(total);
        return total.toString();

    
    }
}

