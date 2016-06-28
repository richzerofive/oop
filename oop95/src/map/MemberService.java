package map;

import java.util.List;

public interface MemberService {
	public String join(MemberBean bean);
	public String login(MemberBean bean);
	public MemberBean detail();
	public List<MemberBean> list();
	public MemberBean findById(String findId);
	public MemberBean findByName(String name);
	public void updatePw(MemberBean bean);
	public String delete(MemberBean bean);
	public List<MemberBean> findByGender(String gender);
	public int count();
}
