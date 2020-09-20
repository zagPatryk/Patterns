package com.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void buildBigmacTest() throws WrongBurgerNumberException {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .addIngredient(Ingredient.BACON)
                .setSauce(Sauce.BARBECUE)
                .addIngredient(Ingredient.CHILI)
                .build(Roll.SESAME_ROLL, 1);
        System.out.println(bigmac);
        //When

        //Then
        Assert.assertEquals(1, bigmac.getBurgersNumber());
        Assert.assertEquals(2, bigmac.getIngredients().size());
        Assert.assertEquals(Roll.SESAME_ROLL, bigmac.getRoll());
        Assert.assertEquals(Sauce.BARBECUE, bigmac.getSauce());
    }
}