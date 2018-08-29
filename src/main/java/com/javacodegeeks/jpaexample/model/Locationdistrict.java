package com.javacodegeeks.jpaexample.model;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "XST_LOC_DIST")
public class Locationdistrict {

    @Id
    @Column(name = "LOC_NBR")

    Integer locatioNumber;

    @Column(name = "DIST_NBR")
    Integer districtNumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "beg_dte ")
    Date beginDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "end_dte")
    Date endDate;
    public Integer getLocatioNumber() {
        return locatioNumber;
    }

    public void setLocatioNumber(Integer locatioNumber) {
        this.locatioNumber = locatioNumber;
    }

    public Integer getDistrictNumber() {
        return districtNumber;
    }

    public void setDistrictNumber(Integer districtNumber) {
        this.districtNumber = districtNumber;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
System.out.println();
}
