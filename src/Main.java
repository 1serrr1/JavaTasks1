import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задача 1
        System.out.print("(Задача 1) Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным.");
        } else {
            System.out.println("Число " + number + " является нечетным.");
        }
        // Задача 2
        System.out.println("(Задача 2) Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);
        // Задача 3
        System.out.println("(Задача 3) Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));}
        // Задача 4
        System.out.println("(Задача 4) Введите целое число N:");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма от 1 до " + N + " = " + sum);
        // Задача 5
        System.out.println("(Задача 5) Введите целое число N:");
        int fibon = scanner.nextInt();

        int fib1 = 0, fib2 = 1;
        System.out.println("Первые " + fibon + " чисел Фибоначчи:");

        for (int i = 1; i <= fibon; i++) {
            System.out.print(a + " ");
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }
        System.out.println();
        // Задача 6
        System.out.println("(Задача 6) Введите целое число:");
        int num = scanner.nextInt();
        boolean isPrime = (num > 1);

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ? " - простое число." : " - не простое число."));
        // Задача 7
        System.out.println("(Задача 7) Введите целое число N:");
        int N1 = scanner.nextInt();

        System.out.println("Числа от " + N1 + " до 1 в обратном порядке:");
        for (int i = N1; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задача 8
        System.out.println("(Задача 8) Введите два целых числа A и B:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum1 = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("Сумма четных чисел от " + A + " до " + B + " = " + sum1);
        // Задача 9
        System.out.println("(Задача 9) Введите строку:");
        String input = scanner.next();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Обратная строка: " + reversed);
        // Задача 10
        System.out.println("(Задача 10) Введите целое число:");
        int num2 = scanner.nextInt();
        int count = String.valueOf(Math.abs(num2)).length();

        System.out.println("Количество цифр в числе: " + count);
        // Задача 11
        System.out.println("(Задача 11) Введите целое число N:");
        int N2 = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= N2; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + N2 + "! = " + factorial);
        // Задача 12
        System.out.println("(Задача 12) Введите целое число:");
        int num3 = scanner.nextInt();
        int sum3 = 0;

        while (num3 != 0) {
            sum3 += num3 % 10;
            num3 /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum3);
        // Задача 13
        System.out.println("(Задача 13) Введите строку:");
        String input1 = scanner.next();
        String reversed1 = new StringBuilder(input1).reverse().toString();

        boolean isPalindrome = input1.equals(reversed1);
        System.out.println(input1 + (isPalindrome ? " - палиндром." : " - не палиндром."));
        // Задача 14
        System.out.println("(Задача 14) Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
        // Задача 15
        System.out.println("(Задача 15) Введите размер массива:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        int sum4 = 0;
        for (int value : array1) {
            sum4 += value;
        }
        System.out.println("Сумма всех элементов массива: " + sum4);
        // Задача 16
        System.out.println("(Задача 16) Введите размер массива:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int positives = 0, negatives = 0;
        for (int value : array2) {
            if (value > 0) {
                positives++;
            } else if (value < 0) {
                negatives++;
            }
        }
        System.out.println("Количество положительных чисел: " + positives);
        System.out.println("Количество отрицательных чисел: " + negatives);
        // Задача 17
        System.out.println("(Задача 17) Введите два целых числа A и B:");
        int A1 = scanner.nextInt();
        int B1 = scanner.nextInt();

        System.out.println("Простые числа в диапазоне от " + A1 + " до " + B1 + ":");
        for (int i = A1; i <= B1; i++) {
            boolean isPrime1 = (i > 1);
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) {
                System.out.print(i + " ");
            }
        }

        // Задача 18
        System.out.println("(Задача 18) Введите строку:");
        String input2 = scanner.next().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : input2.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("аеёиоуыэюя".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
        // Задача 19
        System.out.println("(Задача 19) Введите строку, состоящую из нескольких слов:");
        scanner.nextLine();
        String input3 = scanner.nextLine();

        String[] words = input3.split(" ");
        StringBuilder reversed3 = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed3.append(words[i]).append(" ");
        }

        System.out.println("Слова в обратном порядке: " + reversed3.toString().trim());
        // Задача 20
        System.out.println("(Задача 20) Введите целое число:");
        int num4 = scanner.nextInt();
        int originalNum = num4;
        int sum5 = 0;

        int numberOfDigits = String.valueOf(num4).length();

        while (num4 != 0) {
            int digit = num4 % 10;
            sum5 += Math.pow(digit, numberOfDigits);
            num4 /= 10;
        }

        if (sum5 == originalNum) {
            System.out.println(originalNum + " - число Армстронга.");
        } else {
            System.out.println(originalNum + " - не число Армстронга.");
        }
    }
}