import java.util.*;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> neighbors = new HashMap<>();

        neighbors.put("Иванов Иван Иванович", 65);
        neighbors.put("Иванова Мария Павловна", 60);
        neighbors.put("Иванов Михаил Иванович", 35);
        neighbors.put("Петрова Анна Сергеевна", 30);
        neighbors.put("Петров Владимир Дмитриевич", 3);
        neighbors.put("Петров Дмитрий Анатольевич", 32);
        neighbors.put("Сидоров Иван Петрович", 75);
        neighbors.put("Сидорова Елена Михайловна", 65);
        neighbors.put("Семенова Ольга Сергеевна", 17);
        neighbors.put("Семенова Инна Андреевна", 45);

        List<String> listOfAdult = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : neighbors.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (entry.getValue() >= 18) {
                listOfAdult.add(entry.getKey());
            }
        }
        Collections.sort(listOfAdult);
        System.out.println(listOfAdult);
    }
}
