package com.bbms.web.models.donor;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DONOR_HEALTH_RELATED_INFORMATION")
public class DonorHealthRelatedInformation implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "HEMOGLOBIN", length = 20, nullable = true)
    private String hemoglobin;
    @Column(name = "WEIGHT", length = 20, nullable = true)
    private String weight;
    @Column(name = "HEIGHT", length = 20, nullable = true)
    private String height;
    @Column(name = "TEMPERATURE", length = 20, nullable = true)
    private String temperature;
    @Column(name = "PULSE", length = 20, nullable = true)
    private String pulse;
    @Column(name = "BLOOD_SUGAR_LEVEL", length = 20, nullable = true)
    private String bloodSugarLevel;
    @Column(name = "BLOOD_PRESSURE", length = 20, nullable = true)
    private String bloodPressure;
    @Column(name = "RESPIRATION_RATE", length = 20, nullable = true)
    private String respirationRate;
    @Column(name = "BLOOD_GROUP_ABO_RHESUS_D", length = 20, nullable = true)
    private String bloodGroupABORhesusD;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public DonorPersonalInformation getDonor() {
        return donor;
    }

    public void setDonor(DonorPersonalInformation donor) {
        this.donor = donor;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getBloodSugarLevel() {
        return bloodSugarLevel;
    }

    public void setBloodSugarLevel(String bloodSugarLevel) {
        this.bloodSugarLevel = bloodSugarLevel;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(String respirationRate) {
        this.respirationRate = respirationRate;
    }

    public String getBloodGroupABORhesusD() {
        return bloodGroupABORhesusD;
    }

    public void setBloodGroupABORhesusD(String bloodGroupABORhesusD) {
        this.bloodGroupABORhesusD = bloodGroupABORhesusD;
    }

}
