package com.bbms.web.models;

import com.bbms.web.models.donor.DonorPersonalInformation;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ABO_GROUPING")
public class AboGroup implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    private DonorPersonalInformation donor;

    @Column(unique = true, nullable = false, updatable = false, name = "SAMPLE_NUMBER", length = 30)
    private String sampleNumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "ABO_GROUPING_DATE", length = 20, nullable = true)
    private Date aboGroupingDate;

    @Column(name = "ABO_GROUPING_ANTI_A", nullable = true)
    private String aboGroupingAntiA;
    @Column(name = "ABO_GROUPING_ANTI_B", nullable = true)
    private String aboGroupingAntiB;
    @Column(name = "ABO_GROUPING_ANTI_AB", nullable = true)
    private String aboGroupingAntiAB;
    @Column(name = "ABO_GROUPING_A_Cell", nullable = true)
    private String aboGroupingACell;
    @Column(name = "ABO_GROUPING_B_Cell", nullable = true)
    private String aboGroupingBCell;
    @Column(name = "ABO_GROUPING_C_Cell", nullable = true)
    private String aboGroupingOCell;
    @Column(name = "ABO_GROUPING_RESULT", nullable = true)
    private String aboGroupingResult;
    @Column(name = "RHESUS_GROUPING_ANTI_D", nullable = true)
    private String rhesusGroupingAntiD;
    @Column(name = "RHESUS_GROUPING_RESULT", nullable = true)
    private String rhesusGroupingResult;
    @Column(name = "BLOOD_DONOR_GROUP", length = 10, nullable = true)
    private String bloodDonorGroup;
    @Column(name = "SIGN_MT_LAB", nullable = true)
    private String signMtLab;
    @Column(name = "COMMENT", nullable = true)
    private String comment;

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

    public String getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(String sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public Date getAboGroupingDate() {
        return aboGroupingDate;
    }

    public void setAboGroupingDate(Date aboGroupingDate) {
        this.aboGroupingDate = aboGroupingDate;
    }

    public String getAboGroupingAntiA() {
        return aboGroupingAntiA;
    }

    public void setAboGroupingAntiA(String aboGroupingAntiA) {
        this.aboGroupingAntiA = aboGroupingAntiA;
    }

    public String getAboGroupingAntiB() {
        return aboGroupingAntiB;
    }

    public void setAboGroupingAntiB(String aboGroupingAntiB) {
        this.aboGroupingAntiB = aboGroupingAntiB;
    }

    public String getAboGroupingAntiAB() {
        return aboGroupingAntiAB;
    }

    public void setAboGroupingAntiAB(String aboGroupingAntiAB) {
        this.aboGroupingAntiAB = aboGroupingAntiAB;
    }

    public String getAboGroupingACell() {
        return aboGroupingACell;
    }

    public void setAboGroupingACell(String aboGroupingACell) {
        this.aboGroupingACell = aboGroupingACell;
    }

    public String getAboGroupingBCell() {
        return aboGroupingBCell;
    }

    public void setAboGroupingBCell(String aboGroupingBCell) {
        this.aboGroupingBCell = aboGroupingBCell;
    }

    public String getAboGroupingOCell() {
        return aboGroupingOCell;
    }

    public void setAboGroupingOCell(String aboGroupingOCell) {
        this.aboGroupingOCell = aboGroupingOCell;
    }

    public String getAboGroupingResult() {
        return aboGroupingResult;
    }

    public void setAboGroupingResult(String aboGroupingResult) {
        this.aboGroupingResult = aboGroupingResult;
    }

    public String getRhesusGroupingAntiD() {
        return rhesusGroupingAntiD;
    }

    public void setRhesusGroupingAntiD(String rhesusGroupingAntiD) {
        this.rhesusGroupingAntiD = rhesusGroupingAntiD;
    }

    public String getRhesusGroupingResult() {
        return rhesusGroupingResult;
    }

    public void setRhesusGroupingResult(String rhesusGroupingResult) {
        this.rhesusGroupingResult = rhesusGroupingResult;
    }

    public String getBloodDonorGroup() {
        return bloodDonorGroup;
    }

    public void setBloodDonorGroup(String bloodDonorGroup) {
        this.bloodDonorGroup = bloodDonorGroup;
    }

    public String getSignMtLab() {
        return signMtLab;
    }

    public void setSignMtLab(String signMtLab) {
        this.signMtLab = signMtLab;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
