package edu.suu.nursingapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.objects.soap.vitals;
import edu.suu.nursingapp.soapActivity;


public class vitalsFragment extends Fragment {
	private patient currentPatient;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
		System.out.println("********************************************");
		System.out.println(currentPatient.getFirstName());

		return inflater.inflate(R.layout.fragment_vitals, container, false);
	}

	public void onFocusChange(View view, boolean hasFocus) {
		if (!hasFocus) {

		}
	}

	@Override
	public void onPause() {
		super.onPause();
		EditText height = (EditText) getView().findViewById(R.id.heightEditText);
		if (currentPatient.getVitals() == null) {
			currentPatient.setVitals(new vitals());
		}
		if (!height.getText().toString().equals("")) {

			currentPatient.getVitals().setHeight(Double.parseDouble(height.getText().toString()));
			System.out.println(currentPatient.getVitals().getHeight());


//		EditText weight = (EditText) getView().findViewById(R.id.vitals_weight);
//		weight.setText(height.getText());
		}
	}


	public void saveVitals(){
		System.out.println("*******************************************");
		System.out.println("SaveVitals");
//		currentPatient.getVitals().setHeight();
//		currentPatient.getVitals().setWeight();
//		currentPatient.getVitals().setBmi();
//		currentPatient.getVitals().setBloodPressure1();
//		currentPatient.getVitals().setBloodPressure2();
//		currentPatient.getVitals().setTemperature();
//		currentPatient.getVitals().setPulse();
//		currentPatient.getVitals().setRespRate();
	}
}
