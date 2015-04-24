package edu.suu.nursingapp.controllers;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import edu.suu.nursingapp.R;


public class teacherViewController extends ActionBarActivity {

	private URL url;
	JSONArray array;
	int JSONIndex;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher_view);
		try {
			url = new URL("http://134.250.253.207/dumpTests.php");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		new makethiswork().execute(url);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void setDisplay(){
		JSONObject s = null;
		try {
			JSONArray array2 = array.getJSONArray(JSONIndex);
			s = array2.getJSONObject(0);

			TextView PatientID = (TextView) findViewById(R.id.PatientID);
			PatientID.setText("PatientID: " + s.getString("PatientID"));
			TextView StudentID = (TextView) findViewById(R.id.StudentID);
			StudentID.setText("StudentID: " + s.getString("StudentID"));
			TextView neck = (TextView) findViewById(R.id.neck);
			neck.setText("Neck: " + s.getString("neck"));
			TextView cardiac = (TextView) findViewById(R.id.cardiac);
			cardiac.setText("Cardiac: " + s.getString("cardiac"));
			TextView pulmonary = (TextView) findViewById(R.id.pulmonary);
			pulmonary.setText("Pulmonary: " + s.getString("pulmonary"));
			TextView abdominal = (TextView) findViewById(R.id.abdominal);
			abdominal.setText("Abdominal: " + s.getString("abdominal"));
			TextView genitourinary = (TextView) findViewById(R.id.genitourinary);
			genitourinary.setText("Genitourinary: " + s.getString("genitourinary"));

            TextView musculoskeletal = (TextView) findViewById(R.id.musculoskeletal);
            musculoskeletal.setText("Musculoskeletal: " + s.getString("musculoskeletal"));


			TextView neurologic = (TextView) findViewById(R.id.neurologic);
			neurologic.setText("Neurologic: " + s.getString("neurologic"));
			TextView integumentary = (TextView) findViewById(R.id.integumentary);
			integumentary.setText("Integumentary: " + s.getString("integumentary"));
			TextView psychological = (TextView) findViewById(R.id.psychological);
			psychological.setText("Psychological: " + s.getString("psychological"));
			TextView labWork = (TextView) findViewById(R.id.labWork);
			labWork.setText("Lab Work: " + s.getString("labWork"));
			TextView general = (TextView) findViewById(R.id.general);
			general.setText("General: " + s.getString("general"));
			TextView imagingResults = (TextView) findViewById(R.id.imagingResults);
			imagingResults.setText("Imaging Results: " + s.getString("imagingResults"));
			TextView medicalDiagnosis = (TextView) findViewById(R.id.medicalDiagnosis);
			medicalDiagnosis.setText("Medical Diagnosis: " + s.getString("medicalDiagnosis"));
			TextView gender = (TextView) findViewById(R.id.gender);
			gender.setText("Gender: " + s.getString("gender"));
			TextView lastName = (TextView) findViewById(R.id.lastName);
			lastName.setText("Last Name: " + s.getString("lastName"));
			TextView firstName = (TextView) findViewById(R.id.firstName);
			firstName.setText("First Name: " + s.getString("firstName"));
			TextView dob = (TextView) findViewById(R.id.dob);
			dob.setText("DOB: " + s.getString("dob"));
			TextView status = (TextView) findViewById(R.id.status);
			status.setText("Status: " + s.getString("status"));
			TextView observations = (TextView) findViewById(R.id.observations);
			observations.setText("Observations: " + s.getString("observations"));
			TextView ND = (TextView) findViewById(R.id.ND);
			ND.setText("ND: " + s.getString("ND"));
			TextView ND2 = (TextView) findViewById(R.id.ND2);
			ND2.setText("ND2: " + s.getString("ND2"));
			TextView ND3 = (TextView) findViewById(R.id.ND3);
			ND3.setText("ND3: " + s.getString("ND3"));
			TextView goal = (TextView) findViewById(R.id.Goal);
			goal.setText("Goal: " + s.getString("Goal"));
			TextView Goal2 = (TextView) findViewById(R.id.Goal2);
			Goal2.setText("Goal2: " + s.getString("Goal2"));
			TextView Goal3 = (TextView) findViewById(R.id.Goal3);
			Goal3.setText("Goal3: " + s.getString("Goal3"));
			TextView Intervention = (TextView) findViewById(R.id.Intervention);
			Intervention.setText("Intervention: " + s.getString("Intervention"));
			TextView Intervention2 = (TextView) findViewById(R.id.Intervention2);
			Intervention2.setText("Intervention2: " + s.getString("Intervention2"));
			TextView Intervention3 = (TextView) findViewById(R.id.Intervention3);
			Intervention3.setText("Intervention3: " + s.getString("Intervention3"));
			TextView Evaluation = (TextView) findViewById(R.id.Evaluation);
			Evaluation.setText("Evaluation: " + s.getString("Evaluation"));
			TextView Evaluation2 = (TextView) findViewById(R.id.Evaluation2);
			Evaluation2.setText("Evaluation2: " + s.getString("Evaluation2"));
			TextView Evaluation3 = (TextView) findViewById(R.id.Evaluation3);
			Evaluation3.setText("Evaluation3: " + s.getString("Evaluation3"));
			TextView chiefComplaint = (TextView) findViewById(R.id.chiefComplaint);
			chiefComplaint.setText("Chief Complaint: " + s.getString("chiefComplaint"));
			TextView pastMedicalHistory = (TextView) findViewById(R.id.pastMedicalHistory);
			pastMedicalHistory.setText("Past Medical History: " + s.getString("pastMedicalHistory"));
			TextView familyMedicalHistory = (TextView) findViewById(R.id.familyMedicalHistory);
			familyMedicalHistory.setText("Family Medical History: " + s.getString("familyMedicalHistory"));
			TextView socialHistory = (TextView) findViewById(R.id.socialHistory);
			socialHistory.setText("Social History: " + s.getString("socialHistory"));
			TextView medications = (TextView) findViewById(R.id.medications);
			medications.setText("Medications: " + s.getString("medications"));
			TextView allergies = (TextView) findViewById(R.id.allergies);
			allergies.setText("Allergies: " + s.getString("allergies"));
			TextView reviewOfSystems = (TextView) findViewById(R.id.reviewOfSystems);
			reviewOfSystems.setText("Review Of Systems: " + s.getString("reviewOfSystems"));
			TextView height = (TextView) findViewById(R.id.height);
			height.setText("Height: " + s.getString("height"));
			TextView weight = (TextView) findViewById(R.id.weight);
			weight.setText("Weight: " + s.getString("weight"));
			TextView bmi = (TextView) findViewById(R.id.bmi);
			bmi.setText("BMI: " + s.getString("bmi"));
			TextView bloodPressure1 = (TextView) findViewById(R.id.bloodPressure1);
			bloodPressure1.setText("Blood Pressure1: " + s.getString("bloodPressure1"));
			TextView bloodPressure2 = (TextView) findViewById(R.id.bloodPressure2);
			bloodPressure2.setText("Blood Pressure2: " + s.getString("bloodPressure2"));
			TextView temperature = (TextView) findViewById(R.id.temperature);
			temperature.setText("Temperature: " + s.getString("temperature"));
			TextView pulse = (TextView) findViewById(R.id.pulse);
			pulse.setText("Pulse: " + s.getString("pulse"));
			TextView respRate = (TextView) findViewById(R.id.respRate);
			respRate.setText("Resp Rate: " + s.getString("respRate"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void parseJSON() {

		InputStream inputStream = null;
		String result = null;
		try {
			URI URL = new URI("http://134.250.253.207/dumpTests.php");
			HttpClient httpclient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(URL);


			HttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);



		} catch (
				Exception e
				)

		{
			// Oops
		} finally

		{
			try {
				if (inputStream != null) inputStream.close();
				array = new JSONArray(result);
				//array2 = array.getJSONArray(0);
				JSONIndex = 0;
				setDisplay();
			} catch (Exception squish) {
			}
		}

	}

	public void clickNext(View view) {
		if (JSONIndex < array.length() - 1){
			JSONIndex++;
			setDisplay();
		}
	}

	public void clickPrevious(View view) {
		if (JSONIndex > 0){
			JSONIndex--;
			setDisplay();
		}
	}

	private class makethiswork extends AsyncTask<URL, Integer, Long> {


		@Override
		protected Long doInBackground(URL... params) {
			parseJSON();
			cancel(true);
			return null;
		}
	}
}

