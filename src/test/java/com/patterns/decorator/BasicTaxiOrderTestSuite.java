package com.patterns.decorator;

import com.patterns.decorator.taxi.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasicTaxiOrderTestSuite {

    @Test
    public void testGetCost() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        // When
        BigDecimal calculatedCost = taxiOrder.getCost();
        // Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testGetDescription() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        // When
        String description  = taxiOrder.getDescription();
        // Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        // When
        BigDecimal calculatedCost = taxiOrder.getCost();
        // Then
        assertEquals(new BigDecimal(40), calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        // When
        String description  = taxiOrder.getDescription();
        // Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiNetworkWithSeatGetCost() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        // When
        BigDecimal calculatedCost = taxiOrder.getCost();
        // Then
        assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testTaxiNetworkWithSeatGetDescription() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        // When
        String description  = taxiOrder.getDescription();
        // Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }
}