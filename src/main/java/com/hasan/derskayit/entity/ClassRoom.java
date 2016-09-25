/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.entity;

import com.hasan.derskayit.enm.ClassRoomType;
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
@Table(name = "class_room")
public class ClassRoom extends BaseEntity {

    private Long id;
    private String code;
    private String name;
    private String parentCode;
    private ClassRoomType type;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "seq_class_room_id", initialValue = 1, sequenceName = "seq_class_room_id")
    @GeneratedValue(generator = "seq_class_room_id", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "code", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "parent_code")
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Column(name = "class_type",nullable = false)
    public ClassRoomType getType() {
        return type;
    }

    public void setType(ClassRoomType type) {
        this.type = type;
    }

}
