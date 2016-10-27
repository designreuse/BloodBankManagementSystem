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
@Table(name = "DONOR_SUFFERING_HISTORY")
public class DonorSufferingHistory implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "HEPATITIS", length = 6, nullable = true)
    private String hepatitis;
    @Column(name = "JAUNDICE", length = 6, nullable = true)
    private String jaundice;
    @Column(name = "MALARIA", length = 6, nullable = true)
    private String malaria;
    @Column(name = "EPILEPSY", length = 6, nullable = true)
    private String epilepsy;
    @Column(name = "HEART_DISEASE", length = 6, nullable = true)
    private String heartDisease;
    @Column(name = "DIABETES", length = 6, nullable = true)
    private String diabetes;
    @Column(name = "SEXUAL_DISEASE", length = 6, nullable = true)
    private String sexualDisease;
    @Column(name = "ASTHMA", length = 6, nullable = true)
    private String asthma;
    @Column(name = "ECZEMA", length = 6, nullable = true)
    private String eczema;
    @Column(name = "HIGH_BLOOD_RPESSURE", length = 6, nullable = true)
    private String highBloodPressure;
    @Column(name = "KIDNEY_DISEASE", length = 6, nullable = true)
    private String kidneyDisease;
    @Column(name = "TV", length = 6, nullable = true)
    private String tv;
    @Column(name = "HIV", length = 6, nullable = true)
    private String hiv;
    @Column(name = "PYLOS", length = 6, nullable = true)
    private String pylos;
    @Column(name = "CANCER", length = 6, nullable = true)
    private String cancer;
    @Column(name = "PEPTIC_ULCER", length = 6, nullable = true)
    private String pepticUlcer;
    @Column(name = "LUNG_DISEASE", length = 6, nullable = true)
    private String lungDisease;
    @Column(name = "LIVER_DISEASE", length = 6, nullable = true)
    private String liverDisease;

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

    public String getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(String hepatitis) {
        this.hepatitis = hepatitis;
    }

    public String getJaundice() {
        return jaundice;
    }

    public void setJaundice(String jaundice) {
        this.jaundice = jaundice;
    }

    public String getMalaria() {
        return malaria;
    }

    public void setMalaria(String malaria) {
        this.malaria = malaria;
    }

    public String getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(String epilepsy) {
        this.epilepsy = epilepsy;
    }

    public String getHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(String heartDisease) {
        this.heartDisease = heartDisease;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getSexualDisease() {
        return sexualDisease;
    }

    public void setSexualDisease(String sexualDisease) {
        this.sexualDisease = sexualDisease;
    }

    public String getAsthma() {
        return asthma;
    }

    public void setAsthma(String asthma) {
        this.asthma = asthma;
    }

    public String getEczema() {
        return eczema;
    }

    public void setEczema(String eczema) {
        this.eczema = eczema;
    }

    public String getHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(String highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    public String getKidneyDisease() {
        return kidneyDisease;
    }

    public void setKidneyDisease(String kidneyDisease) {
        this.kidneyDisease = kidneyDisease;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getHiv() {
        return hiv;
    }

    public void setHiv(String hiv) {
        this.hiv = hiv;
    }

    public String getPylos() {
        return pylos;
    }

    public void setPylos(String pylos) {
        this.pylos = pylos;
    }

    public String getCancer() {
        return cancer;
    }

    public void setCancer(String cancer) {
        this.cancer = cancer;
    }

    public String getPepticUlcer() {
        return pepticUlcer;
    }

    public void setPepticUlcer(String pepticUlcer) {
        this.pepticUlcer = pepticUlcer;
    }

    public String getLungDisease() {
        return lungDisease;
    }

    public void setLungDisease(String lungDisease) {
        this.lungDisease = lungDisease;
    }

    public String getLiverDisease() {
        return liverDisease;
    }

    public void setLiverDisease(String liverDisease) {
        this.liverDisease = liverDisease;
    }

}
