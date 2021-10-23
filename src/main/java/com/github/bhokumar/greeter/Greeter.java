package com.github.bhokumar.greeter;

public class Greeter {
    GreeterProperties greeterProperties;

    public Greeter(GreeterProperties greeterProperties) {
        this.greeterProperties = greeterProperties;
    }

    public String greet() {
        StringBuilder sb = new StringBuilder();
        sb.append(greeterProperties.getUserName());
        sb.append(" ");
        sb.append(greeterProperties.getMorningMessage());
        return sb.toString();
    }
}
