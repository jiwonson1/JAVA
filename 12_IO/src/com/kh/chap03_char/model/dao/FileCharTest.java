package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// ���α׷� --> ���� (��� : ���α׷��� �����͸� ���Ϸ� �������ڴ�.)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ� 
		
		/*
		// 1. FileWriter ��ü ���� 
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' ');
			fw.write("��!IO ��մ�...");
			fw.write("\n");
			
			// char[] �迭 ���۰���
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. �� �� �ڿ� �ݳ�
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// �ش� ��Ʈ�� �� �� �� �ڵ����� close() ���� ���ִ� ����
		// try with resource ���� 
		/*
		 *  try(��Ʈ�� ��ü �����ϴ� ����) {
		 *  	
		 *  } catch(����Ŭ������ e){
		 *  
		 *  }
		 */
		try(FileWriter fw = new FileWriter("b_char.dat")) {
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' ');
			fw.write("��!IO ��մ�...");
			fw.write("\n");
			
			// char[] �迭 ���۰���
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	// ���α׷� <-- ���� (�Է� : ���Ϸκ��� ���α׷����� ������ ��������)
	public void fileRead() {
		
		// FileReader : ���Ϸ� �����͸� 2����Ʈ ������ �Է¹ޱ�
		
		// 1. FileReader  ��ü ���� 
		try(FileReader fr = new FileReader("b_char.dat")) {
			
			// 2. ��θ� ���ؼ� ������ �Է¹޾ƿ��� : read() �޼ҵ� 
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			// �굵 ���������� ������ ���� ������ -1�� ��ȯ
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} /*catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/ catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

}








