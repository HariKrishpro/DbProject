package com.BuilderPattern;

public class builderPattern {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("intel i5","nvidia 2080",8,15.6f);

        Laptop laptop1 = new LaptopBuilder().setProcessor("Amd Ryzen 3500")
                .setRam(16).get();
    }
}
