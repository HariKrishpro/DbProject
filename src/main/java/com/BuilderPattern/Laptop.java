package com.BuilderPattern;

public class Laptop {
    String processor,graphicsCard;
    int ram;
    float displaySize;


    public Laptop(String processor, String graphicsCard, int ram, float displaySize) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.displaySize = displaySize;
    }
}
