package com.bbms.web.models.donor;

import com.bbms.web.models.AboGroup;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "DONOR")
public class DonorPersonalInformation implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "DONOR_ID", length = 30, nullable = false, unique = true)
    private String donorId;
    @Column(name = "FULL_NAME", length = 100, nullable = false)
    @Size(min = 3, max = 100, message = "Size must be between 3 and 100.")
    private String fullName;
    @Column(name = "ID_NUMBER", length = 20, nullable = true)
    private String idNumber;
    @Column(name = "AGE", length = 3, nullable = false)
    private String age;
    @Column(name = "SEX", length = 7, nullable = false)
    private String sex;
    @Column(name = "PHONE_NUMBER", length = 20, nullable = true)
    private String phoneNumber;
    @Column(name = "MOBILE_NUMBER", length = 20, nullable = false)
    private String mobileNumber;
    @Column(name = "EMAIL", length = 100, nullable = true)
    private String email;
    @Column(name = "MARITAL_STATUS", length = 12, nullable = true)
    private String maritalStatus;
    @Column(name = "OCCUPATION", length = 250, nullable = true)
    private String occupation;
    @Column(name = "ADDRESS", length = 250, nullable = false)
    private String address;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorHealthRelatedInformation donorHealthRelatedInformation;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorHistory donorHistory;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorPreviousDonationHistory donorPreviousDonationHistory;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorSufferingHistory donorSufferingHistory;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorTransfusionClottingFactory donorTransfusionClottingFactory;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private DonorTypeAndConsent donorTypeAndConsent;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private Questions questions;
    
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "donor")
    @JsonManagedReference
    private AboGroup aboGroup;

    public AboGroup getAboGroup() {
        return aboGroup;
    }

    public void setAboGroup(AboGroup aboGroup) {
        this.aboGroup = aboGroup;
    }
    
    public DonorHealthRelatedInformation getDonorHealthRelatedInformation() {
        return donorHealthRelatedInformation;
    }

    public void setDonorHealthRelatedInformation(DonorHealthRelatedInformation donorHealthRelatedInformation) {
        this.donorHealthRelatedInformation = donorHealthRelatedInformation;
    }

    public DonorHistory getDonorHistory() {
        return donorHistory;
    }

    public void setDonorHistory(DonorHistory donorHistory) {
        this.donorHistory = donorHistory;
    }

    public DonorPreviousDonationHistory getDonorPreviousDonationHistory() {
        return donorPreviousDonationHistory;
    }

    public void setDonorPreviousDonationHistory(DonorPreviousDonationHistory donorPreviousDonationHistory) {
        this.donorPreviousDonationHistory = donorPreviousDonationHistory;
    }

    public DonorSufferingHistory getDonorSufferingHistory() {
        return donorSufferingHistory;
    }

    public void setDonorSufferingHistory(DonorSufferingHistory donorSufferingHistory) {
        this.donorSufferingHistory = donorSufferingHistory;
    }

    public DonorTransfusionClottingFactory getDonorTransfusionClottingFactory() {
        return donorTransfusionClottingFactory;
    }

    public void setDonorTransfusionClottingFactory(DonorTransfusionClottingFactory donorTransfusionClottingFactory) {
        this.donorTransfusionClottingFactory = donorTransfusionClottingFactory;
    }

    public DonorTypeAndConsent getDonorTypeAndConsent() {
        return donorTypeAndConsent;
    }

    public void setDonorTypeAndConsent(DonorTypeAndConsent donorTypeAndConsent) {
        this.donorTypeAndConsent = donorTypeAndConsent;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
