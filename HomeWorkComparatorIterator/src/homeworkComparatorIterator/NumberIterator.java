package homeworkComparatorIterator;

import java.util.Iterator;

public class NumberIterator implements Iterable<Integer> {
	Integer number;
	
	public NumberIterator(Integer number) {
		this.number = number;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new MyIterator();
	}
	
	public class MyIterator implements Iterator<Integer> {
		int lengthOfNumber = 1;
		int divider = 1;
		
		public MyIterator() {
			if (number != 0 ) {
				while ((number / divider) >= 10) {
					lengthOfNumber++;
					divider *= 10;
				}
			} 
		}

		@Override
		public boolean hasNext() {
			return lengthOfNumber > 0;
		}

		@Override
		public Integer next() {
			if (number == 0) {
				lengthOfNumber--;
				return 0;
			} else {
				// вычисляем нынешнюю длину числа
				int realLength = 0;
				int forDivide = 1;
				while ((number / forDivide) >= 10) {
					realLength++;
					forDivide *= 10;
				}
				realLength++;
				
				// если нынешняя длина меньше ожидаемой - нужно вернуть 0
				if (realLength < lengthOfNumber) {
					divider /= 10;
					lengthOfNumber--;
					return 0;
				} else {
					// получаем первую цифру из числа
					var forReturn = number / divider;
					// удаляем первую цифру
					number -= forReturn * divider;
					// делитель делим на 10, длину уменьшаем на 1
					divider /= 10;
					lengthOfNumber -= 1;
					// возвращаем наше первую цифру из числа
					return forReturn;
				}
			}
		}
	}
}
