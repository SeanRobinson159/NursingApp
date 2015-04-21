package edu.suu.nursingapp.objects.soap;

import java.io.Serializable;

public class objective implements Serializable {

	private String observations;


	public objective()
	{
		observations = "";
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}


}
