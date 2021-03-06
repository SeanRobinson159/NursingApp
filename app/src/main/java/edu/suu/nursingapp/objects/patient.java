package edu.suu.nursingapp.objects;

import java.io.Serializable;

import edu.suu.nursingapp.objects.soap.*;

public class patient implements Serializable {
    private edu.suu.nursingapp.objects.soap.subjective s;
    private edu.suu.nursingapp.objects.soap.objective o;
    private edu.suu.nursingapp.objects.soap.assessment a;
    private edu.suu.nursingapp.objects.soap.plan p;
    private edu.suu.nursingapp.objects.soap.vitals vitals;

    private String lastName;
    private String firstName;
    private String gender;
    private String dob;
    private String status;
    private String studentName;
    private String patientID;

    public patient() {
        s = new subjective();
        o = new objective();
        a = new assessment();
        p = new plan();
        vitals = new vitals();
        studentName = "NO NAME";

        lastName = "Doe";
        firstName = "John";
        gender = "Male";
        dob = "01/01/1960";
        status = "Open";
    }

    public patient(String lastName, String firstName, String gender, String dob, String status) {
        s = new subjective();
        o = new objective();
        a = new assessment();
        p = new plan();
        vitals = new vitals();

        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.dob = dob;
        this.status = status;
    }

    public patient(edu.suu.nursingapp.objects.soap.subjective s, edu.suu.nursingapp.objects.soap.objective o, edu.suu.nursingapp.objects.soap.assessment a, edu.suu.nursingapp.objects.soap.plan p, edu.suu.nursingapp.objects.soap.vitals vitals, String lastName, String firstName, String gender, String dob, String status) {
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

    public edu.suu.nursingapp.objects.soap.subjective getS() {
        return s;
    }

    public void setS(edu.suu.nursingapp.objects.soap.subjective s) {
        this.s = s;
    }

    public edu.suu.nursingapp.objects.soap.objective getO() {
        return o;
    }

    public void setO(edu.suu.nursingapp.objects.soap.objective o) {
        this.o = o;
    }

    public edu.suu.nursingapp.objects.soap.assessment getA() {
        return a;
    }

    public void setA(edu.suu.nursingapp.objects.soap.assessment a) {
        this.a = a;
    }

    public edu.suu.nursingapp.objects.soap.plan getP() {
        return p;
    }

    public void setP(edu.suu.nursingapp.objects.soap.plan p) {
        this.p = p;
    }

    public edu.suu.nursingapp.objects.soap.vitals getVitals() {
        return vitals;
    }

    public void setVitals(edu.suu.nursingapp.objects.soap.vitals vitals) {
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
}
