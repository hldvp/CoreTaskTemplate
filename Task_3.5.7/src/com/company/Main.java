package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "string string string string ";
        String[] keyw = new String[] {
            "spam", "fck"
        };
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(keyw);
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
        TextAnalyzer[] analyzers = new TextAnalyzer[] {
            spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer
        };
        System.out.println(checkLabels(analyzers,text));
    }


    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}
