
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Drug_List extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre = null;
ResultSet res= null;
String sql1;
String sql2;
String sql3;
    public Drug_List() {
        initComponents();
        con=Connect.connect();
        drug_list();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        druglist = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        sort_by = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drug List");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Drug List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        druglist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        druglist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "         Name", "         Type", "         Barcode", "         Price", "         Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        druglist.getTableHeader().setReorderingAllowed(false);
        druglist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                druglistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(druglist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        sort_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Name", "Type" }));
        sort_by.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sort_byItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sort By:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(679, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void druglistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_druglistMouseClicked
int row = druglist.getSelectedRow();
String t = druglist.getModel().getValueAt(row,2).toString();
String sql = "select * from drugs where BARCODE='"+t+"' ";
try{
    pre=con.prepareStatement(sql);
    res=pre.executeQuery();
    if(res.next()){
        String Name = res.getString("NAME");
        Pharmacy.drug.name.setText(Name);
        
        String Type = res.getString("TYPE");
        Pharmacy.drug.type.setSelectedItem(Type);
        
        String Barcode = res.getString("BARCODE");
        Pharmacy.drug.barcode.setText(Barcode);
        
        String Code = res.getString("CODE");
        Pharmacy.drug.code.setText(Code);
        
        String Dose = res.getString("DOSE");
        Pharmacy.drug.dose.setText(Dose);
        
        String cost_price = res.getString("COST_PRICE");
        Pharmacy.drug.cost_price.setText(cost_price);
        
        String sell_price = res.getString("SELLING_PRICE");
        Pharmacy.drug.selling_price.setText(sell_price);
        
        String company_Name = res.getString("COMPANY_NAME");
        Pharmacy.drug.company_name.setSelectedItem(company_Name);
        
        String Quantity = res.getString("QUANTITY");
        Pharmacy.drug.quantity.setSelectedItem(Quantity);
        
             String sec = res.getString("PLACE").split("-")[0];
             Pharmacy.drug.section.setSelectedItem(sec);
             String pla = res.getString("PLACE").split("-")[1];
             Pharmacy.drug.place.setSelectedItem(pla);
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
}

    }//GEN-LAST:event_druglistMouseClicked

    private void sort_byItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sort_byItemStateChanged
switch (sort_by.getSelectedIndex()){ // one case will execute in these cases 
    case 1 : {
    sql1 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , COMPANY_NAME from drugs order by NAME";
    sort(1);  break;  //1- order by name from A - Z
    }
   case 2 : {
   sql2 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , COMPANY_NAME from drugs order by TYPE";
   sort(2);break;  // 2- order by type from A - Z 
    }
}
    }//GEN-LAST:event_sort_byItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Drug_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drug_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drug_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drug_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drug_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable druglist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sort_by;
    // End of variables declaration//GEN-END:variables
private void drug_list(){ // this method will be executed when you click on drug_list
    String sql = "select NAME , TYPE ,BARCODE,SELLING_PRICE , COMPANY_NAME from drugs"; // get data from database
    try{
        pre=con.prepareStatement(sql); // prepare sql statement
        res=pre.executeQuery(); // execute sql statement
        druglist.setModel(DbUtils.resultSetToTableModel(res)); // set data in the table 
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }
}
private void sort(int index){ // one case will execute in these cases 1 or 2 or 3 depend on the index number;
    try{
   switch (index){
       case 1 : {
        pre=con.prepareStatement(sql1);
        res=pre.executeQuery();
        druglist.setModel(DbUtils.resultSetToTableModel(res));   
      }break;
       case 2 : {
       pre=con.prepareStatement(sql2);
        res=pre.executeQuery();
        druglist.setModel(DbUtils.resultSetToTableModel(res));    
       }break;
       case 3 : {
       pre=con.prepareStatement(sql3);
        res=pre.executeQuery();
        druglist.setModel(DbUtils.resultSetToTableModel(res));    // set data in the table 
       }
    }    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }}
}