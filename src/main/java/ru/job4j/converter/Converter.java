package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
            float inEuro = 140;
            float inDoll = 180;
            float expectedEuro = 2;
            float expectedDoll = 3;
            float outEuro = Converter.rubleToEuro(inEuro);
            float outDoll = rubleToDollar(inDoll);
            boolean passedEuro = expectedEuro == outEuro;
            boolean passedDoll = expectedDoll == outDoll;
            System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
            System.out.println("180 rubles are 3 Dollar. Test result : " + passedDoll);
        }
}