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

public class assessmentFragment extends Fragment {
	private patient currentPatient;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
		return inflater.inflate(R.layout.fragment_assessment, container, false);
	}

	@Override
	public void onResume() {
		super.onResume();

		currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
	}


	public void saveAssessment() {
		System.out.println("*******************************************");
		System.out.println("SaveAssessment");

//		EditText





//		currentPatient.getA().setGeneral();
//		currentPatient.getA().setHEENT();
//		currentPatient.getA().setNeck();
//		currentPatient.getA().setCardiac();
//		currentPatient.getA().setPulmonary();
//		currentPatient.getA().setAbdominal();
//		currentPatient.getA().setGenitourinary();
//		currentPatient.getA().setMusculoskeletal();
//		currentPatient.getA().setNeurologic();
//		currentPatient.getA().setIntegumentary();
//		currentPatient.getA().setPsychological();
//		currentPatient.getA().setLabWork();
//		currentPatient.getA().setImagingResults();
//		currentPatient.getA().setMedicalDiagnosis();
//
//		//Check Boxes
//		currentPatient.getA().setGeneralNormal();
//		currentPatient.getA().setHEENTNormal();
//		currentPatient.getA().setNeckNormal();
//		currentPatient.getA().setCardiacNormal();
//		currentPatient.getA().setPulmonaryNormal();
//		currentPatient.getA().setAbdominalNormal();
//		currentPatient.getA().setGenitourinaryNormal();
//		currentPatient.getA().setMusculoskeletalNormal();
//		currentPatient.getA().setNeurologicNormal();
//		currentPatient.getA().setIntegumentaryNormal();
//		currentPatient.getA().setPsychologicalNormal();

				((soapActivity) getActivity()).setCurrentPatient(currentPatient);

	}

	@Override
	public void onPause() {
		super.onPause();
		saveAssessment();
	}


}
