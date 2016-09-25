/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.entity;

import com.hasan.derskayit.framework.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Hasan
 */

@Entity
@Table(name = "lecture_member_lectures")
public class FacultyMemberLectures extends BaseEntity{

    private Long id;
    private Lecture lectureCode;
    private FacultyMember facultyMemberCode;
    private ClassRoom classRoom;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "seq_faculty_member_lectures_id", initialValue = 1, sequenceName = "seq_faculty_member_lectures_id")
    @GeneratedValue(generator = "seq_faculty_member_lectures_id", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne()
    @JoinColumn(name = "lecture_id")
    public Lecture getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(Lecture code) {
        this.lectureCode = code;
    }

    @ManyToOne
    @JoinColumn(name = "faculty_member_id")
    public FacultyMember getFacultyMemberCode() {
        return facultyMemberCode;
    }

    public void setFacultyMemberCode(FacultyMember facultyMemberCode) {
        this.facultyMemberCode = facultyMemberCode;
    }

    @JoinColumn(name = "class_room_id") 
    @ManyToOne(targetEntity = ClassRoom.class)
    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoomCode) {
        this.classRoom = classRoomCode;
    }

}
