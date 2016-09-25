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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Hasan
 */
@Entity
@Table(name = "student_lectures")
public class StudentLectures extends BaseEntity{

    private Long id;
    private Student studentCode;
    private FacultyMemberLectures lectureCode;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "seq_student_lesson_id", initialValue = 1, sequenceName = "seq_student_lesson_id")
    @GeneratedValue(generator = "seq_student_lesson_id", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne()
    @JoinColumn(name = "student_id") 
    public Student getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Student studentCode) {
        this.studentCode = studentCode;
    }
    
    @ManyToOne()
    @JoinColumn(name = "faculty_member_lectures_id") 
    public FacultyMemberLectures getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(FacultyMemberLectures lectureCode) {
        this.lectureCode = lectureCode;
    }

}
