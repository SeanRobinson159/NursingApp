package edu.suu.nursingapp;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import edu.suu.nursingapp.objects.patient;
import edu.suu.nursingapp.objects.soap.assessment;
import edu.suu.nursingapp.objects.soap.objective;
import edu.suu.nursingapp.objects.soap.plan;
import edu.suu.nursingapp.objects.soap.subjective;
import edu.suu.nursingapp.objects.soap.vitals;

/**
 * Created by Toby on 4/21/2015.
 */
public class ApiConnector {

	private static patient whoami;
	private URL url;

	public JSONArray GetAllTests() {
		// URL for getting all Tests

		String url = "http://134.250.253.207/createPatient.php";

		// Get HttpResponse Object from url.
		// Get HttpEntity from Http Response Object

		HttpEntity httpEntity = null;

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();  // Default HttpClient
			HttpGet httpGet = new HttpGet(url);

			HttpResponse httpResponse = httpClient.execute(httpGet);

			httpEntity = httpResponse.getEntity();


		} catch (ClientProtocolException e) {

			// Signals error in http protocol
			e.printStackTrace();

			//Log Errors Here


		} catch (IOException e) {
			e.printStackTrace();
		}


		// Convert HttpEntity into JSON Array
		JSONArray jsonArray = null;

		if (httpEntity != null) {
			try {
				String entityResponse = EntityUtils.toString(httpEntity);

				Log.e("Entity Response  : ", entityResponse);

				jsonArray = new JSONArray(entityResponse);

			} catch (JSONException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return jsonArray;


	}

	public void sendJSON(patient p){
		whoami = p;
		try {
			url = new URL("http://134.250.253.207/createPatient.php");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		new makethiswork().execute(url);


	}

	public static void sendJSON2() {
		patient p = whoami;
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000); //Timeout Limit

		try {
			URI URL = new URI("http://134.250.253.207/createPatient.php");
			HttpPost post = new HttpPost(URL);

			vitals v = p.getVitals();
			subjective s = p.getS();
			objective o = p.getO();
			assessment a = p.getA();
			plan pl = p.getP();

			JSONObject jObject = new JSONObject();
			//Creating the jsonObject
			//Patient
			jObject.put("studentID", p.getStudentName());
			jObject.put("patientID", p.getFirstName() + p.getLastName());
			jObject.put("gender", p.getGender());
			jObject.put("dob", p.getDob());
			jObject.put("status", p.getStatus());

			//Vitals
			jObject.put("height", v.getHeight() + "");
			jObject.put("weight", v.getWeight() + "");
			jObject.put("bmi", v.getBmi() + "");
			jObject.put("bloodPressure1", v.getBloodPressure1() + "");
			jObject.put("bloodPressure2", v.getBloodPressure2() + "");
			jObject.put("temperature", v.getTemperature() + "");
			jObject.put("pulse", v.getPulse() + "");
			jObject.put("respRate", v.getRespRate() + "");

			//Subjective
			jObject.put("chiefComplaint", s.getChiefComplaint());
			jObject.put("pastMedicalHistory", s.getPastMedicalHistory());
			jObject.put("familyMedicalHistory", s.getFamilyMedicalHistory());
			jObject.put("socialHistory", s.getSocialHistory());
			jObject.put("medications", s.getMedications());
			jObject.put("allergies", s.getAllergies());
			jObject.put("reviewOfSystems", s.getReviewOfSystems());

			//Objective
			jObject.put("observations", o.getObservations());

			//Assessment
			jObject.put("general", a.getGeneral());
			jObject.put("HEENT", a.getHEENT());
			jObject.put("neck", a.getNeck());
			jObject.put("cardiac", a.getCardiac());
			jObject.put("pulmonary", a.getPulmonary());
			jObject.put("abdominal", a.getAbdominal());
			jObject.put("genitourinary", a.getGenitourinary());
			jObject.put("musculoskeletal", a.getMusculoskeletal());
			jObject.put("neurologic", a.getNeurologic());
			jObject.put("integumentary", a.getIntegumentary());
			jObject.put("psychological", a.getPsychological());
			jObject.put("labWork", a.getLabWork());
			jObject.put("imagingResults", a.getImagingResults());
			jObject.put("medicalDiagnosis", a.getMedicalDiagnosis());

			//Plan
			jObject.put("ND", pl.getND());
			jObject.put("ND2", pl.getND2());
			jObject.put("ND3", pl.getND3());
			jObject.put("Goal", pl.getGoal());
			jObject.put("Goal2", pl.getGoal2());
			jObject.put("Goal3", pl.getGoal3());
			jObject.put("Intervention", pl.getIntervention());
			jObject.put("Intervention2", pl.getIntervention2());
			jObject.put("Intervention3", pl.getIntervention3());
			jObject.put("Evaluation", pl.getEvaluation());
			jObject.put("Evalutation2", pl.getEvaluation2());
			jObject.put("Evalutation3", pl.getEvaluation3());

			//Done Creating the jsonObject
			StringEntity se = new StringEntity(jObject.toString());
			se.setContentType("application/json;charset=UTF-8");

			post.setEntity(se);

			client.execute(post);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private class makethiswork extends AsyncTask<URL, Integer, Long> {


		@Override
		protected Long doInBackground(URL... params) {
			sendJSON2();
			cancel(true);
			return null;
		}
	}
}
