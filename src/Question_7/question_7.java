package Question_7; //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
import java.util.*;

public class question_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words: ");
        String n = scanner.next();
        System.out.print("Replace repeating characters: ");
        singleСharacter(n);
    }

    public static void singleСharacter(String n){

        String result = n.replaceAll(" ", "");
        result = result.replaceAll("([a-z])\\1+", "$1"); // заменим в строке все подряд повторяющиеся символы одним символом

        System.out.println(result.trim());     //trim возвращает копию строки с пропущенными начальными и конечными пробелами
    }
}




