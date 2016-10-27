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
@Table(name = "DONOR_TRANSFUSION_CLOTTING_HISTORY")
public class DonorTransfusionClottingFactory implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @OneToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "HISTORY", length = 250, nullable = true)
    private String clottingHistory;

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

    public String getClottingHistory() {
        return clottingHistory;
    }

    public void setClottingHistory(String clottingHistory) {
        this.clottingHistory = clottingHistory;
    }

}
