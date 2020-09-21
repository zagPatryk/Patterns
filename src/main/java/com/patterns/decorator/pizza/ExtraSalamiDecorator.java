package com.patterns.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSalamiDecorator extends AbstractPizzaDecorator {

    public ExtraSalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + salami";
    }
}
