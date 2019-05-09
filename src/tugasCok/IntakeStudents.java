/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasCok;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Albert
 */
public class IntakeStudents extends javax.swing.JFrame {
    
    /**
     * Creates new form viewAll
     */
    public IntakeStudents(String intakeLecturer) {
        initComponents();
        this.intakeLecturer = intakeLecturer;
        jLabel1.setText("List of students");
        String[] splittedIntake = intakeLecturer.split("/");
        for (int count = 0; count < splittedIntake.length; count++) {
            IntakeList.addItem(splittedIntake[count]);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IntakeList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First name", "Last name", "Gender", "Date of birth", "Intake"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of students in an intake");

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Intake");

        IntakeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IntakeList, 0, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IntakeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        removeAll();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IntakeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeListActionPerformed
        try {
            FileReader inputFile = new FileReader(".\\src\\\\tugasCok\\\\studentInfoList.txt");
            Scanner in = new Scanner(inputFile);
            Scanner lineTokenizer;
            String currLine, id, username, firstName, lastName, gender, dateOfBirth, intake;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int rowCount = model.getRowCount(); model.getRowCount() != 0; rowCount--) {
                model.removeRow(rowCount - 1);
            }
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                id = lineTokenizer.next();
                username = lineTokenizer.next();
                firstName = lineTokenizer.next();
                lastName = lineTokenizer.next();
                gender = lineTokenizer.next();
                dateOfBirth = lineTokenizer.next();
                intake = lineTokenizer.next();

                if (IntakeList.getSelectedItem().toString().compareTo(intake) == 0) {
                    model.addRow(new Object[]{id, firstName, lastName, gender, dateOfBirth, intake});
                }
            }
            in.close();

        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }
        this.setVisible(true);
    }//GEN-LAST:event_IntakeListActionPerformed

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
            java.util.logging.Logger.getLogger(IntakeStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntakeStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntakeStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntakeStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntakeStudents("UC2F/UC1F").setVisible(true);
            }
        });
    }

    public void AddRows(String directory) {
        //file format:ID;username;first name;last name;gender;DOB
        /*object format: {id, firstname, lastname, gender, DOB} */
        //Might consider username to be added into the list in the future
        try {
            FileReader inputFile = new FileReader(directory);
            Scanner in = new Scanner(inputFile);
            Scanner lineTokenizer;
            String currLine, id, username, firstName, lastName, gender, dateOfBirth, intake;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                id = lineTokenizer.next();
                username = lineTokenizer.next();
                firstName = lineTokenizer.next();
                lastName = lineTokenizer.next();
                gender = lineTokenizer.next();
                dateOfBirth = lineTokenizer.next();
                intake = lineTokenizer.next();
                if (IntakeList.getSelectedItem().toString().compareTo(intake) == 0) {
                    model.addRow(new Object[]{id, firstName, lastName, gender, dateOfBirth, intake});
                }
            }

        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }
    }

    private String intakeLecturer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IntakeList;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}