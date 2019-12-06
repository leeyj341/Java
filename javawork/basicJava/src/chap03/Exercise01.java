package chap03;

public class Exercise01 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBuckets = numOfApples % sizeOfBucket > 0 ? 
				numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket;
		
		System.out.println("필요한 바구니의 수 : " + numOfBuckets);

	}

}
