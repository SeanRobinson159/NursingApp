package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
//		currentPatient.getS().setChiefComplaint();
//		currentPatient.getS().setPastMedicalHistory();
//		currentPatient.getS().setFamilyMedicalHistory();
//		currentPatient.getS().setSocialHistory();
//		currentPatient.getS().setMedications();
//		currentPatient.getS().setReviewOfSystems();

		((soapActivity) getActivity()).setCurrentPatient(currentPatient);

	}

	@Override
	public void onPause(){
		super.onPause();
		saveSubjective();
	}
}
