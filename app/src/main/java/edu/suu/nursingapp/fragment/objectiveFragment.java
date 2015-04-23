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

public class objectiveFragment extends Fragment {
	private patient currentPatient;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
		return inflater.inflate(R.layout.fragment_objective, container, false);
	}

	@Override
	public void onResume() {
		super.onResume();

		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
	}

	public void saveObjective() {
		System.out.println("*******************************************");
		System.out.println("SaveObjective");

		EditText observation = (EditText) getView().findViewById(R.id.objectiveEditText);
		currentPatient.getO().setObservations(observation.getText().toString());

		((soapActivity) getActivity()).setCurrentPatient(currentPatient);

	}

	@Override
	public void onPause(){
		super.onPause();
		saveObjective();
	}
}
