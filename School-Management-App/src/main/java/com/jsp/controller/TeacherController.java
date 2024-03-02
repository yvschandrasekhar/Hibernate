package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.entities.Subject;
import com.jsp.entities.Teacher;

public class TeacherController {
	public static void main(String[] args) {
		Teacher tea1 = new Teacher("Kanishk" , "Male" , 10 ,new Subject() );
		TeacherDao dao = new TeacherDao();
		dao.savetTeacher(tea1);
	}
}
