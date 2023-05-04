import java.io.IOException;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) throws IOException {
    	Scanner weather = new Scanner (System.in);
    	boolean tempkey = false, windkey = false;
    	double wind = 0, temp = 0;
    	System.out.println("Введите температуру в градусах Цельсия");
    	do{
    	        if(weather.hasNextDouble()){
    	       	 temp = weather.nextDouble();
    	       	 tempkey = true;
    	        }
    	        else{
    	        	weather.nextLine();
    	            System.out.println("Попробуйте ввести число через запятую");
    	        }
    	} while(!tempkey);
    	System.out.println("Введите скорость ветра в м/с");
    	do{
	        if(weather.hasNextDouble()){
	       	 wind  = weather.nextDouble();
	       	 tempkey = true;
	        }
	        else{
	        	weather.nextLine();
	            System.out.println("Попробуйте ввести число через запятую");
	        }
	} while(!tempkey);    	System.out.println("Идёт ли дождь?");
    	String rain = weather.next();
    	if (temp < 15.0) 
    		System.out.println("Наденьте куртку");
    	else if (temp > 25.0)
    		System.out.println("Наденьте кепку");
    	if (rain.toLowerCase().equals("да") || rain.toLowerCase().equals("идёт") ) System.out.println("Возьмите с собой зонт");
    	if (wind > 15.0) System.out.println("Остерегайтесь падающих деревьев");
    	weather.close();
    }

}

/*
▸ Создайте программу, определяющую, подходят ли текущие погодные условия для прогулки
▸ В начале работы программы пользователь вводит температуру окружающей среды, информацию о ветре и дожде
▸ Программа ее обрабатывает и дает совет
 */
