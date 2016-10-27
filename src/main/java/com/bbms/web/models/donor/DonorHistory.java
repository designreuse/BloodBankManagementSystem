package com.bbms.web.models.donor;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DONOR_HISTORY")
public class DonorHistory implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    private DonorPersonalInformation donor;
    @Column(name = "RECENT_VACCINATION_STATUS", length = 6, nullable = true)
    private String recentVaccinationStatus;
    @Column(name = "RECENT_SURGERY_STATUS", length = 6, nullable = true)
    private String recfentSurgeryStatus;
    @Column(name = "RECENT_TOOTH_EXTRACTION_STATUS", length = 6, nullable = true)
    private String recentToothExtraction;
    @Column(name = "TYPHOID_STATUS", length = 6, nullable = true)
    private String typhoidStatus;
    @Column(name = "ARTHRITIS_FEVER_STATUS", length = 6, nullable = true)
    private String arthritisFeverStatus;
    @Column(name = "DASAPHILISA_STATUS", length = 6, nullable = true)
    private String dasaphilisaStatus;
    @Column(name = "SHIGELLOSIS_STATUS", length = 6, nullable = true)
    private String shigellosisStatus;
    @Column(name = "BLOOD_DISORDER_STATUS", length = 6, nullable = true)
    private String bloodDisordersStatus;
    @Column(name = "ANADULENTA_FEVER_STATUS", length = 6, nullable = true)
    private String anadulentaFeverStatus;
    @Column(name = "MIJILASA_OR_MUMPS_STATUS", length = 6, nullable = true)
    private String mijilasaOrMumpsStatus;
    @Column(name = "RECENT_WEIGHT_REDUCTION_STATUS", length = 6, nullable = true)
    private String recentWeightReductionStatus;

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

    public String getRecentVaccinationStatus() {
        return recentVaccinationStatus;
    }

    public void setRecentVaccinationStatus(String recentVaccinationStatus) {
        this.recentVaccinationStatus = recentVaccinationStatus;
    }

    public String getRecfentSurgeryStatus() {
        return recfentSurgeryStatus;
    }

    public void setRecfentSurgeryStatus(String recfentSurgeryStatus) {
        this.recfentSurgeryStatus = recfentSurgeryStatus;
    }

    public String getRecentToothExtraction() {
        return recentToothExtraction;
    }

    public void setRecentToothExtraction(String recentToothExtraction) {
        this.recentToothExtraction = recentToothExtraction;
    }

    public String getTyphoidStatus() {
        return typhoidStatus;
    }

    public void setTyphoidStatus(String typhoidStatus) {
        this.typhoidStatus = typhoidStatus;
    }

    public String getArthritisFeverStatus() {
        return arthritisFeverStatus;
    }

    public void setArthritisFeverStatus(String arthritisFeverStatus) {
        this.arthritisFeverStatus = arthritisFeverStatus;
    }

    public String getDasaphilisaStatus() {
        return dasaphilisaStatus;
    }

    public void setDasaphilisaStatus(String dasaphilisaStatus) {
        this.dasaphilisaStatus = dasaphilisaStatus;
    }

    public String getShigellosisStatus() {
        return shigellosisStatus;
    }

    public void setShigellosisStatus(String shigellosisStatus) {
        this.shigellosisStatus = shigellosisStatus;
    }

    public String getBloodDisordersStatus() {
        return bloodDisordersStatus;
    }

    public void setBloodDisordersStatus(String bloodDisordersStatus) {
        this.bloodDisordersStatus = bloodDisordersStatus;
    }

    public String getAnadulentaFeverStatus() {
        return anadulentaFeverStatus;
    }

    public void setAnadulentaFeverStatus(String anadulentaFeverStatus) {
        this.anadulentaFeverStatus = anadulentaFeverStatus;
    }

    public String getMijilasaOrMumpsStatus() {
        return mijilasaOrMumpsStatus;
    }

    public void setMijilasaOrMumpsStatus(String mijilasaOrMumpsStatus) {
        this.mijilasaOrMumpsStatus = mijilasaOrMumpsStatus;
    }

    public String getRecentWeightReductionStatus() {
        return recentWeightReductionStatus;
    }

    public void setRecentWeightReductionStatus(String recentWeightReductionStatus) {
        this.recentWeightReductionStatus = recentWeightReductionStatus;
    }

}
