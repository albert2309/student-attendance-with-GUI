/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasCok;
//This class can be acessed in two ways:
//One is used to record the data for the first time through GUI so you don't need to create another class just to record session

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//Another way is just to get the data through getter.

/**
 *
 * @author Albert
 */
public class Session extends javax.swing.JFrame {

    /**
     * Creates new form Session
     */
    public Session(String intakeLecturer, String lecturerID) {
        initComponents();
        this.lecturerID = lecturerID;
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

        AttendanceCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SimpleDateFormat model = new SimpleDateFormat("dd.MMM.yy");
        DOBSpinner = new javax.swing.JSpinner(new SpinnerDateModel());
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        IntakeList = new javax.swing.JComboBox<>();
        StartSpinner = new javax.swing.JSpinner(new SpinnerDateModel());
        EndSpinner = new javax.swing.JSpinner(new SpinnerDateModel());

        AttendanceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "PRESENT", "ABSENT", "LATE" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sessions");

        jLabel2.setText("Module Code");

        jLabel3.setText("Module Name");

        jLabel4.setText("Intake Code");

        jLabel5.setText("Start Time");

        jLabel6.setText("End Time");

        DOBSpinner.setModel(new javax.swing.SpinnerDateModel());
        DOBSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lecture Date");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First name", "Last name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(AttendanceCombo));
        }

        jButton1.setText("Record Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        IntakeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeListActionPerformed(evt);
            }
        });

        StartSpinner.setModel(new javax.swing.SpinnerDateModel());
        StartSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EndSpinner.setModel(new javax.swing.SpinnerDateModel());
        EndSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IntakeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DOBSpinner, jTextField1, jTextField2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(IntakeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(StartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(EndSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DOBSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DOBSpinner, jTextField1, jTextField2});

        DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, model.toPattern()));
        //DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, "MM/yyyy"));
        StartSpinner.setEditor(new JSpinner.DateEditor(StartSpinner, "h:mm a"));
        EndSpinner.setEditor(new JSpinner.DateEditor(EndSpinner, "h:mm a"));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntakeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeListActionPerformed
        try {
            FileReader inputFile = new FileReader("D:\\\\Albert\\\\Documents\\\\NetBeansProjects\\\\OODJ\\\\src\\\\tugasCok\\\\studentInfoList.txt");
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
                    model.addRow(new Object[]{id, firstName, lastName, new DefaultCellEditor(AttendanceCombo)});
                }
            }
            in.close();

        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }
    }//GEN-LAST:event_IntakeListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            FileReader inputFile = new FileReader("D:\\Albert\\Documents\\NetBeansProjects\\OODJ\\src\\tugasCok\\sessionList.txt");
            Scanner in = new Scanner(inputFile);
            String currLine;
            Scanner lineTokenizer;
            int numberOfLine = 0;
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                numberOfLine++;
            }
            String studentList = "";
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int rowCount = 0; rowCount < model.getRowCount(); rowCount++) {
                if (rowCount < model.getRowCount() && rowCount > 0) {
                    studentList += ",";
                }
                for (int colCount = 0; colCount < model.getColumnCount(); colCount++) {

                    studentList += model.getValueAt(rowCount, colCount).toString();
                    //Maybe add another delimiter after each line for easy read by machine.

                    if (colCount < 3) {
                        studentList += ",";
                    }
                }

                System.out.println(jTable1.getModel().getValueAt(0, 3).toString());
            }
            //TINGGAL BIKIN LIST BUAT STUDENT ABIS ITU TEST
            in.close();
            System.out.println(studentList);
            String filledDate = DOBSpinner.getValue().toString();
            String[] tempSplit = filledDate.split(" ");
            filledDate = tempSplit[2] + " " + tempSplit[1] + " " + tempSplit[5];
            String filledStart = StartSpinner.getValue().toString();
            tempSplit = filledStart.split(" ");
            filledStart = tempSplit[3];
            tempSplit = filledStart.split(":");
            filledStart = tempSplit[0] + ":" + tempSplit[1];
            
            String filledEnd = EndSpinner.getValue().toString();
            tempSplit = filledEnd.split(" ");
            filledEnd = tempSplit[3];
            tempSplit = filledEnd.split(":");
            filledEnd = tempSplit[0] + ":" + tempSplit[1];
            System.out.println(filledStart);
            String savedSession = "SES-" + numberOfLine + ";" + lecturerID + ";" + jTextField1.getText() + ";" + jTextField2.getText() + ";" + IntakeList.getSelectedItem().toString() + ";";
            savedSession += filledStart + ";" + filledEnd + ";" + filledDate + ";" + studentList;
            System.out.println(savedSession);
            PrintWriter output = new PrintWriter(new FileWriter("D:\\Albert\\Documents\\NetBeansProjects\\OODJ\\src\\tugasCok\\sessionList.txt", true));
            if (numberOfLine > 0) {
                output.append('\n');
            }
            output.append(savedSession);
            output.close();
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Session recorded");
        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        removeAll();
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Session("UC2F/UC1F", "L-0").setVisible(true);
            }
        });
    }
    private String moduleCode;
    private String moduleName;
    private String lecturerID;
    private String date;
    private String startTime;
    private String endTime;
    private String intakeCode;
    private String[] studentIdNumber; //maybe we can use List<Students> instead for easy retrieval by reusing code from the searchStudent. 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AttendanceCombo;
    private javax.swing.JSpinner DOBSpinner;
    private javax.swing.JSpinner EndSpinner;
    private javax.swing.JComboBox<String> IntakeList;
    private javax.swing.JSpinner StartSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
