package map;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		MemberBean bean = new MemberBean();
		String temp = "";
		while (true) {
			switch (JOptionPane.showInputDialog(""+"--- 회원이 보는 화면\n"+"1.회원가입 2.로그인 3. 내정보보기(detail) 4.내정보수정(비번) 4.탈퇴 0.종료\n"+"---관리자 화면 ---\n"+"11.회원목록 12.검색(ID) 13.검색(이름) 14.검색(성별) 15.회원수")){
			case "1":
				String res=JOptionPane.showInputDialog("아이디,비번,이름,성별 입력");
				String []resArr = res.split(",");
				MemberBean member = new MemberBean();
				member.setId(resArr[0]);
				member.setPw(resArr[1]);
				member.setName(resArr[2]);
				member.setGender(resArr[3]);
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				String log = JOptionPane.showInputDialog("id ,비밀번호");
				String []logArr = log.split(",");
				bean.setId(logArr[0]);
				bean.setPw(logArr[1]);
				JOptionPane.showMessageDialog(null, service.login(bean));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.detail());
				break;
			case "4":
				String change = JOptionPane.showInputDialog("아이디 입력 , 변경할 비번입력");
				String []changeArr = change.split(",");
				bean.setId(changeArr[0]);
				bean.setPw(changeArr[1]);
				service.updatePw(bean);
				break;
			case "5":
				String del =JOptionPane.showInputDialog("삭제할아이디,비밀번호입력");
				String []DelArr = del.split(",");
				bean.setId(DelArr[0]);
				bean.setPw(DelArr[1]);
				service.delete(bean);
				break;
			case "0":
				int yes = JOptionPane.showConfirmDialog(null, "종료?");
				if (yes==0) {
					return;
				} else {
					break;
				}
			case "11":
				JOptionPane.showMessageDialog(null, service.list());
				
			break;
			
			case "12":
				String findId=JOptionPane.showInputDialog("id 입력");
				service.findById(findId);
				break;
			case "13":
				String findName=JOptionPane.showInputDialog("이름 입력");
				service.findByName(findName);
				break;
			case "14":
				String findGender=JOptionPane.showInputDialog("id 입력");
				service.findByGender(findGender);
			case "15":
				service.count();
				break;
			}
		}
	}
}
