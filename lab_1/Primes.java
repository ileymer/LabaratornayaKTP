package com.company;

public class Primes {

    public static void main(String[] args)
    {
        for (int i = 2; i <= 100; i++)
        {
            if (isPrime(i) == true)
                System.out.print(i + "  "); // Вывод
        }
    }

    public static boolean isPrime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0) //Проверка на делимость
                return false;
        }
        return true;
    }
}
