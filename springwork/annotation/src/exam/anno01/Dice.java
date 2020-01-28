package exam.anno01;

import java.util.Random;

import org.springframework.stereotype.Service;

//이름을 지정하지 않으면 클래스 이름 앞 첫 글자를 소문자로 바꾼 이름으로 자동 등록
@Service
public class Dice extends Random implements AbstractDice{
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
