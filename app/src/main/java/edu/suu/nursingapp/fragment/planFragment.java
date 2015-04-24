package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.soapActivity;

public class planFragment extends Fragment {
	private patient currentPatient;



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
		return inflater.inflate(R.layout.fragment_plan, container, false);
	}

	@Override
	public void onResume() {
		super.onResume();

		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
	}

	public void savePlan() {
		System.out.println("*******************************************");
		System.out.println("SavePlan");


//		currentPatient.getP().setND();
//		currentPatient.getP().setND2();
//		currentPatient.getP().setND3();
//		currentPatient.getP().setGoal();
//		currentPatient.getP().setGoal2();
//		currentPatient.getP().setGoal3();
//		currentPatient.getP().setIntervention();
//		currentPatient.getP().setIntervention2();
//		currentPatient.getP().setIntervention3();
//		currentPatient.getP().setEvaluation();
//		currentPatient.getP().setEvaluation2();
//		currentPatient.getP().setEvaluation3();

		((soapActivity) getActivity()).setCurrentPatient(currentPatient);


	}

	@Override
	public void onPause() {
		super.onPause();
		savePlan();
	}



}
