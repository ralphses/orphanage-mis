/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orphan;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author iCode
 */
public class frmDischarge extends javax.swing.JFrame {

    
    
    private static final String Username="root";
    private static final String Password="";
    private static final String ConnString="jdbc:mysql://localhost/orphanage";
    private Connection conn = null;
    private Statement st;
    
    
    /**
     * Creates new form frmDischarge
     */
    public frmDischarge() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2, 
         dim.height/2-(this.getSize()).height/2); 

    }

         public void connect()
     {
        try{
            conn=DriverManager.getConnection(ConnString,Username,Password);
            st = conn.createStatement();
        } 
            catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex.toString());
        }
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
        lblGender = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbStaff = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        lblFirst = new javax.swing.JLabel();
        lblSur = new javax.swing.JLabel();
        lblOther = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        cmbDTime = new javax.swing.JComboBox<>();
        dd = new javax.swing.JComboBox<>();
        mm = new javax.swing.JComboBox<>();
        yyyy = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 170, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Other Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Founded:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area Founded:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Time Founded:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Orpan ID. No.:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtID.setText(" ");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 560, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Orphan Discharge");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("First Name:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 20, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 50));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 580, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Surname:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date Discharged:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Time Discharged:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Discharched by:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        cmbStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select..." }));
        jPanel1.add(cmbStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 150, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("First Name:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblFirst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFirst.setForeground(new java.awt.Color(255, 255, 255));
        lblFirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 20));

        lblSur.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSur.setForeground(new java.awt.Color(255, 255, 255));
        lblSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 20));

        lblOther.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblOther.setForeground(new java.awt.Color(255, 255, 255));
        lblOther.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, 20));

        lblDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, 20));

        lblArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, 100));

        lblTime.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 20));

        lblAge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, 20));

        cmbDTime.setMaximumRowCount(12);
        cmbDTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select...", "06:01am - 06:30am", "06:31am - 07:00am", "07:01am - 07:30am", "07:31am - 08:00am", "08:01am - 08:30am", "08:31am - 09:00am", "19:00am - 09:30am", "09:31am- 1 0:00am", "10:01am - 10:30am", "10:31am - 11:00am", "11:01am - 11:30am", "11:31am - 12:00pm", "12:01pm - 12:30pm", "12:31pm - 01:00pm", "01:01pm - 01:30pm", "01:31pm - 02:00pm", "02:01pm - 02:30pm", "02:31pm - 03:00pm", "03:01pm - 03:30pm", "03:31pm - 04:00pm", "04:00pm - 04:30pm", "04:31pm - 05:00pm", "05:01pm - 05:30pm", "05:31pm - 06:00pm" }));
        jPanel1.add(cmbDTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 150, -1));

        dd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 40, -1));

        mm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, -1));

        yyyy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jPanel1.add(yyyy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 70, -1));

        jButton3.setText("Discharge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, -1));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        if(" ".equals(txtID.getText()))
        {
            JOptionPane.showMessageDialog(this,"Please Enter Doctor Intake ID");
            return;
        }

        
        try{

            String Query="SELECT * FROM intake WHERE idno='"+txtID.getText() + "'";
            connect();
            st.execute(Query);
            ResultSet rs = st.getResultSet();

            connect();
           
            
    
            while(rs.next()) 
            {
                lblFirst.setText(rs.getString("FIRSTNAME"));
                lblSur.setText(rs.getString("LASTNAME"));
                lblOther.setText(rs.getString("OTHERNAME"));
                lblDate.setText(rs.getString("DATEFOUND"));
                lblArea.setText(rs.getString("AREA"));
                lblTime.setText(rs.getString("TIME"));
                lblAge.setText(rs.getString("AGE"));
                lblGender.setText(rs.getString("GENDER"));                
            }    
                
                     
                     
                
                
                
         

        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

                       txtID.setText("");
                       lblFirst.setText("");
                       lblSur.setText("");
                       lblOther.setText("");
                       lblDate.setText("");
                       lblArea.setText("");
                       lblTime.setText("");
                       lblAge.setText("");
                       lblGender.setText("");
                       cmbDTime.setSelectedItem("");
                       cmbStaff.setSelectedItem("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.show(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed




      if(" ".equals(txtID.getText()))
      {     JOptionPane.showMessageDialog(this,"Please Enter Intake Number");
            return;
      }
                    String DDate= dd.getSelectedItem()+"/"+ mm.getSelectedItem()+"/"+yyyy.getSelectedItem();
            try
            {
            String Query="INSERT INTO DISCHARGE(IDNO,FIRSTNAME,LASTNAME,OTHERNAME,DATEFOUND,AREA,TIME,AGE,GENDER,DDate,DTime,DBy)\n" +
                        "VALUES('" + txtID.getText()
                        +"'," + "'"+lblFirst.getText()
                        +"'," + "'"+lblSur.getText()
                        +"'," + "'"+lblOther.getText()
                        +"'," + "'"+lblDate.getText()
                        + "'," + "'"+ lblArea.getText()
                        + "'," + "'"+lblTime.getText()
                        + "'," + "'"+ lblAge.getText()
                        + "'," + "'"+lblGender.getText()
                        +"'," + "'"+DDate
                        +"'," + "'"+cmbDTime.getSelectedItem()
                        +"'," + "'"+cmbStaff.getSelectedItem()
                        +"')";
                        connect();   
                        st.execute(Query);
                        JOptionPane.showMessageDialog(this,"Intake has successfully been discharged","Success Message",JOptionPane.INFORMATION_MESSAGE);

                      //  Get_Data();
           }
           catch(SQLException ex)
           {
                JOptionPane.showMessageDialog(this, ex.toString());
           }













        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

            loadtocombo();



        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    public void loadtocombo(){
     String s = "Select firstname,lastname from staff " ;


        connect();
        try {
             st.execute(s);
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
               cmbStaff.addItem((rs.getString("Firstname")+" "+rs.getString("lastname")));
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            
    }
}  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDischarge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDTime;
    private javax.swing.JComboBox<String> cmbStaff;
    private javax.swing.JComboBox<String> dd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFirst;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblOther;
    private javax.swing.JLabel lblSur;
    private javax.swing.JLabel lblTime;
    private javax.swing.JComboBox<String> mm;
    private javax.swing.JTextField txtID;
    private javax.swing.JComboBox<String> yyyy;
    // End of variables declaration//GEN-END:variables
}
