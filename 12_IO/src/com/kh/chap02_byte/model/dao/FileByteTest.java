package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// ���α׷� (�ڹ� �ڵ�) --> �ܺθ�ü(����) (���: ���α׷� ���� �����͸� ���Ϸ� �������� ��, ���Ͽ� �����ϰٴ�.)
	public void fileSave() {
		
		// FileOutputStream  : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		FileOutputStream fos = null;
		try {
			// 1. FileOutputStream ��ü ���� : �ش� ���ϰ��� ������ΰ� �������
			fos = new FileOutputStream("a_byte.txt"); // �ش� ������ ������ �ڵ����� ������� �� ����, ���� ������ �־��ٸ� �׳� �ٷ� ����
			// fos�� �ٷ� ���� ���
			// true ���ۼ��� --> ������ �ش� ���� ������� ������� (�⺻�� false)
			// true �ۼ���    --> ������ �ش� ���� ������� ���̾ �ۼ���
			
			
			// 2. ��η� ������ ��� : write() �޼ҵ� ���
			//    ��, 1����Ʈ ����(-128~127)�� �ۿ� ������ ��� �Ұ�
			
			fos.write(97);// a // ���ڰ� �״�� ����Ǵ°� �ƴ� �ش� ������ �ƽ�Ű�ڵ�(0~127)���� ���ڰ� �����
			fos.write('b');
			//fos.write('��'); // �ѱ��� 2byte¥���̱� ������ 1byte��η� ���޽� ������ ��ϵ�!! 
			
			//    ����Ʈ �迭�� ��� ����
			byte[] bArr = {99, 100, 101}; // cde
			fos.write(bArr);
			
			//	fos.write(�迭, �����ε���, ����) => �迭�� �����ε������� �ش� ������ŭ ���
			fos.write(bArr, 1, 2); // de
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// � ���ܰ� �߻� �ϵ� ���� �ݵ�� ������ ������ ����ص�
			
			try {
				// 3. ��Ʈ�� �� �̿������� �ݳ��ϱ� (close�޼ҵ�)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	// ���α׷� (�ڹ� �ڵ�) <-- ����    (�Է� : ���Ͽ� ��ϵ� ������ �������� )
	public void fileRead() {
		
		// FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ��
		
		// 1. FileInputStream ��ü ���� : �ش� ���ϰ��� ������ΰ� �������
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			// 2. ���Ϸκ��� �����͸� �Է¹ް��� �� �� read() �޼ҵ� ���
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			// ��� �о�ͺ��� ������ ���� ������ ���� -1�� ��ȯ�ϴ°� �ľ�!!
			
			/*  ���ǰ˻�� �о�� ���� ����� �ؾ߸� �ϴµ� ���������� ����ϰ� �ִ� ������ �ٽ� �о�°��� ���
			while(fis.read() != -1) { // �о�� ���� -1�� �ƴ� ��� ����� �ǰԲ�
				System.out.println(fis.read());
			}
			*/
			
			// fis.read()�� �ݺ����� ����ɶ����� �� �ѹ��� ����Ǿ���!!
			
			// �ذ���1. ���ѹݺ����� �����鼭 ���ǰ˻�
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.print(value + " ");
				}else {
					break;
				}
			}
			*/
			
			// �ذ���2. ������
			int value = 0; // �Ź� �Է¹޾ƿ� �����͸� ����� ���� �����α�
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. �� �� �ڿ� �ݳ��ϱ�
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
	
	

}
