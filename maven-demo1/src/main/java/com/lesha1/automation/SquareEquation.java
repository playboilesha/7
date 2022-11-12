package com.lesha1.automation;

// Корни уравнения

// Класс, решающий квадратное уравнение - этот класс будет протестирован другим
// классом.
// a*x^2 + b*x + c = 0

public class SquareEquation {
    // Извлечение символов и подстрок
    public static String ZamenaStr(String str) {

        String replStr2 = str.replace("Hello", "Bye"); // Bye world
        return replStr2;// Bye world
    }

    public static String removeSpace(String s) {
        String withoutspaces = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                withoutspaces += s.charAt(i);

        }
        return withoutspaces;

    }

    public static double Rez(int a, int b, int c) {
        double bb;
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.println("введите первое число:");
         * a = input.nextInt();
         * System.out.println("введите второе число:");
         * a = input.nextInt();
         * System.out.
         * println("выберите операцию: 1)+(сложение) 2)-(вычитание) 3)*(умножение) 4)/(деление)"
         * );
         */
        if (c == 1) {
            return bb = add(a, b);
        } else if (c == 2) {
            return bb = sub(a, b);
        } else if (c == 3) {
            return bb = umn(a, b);
        } else if (c == 4) {
            return bb = del(a, b);
        } else {
            return bb = 0;
        }

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int umn(int a, int b) {
        return a * b;
    }

    public static int del(int a, int b) {
        return a / b;
    }

}
