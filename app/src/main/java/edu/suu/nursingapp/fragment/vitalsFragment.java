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
        saveVitals();

    }

    @Override
    public void onResume() {
        super.onResume();
        currentPatient = ((soapActivity) getActivity()).getCurrentPatient();
    }

    public void saveVitals() {
        System.out.println("*******************************************");
        System.out.println("SaveVitals");
        try {
            EditText height = (EditText) getView().findViewById(R.id.heightEditText);
            EditText weight = (EditText) getView().findViewById(R.id.weightEditText);
            EditText bmi = (EditText) getView().findViewById(R.id.bmiEditText);
            EditText bp1 = (EditText) getView().findViewById(R.id.bp1EditText);
            EditText bp2 = (EditText) getView().findViewById(R.id.bp2EditText);
            EditText temp = (EditText) getView().findViewById(R.id.tempEditText);
            EditText pulse = (EditText) getView().findViewById(R.id.pulseEditText);
            EditText rr = (EditText) getView().findViewById(R.id.rrEditText);
            EditText studentName = (EditText) getView().findViewById(R.id.vitals_studentNameEditText);
            EditText patientName = (EditText) getView().findViewById(R.id.vitals_patientNameEditText);


            currentPatient.setStudentName(studentName.getText().toString());
            currentPatient.setPatientID(patientName.getText().toString());
            currentPatient.getVitals().setHeight(Double.parseDouble(height.getText().toString()));
            currentPatient.getVitals().setWeight(Double.parseDouble(weight.getText().toString()));
            currentPatient.getVitals().setBmi(Double.parseDouble(bmi.getText().toString()));
            currentPatient.getVitals().setBloodPressure1(Double.parseDouble(bp1.getText().toString()));
            currentPatient.getVitals().setBloodPressure2(Double.parseDouble(bp2.getText().toString()));
            currentPatient.getVitals().setTemperature(Double.parseDouble(temp.getText().toString()));
            currentPatient.getVitals().setPulse(Double.parseDouble(pulse.getText().toString()));
            currentPatient.getVitals().setRespRate(Double.parseDouble(rr.getText().toString()));


            ((soapActivity) getActivity()).setCurrentPatient(currentPatient);


        } catch (NullPointerException e) {
            System.out.println("******IT BROKE******");
        } catch (NumberFormatException e) {
            System.out.println("******IT BROKE******");

        }
    }
}
