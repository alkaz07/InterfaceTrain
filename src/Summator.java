//Сделайте 4 класса, реализующих этот интерфейс:
//	Сумматор
public class Summator implements ICalculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
