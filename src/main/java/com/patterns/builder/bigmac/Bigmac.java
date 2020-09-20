package com.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Roll roll;
    private final int burgersNumber;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    public static class BigmacBuilder {
//        private Roll roll;
//        private int burgersNumber;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

//        public BigmacBuilder setRoll(Roll roll) {
//            this.roll = roll;
//            return this;
//        }
//
//        public BigmacBuilder setBurgersNumber(int burgersNumber) {
//            this.burgersNumber = burgersNumber;
//            return this;
//        }

        public BigmacBuilder setSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder addIngredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(Roll roll, int burgersNumber) throws WrongBurgerNumberException {

            if (burgersNumber < 1) {
                throw new WrongBurgerNumberException();
            }

            return new Bigmac(roll, burgersNumber, sauce, ingredients);
        }
    }

    public Bigmac(Roll roll, int burgersNumber, Sauce sauce, List<Ingredient> ingredients) {
        this.roll = roll;
        this.burgersNumber = burgersNumber;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll=" + roll +
                ", burgersNumber=" + burgersNumber +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }



    public Roll getRoll() {
        return roll;
    }

    public int getBurgersNumber() {
        return burgersNumber;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
