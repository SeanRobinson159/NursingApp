package edu.suu.nursingapp.controllers;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import edu.suu.nursingapp.R;
import edu.suu.nursingapp.objects.patient;

/**
 * Created by sean on 4/14/15.
 */
public class patientController extends ActionBarActivity {

	private patient p;


	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.patient_list);
	}

}
