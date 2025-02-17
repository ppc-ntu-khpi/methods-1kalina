//package test;

//import domain.Exercise;

public class TestResult {
    
    public static void main(String[] args) {
        int number = 123595;
        try {
            String result = Exercise.Calculate(number);
            System.out.println("Перетворення числа " + number + ":");
            System.out.println("Двійкова: " + result.split(", ")[0]);
            System.out.println("Вісімкова: " + result.split(", ")[1]);
            System.out.println("Шістнадцяткова: " + result.split(", ")[2]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
