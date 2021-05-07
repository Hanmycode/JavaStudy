package Cash.vo;

public class Result {
	private int saleTotalNum; //���۱���
	private int saleTotalCount; //��������
	private float saleTotalMoney; //���۽��
	public Result() {
		super();
	}
	public Result(int saleTotalNum, int saleTotalCount, float saleTotalMoney) {
		super();
		this.saleTotalNum = saleTotalNum;
		this.saleTotalCount = saleTotalCount;
		this.saleTotalMoney = saleTotalMoney;
	}
	public int getSaleTotalNum() {
		return saleTotalNum;
	}
	public void setSaleTotalNum(int saleTotalNum) {
		this.saleTotalNum = saleTotalNum;
	}
	public int getSaleTotalCount() {
		return saleTotalCount;
	}
	public void setSaleTotalCount(int saleTotalCount) {
		this.saleTotalCount = saleTotalCount;
	}
	public float getSaleTotalMoney() {
		return saleTotalMoney;
	}
	public void setSaleTotalMoney(float saleTotalMoney) {
		this.saleTotalMoney = saleTotalMoney;
	}
	@Override
	public String toString() {
		return "�ܼ�:" + "\t���۱��� " + saleTotalNum + "\t\t�������� " + saleTotalCount + "\t���۽�� " + saleTotalMoney;
	}
	
	
}
