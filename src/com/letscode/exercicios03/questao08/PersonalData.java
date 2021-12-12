package com.letscode.exercicios03.questao08;

public class PersonalData {
    private String name;
    private double height;
    private double weight;
    private double imc;

    public PersonalData() {
        this.name = "";
        this.height = 0;
        this.weight = 0;
        this.imc = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
