package STUDENT_LIST;

public class StudentList_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList list = new StudentList(10);
		
		if(list.add(new Student("1001", "�")))
			System.out.println("���ӳɹ�!");
		else System.out.println("����ʧ��!");
		if(list.add(new Student("1002", "����")))
			System.out.println("���ӳɹ�!");
		else System.out.println("����ʧ��!");
		if(list.add(new Student("1003", "����")))
			System.out.println("���ӳɹ�!");
		else System.out.println("����ʧ��!");
		if(list.add(new Student("1004", "����")))
			System.out.println("���ӳɹ�!");
		else System.out.println("����ʧ��!");
		if(list.add(new Student("1005", "����")))
			System.out.println("���ӳɹ�!");
		else System.out.println("����ʧ��!");
		
		System.out.print(list.toString());
		System.out.println("����ѧ��" + list.getSize() + "��" +"\n");
		
		int index1 = list.indexOf("1001");
		if(index1 != -1) {
			System.out.println("���ҵ���ѧ������Ϣ:");
			System.out.println(list.get(index1).toString()+"\n");
		}
		else
			System.out.println("δ�ҵ���ѧ������Ϣ!");
		
		int index2 = list.indexOf("1003");
		if(index2 != -1) {
			if(list.remove(index2))
				System.out.println("ɾ���ɹ�!");
			else
				System.out.println("ɾ��ʧ��!");
		}

		System.out.print(list.toString());
		System.out.println("����ѧ��" + list.getSize() + "��" +"\n");
		
	}

}
