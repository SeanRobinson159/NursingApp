package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.*;
import edu.suu.nursingapp.objects.patient;

public class subjectiveFragment extends Fragment {

	private patient currentPatient;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    currentPatient = ((soapActivity) getActivity()).getCurrentPatient();

	    return inflater.inflate(R.layout.fragment_subjective, container, false);
    }


	public void saveSubjective(){
		System.out.println("*******************************************");
		System.out.println("SaveSubjective");
//		currentPatient.getS().setChiefComplaint();
//		currentPatient.getS().setPastMedicalHistory();
//		currentPatient.getS().setFamilyMedicalHistory();
//		currentPatient.getS().setSocialHistory();
//		currentPatient.getS().setMedications();
//		currentPatient.getS().setReviewOfSystems();
	}
}
