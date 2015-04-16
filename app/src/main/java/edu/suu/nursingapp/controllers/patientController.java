package edu.suu.nursingapp.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.soapActivity;

/**
 * Created by sean on 4/14/15.
 */
public class patientController extends ActionBarActivity {

	private patient[] patients;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		loadPatients();
		//setupTheView();

		setContentView(R.layout.patient_list);
	}

	public void loadPatients(){
		//TODO load patients from file, or from server
		patients = new patient[10];
	}

	public void setupTheView(){
		//TODO Make this actually work....
		patients[0] = new patient();

		TextView lastName = (TextView) findViewById(R.id.p1_last);
		TextView firstName = (TextView) findViewById(R.id.p1_first);
		TextView gender = (TextView) findViewById(R.id.p1_gender);
		TextView dob = (TextView) findViewById(R.id.p1_dob);
		TextView status = (TextView) findViewById(R.id.p1_status);


		lastName.setText(patients[0].getLastName());
		firstName.setText(patients[0].getFirstName());
		gender.setText(patients[0].getGender());
		dob.setText(patients[0].getDob());
		status.setText(patients[0].getStatus());


	}

	public void TabbedView(View v) {
		Intent intent = new Intent(this, soapActivity.class);
		startActivity(intent);
	}

}
