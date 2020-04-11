/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid.tracker.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mmamdouh
 */
@Entity
@Table(name = "verified_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VerifiedUsers.findAll", query = "SELECT v FROM VerifiedUsers v")
    , @NamedQuery(name = "VerifiedUsers.findById", query = "SELECT v FROM VerifiedUsers v WHERE v.id = :id")
    , @NamedQuery(name = "VerifiedUsers.findByIemi", query = "SELECT v FROM VerifiedUsers v WHERE v.iemi = :iemi")
    , @NamedQuery(name = "VerifiedUsers.findByMsidn", query = "SELECT v FROM VerifiedUsers v WHERE v.msidn = :msidn")
    , @NamedQuery(name = "VerifiedUsers.findByLat", query = "SELECT v FROM VerifiedUsers v WHERE v.lat = :lat")
    , @NamedQuery(name = "VerifiedUsers.findByLongg", query = "SELECT v FROM VerifiedUsers v WHERE v.longg = :longg")})
public class VerifiedUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "iemi")
    private String iemi;
    @Size(max = 45)
    @Column(name = "msidn")
    private String msidn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lat")
    private Double lat;
    @Column(name = "longg")
    private Double longg;

    public VerifiedUsers() {
    }

    public VerifiedUsers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIemi() {
        return iemi;
    }

    public void setIemi(String iemi) {
        this.iemi = iemi;
    }

    public String getMsidn() {
        return msidn;
    }

    public void setMsidn(String msidn) {
        this.msidn = msidn;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLongg() {
        return longg;
    }

    public void setLongg(Double longg) {
        this.longg = longg;
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
        if (!(object instanceof VerifiedUsers)) {
            return false;
        }
        VerifiedUsers other = (VerifiedUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.covid.tracker.models.VerifiedUsers[ id=" + id + " ]";
    }
    
}
