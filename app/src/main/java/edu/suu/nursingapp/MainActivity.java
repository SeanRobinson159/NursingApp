package edu.suu.nursingapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

import edu.suu.nursingapp.controllers.*;

/**
 * Created by sean on 4/1/15.
 */
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}

	public void login(View v) {
		EditText userName = (EditText)findViewById(R.id.et_username);
		EditText password = (EditText)findViewById(R.id.et_password);

		if(userName.getText().toString().equals("Teacher") && password.getText().toString().equals("password")){
			Intent intent = new Intent(this, teacherViewController.class);
			startActivity(intent);
		}
		else {
			Intent intent = new Intent(this, patientController.class);
			startActivity(intent);
		}
	}
}