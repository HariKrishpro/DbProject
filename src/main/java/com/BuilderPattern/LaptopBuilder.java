package com.BuilderPattern;

public class LaptopBuilder {
    String processor,graphicsCard;
    int ram;
    float displaySize;

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public Laptop get(){
        return new Laptop(processor,graphicsCard,ram,displaySize);
    }
}
