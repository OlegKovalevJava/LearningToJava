package com.LearningToJava;

public record Book(String name, String genre) {
    @Override
    public String genre() {
        return genre;
    }
}
