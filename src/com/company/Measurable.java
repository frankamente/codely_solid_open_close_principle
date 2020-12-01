package com.company;

public abstract class Measurable {
    abstract protected double getTotalLength();
    abstract protected double getSentLength();

    public double getSentLengthPercentage() {
        return this.getSentLength() * 100 / this.getTotalLength();
    }
}
