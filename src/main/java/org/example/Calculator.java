package org.example;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calculator {
    public Calculator() {
    }

    public static <T extends Number> Double sum(T a, T b) {
            return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> Double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> Double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> Double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}

