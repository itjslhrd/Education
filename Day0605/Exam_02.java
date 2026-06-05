
class ProcessExam_02{
	public void arrayData(int score[]) {
		//출력
		System.out.print("Data : ");
		for(int i=0; i<score.length;i++) {
			System.out.printf("%5d", score[i]);
		}
		System.out.println();
		
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i])
				max = score[i];
			else if(min > score[i])
				min = score[i];
			sum += score[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + (sum-max-min));
		
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		int score[]= {30,67,55,79,97,65,33,78,96,58,94,32};

        ProcessExam_02 ex02 = new ProcessExam_02();
        ex02.arrayData(score);
	}

}
