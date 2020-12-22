package constructorDI1;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
