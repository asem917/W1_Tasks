package task1;

public class Number2 implements Number {
    private Double value;
    public void setValue(double number) {
        this.value =new Double(number);

    }

    public Double getValue() {
        return this.value;
    }
}
