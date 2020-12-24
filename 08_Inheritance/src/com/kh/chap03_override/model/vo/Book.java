package com.kh.chap03_override.model.vo;


public class Book /*extends Object*/ {

	private String title;
	private String author;
	private int price;
	
	// �⺻������
	public Book() {}
	
	// �Ű�����������
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// setter/getter�޼ҵ�
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/*
	 * * �������̵�
	 * - �ڽ�Ŭ������ ��ӹް� �ִ� �θ� Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ� ��
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 *   �ڽ� ��ü�� ���� �ش� �޼ҵ� ȣ�� �� �ڽĸ޼ҵ尡 �켱���� ����!!
	 *   
	 * * �������̵� ���� ����
	 * - �θ�Ŭ������ �޼ҵ��� ��ġ�ؾߵ�
	 * - �Ű������� ��ġ�ؾߵ�
	 * - ��ȯ�� ��ġ�ؾߵ� (jdk�������Ǹ鼭 �θ�޼ҵ� ��ȯ���� �ڽ��ڷ�������� ��밡��)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ�ߵ�
	 *   ex) �θ�޼ҵ��� ���������ڰ� protected�� ���  �������̵� �ϴ� �޼ҵ��� ���������ڴ� protected, public
	 *   
	 * --> �Ծ��� ������ ������!!
	 * 
	 *  * @Override ������̼�
	 *  - ��ø� �����൵ ũ�� ����� ����! 
	 *  - ������ ������̼��� ���̴� ����
	 *    --> �θ� �޼ҵ���̳� �Ű������� �ٸ��� ������� ��� ���� �߻� 
	 *    --> ���� �̸޼ҵ尡 �������̵� �� �޼ҵ�� ��� �� �˸��� ���ؼ�
	 * 
	 */
	
	// Object Ŭ������ �ִ� toString �޼ҵ� �������̵�(������)
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	
	// Object Ŭ������ �ִ� equals �޼ҵ� �������̵�(������)
	// �ּҰ� �񱳰� �ƴ� ���� �ʵ尪���� ��� ���� ��� true ����
	// �ϳ��� ��ġ���� ������ false ����
	@Override
	public boolean equals(Object obj) {
		
		//          bk1.equals(bk3)
		//      this(����ü) vs  obj(���޹��� ���Ҵ�� ��ü)
		// �ڷ���       Book            Object
		
		Book other = (Book)obj;
		
		//      this(����ü) vs other(���Ҵ��ü)
		
		// this.title.equals(other.title)
		// this.author.equals(other.author)
		// this.price == other.price
		if(title.equals(other.title) 
				&& author.equals(other.author)
					&& price == other.price) {
			return true;
		}else {
			return false;
		}
		
    }
	
	
	// Object Ŭ������ �ִ� hashCode �޼ҵ带 ������ (�������̵�)
	// �ּҰ��� ������ 10������ ���·� ����� ���°� �ƴ�
	// �����ʵ尪�� ������ �ؽ��ڵ带 �����Բ�
	@Override
	public int hashCode() {
		
		// bk1.hashCode()	--> "������ ����������10000"
		// bk3.hashCode()	--> "������ ����������10000"
		
		// �ش� ��ü�� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� �ش� ���ڿ��� �ؽ��ڵ带 ��������!!
		// title + author + price		--> ���ڿ�(String)
		
		return (title + author + price).hashCode();
		
	}
	
	
	
}





