package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberServiceImpl implements MemberService{

	Map<String,MemberBean>  map;
	MemberBean session;
	
	public MemberServiceImpl() {
		map = new HashMap<String,MemberBean>();
	}
	@Override
	public String join(MemberBean bean) {
		String result = "";
		if (map.containsKey(bean.getId())==true) {
			result = "이미 아이디가 있습니다";
		}else{
			map.put(bean.getId(), bean);
		result = "환영합니다";
		}
		
		return result;
	}

	@Override
	public String login(MemberBean bean) {
		String result = "";
		if (map.containsKey(bean.getId())) {
			if (map.get(bean.getId()).getPw().equals(bean.getPw())) {
				result = "로그인성공";
				session = findById(bean.getId());
			}else{
				result = "로그인실패";
			}
		
	}return result;
	}
	@Override
	public MemberBean detail() {
			
	return session;
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String Id) {
		// TODO Auto-generated method stub
		return map.get(Id);
	}

	@Override
	public MemberBean findByName(String name) {
		return null;
	}

	@Override
	public void updatePw(MemberBean bean) {
		
	}

	@Override
	public String delete(MemberBean bean) {
		return "탈퇴되었습니다";
	}

	@Override
	public List<MemberBean> findByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return map.size();
	}

}
