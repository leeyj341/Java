package workbook;

public class Test02 {

	public static void main(String[] args) {
		// Company의 salary가 double이고 입력받은 salary가 int이므로 자동 casting이 된다.
		int salary = Integer.parseInt(args[0]);
		Company company = new Company(salary);
		
		System.out.println("연 기본급 합: " + company.getIncome() + " 세후: " + company.getAfterTaxIncome());
		System.out.println("연 보너스 합: " + company.getBonus() + " 세후: " + company.getAfterTaxBonus());
		System.out.println("연 지급액 합: " + (company.getAfterTaxIncome() + company.getAfterTaxBonus()));

	}

}
