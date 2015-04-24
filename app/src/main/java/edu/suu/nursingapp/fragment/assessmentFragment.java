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

        EditText general = (EditText) getView().findViewById(R.id.editGeneral);
        EditText HEENT = (EditText) getView().findViewById(R.id.editHEENT);
        EditText neck = (EditText) getView().findViewById(R.id.editNeck);
        EditText cardiac = (EditText) getView().findViewById(R.id.editCardiac);
        EditText pulmonary = (EditText) getView().findViewById(R.id.editPulmonary);
        EditText abdominal = (EditText) getView().findViewById(R.id.editAbdominal);
        EditText genitorianary = (EditText) getView().findViewById(R.id.editGenitourinary);
        EditText musculoskeletal = (EditText) getView().findViewById(R.id.editMusculoskeletal);
        EditText neurologic = (EditText) getView().findViewById(R.id.editNeurologic);
        EditText integumentary = (EditText) getView().findViewById(R.id.editIntegumentary);
        EditText psychological = (EditText) getView().findViewById(R.id.editPsychological);
        EditText labWork = (EditText) getView().findViewById(R.id.editLabWork);
        EditText imagingResults = (EditText) getView().findViewById(R.id.editImagingResults);
        EditText medicalDiagnosis = (EditText) getView().findViewById(R.id.editMedicalDiagnosis);


        currentPatient.getA().setGeneral(general.getText().toString());
        currentPatient.getA().setHEENT(HEENT.getText().toString());
        currentPatient.getA().setNeck(neck.getText().toString());
        currentPatient.getA().setCardiac(cardiac.getText().toString());
        currentPatient.getA().setPulmonary(pulmonary.getText().toString());
        currentPatient.getA().setAbdominal(abdominal.getText().toString());
        currentPatient.getA().setGenitourinary(genitorianary.getText().toString());
        currentPatient.getA().setMusculoskeletal(musculoskeletal.getText().toString());
        currentPatient.getA().setNeurologic(neurologic.getText().toString());
        currentPatient.getA().setIntegumentary(integumentary.getText().toString());
        currentPatient.getA().setPsychological(psychological.getText().toString());
        currentPatient.getA().setLabWork(labWork.getText().toString());
        currentPatient.getA().setImagingResults(imagingResults.getText().toString());
        currentPatient.getA().setMedicalDiagnosis(medicalDiagnosis.getText().toString());
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
