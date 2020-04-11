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
import javax.persistence.Lob;
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
@Table(name = "questionnaire_result")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuestionnaireResult.findAll", query = "SELECT q FROM QuestionnaireResult q")
    , @NamedQuery(name = "QuestionnaireResult.findById", query = "SELECT q FROM QuestionnaireResult q WHERE q.id = :id")
    , @NamedQuery(name = "QuestionnaireResult.findByResult", query = "SELECT q FROM QuestionnaireResult q WHERE q.result = :result")
    , @NamedQuery(name = "QuestionnaireResult.findByIemi", query = "SELECT q FROM QuestionnaireResult q WHERE q.iemi = :iemi")})
public class QuestionnaireResult implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "result")
    private String result;
    @Size(max = 45)
    @Column(name = "iemi")
    private String iemi;
    @Lob
    @Size(max = 65535)
    @Column(name = "question_data")
    private String questionData;

    public QuestionnaireResult() {
    }

    public QuestionnaireResult(Integer id) {
        this.id = id;
    }

    public QuestionnaireResult(Integer id, String result) {
        this.id = id;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getIemi() {
        return iemi;
    }

    public void setIemi(String iemi) {
        this.iemi = iemi;
    }

    public String getQuestionData() {
        return questionData;
    }

    public void setQuestionData(String questionData) {
        this.questionData = questionData;
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
        if (!(object instanceof QuestionnaireResult)) {
            return false;
        }
        QuestionnaireResult other = (QuestionnaireResult) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.covid.tracker.models.QuestionnaireResult[ id=" + id + " ]";
    }
    
}
