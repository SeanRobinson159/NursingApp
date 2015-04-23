package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.soapActivity;

public class objectiveFragment extends Fragment {
	private patient currentPatient;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
		return inflater.inflate(R.layout.fragment_objective, container, false);
	}

	public void saveObjective() {
		System.out.println("*******************************************");
		System.out.println("SaveObjective");
//		currentPatient.getO().setObservations();
	}
}
