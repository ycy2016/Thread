package annotation;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class RefectionDemo extends T<String> {
	
	public RefectionDemo(){
		 Type type = getClass().getGenericSuperclass();
		 //�����
		 System.out.println("getClass() == " + getClass());  
	     //�������ͣ�����ĸ���
		 System.out.println("type = " + type);
//		 Class<T> entity =  (Class<T>) ((ParameterizedType)type).getActualTypeArguments()[0];  
//		 System.out.println(entity);
		 
		 Class<T> entity =  (Class<T>) ((ParameterizedType)type).getActualTypeArguments()[0];
		 
		 
	}
	
	
public static void main(String[] args) {
		
		RefectionDemo one =  new RefectionDemo();
		
		T T = new T();
//		Class cs  = (Class)T;
		System.out.println();
	}
	
	
	
}


class  T<String>{

	private int index;

	public T(){
		 //�����
		 System.out.println("�����getClass() == " + this.getClass());  
	     //�������ͣ�����ĸ���
	}
	
}