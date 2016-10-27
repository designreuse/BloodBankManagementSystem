package com.bbms.web.models;

import com.bbms.web.models.donor.DonorPersonalInformation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BLOOD_BAG")
public class BloodBag implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false, name = "BLOOD_BAG_GENERATED_ID", length = 30)
    private String bloodBagId;
    @Column(nullable = false, updatable = false, name = "DONOR_GENERATED_ID", length = 30)
    private String donorId;
    @Temporal(TemporalType.DATE)
    @Column(name = "COLLECTION_DATE", length = 20, nullable = true)
    private Date collectionDate;
    @ManyToOne
    @JsonBackReference
    private DonorPersonalInformation donor;
    @Column(name = "RED_CELLS", length = 100, nullable = true)
    private String redCells;
    @Column(name = "WHITE_CELLS", length = 100, nullable = true)
    private String whiteCells;
    @Column(name = "PLATELETSS", length = 100, nullable = true)
    private String platelets;
    @Column(name = "PLASMA", length = 100, nullable = true)
    private String plasma;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloodBagId() {
        return bloodBagId;
    }

    public void setBloodBagId(String bloodBagId) {
        this.bloodBagId = bloodBagId;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public DonorPersonalInformation getDonor() {
        return donor;
    }

    public void setDonor(DonorPersonalInformation donor) {
        this.donor = donor;
    }

    public String getRedCells() {
        return redCells;
    }

    public void setRedCells(String redCells) {
        this.redCells = redCells;
    }

    public String getWhiteCells() {
        return whiteCells;
    }

    public void setWhiteCells(String whiteCells) {
        this.whiteCells = whiteCells;
    }

    public String getPlatelets() {
        return platelets;
    }

    public void setPlatelets(String platelets) {
        this.platelets = platelets;
    }

    public String getPlasma() {
        return plasma;
    }

    public void setPlasma(String plasma) {
        this.plasma = plasma;
    }

}
