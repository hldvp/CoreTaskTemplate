package com.company;

import static java.util.Locale.US;

import java.util.Arrays;
import sun.nio.cs.US_ASCII;

public  class AsciiCharSequence implements CharSequence {

    private byte[] A;

    public AsciiCharSequence(byte[] A) {
        this.A = A;
    }

    @Override
    public int length() {
        return this.A.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.A[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.A, start, end));
    }

    @Override
    public String toString() {
        return new String(this.A);
    }
}
