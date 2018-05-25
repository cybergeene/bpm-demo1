package com.company.bpmdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;

@NamePattern("%s|number")
@Table(name = "BPMDEMO_CONTRACT")
@Entity(name = "bpmdemo$Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 5918059376487715992L;

    @NotNull
    @Column(name = "NUMBER_")
    protected String number;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date = new Date();

    @Column(name = "STATE")
    protected String state = "Новый";

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}