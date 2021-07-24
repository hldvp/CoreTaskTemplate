package com.company;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
