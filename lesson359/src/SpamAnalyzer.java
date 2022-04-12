class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
        label = Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}



    //SpamAnalyzer должен конструироваться от массива строк с ключевыми словами. Объект этого класса должен сохранять
    // в своем состоянии этот массив строк в приватном поле keywords.