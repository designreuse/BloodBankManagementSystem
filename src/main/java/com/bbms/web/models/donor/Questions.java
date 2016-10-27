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
@Table(name = "QUESTIONS")
public class Questions implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "HAS_TAKEN_BLOOD_ELEMENT", length = 6, nullable = true)
    private String hasTakenBloodElement;
    @Column(name = "HAS_TAKEN_ASPIRIN", length = 6, nullable = true)
    private String hasTakenAspirin;
    @Column(name = "DRUG_ADDICTED", length = 6, nullable = true)
    private String drugAddicted;
    @Column(name = "HAS_TAKEN_ANY_DRUG", length = 6, nullable = true)
    private String hasTakenAnyDrug;
    @Column(name = "TRAVELS_TO_FOREIGN", length = 6, nullable = true)
    private String travelsToForeign;
    @Column(name = "CURRENTLY_TAKING_MEDICINE", length = 6, nullable = true)
    private String currentlyTakingMedicine;
    @Column(name = "WILLING_TO_DONATE_BLOOD_REGULARLY", length = 6, nullable = true)
    private String willingToDonateBloodRegularly;
    @Column(name = "FITNESS", length = 6, nullable = true)
    private String fitness;
    @Column(name = "HAS_TAKEN_FOOD", length = 6, nullable = true)
    private String hasTakenFood;
    @Column(name = "ACUPUNCTURE", length = 6, nullable = true)
    private String acupuncture;

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

    public String getHasTakenBloodElement() {
        return hasTakenBloodElement;
    }

    public void setHasTakenBloodElement(String hasTakenBloodElement) {
        this.hasTakenBloodElement = hasTakenBloodElement;
    }

    public String getHasTakenAspirin() {
        return hasTakenAspirin;
    }

    public void setHasTakenAspirin(String hasTakenAspirin) {
        this.hasTakenAspirin = hasTakenAspirin;
    }

    public String getDrugAddicted() {
        return drugAddicted;
    }

    public void setDrugAddicted(String drugAddicted) {
        this.drugAddicted = drugAddicted;
    }

    public String getHasTakenAnyDrug() {
        return hasTakenAnyDrug;
    }

    public void setHasTakenAnyDrug(String hasTakenAnyDrug) {
        this.hasTakenAnyDrug = hasTakenAnyDrug;
    }

    public String getTravelsToForeign() {
        return travelsToForeign;
    }

    public void setTravelsToForeign(String travelsToForeign) {
        this.travelsToForeign = travelsToForeign;
    }

    public String getCurrentlyTakingMedicine() {
        return currentlyTakingMedicine;
    }

    public void setCurrentlyTakingMedicine(String currentlyTakingMedicine) {
        this.currentlyTakingMedicine = currentlyTakingMedicine;
    }

    public String getWillingToDonateBloodRegularly() {
        return willingToDonateBloodRegularly;
    }

    public void setWillingToDonateBloodRegularly(String willingToDonateBloodRegularly) {
        this.willingToDonateBloodRegularly = willingToDonateBloodRegularly;
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness;
    }

    public String getHasTakenFood() {
        return hasTakenFood;
    }

    public void setHasTakenFood(String hasTakenFood) {
        this.hasTakenFood = hasTakenFood;
    }

    public String getAcupuncture() {
        return acupuncture;
    }

    public void setAcupuncture(String acupuncture) {
        this.acupuncture = acupuncture;
    }
    
}
