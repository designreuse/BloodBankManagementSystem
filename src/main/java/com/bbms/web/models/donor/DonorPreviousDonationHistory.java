package com.bbms.web.models.donor;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "HISTORY_OF_PREVIOUS_DONATION")
public class DonorPreviousDonationHistory implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @Column(name = "DONATION_STATUS", length = 6, nullable = true)
    private String donationStatus;
    @Temporal(TemporalType.DATE)
    @Column(name = "DONATION_DATE", length = 20, nullable = true)
    private Date donationDate;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "DONATION_PLACE", length = 100, nullable = true)
    private String donationPlace;
    @Column(name = "ADVERSE_REACTION_STATUS", length = 6, nullable = true)
    private String anyAdverseReaction;
    @Column(name = "REACTION_DETAIL", length = 250, nullable = true)
    private String reactionDetail;

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

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public String getAnyAdverseReaction() {
        return anyAdverseReaction;
    }

    public void setAnyAdverseReaction(String anyAdverseReaction) {
        this.anyAdverseReaction = anyAdverseReaction;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public DonorPersonalInformation getDonor() {
        return donor;
    }

    public void setDonor(DonorPersonalInformation donor) {
        this.donor = donor;
    }

    public String getDonationPlace() {
        return donationPlace;
    }

    public void setDonationPlace(String donationPlace) {
        this.donationPlace = donationPlace;
    }

    public String getReactionDetail() {
        return reactionDetail;
    }

    public void setReactionDetail(String reactionDetail) {
        this.reactionDetail = reactionDetail;
    }

}
