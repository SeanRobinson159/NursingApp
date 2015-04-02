package edu.suu.nursingapp.soap;

/**
 * Created by sean on 4/1/15.
 */
public class subjective {

    private String chiefComplaint;
    private String pastMedicalHistory;
    private String familyMedicalHistory;
    private String socialHistory;
    private String medications;
    private String allergies;
    private String reviewOfSystems;

    public subjective() {
        chiefComplaint = "";
        pastMedicalHistory = "";
        familyMedicalHistory = "";
        socialHistory = "";
        medications = "";
        allergies = "";
        reviewOfSystems = "";
    }
    public subjective(String chiefComplaint, String pastMedicalHistory, String familyMedicalHistory, String socialHistory, String medications, String allergies, String reviewOfSystems){
        this.chiefComplaint = chiefComplaint;
        this.pastMedicalHistory = pastMedicalHistory;
        this.familyMedicalHistory = familyMedicalHistory;
        this.socialHistory = socialHistory;
        this.medications = medications;
        this.allergies = allergies;
        this.reviewOfSystems = reviewOfSystems;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getPastMedicalHistory() {
        return pastMedicalHistory;
    }

    public void setPastMedicalHistory(String pastMedicalHistory) {
        this.pastMedicalHistory = pastMedicalHistory;
    }

    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public void setFamilyMedicalHistory(String familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

    public String getSocialHistory() {
        return socialHistory;
    }

    public void setSocialHistory(String socialHistory) {
        this.socialHistory = socialHistory;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getReviewOfSystems() {
        return reviewOfSystems;
    }

    public void setReviewOfSystems(String reviewOfSystems) {
        this.reviewOfSystems = reviewOfSystems;
    }


}
