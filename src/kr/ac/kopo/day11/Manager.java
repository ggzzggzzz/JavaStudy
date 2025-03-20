package kr.ac.kopo.day11;

public class Manager extends Employee {
	Employee[] empList;
	
	Manager(int no, String name, String grade, int salary,Employee[] empList ){
		super(no,  name, grade, salary);
		this.empList = empList;
	}
	
	void info() {
		super.info();
		
		System.out.println("<<<<  관리사원 리스트 >>>");

		for(Employee e : empList) {
			e.info();
		}
		
			
			
			
	}

}
