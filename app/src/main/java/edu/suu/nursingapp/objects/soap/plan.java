package edu.suu.nursingapp.objects.soap;

import java.io.Serializable;

/**
 * Created by sean on 4/1/15.
 */
public class plan implements Serializable{
	/*
    Only falcuty can edit
    Nursing Diagnosis (ND)//up to three boxes
    Goal: //up to three boxes
    Intervention: // up to three boxes
    Evaluation: // up to three boxes
     */
	public String ND;
	public String ND2;
	public String ND3;
	public String Goal;
	public String Goal2;
	public String Goal3;
	public String Intervention;
	public String Intervention2;
	public String Intervention3;
	public String Evaluation;
	public String Evaluation2;
	public String Evaluation3;

	public plan(){

	}

	public plan(String ND, String ND2, String ND3, String Goal, String Goal2, String Goal3, String Intervention, String Intervention2, String Intervention3, String Evaluation, String Evaluation2, String Evaluation3){
		setND(ND);
		setND2(ND2);
		setND3(ND3);
		setGoal(Goal);
		setGoal2(Goal2);
		setGoal3(Goal3);
		setIntervention(Intervention);
		setIntervention2(Intervention2);
		setIntervention3(Intervention3);
		setEvaluation(Evaluation);
		setEvaluation2(Evaluation2);
		setEvaluation3(Evaluation3);
	}

//	private Plan(Parcel in){
//		setND(in.readString());
//		setND2(in.readString());
//		setND3(in.readString());
//		setGoal(in.readString());
//		setGoal2(in.readString());
//		setGoal3(in.readString());
//		setIntervention(in.readString());
//		setIntervention2(in.readString());
//		setIntervention3(in.readString());
//		setEvaluation(in.readString());
//		setEvaluation2(in.readString());
//		setEvaluation3(in.readString());
//	}



	public String getND() {
		return ND;
	}

	public void setND(String ND) {
		this.ND = ND;
	}

	public String getND2() {
		return ND2;
	}

	public void setND2(String ND2) {
		this.ND2 = ND2;
	}

	public String getND3() {
		return ND3;
	}

	public void setND3(String ND3) {
		this.ND3 = ND3;
	}

	public String getGoal() {
		return Goal;
	}

	public void setGoal(String goal) {
		Goal = goal;
	}

	public String getGoal2() {
		return Goal2;
	}

	public void setGoal2(String goal2) {
		Goal2 = goal2;
	}

	public String getGoal3() {
		return Goal3;
	}

	public void setGoal3(String goal3) {
		Goal3 = goal3;
	}

	public String getIntervention() {
		return Intervention;
	}

	public void setIntervention(String intervention) {
		Intervention = intervention;
	}

	public String getIntervention2() {
		return Intervention2;
	}

	public void setIntervention2(String intervention2) {
		Intervention2 = intervention2;
	}

	public String getIntervention3() {
		return Intervention3;
	}

	public void setIntervention3(String intervention3) {
		Intervention3 = intervention3;
	}

	public String getEvaluation() {
		return Evaluation;
	}

	public void setEvaluation(String evaluation) {
		Evaluation = evaluation;
	}

	public String getEvaluation2() {
		return Evaluation2;
	}

	public void setEvaluation2(String evaluation2) {
		Evaluation2 = evaluation2;
	}

	public String getEvaluation3() {
		return Evaluation3;
	}

	public void setEvaluation3(String evaluation3) {
		Evaluation3 = evaluation3;
	}

//	@Override
//	public int describeContents(){
//		return 0;
//	}
//
//	@Override
//	public void writeToParcel(Parcel dest, int flags) {
//		dest.writeString(ND);
//		dest.writeString(ND2);
//		dest.writeString(ND3);
//		dest.writeString(Goal);
//		dest.writeString(Goal2);
//		dest.writeString(Goal3);
//		dest.writeString(Intervention);
//		dest.writeString(Intervention2);
//		dest.writeString(Intervention3);
//		dest.writeString(Evaluation);
//		dest.writeString(Evaluation2);
//		dest.writeString(Evaluation3);
//	}
}
