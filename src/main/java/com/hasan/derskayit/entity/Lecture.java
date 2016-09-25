/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.entity;

import com.hasan.derskayit.enm.DayType;
import com.hasan.derskayit.enm.IsMandatoryType;
import com.hasan.derskayit.framework.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Hasan
 */
@Entity
@Table(name = "lecture")
public class Lecture extends BaseEntity {

    private Long id;
    private String code;
    private String name;
    private IsMandatoryType isMandatory;//Zorunlu mu
    private DayType day;
    private String hour;

    @Id
    @SequenceGenerator(allocationSize = 1,name = "seq_lecture_id",initialValue = 1,sequenceName = "seq_lecture_id")
    @GeneratedValue(generator ="seq_lecture_id" ,strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "code",nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "ismandatory",nullable = false)
    public IsMandatoryType getIsMandator() {
        return isMandatory;
    }

    public void setIsMandator(IsMandatoryType isMandator) {
        this.isMandatory = isMandator;
    }
    
    @Column(name = "day",nullable = false)
    public DayType getDay() {
        return day;
    }

    public void setDay(DayType day) {
        this.day = day;
    }
    
    @Column(name = "hour",nullable = false)
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

}
