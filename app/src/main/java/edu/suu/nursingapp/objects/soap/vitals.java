package edu.suu.nursingapp.objects.soap;

import java.io.Serializable;

/**
 * Created by carleebunn on 3/31/2015.
 */
public class vitals implements Serializable {

    double height;
    double weight;
    double bmi;
    double bloodPressure1;
    double bloodPressure2;
    double temperature;
    double pulse;
    double respRate;
    String patientSummary;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        if (bmi > 0) {
            this.bmi = bmi;
        } else {
            this.bmi = 0;
        }
    }

    public double getBloodPressure1() {
        return bloodPressure1;
    }

    public void setBloodPressure1(double bloodPressure1) {
        if (bloodPressure1 > 0) {
            this.bloodPressure1 = bloodPressure1;
        } else {
            this.bloodPressure1 = 0;
        }
    }

    public double getBloodPressure2() {
        return bloodPressure2;
    }

    public void setBloodPressure2(double bloodPressure2) {
        if (bloodPressure2 > 0) {
            this.bloodPressure2 = bloodPressure2;
        } else {
            this.bloodPressure2 = 0;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature > 0) {
            this.temperature = temperature;
        } else {
            this.temperature = 0;
        }
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        if (pulse > 0) {
            this.pulse = pulse;
        } else {
            this.pulse = 0;
        }
    }

    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        if (respRate > 0) {
            this.respRate = respRate;
        } else {
            this.respRate = 0;
        }
    }
}