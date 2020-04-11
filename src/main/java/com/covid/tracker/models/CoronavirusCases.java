/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid.tracker.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mmamdouh
 */
@Entity
@Table(name = "coronavirus_cases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoronavirusCases.findAll", query = "SELECT c FROM CoronavirusCases c")
    , @NamedQuery(name = "CoronavirusCases.findById", query = "SELECT c FROM CoronavirusCases c WHERE c.id = :id")
    , @NamedQuery(name = "CoronavirusCases.findByCaseLong", query = "SELECT c FROM CoronavirusCases c WHERE c.caseLong = :caseLong")
    , @NamedQuery(name = "CoronavirusCases.findByCaseLat", query = "SELECT c FROM CoronavirusCases c WHERE c.caseLat = :caseLat")
    , @NamedQuery(name = "CoronavirusCases.findByCaseStatus", query = "SELECT c FROM CoronavirusCases c WHERE c.caseStatus = :caseStatus")
    , @NamedQuery(name = "CoronavirusCases.findByInfectionDate", query = "SELECT c FROM CoronavirusCases c WHERE c.infectionDate = :infectionDate")
    , @NamedQuery(name = "CoronavirusCases.findByRecoveryDate", query = "SELECT c FROM CoronavirusCases c WHERE c.recoveryDate = :recoveryDate")})
public class CoronavirusCases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "case_name")
    private String caseName;
    @Lob
    @Size(max = 65535)
    @Column(name = "case_info")
    private String caseInfo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "case_long")
    private Double caseLong;
    @Column(name = "case_lat")
    private Double caseLat;
    @Lob
    @Size(max = 65535)
    @Column(name = "detailed_address")
    private String detailedAddress;
    @Size(max = 45)
    @Column(name = "case_status")
    private String caseStatus;
    @Column(name = "infection_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date infectionDate;
    @Column(name = "recovery_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recoveryDate;

    public CoronavirusCases() {
    }

    public CoronavirusCases(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseInfo() {
        return caseInfo;
    }

    public void setCaseInfo(String caseInfo) {
        this.caseInfo = caseInfo;
    }

    public Double getCaseLong() {
        return caseLong;
    }

    public void setCaseLong(Double caseLong) {
        this.caseLong = caseLong;
    }

    public Double getCaseLat() {
        return caseLat;
    }

    public void setCaseLat(Double caseLat) {
        this.caseLat = caseLat;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Date getInfectionDate() {
        return infectionDate;
    }

    public void setInfectionDate(Date infectionDate) {
        this.infectionDate = infectionDate;
    }

    public Date getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(Date recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoronavirusCases)) {
            return false;
        }
        CoronavirusCases other = (CoronavirusCases) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.covid.tracker.models.CoronavirusCases[ id=" + id + " ]";
    }
    
}
