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

        EditText nd = (EditText) getView().findViewById(R.id.ndText1);
        EditText nd2 = (EditText) getView().findViewById(R.id.ndText2);
        EditText nd3 = (EditText) getView().findViewById(R.id.ndText3);

        EditText goal = (EditText) getView().findViewById(R.id.goalText1);
        EditText goal2 = (EditText) getView().findViewById(R.id.goalText2);
        EditText goal3 = (EditText) getView().findViewById(R.id.goalText3);

        EditText i = (EditText) getView().findViewById(R.id.interventionText1);
        EditText i2 = (EditText) getView().findViewById(R.id.interventionText2);
        EditText i3 = (EditText) getView().findViewById(R.id.interventionText3);

        EditText e = (EditText) getView().findViewById(R.id.evalText1);
        EditText e2 = (EditText) getView().findViewById(R.id.evalText2);
        EditText e3 = (EditText) getView().findViewById(R.id.evalText3);


        currentPatient.getP().setND(nd.getText().toString());
        currentPatient.getP().setND2(nd2.getText().toString());
        currentPatient.getP().setND3(nd3.getText().toString());
        currentPatient.getP().setGoal(goal.getText().toString());
        currentPatient.getP().setGoal2(goal2.getText().toString());
        currentPatient.getP().setGoal3(goal3.getText().toString());
        currentPatient.getP().setIntervention(i.getText().toString());
        currentPatient.getP().setIntervention2(i2.getText().toString());
        currentPatient.getP().setIntervention3(i3.getText().toString());
        currentPatient.getP().setEvaluation(e.getText().toString());
        currentPatient.getP().setEvaluation2(e2.getText().toString());
        currentPatient.getP().setEvaluation3(e3.getText().toString());

        ((soapActivity) getActivity()).setCurrentPatient(currentPatient);


    }

    @Override
    public void onPause() {
        super.onPause();
        savePlan();
    }

}
