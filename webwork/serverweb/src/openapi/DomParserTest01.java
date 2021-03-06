package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//xml 문서 파싱하기
public class DomParserTest01 {

	public static void main(String[] args) throws Exception {
		//Parser 생성기
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();	//싱글톤 패턴
		//Dom Parser
		DocumentBuilder domparser = factory.newDocumentBuilder();
		//Parser의 parse메서드를 호출하면 xml을 분석하여 Dom객체로 만들어서 반환
		Document document = domparser.parse("src/openapi/dept.xml");
		
		//root엘리먼트
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		//dept엘리먼트 추출하기
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		
		for (int i = 0; i < nodelist.getLength(); i++) {
			Node node = nodelist.item(i);
			System.out.println("노드명" + node.getNodeName());
		}
	}
}
