package STUDENT_LIST;

public class StudentList {
	private Student list[];
	private int count;
	
	public StudentList(int maxSize) {
		list = new Student[maxSize];
		count = 0;
	}
	
	public boolean add(Student stu) {
		if(stu==null || list.length<=count)
			return false;
		list[count] = stu;
		count++;
		return true;
	}
	
	public boolean remove(int index) {
		if(index<0||index>=count)
			return false;
		
//		//集合中没有元素，或集合中只剩1个元素时
//		if(count==0||index==count-1)
//			return true;
		list[index] = null;
		for(int i=index;i<count-1;i++) {
			list[i] = list[i+1]; //前移覆盖
		}
		count--;
		list[count] = null;
		return true;
	}
	
	public int indexOf(String id) {
		for(int i=0;i<list.length&&list[i]!=null;i++) {
			if(list[i].getId().equals(id))
				return i;
		}
		return -1;
	}
	
	public Student get(int index) {
		return list[index];
	}
	
	public int getSize() {
		return count;
	}
	
	public String toString() {
		String info = "";
		for(int i=0;i<list.length&&list[i]!=null;i++) {
			info += list[i].toString() + "\n"; 
		}
		return info;
	}
}
