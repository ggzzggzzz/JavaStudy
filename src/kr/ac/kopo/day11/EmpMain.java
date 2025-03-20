package kr.ac.kopo.day11;

public class EmpMain {

	public static void main(String[] args) {

		
		
		Employee e = new Employee(100, "홍길동", "사원", 3_000);
		Employee e2 = new Employee(101, "강길동", "사원", 3_200);
		Employee e3 = new Employee(102, "윤길동", "대리", 3_600);
		Employee e4 = new Employee(103, "김길동", "대리", 3_800);
		Employee e5 = new Employee(104, "고길동", "과장", 4_500);
		
		Employee[] empList = {e,e2,e3,e4,e5};
		Manager m = new Manager(10, "나최고", "부장", 9_900, empList);
		m.info();

		
	}

}
