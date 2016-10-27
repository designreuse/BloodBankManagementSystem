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
@Table(name = "DONOR_TYPE_AND_CONSENT")
public class DonorTypeAndConsent implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "DONOR_TYPE", length = 15, nullable = true)
    private String donorType;
    @Column(name = "DONOR_CONSENT", length = 250, nullable = true)
    private String donorConsent;

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

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonorConsent() {
        return donorConsent;
    }

    public void setDonorConsent(String donorConsent) {
        this.donorConsent = donorConsent;
    }

}
