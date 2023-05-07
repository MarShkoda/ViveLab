import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fiveth {

    public static void main(String[] args) {
    	 
    	 System.out.println(" *** 1 часть *** ");
         String m = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic.Object-oriented programming blabla. Object-oriented programming bla.";
         System.out.println("Оригинал\n"+m);
         replaceSecond(m);
         String m3 = "";
         System.out.println("Оригинал\n"+m3);
         replaceSecond(m3);
         String m2 = "Object-oriented programming Object-orienTed PROgramming&object-oriented programming ObjeCT-orienTed PROgramming!";
         System.out.println("Оригинал\n"+m2);
         replaceSecond(m2);
         String m4 = "OBJECT-oriented programming";
         System.out.println("Оригинал\n"+m4);
         replaceSecond(m4);
    	 System.out.println("\n *** 2 часть *** ");
    	 String m5 = "fffff ab f 1234 jkjk";
         System.out.println("Оригинал\n"+m5 +" \nCлово, в котором число различных символов минимально:");
         minSymbols(m5);
    	 String m6 = "1212 aab 1234 555555";
         System.out.println("Оригинал\n"+m6+" \nCлово, в котором число различных символов минимально:");
         minSymbols(m6);
    	 System.out.println("\n *** 3 часть *** ");
    	 String m7 = "1212 aab аю wonDerFUL 12jd uu8";
    	 String m8 = "62 Русский тоже 12 engl8sh";

         System.out.println("Строка: \""+m7+"\"  включает " + countWords(m7)+ " слов(а/о), содержащих только символы латинского алфавита");
         System.out.println("Строка: \""+m8+"\"  включает " + countWords(m8)+ " слов(а/о), содержащих только символы латинского алфавита");

    	 System.out.println("\n *** 4 часть *** ");
    	 String m9 = "Fkkf Анна Казак оао нет да привет пока";
         System.out.println("Оригинал\n"+m9+"\nПалиндромы:");
         palindrome(m9);


    }
    
    public static void replaceSecond(String str)
    {
    	int num = 0;
    	ArrayList<Integer> result = new ArrayList<>(); //массив дефисов внутри Object-oriented programming
    	String s1 = str.toLowerCase();
    	String s2 ="object-oriented programming";
    	while(num!=-1) {
	    	num = s1.indexOf(s2, num);
	    	//System.out.print(num+" ");
	    	if (num!=-1) {
	    		num+=6;

	    		result.add(num);
	    	}
    	}
    	int end = result.size();

        char[] chars = str.toCharArray();
    	for (int i = 0; i<end; i+=2) {
            chars[result.get(i)] = '\'';
    	}
    	str = new String(chars);
    	System.out.println("Результат\n"+str.replaceAll("(?i)object-oriented programming", "OOP").replaceAll("\'", "-"));

    }
    
    public static void minSymbols(String str) {
    	String[] strs = str.split(" ");
        int end = strs.length;
        ArrayList<HashSet<Character>> stringSet = new ArrayList<HashSet<Character>>(end);
        for (int i = 0; i < end; i++) {
            char[] chars = strs[i].toCharArray();
            int end_chars = chars.length;
//            if (end_chars == 1) {
//            	System.out.print(strs[i]);
//            	return;
//            }
            for (int j = 0; j < end_chars; j++) {
            	stringSet.add(new HashSet<Character>());
            	stringSet.get(i).add(chars[j]);
            }
        }
        int min = 30;
        int res_min = 0;
        for (int i = 0; i < end; i++) {
        	if (stringSet.get(i).size() < min) {
        		min = stringSet.get(i).size();
        		res_min = i;
        	}
        }
    	System.out.println(strs[res_min]);

    }

    public static int countWords(String str) {
    	String[] strs = str.split(" ");
        int end = strs.length;
        int count = 0;
        for (int i = 0; i < end; i++) {
            char[] chars = strs[i].toCharArray();
            int end_chars = chars.length;
            boolean key = true;
	        for (int j = 0; j < end_chars; j++) {
	        	key = ((chars[j] >= 'A' && chars[j] <= 'Z') || (chars[j]  >= 'a' && chars[j]  <= 'z'));
	        	if (key == false) break;
	          }
	        if (key) count++;
        }
        return count;
        }
    
    public static void palindrome(String str) {
    	String[] strs = str.split(" ");
        int end = strs.length;
        for (int i = 0; i < end; i++) {
            char[] chars = strs[i].toCharArray();
            int end_chars = chars.length;
            boolean key = true;
	        for (int st = 0, fin = end_chars-1; st<=fin; st++, fin--) {
	        	key = (chars[st] == chars[fin]);
	        	if (key) break;
	          }
	        if (key) System.out.print(strs[i]+" ");
        }
        }

}

/*
▸ Введите любую строку. Замените в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP»
▸ Например, строка 
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. 
Object-oriented programming blabla. Object-oriented programming bla." 
должна быть преобразована в 
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. 
OOP blabla. Object-oriented programming bla."
▸ Найти слово, в котором число различных символов минимально
▸ Слово может содержать буквы и цифры
▸ Если таких слов несколько, найти первое из них
▸ Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff"
▸ Найти количество слов, содержащих только символы латинского алфавита
▸ Найти слова палиндромы
*/