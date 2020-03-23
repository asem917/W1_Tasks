package com.week1.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Calculator implements Addition,Subtraction,Multiplication,Division {
    @Autowired
    @Qualifier("number1")
    private Number number1;
    @Autowired
    @Qualifier("number2")
    private Number number2;

    public Calculator(Number number1, Number number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double add() {
        return number1.getValue()+number2.getValue();
    }

    public Double divide() {
        return number1.getValue()/number2.getValue();
    }

    public Double multiply() {
        return number1.getValue()*number2.getValue();
    }

    public Double subtract() {
        return number1.getValue()-number2.getValue();
    }
}
