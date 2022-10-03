public class Main {

    public static void main(String[] args) {
        byte a2 = 0b10;
        byte a8 = 010;
        byte a10 = 10;
        byte a16 = 0x10;
        int sumByte = (a2 + a8 + a10 + a16);
        System.out.print("sumByte = ");
        System.out.println(sumByte);

        short b2 = 0b100001;
        short b8 = 0377;
        short b10 = 1690;
        short b16 = 0xFF;
        int sumShort = (b2 + b8 + b10 + b16);
        System.out.print("sumShort = ");
        System.out.println(sumShort);

        int c2 = 0b11111111111101;
        int c8 = 07777;
        int c10 = 547_845;
        int c16 = 0x10FFF;
        int sumInt = (c2 + c8 + c10 + c16);
        System.out.print("sumInt = ");
        System.out.println(sumInt);

        long d2 = 0b111111111111000001;
        long d8 = 01234567;
        long d10 = 876543;
        long d16 = 0x10000F;
        int sumLong = (int) (d2 + d8 + d10 + d16);
        System.out.print("sumLong = ");
        System.out.println(sumLong);

        char e1 = 'a';
        char e2 = 'b';
        char e3 = 'c';
        char e4 = 'd';
        int sumChar = (e1 + e2 + e3 + e4 + 1);
        System.out.print("sumChar = ");
        System.out.println(sumChar);

        float f10 = 1147.6f;
        float f16 = 0x234F;
        int sumFloat = (int) (f10 + f16);
        System.out.print("sumFloat = ");
        System.out.println(sumFloat);

        double j10 = 347.9;
        double j16 = 0x123.4P2;
        int sumDouble = (int) (j10 + j16);
        System.out.print("sumDouble = ");
        System.out.println(sumDouble);

        long result = (sumByte + sumShort + sumInt + sumLong + sumChar + sumFloat + sumDouble);
        System.out.print("result = ");
        System.out.println(result);


        // Конвертація градусів Фаренгейта в градуси Цельсій
        double degreeFahrenheit = 298;
        double degreeCelcius = (degreeFahrenheit - 32) * 5 / 9;
        convertToCelcius(degreeFahrenheit, degreeCelcius);
        // Конвертація дюймів у сантиметри
        double inch = 40;
        double cmConverting = inch*2.54;
        convertToCM(cmConverting);
    }

    private static double convertToCM(double cmConverting) {
        System.out.println("Inch convinced to cm: "+cmConverting);
        return cmConverting;
    }

    private static double convertToCelcius(double degreeFahrenheit, double degreeCelcius) {
        System.out.println("Fahrenheit degree convinced to the Celcius degree: "+degreeCelcius);
        return degreeCelcius;
    }

}