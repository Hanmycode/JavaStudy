package week4;

public class AddressDriver {
	public static void main(String[] args) {
		Address a1 = new Address("�й�", "����ʡ", "�人��", "��ɽ�ֵ�", "430212");
		Address a2 = new Address("�й�", "ɽ��ʡ", "̩����", "���ֵ�", "271000");

		System.out.println("��ַ1Ϊ:" + a1.detail());
		System.out.println("��ַ2Ϊ:" + a2.detail());

	}
}
