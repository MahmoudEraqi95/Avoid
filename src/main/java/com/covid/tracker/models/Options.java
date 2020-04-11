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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mmamdouh
 */
@Entity
@Table(name = "options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Options.findAll", query = "SELECT o FROM Options o")
    , @NamedQuery(name = "Options.findById", query = "SELECT o FROM Options o WHERE o.id = :id")
    , @NamedQuery(name = "Options.findByPercentage", query = "SELECT o FROM Options o WHERE o.percentage = :percentage")})
public class Options implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "option")
    private String option;
    @Basic(optional = false)
    @NotNull
    @Column(name = "percentage")
    private int percentage;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments")
    private String comments;
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    @ManyToOne
    private Questions question;

    public Options() {
    }

    public Options(Integer id) {
        this.id = id;
    }

    public Options(Integer id, String option, int percentage) {
        this.id = id;
        this.option = option;
        this.percentage = percentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Questions getQuestionId() {
        return question;
    }

    public void setQuestionId(Questions questionId) {
        this.question = questionId;
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
        if (!(object instanceof Options)) {
            return false;
        }
        Options other = (Options) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com._4gtss.spring.quest.models.Options[ id=" + id + " ]";
    }
    
}
