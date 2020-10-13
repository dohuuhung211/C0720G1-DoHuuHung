package case_study_tu_dien;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    String vocabulary;
    String adjective;
    String noun;
    String verb;
    List<String> listSynonymous = new ArrayList<>();

    public Dictionary(String vocabulary, String adjective, String noun, String verb, List<String> listVocabulary) {
        this.vocabulary = vocabulary;
        this.adjective = adjective;
        this.noun = noun;
        this.verb = verb;
        listSynonymous = listVocabulary;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public List<String> getListSynonymous() {
        return listSynonymous;
    }

    public void setListSynonymous(List<String> listSynonymous) {
        this.listSynonymous = listSynonymous;
    }

    @Override
    public String toString() {
        return "Tu vung: " + vocabulary + ", " +
                "Tinh tu: " + adjective + ", " +
                "danh tu: " + noun + ", " +
                "dong tu: " + verb + ", " +
                "Cac tu tuong dong: " + listSynonymous;
    }
}
