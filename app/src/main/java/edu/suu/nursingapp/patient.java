package edu.suu.nursingapp;

/**
 * Created by sean on 4/1/15.
 */
public class patient {
    private edu.suu.nursingapp.subjective s;
    private edu.suu.nursingapp.objective o;
    private edu.suu.nursingapp.assessment a;
    private edu.suu.nursingapp.plan p;
    private edu.suu.nursingapp.vitals vitals;

    private String lastName;
    private String firstName;
    private String gender;
    private String dob;
    private String status;


    public patient() {
        s = null;
        o = null;
        a = null;
        p = null;
        vitals = null;

        lastName = "Doe";
        firstName = "John";
        gender = "Male";
        dob = "01/01/1960";
        status = "Open";
    }

    public patient(String lastName, String firstName, String gender, String dob, String status) {
        s = null;
        o = null;
        a = null;
        p = null;
        vitals = null;

        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.dob = dob;
        this.status = status;
    }

    public patient(edu.suu.nursingapp.subjective s, edu.suu.nursingapp.objective o, edu.suu.nursingapp.assessment a, edu.suu.nursingapp.plan p, edu.suu.nursingapp.vitals vitals, String lastName, String firstName, String gender, String dob, String status) {
        this.s = s;
        this.o = o;
        this.a = a;
        this.p = p;
        this.vitals = vitals;

        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.dob = dob;
        this.status = status;
    }

    public edu.suu.nursingapp.subjective getS() {
        return s;
    }

    public void setS(edu.suu.nursingapp.subjective s) {
        this.s = s;
    }

    public edu.suu.nursingapp.objective getO() {
        return o;
    }

    public void setO(edu.suu.nursingapp.objective o) {
        this.o = o;
    }

    public edu.suu.nursingapp.assessment getA() {
        return a;
    }

    public void setA(edu.suu.nursingapp.assessment a) {
        this.a = a;
    }

    public edu.suu.nursingapp.plan getP() {
        return p;
    }

    public void setP(edu.suu.nursingapp.plan p) {
        this.p = p;
    }

    public edu.suu.nursingapp.vitals getVitals() {
        return vitals;
    }

    public void setVitals(edu.suu.nursingapp.vitals vitals) {
        this.vitals = vitals;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
