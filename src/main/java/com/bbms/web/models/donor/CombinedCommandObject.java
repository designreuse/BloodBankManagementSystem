package com.bbms.web.models.donor;

public class CombinedCommandObject {

    private DonorPersonalInformation donorPersonalInformation;
    private DonorHealthRelatedInformation donorHealthRelatedInformation;
    private DonorPreviousDonationHistory donorPreviousDonationHistory;
    private DonorTypeAndConsent donorTypeAndConsent; 
    private DonorTransfusionClottingFactory donorTransfusionClottingFactory;
    private DonorHistory donorHistory;
    private DonorSufferingHistory donorSufferingHistory;
    private Questions questions;
    
    public DonorPersonalInformation getDonorPersonalInformation() {
        return donorPersonalInformation;
    }

    public void setDonorPersonalInformation(DonorPersonalInformation donorPersonalInformation) {
        this.donorPersonalInformation = donorPersonalInformation;
    }

    public DonorHealthRelatedInformation getDonorHealthRelatedInformation() {
        return donorHealthRelatedInformation;
    }

    public void setDonorHealthRelatedInformation(DonorHealthRelatedInformation donorHealthRelatedInformation) {
        this.donorHealthRelatedInformation = donorHealthRelatedInformation;
    }

    public DonorPreviousDonationHistory getDonorPreviousDonationHistory() {
        return donorPreviousDonationHistory;
    }

    public void setDonorPreviousDonationHistory(DonorPreviousDonationHistory donorPreviousDonationHistory) {
        this.donorPreviousDonationHistory = donorPreviousDonationHistory;
    }

    public DonorTypeAndConsent getDonorTypeAndConsent() {
        return donorTypeAndConsent;
    }

    public void setDonorTypeAndConsent(DonorTypeAndConsent donorTypeAndConsent) {
        this.donorTypeAndConsent = donorTypeAndConsent;
    }

    public DonorTransfusionClottingFactory getDonorTransfusionClottingFactory() {
        return donorTransfusionClottingFactory;
    }

    public void setDonorTransfusionClottingFactory(DonorTransfusionClottingFactory donorTransfusionClottingFactory) {
        this.donorTransfusionClottingFactory = donorTransfusionClottingFactory;
    }

    public DonorHistory getDonorHistory() {
        return donorHistory;
    }

    public void setDonorHistory(DonorHistory donorHistory) {
        this.donorHistory = donorHistory;
    }

    public DonorSufferingHistory getDonorSufferingHistory() {
        return donorSufferingHistory;
    }

    public void setDonorSufferingHistory(DonorSufferingHistory donorSufferingHistory) {
        this.donorSufferingHistory = donorSufferingHistory;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

}
