package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Аркадий Желнин";
        names[1] = "Григорий Кравчук";
        names[2] = "Сёма Спица";
        names[3] = "Афанасий Фет";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
