package model;

public class Word {

private String text;
private int words;
private int characters;
private int sentences;

public String getText() {
return text;
}

public void setText(String text) {
this.text = text;
}

public int getWords() {
return words;
}

public void setWords(int words) {
this.words = words;
}

public int getCharacters() {
return characters;
}

public void setCharacters(int characters) {
this.characters = characters;
}

public int getSentences() {
return sentences;
}

public void setSentences(int sentences) {
this.sentences = sentences;
}
}