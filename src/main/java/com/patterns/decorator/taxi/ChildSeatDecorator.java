package com.patterns.decorator.taxi;

import java.math.BigDecimal;

public class ChildSeatDecorator extends AbstractTaxiOrderDecorator {

    public ChildSeatDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + child seat";
    }
}
