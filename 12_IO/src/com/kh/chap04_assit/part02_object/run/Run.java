package com.kh.chap04_assit.part02_object.run;

import com.kh.chap04_assit.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assit.part02_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		//od.fileSave();
		od.fileRead();
		
		ObjectsDao osd = new ObjectsDao();
		//osd.fileSave();
		//osd.fileRead();
		
	}

}
