package exam.anno01;

import java.util.Random;

import org.springframework.stereotype.Service;

//�̸��� �������� ������ Ŭ���� �̸� �� ù ���ڸ� �ҹ��ڷ� �ٲ� �̸����� �ڵ� ���
@Service
public class Dice extends Random implements AbstractDice{
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
