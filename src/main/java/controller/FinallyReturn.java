package controller;

public class FinallyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinallyReturn fr = new FinallyReturn();
		
		System.out.println(fr.getInt());
		System.out.println(fr.getStudent());
	}

	
	
	/**
	 * ��������
	 * @return
	 */
	public int getInt(){
		int i = 0 ;
		try{
			return i;
		}catch(Exception e){
			return i;
		}finally{
			i=1;
		}
	}
	
	/**
	 * ��������
	 * @return
	 */
	public Student getStudent(){
		Student s = new Student();
		s.setName("СС");
		try{
			return s;
		}catch(Exception e){
			return s;
		}finally{
			s.setName("����Finally�޸���...");;
		}
	}
	
}

class Student{
	String name;
	protected int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String toString(){
		return name + ":" + age;
	}
	
}