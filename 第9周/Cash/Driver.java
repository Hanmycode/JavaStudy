package Cash;

import java.util.ArrayList;

import Cash.dao.CashierSystemDao;
import Cash.vo.Product;
import Cash.vo.Result;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashierSystemDao dao = new CashierSystemDao();
		dao.outputHeader();
		ArrayList<Product> list = dao.inputFromKeyBoard();
		Result result = dao.process(list);
		dao.outputForm(list, result);
	}

}
