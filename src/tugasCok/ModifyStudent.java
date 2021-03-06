package tugasCok;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Albert
 */
public class ModifyStudent extends javax.swing.JFrame {

    /**
     * Creates new form ModifyStudent
     */
    public ModifyStudent(String selectedID, String selectedUser, String selectedFirst, String selectedLast, String selectedGender, String selectedDate, String selectedIntake) {
        initComponents();
        userField.setText(selectedUser);
        firstNameField.setText(selectedFirst);
        lastNameField.setText(selectedLast);
        targetedID = selectedID;
        originalUsername = selectedUser;
        String[] selectedDOB = selectedDate.split(" ");
        Date convertedMonth;
        try {
            convertedMonth = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(selectedDOB[1]);
            convertedMonth.setDate(Integer.parseInt(selectedDOB[0]));
            convertedMonth.setYear(Integer.parseInt(selectedDOB[2]));
            DOBSpinner.setValue(convertedMonth);
        } catch (ParseException ex) {
            Logger.getLogger(ModifyStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
         * Following source code obtained from (Anto, 2015)
         */
        SimpleDateFormat model = new SimpleDateFormat("dd.MM.yy");
        DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, model.toPattern()));

        intakeField.setText(selectedIntake);
        //return the date format into normal
        model = new SimpleDateFormat("dd.MMM.yy");
        DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, model.toPattern()));

        if (selectedGender.compareTo("Male") == 0) {
            female.setSelected(false);
            male.setSelected(true);
        } else {
            female.setSelected(true);
            male.setSelected(false);
        }

        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\loginList.txt");
            Scanner in = new Scanner(inputFile);
            Scanner lineTokenizer;
            String currLine = "";

            String candidateString, pass, user = "";
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                candidateString = lineTokenizer.next();
                if (selectedUser.compareTo(candidateString) == 0) {
                    pass = lineTokenizer.next();
                    passwordField.setText(pass);
                    break;
                }
            }
        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        modifyButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JToggleButton();
        lastNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        intakeField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        /*
        * Following source code obtained from (Anto, 2015)
        */
        SimpleDateFormat model = new SimpleDateFormat("dd.MMM.yy");
        DOBSpinner = new javax.swing.JSpinner(new SpinnerDateModel());
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtoncancel(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Last name");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Intake");

        jLabel1.setText("Modify Student's Information");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gender");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date of Birth");

        DOBSpinner.setModel(new javax.swing.SpinnerDateModel());
        DOBSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(CancelButton)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(male)
                        .addGap(18, 18, 18)
                        .addComponent(female))
                    .addComponent(DOBSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(modifyButton)
                        .addComponent(userField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(intakeField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DOBSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intakeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyButton)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, model.toPattern()));
        //DOBSpinner.setEditor(new JSpinner.DateEditor(DOBSpinner, "MM/yyyy"));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        ModifyInfo();
    }//GEN-LAST:event_modifyButtonActionPerformed
    public void ModifyInfo() {
        try {

            Scanner lineTokenizer;
            String currLine;
            String userName;
            //NOTE: FILLED REFERS TO THE DATA THAT WAS FILLED IN THE FORM
            String filledUser = userField.getText();
            char[] filledPass = passwordField.getPassword();
            String filledFirst = firstNameField.getText();
            String filledLastName = lastNameField.getText();
            String filledGender = "Null";
            String filledIntake = intakeField.getText();
            Enumeration<AbstractButton> buttonlist = buttonGroup1.getElements();
            AbstractButton button = buttonlist.nextElement();
            if (button.isSelected()) {
                filledGender = "Male";
            }
            button = buttonlist.nextElement();
            if (button.isSelected()) {
                filledGender = "Female";
            }
            String filledDOB = DOBSpinner.getValue().toString();
            String[] splitDOB = filledDOB.split(" ");
            filledDOB = splitDOB[2] + " " + splitDOB[1] + " " + splitDOB[5];

            LocalDate localDate = LocalDate.now();
            String currentDate = DateTimeFormatter.ofPattern("dd MMM yyyy").format(localDate);
            final JPanel panel = new JPanel();
            if (userField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Missing user name!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (String.valueOf(filledPass).isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Missing password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (firstNameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Missing first name!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (lastNameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Missing last name!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (filledGender.equals("Null")) {
                JOptionPane.showMessageDialog(panel, "Pick gender!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (intakeField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Missing intake", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (filledDOB.compareTo(currentDate) == 0) {
                JOptionPane.showMessageDialog(panel, "Date must not be today!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            boolean hasExist = false;
            if (Arrays.equals(filledUser.toCharArray(), filledPass)) {
                JOptionPane.showMessageDialog(panel, "Username must not same as password", "Error", JOptionPane.ERROR_MESSAGE);
                hasExist = true;
            }
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\loginList.txt");
            Scanner in = new Scanner(inputFile);
            while (in.hasNext() && hasExist == false) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                userName = lineTokenizer.next();
                if (userName.compareTo(filledUser) == 0 && userName.compareTo(originalUsername) != 0) {
                    JOptionPane.showMessageDialog(panel, "Username has exist", "Error", JOptionPane.ERROR_MESSAGE);
                    hasExist = true;
                }
            }

            if (!hasExist) {
                studentList = new ArrayList<Student>();
                //DATE CHECK SYSTEM MISSING
                try {
                    inputFile = new FileReader(".\\src\\tugasCok\\studentInfoList.txt");
                    in = new Scanner(inputFile);
                    String id, username, firstName, lastName, gender, dateOfBirth, intake;
                    Student curr;
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
                        if (targetedID.equals(id)) {
                            curr = new Student(targetedID, filledUser, filledFirst, filledLastName, filledGender, filledDOB, filledIntake);
                        } else {
                            curr = new Student(id, username, firstName, lastName, gender, dateOfBirth, intake);
                        }
                        studentList.add(curr);
                    }

                } catch (IOException fileError) {
                    System.out.println("FILE NOT FOUND!!");
                    System.exit(0);
                }

                //The int variable takes the smallest number that is available so any empty number will be filled rather than left it as a gap.
                //However, the number is taken by through parsing of idNumber in each line.
                FileWriter outputFile;
                currLine = "";
                outputFile = new FileWriter(".\\src\\\\tugasCok\\\\studentInfoList.txt");
                for (int index = 0; index < studentList.size(); index++) {
                    currLine = studentList.get(index).getIdNumber() + ";" + studentList.get(index).getUsername() + ";" + studentList.get(index).getFirstName() + ";" + studentList.get(index).getLastName() + ";" + studentList.get(index).getGender() + ";" + studentList.get(index).getDateOfBirth() + ";" + studentList.get(index).getIntake();
                    if (index > 0) {
                        outputFile.append('\n');
                    }
                    outputFile.append(currLine);
                }
                outputFile.close();
                currLine = "";
                ArrayList<String> userList = new ArrayList<>();
                ArrayList<String> passwordList = new ArrayList<>();
                ArrayList<String> userTypeList = new ArrayList<>();
                inputFile = new FileReader(".\\src\\tugasCok\\loginList.txt");
                in = new Scanner(inputFile);
                int countUser = 0;
                String candidateString, pass, userType = "";
                while (in.hasNext()) {
                    currLine = in.nextLine();
                    lineTokenizer = new Scanner(currLine);
                    lineTokenizer.useDelimiter(";");
                    candidateString = lineTokenizer.next();
                    if (originalUsername.compareTo(candidateString) == 0) {
                        userList.add(filledUser);
                        passwordList.add(String.valueOf(filledPass));
                        userTypeList.add("student");
                    } else {
                        userList.add(candidateString);
                        pass = lineTokenizer.next();
                        passwordList.add(pass);
                        userType = lineTokenizer.next();
                        userTypeList.add(userType);
                    }
                    countUser++;
                }
                in.close();
                try {
                    outputFile = new FileWriter(".\\src\\tugasCok\\loginList.txt");;
                    currLine = "";
                    for (int index = 0; index < countUser; index++) {
                        currLine = userList.get(index) + ";" + passwordList.get(index) + ";" + userTypeList.get(index);
                        if (index > 0) {
                            outputFile.append('\n');
                        }
                        outputFile.append(currLine);
                    }
                    outputFile.close();
                    JOptionPane.showMessageDialog(panel, "Modify success");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ModifyStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException fileError) {
            System.out.println("FILE NOT FOUND!!");
            System.exit(0);
        }
    }
    private void CancelButtoncancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtoncancel
        setVisible(false);
        removeAll();
        this.dispose();
    }//GEN-LAST:event_CancelButtoncancel

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
            java.util.logging.Logger.getLogger(ModifyStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyStudent("L-1", "tanveer2", "tanveer", "sikh", "Female", "10 Jun 2017", "UC2F/UC1F").setVisible(true);
            }
        });
    }
    private String originalUsername;
    private String targetedID;
    private ArrayList<Student> studentList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton CancelButton;
    private javax.swing.JSpinner DOBSpinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField intakeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton modifyButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
