/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package tugasCok;
/**
 *
 * @author Albert
 */
public abstract class PersonInfo extends javax.swing.JFrame{

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getIntake() {
        return intake;
    }

    /**
     * @param password the password to set
     */
    public void setIntake(String intake) {
        this.intake = intake;
    }
    
    public PersonInfo(String id, String username, String firstName, String lastName, String gender, String dateOfBirth,String intake){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.intake = intake;
    }
    public PersonInfo(){
        this.firstName = "UNKNOWN";
        this.lastName = "NAME";
        this.idNumber = "X-X";
        this.gender = "Null";
        this.dateOfBirth = "01 Jan 1900";
        this.username = "unknown";
        this.intake = "INVALID INTAKE";
    }
    private String firstName;
    private String lastName;
    private String idNumber;
    private String gender;
    private String dateOfBirth;
    private String username;
    private String intake;
    
}
