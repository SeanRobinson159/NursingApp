package edu.suu.nursingapp.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.soapActivity;

public class patientController extends ActionBarActivity {

	private patient[] patients;
	private patientController myself;
	public static final String INTENT_KEY_FROM_PATIENT_LIST = "intentkey";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myself = this;
		setContentView(R.layout.patient_list);
		loadPatients();
		setupTheView();

	}

	public void loadPatients() {
		//TODO load patients from file, or from server
		patients = new patient[5];
		patients[0] = new patient("Robinson", "Dean", "Male", "01/02/1978", "Open");
		patients[1] = new patient("Barker", "Jane", "Female", "04/09/1990", "Open");
	}

	public void setupTheView() {
		TableLayout tLayout = (TableLayout) findViewById(R.id.tableLayout1);


		for (int i = 0; i < patients.length; i++) {

			if (patients[i] == null) {
				patients[i] = new patient();

			}

			TableRow tablerow = new TableRow(this);
			TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
			tablerow.setLayoutParams(lp);
			tablerow.setPadding(10, 10, 10, 10);
			tablerow.setMinimumWidth(1250);

			TextView lastName = new TextView(this);
			TextView firstName = new TextView(this);
			TextView gender = new TextView(this);
			TextView dob = new TextView(this);
			TextView status = new TextView(this);

			lastName.setText(patients[i].getLastName());
			lastName.setWidth(250);
			lastName.setTextSize(25);
			lastName.setGravity(Gravity.CENTER);
			tablerow.addView(lastName);

			firstName.setText(patients[i].getFirstName());
			firstName.setWidth(250);
			firstName.setTextSize(25);
			firstName.setGravity(Gravity.CENTER);
			tablerow.addView(firstName);

			gender.setText(patients[i].getGender());
			gender.setWidth(250);
			gender.setTextSize(25);
			gender.setGravity(Gravity.CENTER);
			tablerow.addView(gender);

			dob.setText(patients[i].getDob());
			dob.setWidth(250);
			dob.setTextSize(25);
			dob.setGravity(Gravity.CENTER);
			tablerow.addView(dob);

			status.setText(patients[i].getStatus());
			status.setWidth(250);
			status.setTextSize(25);
			status.setGravity(Gravity.CENTER);
			tablerow.addView(status);

			tLayout.addView(tablerow, i + 2);

			final int tempVal = i;

			tablerow.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(myself, soapActivity.class);
					intent.putExtra("intentkey", patients[tempVal]);
					startActivity(intent);
				}
			});

		}

	}
}
