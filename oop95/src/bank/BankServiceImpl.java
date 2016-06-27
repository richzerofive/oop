package bank;

import java.util.ArrayList;
import java.util.List;

import school.StudentBean;

public class BankServiceImpl implements BankService{

	List<AccountBean> list;
	AccountBean searchMan = new AccountBean();
	
	public BankServiceImpl() {
		list = new ArrayList<AccountBean>();
	}
	@Override
	public void openAccount(AccountBean bean) {
		//11개설(은행창구개설)
		list.add(bean);
	}

	@Override
	public List<AccountBean> findAccount() {
		return null;
	}

	@Override
	public AccountBean findByAccountNo(String bean) {
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNo().equals(bean)) {
				searchMan = list.get(i);
				break;
			}
		}
		return null;
	}

	@Override
	public List<AccountBean>  findByName(String name) {
		return null;
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}


}
