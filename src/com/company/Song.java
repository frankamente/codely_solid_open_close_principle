package com.company;

public class Song extends Measurable{
    private double totalLength;
    private double sentLength;

    @Override
    public double getTotalLength() {
        return totalLength;
    }

    @Override
    public double getSentLength() {
        return sentLength;
    }
}
