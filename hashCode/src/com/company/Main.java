package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

public static class ComplexNumber<punlic> {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (hashCode() != o.hashCode()) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber that = (ComplexNumber) o;
        if(that.getRe() != getRe()) {
            return false;
        }
        if(that.getIm() != getIm()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) getRe();
        result = prime * result + (int) getIm();
        return result;
    }
}

