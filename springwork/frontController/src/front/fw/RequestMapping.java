package front.fw;

import java.util.HashMap;

import member.MemberInsert;
import product.ProductList;

/*
 * FrontServlet�� �Ѱ��� ��û path�� ������ ���� ������ Ŭ������ ��ü�� ���� �����ϴ� �۾��� ����
 * 	=> �̸� ��û path���� ������ ���� Ŭ������ ����� ���������� ���� ��ü�� ã�Ƽ� ����
 * 	   mycommand.properties���Ͽ� ��ϵ� ��û path�� ���� ������ ��ü�� ã�´�.
 * 	   xml�����̳� properties������ �Ľ��ϴ� �ڵ带 ����
*/
public class RequestMapping {
	//xml�̳� properties������ �Ľ��ؼ� �����س��� ��ü�� ������ map
	//��û path�� key, ���������Ұ�ü value
	private HashMap<String, Action> actionMap = new HashMap<String, Action>();
	
	public RequestMapping() {
		//������ ���ο��� ���������� �Ľ��ؼ� ��ü�� ����� �ڵ尡 ���ǵǾ�� �Ѵ�.
		
	}

	public Action mapping(String path) {
		//�Ű������� ���޵� path�� ��ϵ� Action��ü�� actionMap���� ã�Ƽ� ����
		//�ϴ� �ڵ尡 ���ǵǾ�� �ϳ�... �ϴ� if...else�� ó��
		Action action = null;
		if(path.equals("/product/list.do")) {
			action = new ProductList();
		} else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		}
		//.......
		return action;
	}

}
