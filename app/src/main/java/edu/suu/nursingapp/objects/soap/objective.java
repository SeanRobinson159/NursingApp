package edu.suu.nursingapp.objects.soap;
import android.os.Parcel;
import android.os.Parcelable;

public class objective implements Parcelable {

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(observations);
	}
}
