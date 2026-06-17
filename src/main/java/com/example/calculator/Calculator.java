package com.example.calculator;

/**
 * Kelas Calculator menyediakan operasi aritmatika dasar.
 *
 * @author CI/CD Demo Team
 * @version 1.0.0
 */
public class Calculator {

    /**
     * Menjumlahkan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Mengurangkan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Mengalikan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil perkalian
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Membagi dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pembagian
     * @throws ArithmeticException jika b bernilai 0
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }
}
