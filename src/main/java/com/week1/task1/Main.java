package com.week1.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext ac=new AnnotationConfigApplicationContext(CalculatorBean.class);
    Calculator calculator=ac.getBean(Calculator.class);
    Number number1= (Number) ac.getBean("number1");
        Number number2= (Number) ac.getBean("number2");
        number1.setValue(2);
        number2.setValue(5);
        System.out.println( calculator.multiply());



}}
