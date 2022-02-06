package grade;

// 필수과목과 일반과목으로 구분해야 하기 때문에 추상 메서드
public interface GradeEvaluation {
	public String getGrade(int point); 
}
