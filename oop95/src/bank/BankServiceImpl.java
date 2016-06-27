package bank;

import java.util.ArrayList;
import java.util.List;

import school.StudentBean;

public class BankServiceImpl implements BankService{

	List<AccountBean> list;
	AccountBean searchMan = new AccountBean();
	String result = "";
	
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
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(accNo)) {
				acc = list.get(i);
				break;
			}
		}
			return acc;
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
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteAccount(String accNo) {
		AccountBean a = this.findByAccountNo(accNo);
		if (!a.equals(a.getAccountNo())) {
			result = accNo + "는 없는 계좌입니다";
			
		} else {
			a=null;
			result = "해지가 완료되었습니다";
	}
		return result;
		}
}
