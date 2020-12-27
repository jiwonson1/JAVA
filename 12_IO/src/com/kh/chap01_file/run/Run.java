package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		// ���ϸ�������°ſ� ���� ���� �׽�Ʈ 
		// java.io ��Ű���� �մ� File Ŭ���� ������ ���ϸ� ����
		
		
		try {
			// 1. ������� ���� ���� ���� ����		--> �ش� �� ������Ʈ�� ���� ����
			File f1 = new File("test.txt");
			f1.createNewFile();	// �޼ҵ� �����ؾ߸� ���� ������ �������!! 	--> IOException �߻��� ���� ����
			
			// 2. �����ϴ� ���� ����̺곪 ������ ���� ����
			File f2 = new File("C:\\java_workspace\\test.txt");
			f2.createNewFile();
			
			// 3. ���� ����� ���� ����
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			// ���� ���� ���� ��
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(tempFolder.exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			System.out.println("������ : " + file.getAbsolutePath()); // �������� ���
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}
	
	/*
	 * ���α׷� ���� �����͸� �ܺθ�ü�� ����� �Ѵٰų� / �Ǵ� �ܺθ�ü�κ��� �Է� �޾ƿ� �� 
	 * �ݵ�� �� �ܺθ�ü���� �������� ��θ� �����ߵ�!! => �װ� �ٷ� ��Ʈ��
	 * 
	 * * ��Ʈ���� Ư¡
	 * - �ܹ��� : �Է��̸� �Է� / ����̸� ��¸� ����!! (��, �Է°� ����� ���ôٹ������� �ϰ������ ������ ��Ʈ���� ���� �����ߵ�!)
	 * - ���Լ���(FIFO) : ���� �������� ���� ����!! (�ð� ����)
	 * 
	 * * �ڹٿ��� �����ϴ� ��Ʈ�� Ŭ���� 
	 * > ����� ������ (1byte / 2byte)
	 *   - ����Ʈ(byte) ��Ʈ�� : 1byte¥�� �Դ� ���� �� ������ ������ ������ (�������)
	 *   			                  �Է�(InputStream) / ���(OutputStream)
	 *   
	 *   - ����(char) ��Ʈ��    : 2byte¥�� �Դ� ���� �� �� ���� ������ ������ (�������)
	 *   			                  �Է�(Reader) / ��� (Writer) 
	 *   
	 * > �ܺθ�ü�� ���� �����ϴ� ����
	 *   - ���(�⺻) ��Ʈ�� : �ܺ� ��ü�� ���������� �����ϴ� ���
	 *   
	 *   - ���� ��Ʈ�� : ���״�� ���� ���Ҹ��� �����ϴ� ���
	 *   			   �ܵ����δ� ��� �Ұ�!! (�ݵ�� �ܺ� ��ü�� ����Ǿ��ִ� ��� ��Ʈ�� �ʿ�!!)
	 * 
	 *
	 */
	
	
	
	

}




