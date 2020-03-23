package task1;

import org.springframework.context.annotation.Bean;

public class CalculatorBean {
    @Bean
    public Calculator getCalculator(){
        return new Calculator(getNumber1(),getNumber2());
    }
    @Bean("number1")
    public Number getNumber1(){
        return new Number1();
    }

    @Bean("number2")
    public Number getNumber2(){
        return new Number2();

    }




}
