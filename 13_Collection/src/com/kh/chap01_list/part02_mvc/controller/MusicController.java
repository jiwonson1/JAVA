package com.kh.chap01_list.part02_mvc.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	
	/*
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	*/
	
	public void insertMusic(Music m) {
		list.add(m);
	}
	
	public ArrayList<Music> selectList() {
		
		return list;
		
	}
	
	
	
}





