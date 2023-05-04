public class Fourth {

    public static void main(String[] args) {
    	int count = 8;
    	java.util.Random r = new java.util.Random();
    	int[] massive = r.ints(1, 11).limit(count).toArray();
    	boolean isIncreasing = true;
    	for (int i = 0; i < count; i++) {
    		System.out.print(massive[i]+" ");
    		if (i+1 < count && massive[i] >= massive[i+1]) isIncreasing = false;
    	}
    	System.out.println();
    	if (isIncreasing) System.out.println("Строго возрастает"); 
    	System.out.println();
    	for (int i = 0; i < count; i++) {
    		if (i%2!=0) massive[i] = 0;
    		System.out.print(massive[i]+" ");
    	}
    	
    	
    }

}

/*Создайте массив из 8 случайных целых чисел из отрезка [1;10]
▸ Выведите массив на экран в строку
▸ Далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью
▸ Замените каждый элемент с нечётным индексом на ноль
▸ Снова выведете массив на экран на отдельной строке*/