package grade;

public class GradeServiceImpl implements GradeService {
	GradeBean bean = new GradeBean();

	@Override
	public int total(int kor,int eng, int math) {
		int avg = (kor+eng+math) / 3 / 10;
		String grade = "";
		switch (avg) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;

		case 7:
			grade = "C";
			break;

		case 6:
			grade = "D";
			break;

		case 5:
			grade = "E";
			break;

		default:
			grade = "F";
			break;
		}
		return  ":총점 " + total + ", 평균 " + avg + ",학점" + grade;
		
	}
	@Override
	public String name(String name) {
		return name;
	}

	}

