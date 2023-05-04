public class Third {

    public static void main(String[] args) {
    	int num1 = 1, num2 = 1, members = 11;
    	System.out.println("For:");
    	for (int i = 0; i < members; i++) {
    		System.out.print(num1+" ");
    		num2 = num1+num2;
    		num1 = num2-num1;
    	}
    	int i = 0;
    	num1 = 1; num2 = 1;
    	System.out.println("\nWhile:");
    	while (i < members)
    	{
    		System.out.print(num1+" ");
    		num2 = num1+num2;
    		num1 = num2-num1;
    		i++;
    	}
    }

}

/*
Выведите на экран первые 11 членов последовательности Фибоначчи. (2 варианта: с while и for)
▸ Напоминаем, что: первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих. 
То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
*/