package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.soapActivity;

public class subjectiveFragment extends Fragment {

	private patient currentPatient;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();

		return inflater.inflate(R.layout.fragment_subjective, container, false);
	}

	@Override
	public void onResume() {
		super.onResume();

		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
	}

	public void saveSubjective() {
		System.out.println("*******************************************");
		System.out.println("SaveSubjective");

		EditText chiefComplaint = (EditText) getActivity().findViewById(R.id.subjective_cc_edittext);
		EditText pastMedicalHistory = (EditText) getActivity().findViewById(R.id.subjective_pmh_edittext);
		EditText familyMedicalHistory = (EditText) getActivity().findViewById(R.id.subjective_fmh_edittext);
		EditText socialHistory = (EditText) getActivity().findViewById(R.id.subjective_sh_edittext);
		EditText medications = (EditText) getActivity().findViewById(R.id.subjective_meds_edittext);
		EditText reviewOfSystems = (EditText) getActivity().findViewById(R.id.subjective_ros_edittext);


		currentPatient.getS().setChiefComplaint(chiefComplaint.getText().toString());
		currentPatient.getS().setPastMedicalHistory(pastMedicalHistory.getText().toString());
		currentPatient.getS().setFamilyMedicalHistory(familyMedicalHistory.getText().toString());
		currentPatient.getS().setSocialHistory(socialHistory.getText().toString());
		currentPatient.getS().setMedications(medications.getText().toString());
		currentPatient.getS().setReviewOfSystems(reviewOfSystems.getText().toString());

		((soapActivity) getActivity()).setCurrentPatient(currentPatient);

	}

	@Override
	public void onPause() {
		super.onPause();
		saveSubjective();
	}
}
