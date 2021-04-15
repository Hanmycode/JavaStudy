package STUDENT_LIST;

public class StudentList_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList list = new StudentList(10);
		
		if(list.add(new Student("1001", "李华")))
			System.out.println("增加成功!");
		else System.out.println("增加失败!");
		if(list.add(new Student("1002", "王刚")))
			System.out.println("增加成功!");
		else System.out.println("增加失败!");
		if(list.add(new Student("1003", "张三")))
			System.out.println("增加成功!");
		else System.out.println("增加失败!");
		if(list.add(new Student("1004", "李四")))
			System.out.println("增加成功!");
		else System.out.println("增加失败!");
		if(list.add(new Student("1005", "王五")))
			System.out.println("增加成功!");
		else System.out.println("增加失败!");
		
		System.out.print(list.toString());
		System.out.println("共有学生" + list.getSize() + "个" +"\n");
		
		int index1 = list.indexOf("1001");
		if(index1 != -1) {
			System.out.println("已找到该学生的信息:");
			System.out.println(list.get(index1).toString()+"\n");
		}
		else
			System.out.println("未找到该学生的信息!");
		
		int index2 = list.indexOf("1003");
		if(index2 != -1) {
			if(list.remove(index2))
				System.out.println("删除成功!");
			else
				System.out.println("删除失败!");
		}

		System.out.print(list.toString());
		System.out.println("共有学生" + list.getSize() + "个" +"\n");
		
	}

}
