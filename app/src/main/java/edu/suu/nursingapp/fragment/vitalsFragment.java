package edu.suu.nursingapp.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.*;

public class vitalsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vitals, container, false);
    }

	public void onFocusChange(View view, boolean hasFocus){
		if(!hasFocus){

		}
	}
	public void onPause(View v){
		String height = ((EditText)getView().findViewById(R.id.heightEditText)).toString();
		getPatient().getVitals.setHeight(height);
	}
}
