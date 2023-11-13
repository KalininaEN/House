import java.util.*;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> neighbours = new HashMap<>();

        neighbours.put("Иванов Иван Иванович", 65);
        neighbours.put("Иванова Мария Павловна", 60);
        neighbours.put("Иванов Михаил Иванович", 35);
        neighbours.put("Петрова Анна Сергеевна", 30);
        neighbours.put("Петров Владимир Дмитриевич", 3);
        neighbours.put("Петров Дмитрий Анатольевич", 32);
        neighbours.put("Сидоров Иван Петрович", 75);
        neighbours.put("Сидорова Елена Михайловна", 65);
        neighbours.put("Семенова Ольга Сергеевна", 17);
        neighbours.put("Семенова Инна Андреевна", 45);

        List<String> listOfAdult = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : neighbours.entrySet()) {
            if (entry.getValue() >= 18) {
                listOfAdult.add(entry.getKey());
            }
        }
        Collections.sort(listOfAdult);
        System.out.println(listOfAdult);
    }
}
