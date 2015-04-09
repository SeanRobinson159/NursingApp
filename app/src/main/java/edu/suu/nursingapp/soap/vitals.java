package edu.suu.nursingapp.soap;

/**
 * Created by carleebunn on 3/31/2015.
 */
public class vitals {

    double height;
    double weight;
    int bmi;
    int bloodPressure1;
    int bloodPressure2;
    double temperature;
    int pulse;
    int respRate;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
        else{
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

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        if (bmi > 0) {
            this.bmi = bmi;
        } else {
            this.bmi = 0;
        }
    }

    public int getBloodPressure1() {
        return bloodPressure1;
    }

    public void setBloodPressure1(int bloodPressure1) {
        if (bloodPressure1 > 0) {
            this.bloodPressure1 = bloodPressure1;
        } else {
            this.bloodPressure1 = 0;
        }
    }

    public int getBloodPressure2() {
        return bloodPressure2;
    }

    public void setBloodPressure2(int bloodPressure2) {
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

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        if (pulse > 0) {
            this.pulse = pulse;
        } else {
            this.pulse = 0;
        }
    }

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        if (respRate > 0) {
            this.respRate = respRate;
        } else {
            this.respRate = 0;
        }
    }
}