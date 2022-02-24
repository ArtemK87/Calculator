public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        // Складываем 1 + 2 = 3
        int a = calc.plus.apply(1, 2);
        // Вычитаем 1 - 1 = 0
        int b = calc.minus.apply(1,1);
        // Возникает ошибка при выполнении деления первого результата (3) на второй (0)
        int c = calc.devide.apply(a, b);

        // Выполнение не происходит
        calc.println.accept(c);

        // Следует использовать тернарный оператор и при делении на 0 возвращаем максимально возможный результат.
    }
}
