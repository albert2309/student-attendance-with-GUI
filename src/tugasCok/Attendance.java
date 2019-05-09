/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasCok;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Albert
 */
public class Attendance extends javax.swing.JFrame {

    enum AttendanceType {
        NO_INPUT, PRESENT, ABSENT, LATE, ABSENT_WITH_REASON
    };

    /**
     * Creates new form SeeAttendance
     */
    public Attendance(String id, String currentIntake) {

        studentID = id;
        initComponents();
        //Format of save:Session #;lecturer ID;module code; module name;intake code;start time;end time;lecture date; Sessions
        //Classlist:
        /*
        moduleCode
        moduleName
        numberOfPresent
        numberOfLate
        numberOfAbsent
        numberOfAbsentWithReason
         */
        GenerateTable(currentIntake);
        this.setVisible(true);
    }

    public void GenerateTable(String currentIntake) {
        /*
        *This source code is inspired by (Tofubeer, 2010)
         */
        List<ArrayList<String>> classList;
        classList = new ArrayList<ArrayList<String>>();
        classList.add(new ArrayList<String>());
        classList.add(new ArrayList<String>());

        /*
        *This source code is inspired by (Tofubeer, 2010)
         */
        //USE ADD TO ADD ONE STRING 
        List<ArrayList<Integer>> attendanceList = new ArrayList<ArrayList<Integer>>();
        attendanceList.add(new ArrayList<Integer>());
        attendanceList.add(new ArrayList<Integer>());
        attendanceList.add(new ArrayList<Integer>());
        attendanceList.add(new ArrayList<Integer>());
        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\sessionList.txt");
            Scanner in = new Scanner(inputFile);
            String currLine;
            Scanner lineTokenizer;
            String session, lecturerID, moduleCode, moduleName, intakeCode, startTime, endTime, lectureDate, recordedStudent;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int storeTheNumber = 0;

            for (int rowCount = model.getRowCount(); model.getRowCount() != 0; rowCount--) {
                model.removeRow(rowCount - 1);
            }
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                session = lineTokenizer.next();
                lecturerID = lineTokenizer.next();
                moduleCode = lineTokenizer.next();
                moduleName = lineTokenizer.next();
                intakeCode = lineTokenizer.next();
                startTime = lineTokenizer.next();
                endTime = lineTokenizer.next();
                lectureDate = lineTokenizer.next();
                recordedStudent = lineTokenizer.next();
                boolean isDuplicate = false;
                if (currentIntake.compareTo(intakeCode) == 0) {

                    for (int y = 0; y < classList.get(0).size(); y++) {
                        if (classList.get(0).get(y).compareTo(moduleCode) == 0) {
                            isDuplicate = true;
                            storeTheNumber = y;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        storeTheNumber = classList.get(0).size();
                        classList.get(0).add(moduleCode);
                        classList.get(1).add(moduleName);
                        attendanceList.get(0).add(0);
                        attendanceList.get(1).add(0);
                        attendanceList.get(2).add(0);
                        attendanceList.get(3).add(0);
                    }

                    String[] splitted = recordedStudent.split(",");

                    /*
        moduleCode
        moduleName
        numberOfPresent
        numberOfLate
        numberOfAbsent
        numberOfAbsentWithReason
                     */
                    for (int x = 0; x < splitted.length; x += 4) {
                        if (studentID.compareTo(splitted[x]) == 0) {
                            jLabel1.setText("Attendance of " + splitted[x + 1] + " " + splitted[x + 2]);
                            if (splitted[x + 3].compareTo(AttendanceType.PRESENT.toString()) == 0) {
                                int temp = attendanceList.get(0).get(storeTheNumber) + 1;
                                attendanceList.get(0).set(storeTheNumber, temp);
                            } else if (splitted[x + 3].compareTo(AttendanceType.LATE.toString()) == 0) {
                                int temp = attendanceList.get(1).get(storeTheNumber) + 1;
                                attendanceList.get(1).set(storeTheNumber, temp);
                            } else if (splitted[x + 3].compareTo(AttendanceType.ABSENT.toString()) == 0) {
                                int temp = attendanceList.get(2).get(storeTheNumber) + 1;
                                attendanceList.get(2).set(storeTheNumber, temp);
                            } else if (splitted[x + 3].compareTo(AttendanceType.ABSENT_WITH_REASON.toString()) == 0) {
                                int temp = attendanceList.get(3).get(storeTheNumber) + 1;
                                attendanceList.get(3).set(storeTheNumber, temp);
                            } else {
                                System.out.println("UNKNOWN ATTENDANCE TYPE of: " + studentID);
                            }
                            break;
                        }
                    }
                }
            }
            for (int x = 0; x < attendanceList.get(0).size(); x++) {
                int totalClasses = attendanceList.get(0).get(x) + attendanceList.get(1).get(x) + attendanceList.get(2).get(x) + attendanceList.get(3).get(x);
                double percentage = (attendanceList.get(0).get(x) + attendanceList.get(1).get(x) * 0.5 + attendanceList.get(3).get(x)) / totalClasses * 100;
                model.addRow(new Object[]{classList.get(0).get(x), classList.get(1).get(x), attendanceList.get(0).get(x), attendanceList.get(1).get(x), attendanceList.get(2).get(x), attendanceList.get(3).get(x), totalClasses, percentage});
            }

            in.close();

        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Attendance of (insert student name here)");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module Code", "Module Name", "Present", "Late", "Absent", "Absent with reason", "Total Classes", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        removeAll();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance("S-0", "UC2F").setVisible(true);
            }
        });
    }
    private String studentID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
