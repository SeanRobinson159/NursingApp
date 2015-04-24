package edu.suu.nursingapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

import edu.suu.nursingapp.controllers.*;
import edu.suu.nursingapp.objects.patient;

/**
 * Created by sean on 4/1/15.
 */
public class MainActivity extends ActionBarActivity {

    private patient[] patients;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}

    public void loadPatients() {
        //TODO load patients from file, or from server
        patients = new patient[5];
        patients[0] = new patient("Robinson", "Dean", "Male", "01/02/1978", "Open");
        patients[1] = new patient("Barker", "Jane", "Female", "04/09/1990", "Open");
    }

	public void login(View v) {
		EditText userName = (EditText)findViewById(R.id.et_username);
		EditText password = (EditText)findViewById(R.id.et_password);

		if(userName.getText().toString().equals("Teacher") && password.getText().toString().equals("password")){
			Intent intent = new Intent(this, teacherViewController.class);
			startActivity(intent);
		}
		else {
			//Intent intent = new Intent(this, patientController.class);
			//startActivity(intent);
            loadPatients();
            Intent intent = new Intent(this, soapActivity.class);
            intent.putExtra("intentkey", patients[0]);
            startActivity(intent);
		}
	}
}