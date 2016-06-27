package bank;

import java.util.List;

public interface BankService {
	// 1.개설 2.입금 3.조회 4.출금 5.통장내역 6.해지

	// CREATE : 11.개설
	public abstract void openAccount(AccountBean bean);

	// READ : 12. 조회(전체)
	public List<AccountBean> findAccount();

	// READ : 13. 조회(계좌번호)
	public AccountBean findByAccountNo(String num);

	// READ : 14. 조회(이름)
	public List<AccountBean> findByName(String name);

	// READ : 15. 조회(전체통장수)
	public int count();

	// READ : 16. 통장내역
	public void showAccount();

	// UPDATE : 17. 수정..사용자의 요청에 의해 비번만 전환가능
	public void updateAccount();

	// DELETE : 18. 해지
	public void deleteAccount();
}
