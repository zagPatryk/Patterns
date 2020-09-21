package com.patterns.decorator;

import com.patterns.decorator.pizza.BasicPizzaOrder;
import com.patterns.decorator.pizza.ExtraCheeseDecorator;
import com.patterns.decorator.pizza.ExtraSalamiDecorator;
import com.patterns.decorator.pizza.PizzaOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderDecoratorTestSuite {
    @Test
    public void testPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraSalamiDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }

    @Test
    public void testPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraSalamiDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Base + cheese + cheese + salami", description);
    }
}
