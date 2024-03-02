package com.jsp.controller;

import com.jsp.dao.SubjectDao;
import com.jsp.entities.Subject;
import com.jsp.entities.Teacher;

public class SubjectController {

	public static void main(String[] args) {
		Subject sub1 = new Subject("maths" , 1 , "Kanishk" );
		SubjectDao subDao = new SubjectDao();
		subDao.saveSubject(sub1);
	}

}
