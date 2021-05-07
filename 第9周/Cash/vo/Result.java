package Cash.vo;

public class Result {
	private int saleTotalNum; //销售笔数
	private int saleTotalCount; //销售数量
	private float saleTotalMoney; //销售金额
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
		return "总计:" + "\t销售笔数 " + saleTotalNum + "\t\t销售数量 " + saleTotalCount + "\t销售金额 " + saleTotalMoney;
	}
	
	
}
