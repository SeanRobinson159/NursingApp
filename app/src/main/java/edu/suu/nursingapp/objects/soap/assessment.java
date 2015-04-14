package edu.suu.nursingapp.objects.soap;

/**
 * Created by sean on 4/1/15.
 */
public class assessment {
	String general;
	String HEENT;
	String neck;
	String cardiac;
	String pulmonary;
	String abdominal;
	String genitourinary;
	String musculoskeletal;
	String neurologic;
	String integumentary;
	String psychological;
	String labWork;
	String imagingResults;
	String medicalDiagnosis;

	boolean generalNormal;
	boolean HEENTNormal;
	boolean neckNormal;
	boolean cardiacNormal;
	boolean pulmonaryNormal;
	boolean abdominalNormal;
	boolean genitourinaryNormal;
	boolean musculoskeletalNormal;
	boolean neurologicNormal;
	boolean integumentaryNormal;
	boolean psychologicalNormal;
	boolean imagingResultsNormal;

	public assessment() {
		general = "";
		HEENT = "";
		neck = "";
		cardiac = "";
		pulmonary = "";
		abdominal = "";
		genitourinary = "";
		musculoskeletal = "";
		neurologic = "";
		integumentary = "";
		psychological = "";
		labWork = "";
		imagingResults = "";
		medicalDiagnosis = "";

		generalNormal = false;
		HEENTNormal = false;
		neckNormal = false;
		cardiacNormal = false;
		pulmonaryNormal = false;
		abdominalNormal = false;
		genitourinaryNormal = false;
		musculoskeletalNormal = false;
		neurologicNormal = false;
		integumentaryNormal = false;
		psychologicalNormal = false;
		imagingResultsNormal = false;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public String getHEENT() {
		return HEENT;
	}

	public void setHEENT(String HEENT) {
		this.HEENT = HEENT;
	}

	public String getNeck() {
		return neck;
	}

	public void setNeck(String neck) {
		this.neck = neck;
	}

	public String getCardiac() {
		return cardiac;
	}

	public void setCardiac(String cardiac) {
		this.cardiac = cardiac;
	}

	public String getPulmonary() {
		return pulmonary;
	}

	public void setPulmonary(String pulmonary) {
		this.pulmonary = pulmonary;
	}

	public String getAbdominal() {
		return abdominal;
	}

	public void setAbdominal(String abdominal) {
		this.abdominal = abdominal;
	}

	public String getGenitourinary() {
		return genitourinary;
	}

	public void setGenitourinary(String genitourinary) {
		this.genitourinary = genitourinary;
	}

	public String getMusculoskeletal() {
		return musculoskeletal;
	}

	public void setMusculoskeletal(String musculoskeletal) {
		this.musculoskeletal = musculoskeletal;
	}

	public String getNeurologic() {
		return neurologic;
	}

	public void setNeurologic(String neurologic) {
		this.neurologic = neurologic;
	}

	public String getIntegumentary() {
		return integumentary;
	}

	public void setIntegumentary(String integumentary) {
		this.integumentary = integumentary;
	}

	public String getPsychological() {
		return psychological;
	}

	public void setPsychological(String psychological) {
		this.psychological = psychological;
	}

	public String getLabWork() {
		return labWork;
	}

	public void setLabWork(String labWork) {
		this.labWork = labWork;
	}

	public String getImagingResults() {
		return imagingResults;
	}

	public void setImagingResults(String imagingResults) {
		this.imagingResults = imagingResults;
	}

	public String getMedicalDiagnosis() {
		return medicalDiagnosis;
	}

	public void setMedicalDiagnosis(String medicalDiagnosis) {
		this.medicalDiagnosis = medicalDiagnosis;
	}

	public boolean isGeneralNormal() {
		return generalNormal;
	}

	public void setGeneralNormal(boolean generalNormal) {
		this.generalNormal = generalNormal;
	}

	public boolean isHEENTNormal() {
		return HEENTNormal;
	}

	public void setHEENTNormal(boolean HEENTNormal) {
		this.HEENTNormal = HEENTNormal;
	}

	public boolean isNeckNormal() {
		return neckNormal;
	}

	public void setNeckNormal(boolean neckNormal) {
		this.neckNormal = neckNormal;
	}

	public boolean isCardiacNormal() {
		return cardiacNormal;
	}

	public void setCardiacNormal(boolean cardiacNormal) {
		this.cardiacNormal = cardiacNormal;
	}

	public boolean isPulmonaryNormal() {
		return pulmonaryNormal;
	}

	public void setPulmonaryNormal(boolean pulmonaryNormal) {
		this.pulmonaryNormal = pulmonaryNormal;
	}

	public boolean isAbdominalNormal() {
		return abdominalNormal;
	}

	public void setAbdominalNormal(boolean abdominalNormal) {
		this.abdominalNormal = abdominalNormal;
	}

	public boolean isGenitourinaryNormal() {
		return genitourinaryNormal;
	}

	public void setGenitourinaryNormal(boolean genitourinaryNormal) {
		this.genitourinaryNormal = genitourinaryNormal;
	}

	public boolean isMusculoskeletalNormal() {
		return musculoskeletalNormal;
	}

	public void setMusculoskeletalNormal(boolean musculoskeletalNormal) {
		this.musculoskeletalNormal = musculoskeletalNormal;
	}

	public boolean isNeurologicNormal() {
		return neurologicNormal;
	}

	public void setNeurologicNormal(boolean neurologicNormal) {
		this.neurologicNormal = neurologicNormal;
	}

	public boolean isIntegumentaryNormal() {
		return integumentaryNormal;
	}

	public void setIntegumentaryNormal(boolean integumentaryNormal) {
		this.integumentaryNormal = integumentaryNormal;
	}

	public boolean isPsychologicalNormal() {
		return psychologicalNormal;
	}

	public void setPsychologicalNormal(boolean psychologicalNormal) {
		this.psychologicalNormal = psychologicalNormal;
	}

	public boolean isImagingResultsNormal() {
		return imagingResultsNormal;
	}

	public void setImagingResultsNormal(boolean imagingResultsNormal) {
		this.imagingResultsNormal = imagingResultsNormal;
	}
}
