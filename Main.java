import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список чисел, разделенных пробелами: ");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");
        HashSet<Double> numbers = new HashSet<Double>();
        for(String element : elements)
        {
            Double number = Double.parseDouble(element);
            numbers.add(number);
        }
        System.out.println("Количество уникальных чисел: " + numbers.size());

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        String text = "На улице было тихо, тихо. Птицы чирикали, и чирикали они долго.";
        text = text.replaceAll("[,.!?]", "").toLowerCase();
        TreeSet<String> words = new TreeSet<String>(Arrays.asList(text.split("\\s+")));
        System.out.println(words);
    }
}