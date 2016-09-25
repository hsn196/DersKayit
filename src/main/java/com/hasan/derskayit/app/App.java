/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.app;

import com.hasan.derskayit.entity.FacultyMemberLectures;
import com.hasan.derskayit.entity.Lecture;
import com.hasan.derskayit.entity.Student;
import com.hasan.derskayit.entity.StudentLectures;
import com.hasan.derskayit.service.FacultyMemberLecturesService;
import com.hasan.derskayit.service.LectureService;
import com.hasan.derskayit.service.StudentLecturesService;
import com.hasan.derskayit.service.StudentService;

/**
 *
 * @author Hasan
 */
public class App {
    public static void main (String args[]){
        
//        Student student = new StudentService().getById(3L);
//        FacultyMemberLectures ls =  new FacultyMemberLecturesService().getById(1L);
//        s.setLectureCode(ls);
//        s.setStudentCode(student);
//        new StudentLecturesService().save(s);
        StudentLectures s = new StudentLecturesService().getById(1L);
        System.out.println(s.getLectureCode().getClassRoom().getName());
        System.out.println(s.getStudentCode().getName());
        System.out.println(s.getStudentCode().getSurname());
        System.out.println("Hocanın Adı:"+s.getLectureCode().getFacultyMemberCode().getName());
        System.out.println("Hocanın Emaili:"+s.getLectureCode().getFacultyMemberCode().getEmail());
    }
}
