package com.company;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label getLabel () {
        return Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        return text.length() > this.maxLength ? getLabel() : Label.OK;
    }
}
